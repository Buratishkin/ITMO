import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import matplotlib

# Используем бэкенд, который сохраняет график в файл
matplotlib.use('Agg')

# Загрузка данных из предоставленного CSV файла
file_path = 'лаба5.csv'  # Укажите ваш путь к файлу
data = pd.read_csv(file_path,encoding='cp1251')

# Переименуем столбцы для удобства
data.columns = ['DATE', 'OPEN', 'HIGH', 'LOW', 'CLOSE']

# Убираем возможные пробелы
data['DATE'] = data['DATE'].str.strip()

# Проходим по каждой уникальной дате
for date in data['DATE'].unique():
    # Отфильтруем данные для текущей даты
    data_for_date = data[data['DATE'] == date]

    # Построение диаграммы "Ящик с усами" для текущей даты
    plt.figure(figsize=(10, 6))
    sns.boxplot(data=data_for_date[['OPEN', 'HIGH', 'LOW', 'CLOSE']])
    plt.title(f"Диаграмма 'Ящик с усами' для {date}")
    plt.ylabel("Значения")
    plt.xticks(rotation=45)

    # Сохранение графика в файл, используя дату в названии файла
    plt.savefig(f"boxplot_{date}.png")
    plt.close()  # Закрыть график, чтобы освободить память

    print(f"График для {date} сохранен как 'boxplot_{date}.png'")
