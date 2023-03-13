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

![Guide_3](https://user-images.githubusercontent.com/103290810/224773643-71c8f5b4-a106-4342-807e-e0adbb920f52.gif)


###### Projekt in Eclipse clonen

- Auf die Startseite des Repos gehen 
    -> Den Button "<> Code" anklicken
    -> Local
    -> SSH
    -> Link kopieren
<img width="1895" alt="Guide_4" src="https://user-images.githubusercontent.com/103290810/224773694-3852f162-7d8a-4011-96e2-9dfa9fd09dcc.png">
<img width="447" alt="Guide_5" src="https://user-images.githubusercontent.com/103290810/224773746-4b9eb2f8-720b-49bd-8f49-a3f4a71b9ae5.png">


- Eclipse öffnen (Bitte hier auf die Bilder achten, etwas schwierig zu erklären)
    ->Obere rechte Ecke auf GIT-Ansicht wechseln
    ->Links auf die Fläche *unter* den 3 Optionen drücken (Keine Option anklicken)
    ->Link einfügen 

![Guide_6](https://user-images.githubusercontent.com/103290810/224773785-09649ec1-72a4-40ce-bdf0-18359d0fd7c6.png)


- Es sollte sich ein neues Fenster öffnen
    -> Location sollte auto filled sein, wenn nicht die oberen Schritte in Eclipse wiederholen
    -> Connection sollte auf ssh stehen
    -> Authentication sollte als User nur git stehen

<img width="505" alt="Guide_7" src="https://user-images.githubusercontent.com/103290810/224773856-afc47b71-db20-4e5d-9109-885ee4396114.png">

- Branch Selection 
    -> Nur einen Haken bei "developer" setzen
    -> Next

<img width="500" alt="Guide_8" src="https://user-images.githubusercontent.com/103290810/224773898-4fdaa0e3-6bd7-417e-9828-ba22222d6cda.png">

- Local Destination
    -> Locales Verzeichnis auswählen (Da wo es gespeichert werden soll)

<img width="503" alt="Guide_9" src="https://user-images.githubusercontent.com/103290810/224773932-8d70734e-0256-4bbd-b823-7a71e2a3140c.png">

- Wizzard auswahl (Credit an CJ <3)
    -> Import as general project

![Guide_11](https://user-images.githubusercontent.com/103290810/224773965-e74cdb8a-1ad2-4b6d-906d-cf4a78105995.png)

###### Eigenen Branch erstellen

- Rechts klick auf "Lernfeld_Fuenf_Aufgaben"
- Switch to
- New Branc
- Branch name: Einfach euren Namen oder so
- Configure upstream for push and pull
- When pulling: "Rebase"
- Check out new branch
- Finish

![Guide_10](https://user-images.githubusercontent.com/103290810/224774010-4f8b6053-0cd9-4899-a895-c2468c50dbca.png)

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

![Guide_12](https://user-images.githubusercontent.com/103290810/224774056-c0b07a7e-eefd-4cc3-ad77-8477b576e8bd.png)

# Bitte nur machen wenn ihr in eurem eigenen Branch seid 

![Guide_13](https://user-images.githubusercontent.com/103290810/224774077-454899e9-f0d1-45ab-8788-98262394bf2a.png)

# DANKE ❤️

###### Bei Fragen/Anmerkungen/Fehlersichtung/etc einfach auf mich zukommen ich schau gerne mal drauf :)








