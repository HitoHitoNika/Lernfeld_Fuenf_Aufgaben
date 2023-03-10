# ECLIPSE SETUP

Die Einrichtung von Git selbst wird hier nicht erklärt ! Nur die Eclipse Integration.

Das ganze wird erst in Stichpunkten erklärt und dannach mit einem Video bildlich dargestellt.

Meine Sachen sind alle auf English, aber das sollte ja hoffentlich kein Problem sein 😊

Danke an CJ den Löwen fürs testen ❤️

###### SSH Key einrichten

- Window
    -> Preferences
    -> General
    -> Network Connections
    -> SSH2
    -> Key Management

- Generate RSA Key
    -> den Key aus der Textbox *kopieren* 
    -> Save Private Key 

https://user-images.githubusercontent.com/103290810/224427871-8c34e9ca-4081-45d8-ac25-a3502628e79f.mp4

- Damit wärt ihr in Eclipse fertig

- Danach geht ihr auf euren Github Account:

- Oben rechts auf euer Profilbild
    -> Settings

- Links bei dem Unterpunkt Access
    -> "SSH and GPG keys" anklicken
    -> New SSH key
    -> Title ist egal, nimmt einfach Eclipse
    -> Key type "Authentication Key"
    -> Und dann den vorher kopierten Key einfügen
    -> Add SSH key

![](https://github.com/HitoHitoNika/Lernfeld_Fuenf_Aufgaben/blob/master/misc/Eclipse%20Guide/Guide_3.gif)

###### Projekt in Eclipse clonen

- Auf das Repo gehen (Wenn ihr das liest seid ihr richtig)
    -> Den Button "<> Code" anklicken
    -> Local
    -> SSH
    -> Link kopieren

![](https://github.com/HitoHitoNika/Lernfeld_Fuenf_Aufgaben/blob/master/misc/Eclipse%20Guide/Guide_4.png)
![](https://github.com/HitoHitoNika/Lernfeld_Fuenf_Aufgaben/blob/master/misc/Eclipse%20Guide/Guide_5.png)

- Eclipse öffnen (Bitte hier auf die Bilder achten, etwas schwierig zu erklären)
    ->Obere rechte Ecke auf GIT-Ansicht wechseln
    ->Links auf die Fläche *unter* den 3 Optionen drücken (Keine Option anklicken)
    ->Link einfügen 

![](https://github.com/HitoHitoNika/Lernfeld_Fuenf_Aufgaben/blob/master/misc/Eclipse%20Guide/Guide_6.png)

- Es sollte sich ein neues Fenster öffnen
    -> Location sollte auto filled sein, wenn nicht die oberen Schritte in Eclipse wiederholen
    -> Connection sollte auf ssh stehen
    -> Authentication sollte als User nur git stehen

![](https://github.com/HitoHitoNika/Lernfeld_Fuenf_Aufgaben/blob/master/misc/Eclipse%20Guide/Guide_7.png)

- Branch Selection 
    -> Nur einen Haken bei "developer" setzen
    -> Next

![](https://github.com/HitoHitoNika/Lernfeld_Fuenf_Aufgaben/blob/master/misc/Eclipse%20Guide/Guide_8.png)

- Local Destination
    -> Locales Verzeichnis auswählen (Da wo es gespeichert werden soll)

![](https://github.com/HitoHitoNika/Lernfeld_Fuenf_Aufgaben/blob/master/misc/Eclipse%20Guide/Guide_9.png)

- Wizzard auswahl (Credit an CJ <3)
    -> Import as general project

![](https://github.com/HitoHitoNika/Lernfeld_Fuenf_Aufgaben/blob/master/misc/Eclipse%20Guide/Guide_11.png)

###### Eigenen Branch erstellen

- Rechts klick auf "Lernfeld_Fuenf_Aufgaben"
- Switch to
- New Branc
- Branch name: Einfach euren Namen oder so
- Configure upstream for push and pull
- When pulling: "Rebase"
- Check out new branch
- Finish

![](https://github.com/HitoHitoNika/Lernfeld_Fuenf_Aufgaben/blob/master/misc/Eclipse%20Guide/Guide_10.png)

###### Code editieren           (Sorry für den Mental Breakdown CJ ❤️)

- Oben rechts zurück in die Java Ansicht
- File
    -> Open Project from File System
    -> Euren Ordner auswählen

https://user-images.githubusercontent.com/103290810/224436700-cfdd143f-50f3-46e2-8be3-53c0c5c060c9.mp4


###### Code pushen
# Bitte nur machen wenn ihr in eurem eigenen Branch seid
- Rechts klick auf euer Project
- Team
- (Prüfen ob in eigenem Branch bei dem Unterpunkt "Switch to")
- Wenn in eigenem Branch oben auf "Commit..."
- Bei unstagged changes auf das doppel + drücken (siehe Bilder)
- Bei Commit Message ein Kommentar eingeben was ihr geändert habt
- Unten rechts auf "Commit and Push"

![](https://github.com/HitoHitoNika/Lernfeld_Fuenf_Aufgaben/blob/master/misc/Eclipse%20Guide/Guide_12.png)

# Bitte nur machen wenn ihr in eurem eigenen Branch seid 

![](https://github.com/HitoHitoNika/Lernfeld_Fuenf_Aufgaben/blob/master/misc/Eclipse%20Guide/Guide_13.png)

# DANKE ❤️

###### Bei Fragen/Anmerkungen/Fehlersichtung/etc einfach auf mich zukommen ich schau gerne mal drauf :)








