#Cоздание каталога lab0 и переход к нему
mkdir lab0
cd lab0
#Создание каталогов и файлов внутри lab0 + заполнение файлов при помощи cat
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

#Задание прав на файлы и каталоги
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

chmod 444 munchlax9

chmod 737 poliwhirl0
chmod 062 poliwhirl0/piplup
chmod 664 poliwhirl0/gothita
chmod 600 poliwhirl0/ekans

chmod 062 rufflet3
#
chmod 711 clefable6
ln rufflet3 clefable6/slowpokerufflet

ln -s munchlax9 poliwhirl0/gothitamunchlax

cat clefable6/azurill clefable6/slowpoke > charizard6_80

chmod 750 blastoise4
chmod 762 rufflet3
chmod 770 blastoise4/doduo
cp rufflet3 blastoise4/doduo

cp charizard6 clefable6/slowpokecharizard

cp -r clefable6 blastoise4/finneon
#
