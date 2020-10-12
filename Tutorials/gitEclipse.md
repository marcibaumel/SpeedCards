# Hogyan is lehet használni, a Git-et és hogyan is lehet használni ezt a Eclipse környezet alatt + egy kicsi a GitHub-ról.
![alt text](https://avatars3.githubusercontent.com/u/18133?s=200&v=4 "")

Ebben a rövid írásban csak a felszínét fogom érinteni a Git-nek, és most csak a GitHub “kiegészítőről” lesz szó.

## Git használat:

2(+1) megoldást tudunk használni egyrészt a Github Desktop nevű kiegészítőt amivel nem magában a környezetben kell a Git parancsokat elvégezni hanem egy külön programban (https://desktop.github.com/). Ez egy sokkal egyszerűbb eszköz ezért számos funkció hiányzik is belőle de most véleményem szerint ez is elegendő lesz a feladat elvégzésében és így nem kell használni az Eclipse Git kezelőjét.

Az Eclipse elindításakor a képernyőn van egy választható lehetőség: “Checkout projects from Git”. Ott kérni fog egy linket a GitHub page-ről, hogy meg találja a helyet, hogy honnan kell lemásolnia a forrásállományt és itt meg kell adnod a GitHub fiókod felhasználó nevét és jelszavát (és jó ha be pipálod, hogy jegyezze meg mert elég nagy szívás tud lenni ha mindig be kellene írni). Ezek után a project fajtánál a “standard” project típust kell választani és elméletileg a fejlesztő környezet automatikusan be is tölti a projektet.

+Aki nagyon pro akar lenni használhatja parancssorból is de ezt nem nagyon javaslom. Igaz, hogy itt van a legtöbb lehetőségünk de ez a “legbonyolultabb” is, és nem hiszem, hogy ennél a projektnél bármelyik bónusz funkció kelleni fog.

A lerakott segédletben ez a folyamat teljes mértékben benne van videó formájában és ezen kívül a git parancsok pontos elérése is, hogy hol mit is találsz mert arra most én külön nem fogok kitérni. 

## Git fogalmak:

Csak a legalapvetőbb fogalmakat fogom most leírni és megpróbálom minél egyszerűbben megfogalmazni őket de ezek azért jóval komplexebb folyamatok ennél.

* Clone: amikor lehúzod a git repository (mostantól reponak fogom nevezni)

* Repesotrity: nagyon lazán megfogalmazva ez egy “mappa”/tároló 

* Master: ez a fő repo azaz a master repo. Erre csak akkor pusholjuk az általunk készült “feature”-t, ha teljes mértékben biztosak vagyunk benne, hogy nem rontunk el vele semmit. Ez lesz a projektunk végső változata ezért is csak akkor tegyünk bele újítást ha teljes mértékben biztosak vagyunk benne, hogy nem rontunk el vele semmit. 

* Branches: egy branch olyan mintha lenne egy különálló mappánk a projektől, de ezt a “mappa”-át ha úgy állítjuk be tartalmazni fogja a master repo tartalmát és ezen a branchen olyan változtatásokat eszközölhetünk amilyeneket csak szeretnénk és így nem nyúlunk bele a master-be mégis a tartalmával fogunk dolgozni (pl.: ha csinálsz egy weboldalt, az eredeti weboldalból (azaz ami van a master repo-n) csinálsz egy új branchet “amit csinálsz”/feature néven elnevezve, legyen ez az egyik gombnak a funkciója, ekkor elnevezed ezt “newBtn/feature”-nek, megírod a kódot ebben a branchbe és amikor végeztél kérsz egy pull request-et vagy ha nagyon biztos vagy magadban akkor simán bele mergeled a master repoba (ezt tényleg akkor használd ha nagyon egyszerű változtatásokat írtál) és ezek utána a projekt végleges változata is fogja tartalmazni azt amit ebben az új branch-be megalkottál). 

* Merge: “beolvasztás”, azaz ha végeztél egy új feature-el akkor ezzel lehet egyesíteni a brancheket. 
![alt text](https://thumbs.gfycat.com/SoggyAdorableGuanaco-size_restricted.gif "")

* Pull Request: ha végeztél egy feature-el és át akarod nézni valakivel, hogy jó-e akkor kérheszt ilyet, ez a legbiztonságosabb a merge előtt vagy akkor ha nem vagy valamiben biztos.

* Commit: ez egy kicsit trükkös, de a git nél képzelj el 3 helyet, a saját gépedet, egy local/”helyi” repository-t és egy távoli repository-t(ez az ami a interneten van). Ha elmentesz valamit akkor azt a saját gépeden tárolod, ezeket a változtatásokat menteni szeretnéd akkor commit paranccsal tudod majd tárolni a saját local repodban (olyan mintha mentenél egyet ide is de erre van külön gomb és akkor azt kell megnyomni, hogy commitold a változtatásokat).   

* Push: A local repodban lévő tartalmat küldöd el a távoli repoba. Azaz amit eddig commitoltál azokat a változtatásokat küldöd el a távoli repo-ba.

* Conflict: Ha ezt meglátod félj. Ekkor az van, hogy valami amit írtál ütközik azzal ami az adot branchben benne van. Ilyenkor nézd át a kód állományt és reménykedj, hogy nem kell sokat szívni vele.

![alt text](https://thumbs.gfycat.com/ReasonableMilkyGnat-small.gif "")

* Fetch: ilyenkor megtudod nézni, történt valami változás abban a branch-ben amiben éppen benne vagy. Ezt a program minden megnyitása előtt érdemes elvégezni, hogy a legfrissebb állományal dolgoz és ezzel is csökkented a későbbi esélyt arra, hogy conflict helyzet legyen.

* Pull: a változtatásokat amik a branch-ben történtek korábban, bele rakod a saját állományodba és onnantól kezdve azzal is dolgozhatsz (mintha lefrissitenéd a kódodat és ilyenkor belekerül az a változtatás amit más írt ugyanabban a repoban). Ha valaki előtted pushol mielőtt te tennéd, azaz lesz nektek 2 külön forrás kódotok egy kódhoz, ilyenkor azé fog hamarabb felkerülni a távoli repoba aki hamarabb push-ol és a későbbi pusholonk a push előtt bele kell raknia a saját változtatásait manuálisan az új "alap" kód állományba.

**A közös munka megvalósítás érdekében, ha egy branchet többen használtok akkor beszéljétek meg ki mikor használja és ezzel is meg lehet akadályozni a conflict megvalósulását.** 

![alt text](https://thumbs.gfycat.com/DefensiveFlashyEft-max-1mb.gif "")

## GitHub használata:

Rengeteg olyan szolgáltatás van ami segíti a git használatát én azért választottam a GitHub-ot mert ennek a felületét ismerem a legjobban és a legtöbben is ezt használják, meg ingyenes csapatoknak is minimális megkötéssel. Az oldalon mindenki mindenbe bele nyúlhat. Én most csak a projektekről és az issue-ról fogok kitérni de aki jobban bele szeretne menni az is fog találni pár linket segítségül. Az issue a megoldandó probléma ezt fel lehet venni (assign yourself opciónál) és így a legegyszerűbb monitorozni ki mit csinál éppen. A projekteket én beosztottam a H-rendbe így egyszerűbb lesz szerintem számon tartani, hogy az adott beküldési határidőig mit kell még megcsinálni. Ebben szabadon írhat mindenki és tanácsként azt tudnám javasolni, hogy bontsd szét részt feladatokra az adott “nagy” feladatott így ha elakadszt valamivel vagy váratlanul blokkoló tényezővel találkozol (pl.: jövő héten matek ZH és nem lesz rá időd, hogy meg tud csinálni) ami nem enged tovább haladni az adott feladattal így mások is tudnak majd segíteni.

Project leírás:
* To do: amit meg kellene csinálni, ilyenkor is jó ha felveszed magadhoz azt a feladatot amit meg fogsz csinálni mert akkor egyértelműen látszani fog melyik feladathoz lehet hozzákezdeni még, ilyenkor jó leírni az alap body-ját az issue-nak.

* In progress: folyamatba lévő feladat azaz elkezdted megcsinálni, ilyankor az issue body részét jó kiegészíteni pontos leírással. 

* Blocked: “elakadásjelző”

* Review in progress: Pull Request-be berakott feladat ami még nincs átnézve. Azaz ha készen vagy valamivel rakd ide azt a issue-t és amikor beszélünk róla megtudjuk nézni, hogy biztos jó lesz-e.

* Done: befejezett feladat. 

Elsőre ez a sok info nagyon sok tud lenni ezért ha most még nem is érted teljesen akkor sincs semmi probléma a legtöbb dolgot kipróbálva fog értelmet nyerni és onnantól kezdve nagyon egyszerű lesz használni ezt a technikát.

Köszönöm, hogy elolvastad.
  
## Segítségek:

http://math.bme.hu/~balazs/git/gitcml.html

https://www.youtube.com/watch?v=HvyN6oWLxS0&feature=emb_title&ab_channel=progskills

https://www.youtube.com/watch?v=XuuzSaelUzo&ab_channel=GitHubTraining%26Guides

https://www.youtube.com/watch?v=HCeBd5GKNO8&ab_channel=SDET-QAAutomationTechie

https://www.geo.uzh.ch/microsite/reproducible_research/post/rr-eclipse-git/

https://guides.github.com/activities/hello-world/

https://guides.github.com/

https://www.youtube.com/watch?v=XZbYXz7aMJc&ab_channel=CodyHenrichsen

https://www.youtube.com/watch?v=XuuzSaelUzo&ab_channel=GitHubTraining%26Guides

https://www.youtube.com/watch?v=0fKg7e37bQE&ab_channel=LearnCode.academy

https://www.youtube.com/watch?v=ptK9-CNms98&ab_channel=TheCherno

https://www.git-tower.com/learn/git/faq/difference-between-git-fetch-git-pull

https://git-scm.com/book/en/v2
