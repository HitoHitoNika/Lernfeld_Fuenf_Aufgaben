# ECLIPSE SETUP

Die Einrichtung von Git selbst wird hier nicht erklärt ! Nur die Eclipse Integration.

Das ganze wird erst in Stichpunkten erklärt und dannach mit einem Video bildlich dargestellt.

Meine Sachen sind alle auf English, aber das sollte ja hoffentlich kein Problem sein 😊

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

![](misc\Eclipse Guide\Guide_2.mp4)

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

![](misc\Eclipse Guide\Guide_3.mp4)

###### Projekt in Eclipse clonen

- Auf das Repo gehen (Wenn ihr das liest seid ihr richtig)
    -> Den Button "<> Code" anklicken
    -> Local
    -> SSH
    -> Link kopieren

![](misc\Eclipse Guide\Guide_4.png)
![](misc\Eclipse Guide\Guide_5.png)

- Eclipse öffnen (Bitte hier auf die Bilder achten, etwas schwierig zu erklären)
    ->Obere rechte Ecke auf GIT-Ansicht wechseln
    ->Links auf die Fläche *unter* den 3 Optionen drücken (Keine Option anklicken)
    ->Link einfügen 

![](misc\Eclipse Guide\Guide_6.png)

- Es sollte sich ein neues Fenster öffnen
    -> Location sollte auto filled sein, wenn nicht die oberen Schritte in Eclipse wiederholen
    -> Connection sollte auf ssh stehen
    -> Authentication sollte als User nur git stehen

![](misc\Eclipse Guide\Guide_7.png)

- Branch Selection 
    -> Nur einen Haken bei "developer" setzen
    -> Next

![](misc\Eclipse Guide\Guide_8.png)

- Local Destination
    -> Locales Verzeichnis auswählen (Da wo es gespeichert werden soll)
    -> Finish

![](misc\Eclipse Guide\Guide_9.png)

###### Eigenen Branch erstellen

- Rechts klick auf "Lernfeld_Fuenf_Aufgaben"
- Switch to
- New Branc
- Branch name: Einfach euren Namen oder so
- Configure upstream for push and pull
- When pulling: "Rebase"
- Check out new branch
- Finish

![](misc\Eclipse Guide\Guide_10.png)






