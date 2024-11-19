#!/bin/bash
until rm -rf `find lab0 2> /dev/null` 2> /dev/null; do
chmod -R 777 lab0 2> /dev/null
done
#0
mkdir lab0
cd lab0
#1
mkdir blastoise4
echo "Возможности Overland=6 Surface=2 Jump=3 Power=1
Intelligence=4" > blastoise4/venonat
mkdir blastoise4/finneon
mkdir blastoise4/doduo
  
echo "Развитые способности Solar
Power" > charizard6

mkdir clefable6
mkdir clefable6/trubbish
mkdir clefable6/raichu
echo "Ходы Body Slam Covet Double-Edge Heal Bell Helping Hand
Hyper Voice Iron Tail Last Resort Mud-Slap Sleep Talk Snore
Swift" > clefable6/eevee
echo "Тип покемона NORMAL NONE" > clefable6/azurill
mkdir clefable6/dusclops
echo "Живет Beach
Freshwater" > clefable6/slowpoke

echo "weight=231.5 height=24.0 atk=9
def=4" > munchlax9

mkdir poliwhirl0
echo "Возможности Overland=4 Surface=6 Underwater=3 Jump=1
Power=1  Intelligence=2 Fountain=2" > poliwhirl0/piplup
echo "Живет Forest
Urban" > poliwhirl0/gothita
echo "satk=4 sdef=5 spd=6" > poliwhirl0/ekans

echo "weight=23.1 height=20.0
atk=8 def=5" > rufflet3

#2
chmod 550 blastoise4
chmod 620 blastoise4/venonat
chmod 753 blastoise4/finneon  
chmod 570 blastoise4/doduo

chmod 400 charizard6

chmod 511 clefable6
chmod 753 clefable6/trubbish
chmod 777 clefable6/raichu
chmod 644 clefable6/eevee
chmod 440 clefable6/azurill
chmod 735 clefable6/dusclops
chmod 660 clefable6/slowpoke

chmod a=r munchlax9

chmod 737 poliwhirl0
chmod 062 poliwhirl0/piplup
chmod 664 poliwhirl0/gothita
chmod 600 poliwhirl0/ekans

chmod 062 rufflet3
#3
echo "3.1"
#cоздать жесткую ссылку для файла rufflet3 с именем lab0/clefable6/slowpokerufflet
chmod 711 clefable6
ln rufflet3 clefable6/slowpokerufflet4
echo "3.2"
#cоздать символическую ссылку для файла munchlax9 с именем lab0/poliwhirl0/gothitamunchlax
ln -s munchlax9 poliwhirl0/gothitamunchlax 
echo "3.3"
#объеденить содержимое файлов lab0/clefable6/azurill, lab0/clefable6/slowpoke, в новый файл lab0/charizard6_80
cat clefable6/azurill clefable6/slowpoke > charizard6_80
echo "3.4"
#создать символическую ссылку c именем Copy_45 на директорию poliwhirl0 в каталоге lab0
ln -s poliwhirl0 Copy_45
echo "3.5"
#скопировать файл rufflet3 в директорию lab0/blastoise4/doduo
chmod 750 blastoise4
chmod 762 rufflet3
chmod 770 blastoise4/doduo
cp rufflet3 blastoise4/doduo
echo "3.6"
#скопировать содержимое файла charizard6 в новый файл lab0/clefable6/slowpokecharizard
cp charizard6 clefable6/slowpokecharizard
echo "3.7"
#скопировать рекурсивно директорию clefable6 в директорию lab0/blastoise4/finneon
cp -r clefable6 blastoise4/finneon
#возвращаю все права доступа обратно
chmod 550 blastoise4
chmod 570 blastoise4/doduo
chmod 511 clefable6
chmod 062 rufflet3
#4
#Рекурсивно подсчитать количество символов содержимого файлов из директории lab0, имя которых заканчивается на 'e',
#отсортировать вывод по увеличению количества, ошибки доступа не подавлять и не перенаправлять
echo "4.1"
grep -rl 'e$' | xargs wc -m | sort -n
#Вывести два первых элемента рекурсивного списка имен и атрибутов файлов в директории lab0, содержащих строку "du",
#список отсортировать по возрастанию даты модификации файла, ошибки доступа перенаправить в файл в директории /tmp
echo "4.2"
touch /tmp/myerrors
ls -ltR 2>/tmp/myerrors | grep "du" | head -2
#Вывести содержимое файла munchlax9 с номерами строк, исключить строки, заканчивающиеся на 'r', 
#регистр символов игнорировать, добавить вывод ошибок доступа в стандартный поток вывода
echo "4.3"
grep -niv 'r$' munchlax9 2>&1
#Вывести рекурсивно список имен файлов в директории poliwhirl0, список отсортировать по имени z->a, подавить вывод ошибок доступа
echo "4.4"
ls -R poliwhirl0 2>/dev/null | sort -r
#Вывести три первых элемента рекурсивного списка имен и атрибутов файлов в директории lab0, содержащих строку "on", 
#список отсортировать по убыванию даты модификации файла, добавить вывод ошибок доступа в стандартный поток вывода
echo "4.5"
ls -ltR 2>&1 | grep "on" | head -3
#Вывести два первых элемента рекурсивного списка имен и атрибутов файлов в директории lab0, начинающихся на символ 'd', 
#список отсортировать по убыванию даты изменения записи о файле, ошибки доступа не подавлять и не перенаправлять
echo "4.6"
ls -ltR | grep '^d' | head -n 2
#5
echo "5.1"
chmod 744 munchlax9 
rm munchlax9
echo "5.2"
chmod u+w clefable6
rm clefable6/eevee
echo "5.3"
ls -l Copy_* | grep ^l | awk '{print $9}' | xargs rm
echo "5.4"
chmod 762 clefable6/slowpokerufflet4
rm clefable6/slowpokeruffl*
echo "5.5"
chmod 762 poliwhirl0/piplup
rm -r poliwhirl0
echo "5.6"
chmod 750 blastoise4
chmod 770 blastoise4/doduo
rm -r blastoise4/doduo
chmod 550 blastoise4
