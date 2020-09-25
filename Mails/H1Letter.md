SPEED CARDS csoport tagjai:
 Baumel Márton:
Csapatvezető és Játék designer, Játék fejlesztés
 Markó Roland:
Frontend, software tesztelés, ,Játék fejlesztés
 Husoczki Dániel:
Frontend, Béta tesztek elkészítése, ellenőrzése, Játék fejlesztés
 Korita Zsófia:
Backend, SQL adatbázis kezelése, frissítése, karban tartása ,Játék fejlesztés
 Edl Levente:
Backend, SQL adatbázis és a software közötti kommunikáció biztosítása, Bugfixelés
,Játék fejlesztés
2.Fejlesztési terv: mérföldkövek, eredmények:
A projektet 3 +1 féle állapotra bontottuk, hogy montírozni tudjuk az előre haladást.
1. Alpha Állapot:
Ebben az állapbotban a programnak képesnek kell kezelni az adatbázisban lévő
elemeket ezenkívül képesnek kell biztosítania egy grafikus felületet, amin letudjuk
pakolni a lapokat de a alap játékmechanikák közül csak a körökre osztást és a kártya
adatok módosításának a képességét kell csak megvalósítania
2. Béta Állapot:
Ebben az állapotban a programnak rendelkeznie kell egy egységes grafikus felülettel
és képesnek kell lenünk a gép ellen lejátszani egy próbakört azaz a játékmechanikák
közül mindegyiket meg kell valósítani.
3.Kiadási Állapot:
Ebben a fázisban a játék grafikus felületét kell befejezni és a lapokok/paklik közötti
erő egyensúlyt kell stabilizálni.
+1 DEMO Állapot:
Ilyenkor a programnak kell rendelkeznie egy kezdetleges grafikus felülettel, a
játékmechanikák alapvető részét biztosítani kell (körökre osztás, kártya kijátszása, kártya
adatok módosítása, játékbefejezése) de saját paklit ilyenkor még nem leszünk képesek
létrehozni. Próbakört képesnek kell lejátszani a gép ellen.
3. Programozási nyelvek, fejlesztési eszközök
A software Java nyelven fejlesztjük, megírásához az Eclipse IDE fejlesztői környezetet fogjuk
használni. A csapatmunka, kódhozzáférés és a párhuzamosítás elősegítése érdekében a
GitHub használata mellett döntöttünk. A Software-ben található animációk és grafikus elemek
megjelenítéséért a java nyelv egyik könyvtára a JavaFX könyvtár fog felelni, továbbá a
softwarehez társítunk egy adatbázis rendszert is ami a játékosok és kártyák adatait fogja
tárolni. Ezt az adatbázis rendszert MySQL rendszerben fogjuk kivitelezni, ennek eléréséhez 
pedig PHP MyAdmin felületet fogunk használni. Azért választottuk a MySQL rendszert
mivel többfelhasználós és többszálon futó adatbázis kezelő rendszer és platform független
vagyis minden platformon el tudja érni a software az adatok betöltésekor. Java nyelvből
kezelhető a JDBC (Java DataBase Connectivity) segítségével. A JDBC egy API(Application
Programming Interface) amely definiálja az adatbázisok lekérdezéséhez és módosításához
szükséges osztályokat és metódusokat. A MySQL adatbázis eléréséhez azért választottunk
PhpMyAdmin felületet mivel ez egy grafikus felület és könnyen átlátható ellentétben a
consoleos(Parancssori) felülettel.
4.Használni tervezett eszközök, technikák:
A programot személyi számítógépekre szánjuk, egyelőre csak Windows operációs rendszerre
tervezzük teljes mértékben futhatóvá tenni de később szeretnénk Linux-ra és iOS rendszerekre
is elérhetővé tenni a kész játékszoftvert.
Technikai szempontból szeretnénk megvalósítani az Objektum Orientál Programozás
programozási paradigmáit a gyakorlatban. Emelet adatbázis rendszert (MySQL-t) is
szeretnénk használni, hogy a kártyák adatai ott tudjuk eltárolni és később használni a program
futtatása alatt.
Ezenkívül szeretnénk egy verzió kezelő rendszert alkalmazni a Git-et és, hogy megkönnyítsük
a használatát a GitHub oldalát tervezzük használni a projekt elvégzése folyamán, hogy
nyomon tudjuk követni a forrás fájl változásait és a projekt közben felmerülő feladatok
kezelését.
5. Leendő produktumok (dokumentumok) és létrejöttük ideje
Adatbázis:
 A kártyák jellemzőinek tárolása
 Élettartam tárolása
 Egyéb tulajdonságok, hatások tárolása
 Legelső fázis
Java:
 Classok létrehozása
 Játék mechanikájáért lesz felelős
 Az adatbázisból szedi a szükséges információt
 A varázslatok hatását beteszi az adatbázisba, illetve később ki is veszi belőle
 A meglévő életpontokat kezeli
 Az adatbázis elkészítése utáni következő feladat
JavaFX:
 A játék vizuális részéért lesz felelős
 Az alap mechanika után kezdjük el a fejlesztését
6.Tesztelési követelmények
A szoftver tesztelést a gyakorlatban fogjuk végrehajtani. Ezt úgy tervezzük megoldani, hogy a
játék béta állapotát mindenki számára elérhetővé tennénk és aki hibát találna azt játékbeli
jutalommal jutalmaznánk.
Ezenkívül, hogy minden felhasználónak megértethővé és átláthatóvá tudjuk tenni a szoftvert
ezért korcsoport alapján is teszteket szeretnék végezni.
7.Bemutatás (demó) és szállítás módja, ideje
A Demó bemutatása a DEMO állapotban az Alpha és a Béta verzió közötti követelmények
elérésekor történik, a tesztelések után, ahol a játék már játszható állapotban van, rendelkezik
grafikus felülettel, ebben a kezdetleges állapotban még csak a gép ellen tudunk játszani a
"történet" módban, még nincs olyan mód ahol más játékosok ellen játszhatnánk. Tudunk
kártyákat kijátszani a már létező pakliból de ebben az állapotban viszont még nem vagyunk
képesek saját paklit létrehozni.
A Demó szállítási módja fizikai adattárolón fog történni, ezenkívül a projekt ezen verziója
elérhető lesz a GitHub oldalán lévő projektben egy külön branch-ben is.
8.Információ források
A játék alapötletét főként három, már létező online kártyajáték adta:
1. A Blizzard Entertainment játéka, a Hearthstone , https://playhearthstone.com/en-us/
2. A Yu-Gi-Oh! mese alapján készült, Yu-Gi-Oh! Duel Links
https://store.steampowered.com/app/601510/YuGiOh_Duel_Links/?l=hungarian
3. A The Witcher RPG játékon alapuló, GWENT kártyajáték
https://www.playgwent.com/en
A három játéknak számos közös tulajdonsága van, ilyen az is, hogy mind egy fiktív világban
játszódik. A játékokban lévő kitalált karakterekkel és lényekkel tudunk játszani, akár
különféle pályákon, más-más ellenfelekkel. Mindháromnak több egyéni tulajdonsága is van,
amikből mi ötletet merítve vetettük fel egy teljesen új játék, a SpeedCard ötletét, ami a három
játék alapvető játékmechanikája alapján fog felépülni.
