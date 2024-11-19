import re
import time

def tab(tab_count):
    return " " * 4 * tab_count

def parse_start_tag(string):
    global tab_count, flag
    string = string.strip()
    regex = r'<(\w+)>'
    match = re.match(regex, string)
    if match:
        result = f'\n{tab(tab_count)}"{match.group(1)}": {{'
        tab_count += 1
        if flag == 1:
            flag = 0
            return "," + result
        else:
            flag = 0
            return result
    return ""

def parse_end_tag(string):
    global tab_count, flag
    string = string.strip()
    regex = r'</\w+>'
    if re.match(regex, string):
        tab_count -= 1
        flag = 1
        return f'\n{tab(tab_count)}}}'
    return ""

def parse_element(string):
    global flag
    string = string.strip()
    regex = r'<(\w+)>([\w\W]+?)</\1>'
    match = re.match(regex, string)
    if match:
        if flag != 2:
            flag = 2
            return f'\n{tab(tab_count)}"{match.group(1)}": "{match.group(2)}"'
        else:
            return f',\n{tab(tab_count)}"{match.group(1)}": "{match.group(2)}"'
    return ""

def main(string):
    string = string.strip()
    if (result := parse_element(string)):
        return f'{result}'
    if (result := parse_end_tag(string)):
        return f'{result}'
    if (result := parse_start_tag(string)):
        return f'{result}'
    return ""

def parse_xml_to_json():
    start_time = time.perf_counter()

    with open('timetable.xml', 'r', encoding='utf-8') as infile, \
         open('timetable2.json', 'w', encoding='utf-8') as outfile:

        strings = infile.read().strip().split("\n")
        outfile.write("{\n")

        for line in strings[1:]:
            parsed_line = main(line)
            outfile.write(parsed_line)

        outfile.write("\n}")

    end_time = time.perf_counter()
    return f'{end_time - start_time:.6f}'

# Глобальные переменные
tab_count = 1
flag = 0
