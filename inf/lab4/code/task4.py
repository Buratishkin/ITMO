import task0
import task1
import task2
import task3

result = [0, 0, 0, 0]
for i in range(1000):
    time = [0, 0, 0, 0]
    time[0] = task0.parse_xml_to_json()
    time[1] = task1.parse_xml_to_json()
    time[2] = task2.parse_xml_to_json()
    time[3] = task3.parse_xml_to_json()

    for i in range(len(time)):
        if time[i] == max(time):
            result[i] += 1
            break

print(f'Обязательное задание выполнилось быстрее {result[0]} раз')
print(f'Первое доп задание выполнилось быстрее {result[1]} раз')
print(f'Второе доп задание выполнилось быстрее {result[2]} раз')
print(f'Третье доп задание выполнилось быстрее {result[3]} раз')