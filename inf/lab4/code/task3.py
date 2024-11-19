def parse_element(string):
    element = ""
    flag = 0
    #0 - тэг ещё не начался, 1 - тэг ещё не закончился, -1 - тэг закончился
    for letter in string:
        if flag == -1:
            break
        if letter == "/" and flag == 1:
            break
        if letter == "<":
            flag = 1
        elif letter == ">":
            flag = -1
        elif flag == 1:
            element += letter
    if flag == -1:
        return element
    else:
        return 0

def tab(tabs_counter):
    return ' '*4*tabs_counter

def parse_text_content(string):
    parse_string = parse_element(string)
    text_content = ""
    ind = string.find(parse_string + ">") + len(parse_string) + 1
    while string[ind] != "<":
        text_content += string[ind]
        ind += 1
    return text_content

def parse_tags(string):
    global flag, prev_action
    string.strip()
    tabs_counter = 1
    #0 - перенос на строку, 1 - та же строка, -1 - закрывается }
    tag = parse_element(string)
    if tag != 0:
        if string.count(tag) == 1:
            tabs_counter += flag
            flag += 1
            if prev_action == 2:
                prev_action = 0
                return f',\n{tab(tabs_counter)}"{tag}": {{'
            else:
                return f'\n{tab(tabs_counter)}"{tag}": {{'
        elif string.count(tag) == 2:
            tabs_counter += flag
            flag += 0
            if prev_action == 1:
                return f',\n{tab(tabs_counter)}"{tag}": "{parse_text_content(string)}"'
            else:
                prev_action = 1
                return f'\n{tab(tabs_counter)}"{tag}": "{parse_text_content(string)}"'
    else:
        flag += -1
        tabs_counter += flag
        prev_action = 2
        return f'\n{tab(tabs_counter)}}}'
flag = 0
prev_action = 0
#0 - начало тэга, 1 - вывод элементов, 2 - конец тэга
def parse_xml_to_json():
    import time

    start_time = time.perf_counter()  # Начало измерения времени

    infile = open('timetable.xml', 'r', encoding='utf-8')
    outfile = open('timetable0.json', 'w', encoding='utf-8')

    strings = infile.read().split("\n")

    outfile.write("{\n")
    for line in strings[1:]:
        outfile.write(parse_tags(line))


    infile.close()
    outfile.close()

    end_time = time.perf_counter()  # Конец измерения времени
    return f'{end_time - start_time:.6f}'
