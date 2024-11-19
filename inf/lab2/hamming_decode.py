def hamming_decode(bits):
    # Проверочные биты
    p1 = bits[0]
    p2 = bits[1]
    p4 = bits[3]

    # Информационные биты
    d3 = bits[2]
    d5 = bits[4]
    d6 = bits[5]
    d7 = bits[6]

    # Вычисление синдромов
    s1 = (p1 + d3 + d5 + d7) % 2
    s2 = (p2 + d3 + d6 + d7) % 2
    s3 = (p4 + d5 + d6 + d7) % 2

    # Синдром: если не равен 0, указывает на ошибку
    error_position = s1 + (s2 * 2) + (s3 * 4)

    # Если синдром не равен 0, исправляем бит с ошибкой
    if error_position != 0:
        print(f"Ошибка в бите {error_position}")
        bits[error_position - 1] ^= 1  # Инвертируем бит

    else:
        print("Ошибок нет")

    # Возвращаем информационные биты (d3, d5, d6, d7)
    message = [d3, d5, d6, d7]

    print("Правильное сообщение:")
    return message

#Ввод последовательности и преобразование в массив
input_string = input("Введите 0 и 1 подряд: ")
bits = [int(dig) for dig in input_string]

#Проверка на дурака
if len(bits) != 7 or max(bits) != 1 or min(bits) <= 0:
  print("Введена неправильная последовательность")
else:
  print(hamming_decode(bits))