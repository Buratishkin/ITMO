def parse_xml_to_json():
    import xmltodict
    import json
    import time

    start_time = time.perf_counter()  # Начало измерения времени

    with open('timetable.xml', 'r', encoding='utf-8') as xml_file:
        xml_data = xml_file.read()

    # Преобразование XML в словарь
    dict_data = xmltodict.parse(xml_data)

    # Преобразование словаря в JSON и запись в файл
    with open('timetable1.json', 'w', encoding='utf-8') as json_file:
        json.dump(dict_data, json_file, indent=4, ensure_ascii=False)

    end_time = time.perf_counter()  # Конец измерения времени
    return f'{end_time - start_time:.6f}'
