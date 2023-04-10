# Sheet Music for Drums
Converts sheet music for "normal" instruments to a format that allows drummers to play the melody too.
(if the drummer is superhuman, that is)

## What does Sheet Music for Drums Mean? (in this case)
As we all know, a tone is actually just a sound wave with a certain frequency. For example, the tone a1 has a frequency of 440 Hz, that is, 440 oscillations per second.
If a drummer beats on a drum 440 times a second, then the tone a1 should be heard. (this is *obviously* possible to do)
This program converts sheet music to a format that tells the drummers how quickly to play.

## How do I Convert my Sheet Music?

### Preparations
1. Download the file [trummor.jar](https://github.com/en-programmerare/trumnoter/releases/tag/v0.0.2-alpha), which can be found under releases.
2. Make sure JVM 17+ is installed on your computer.
3. Convert you sheet music document into an **uncompressed** MusicXML file. In Musescore, this can be achieved as follows:
    - Open your sheet in Musescore.
    - Press "Export", which lies in the menu "File".
    - In the dialogue, choose the file format "MusicXML".
    - Thereafter, choose the file type "Uncompressed (*.musicxml)".
    - Export the document.
    
### Running the Program
1. Run the program
2. Choose which MusicXML-fil that contains the sheet music to be converted.
3. Choose where to save the drum sheet music.
4. Choose which part to convert.
5. Some debug information is shown, and a MusicXML file with the drum sheet music is created.

## Tips for Viewing and Playback
Musescore isn't particularly good at playing or viewing drum sheet music.
 
[Noteflight](https://www.noteflight.com/) display the sheet music quite well, and can be used to convert the result to PDF.
Because Noteflight is an online app, it can however be quite a slow program at times.
The playback stops working for very long documents, however, sound can still be exported.

To listen to the sheet music live, it seems like [Soundslice XML viewer](https://www.soundslice.com/musicxml-viewer/) is the only option.
It seems to be possible to listen to very long documents there.


# Trumnoter
Konverterar noter för vanliga instrument till ett format där även trummor kan vara med att spela melodin.
(om trummisen är övermänsklig, det vill säga)

## Vad menas med trumnoter? (i detta fall)
Det är allmänt känt att en ton egentligen bara är en ljudvåg med en viss frekvens. Exempelvis har tonen a1 en frekvens på 440 Hz, alltså 440 svängningar i sekunden.
Om en trummis slår på en trumma 440 gånger i sekunden bör alltså tonen a1 uppstå. (vilket *givetvis* är möjligt)
Detta program omvandlar noter till ett format som berättar för trummisarna hur snabbt de ska spela.

## Hur konverterar jag mina noter?

### Förberedelser
1. Ladda ned filen [trummor.jar](https://github.com/en-programmerare/trumnoter/releases/tag/v0.0.2-alpha), vilken återfinns under releases.
2. Kontrollera att JVM 17+ är installerat på din dator.
3. Konvertera ditt notdokument till en **okomprimerad** MusicXML-fil. I Musescore kan detta åstadkommas så här:
    - Öppna dina noter i Musescore.
    - Tryck på "Exportera", vilken återfinns under menyn "Arkiv".
    - I dialogrutan, välj filformatet "MusicXML".
    - Välj därefter filtypen "Okomprimerad (*.musicxml)".
    - Exportera dokumentet.
    
### Programkörning
1. Kör programmet
2. Välj den MusicXML-fil som innehåller noterna som ska konverteras.
3. Välj var trumnoterna ska sparas.
4. Välj vilken stämma som ska konverteras.
5. Lite debuginformation visas, och en MusicXML-fil med trumnoterna skapas.

## Tips på visnings- och uppspelningsprogram
Musescore är inte särskilt bra, varken på att visa eller spela upp trumnoter.
 
[Noteflight](https://www.noteflight.com/) visar noterna ganska bra, och kan användas för att konvertera resultatet till PDF och exportera ljud. 
Eftersom Noteflight är online kan dock programmet vara ganska långsamt.
Uppspelningen slutar fungera bra med alltför långa trumnotsdokument.
Man kan dock exportera ljud för godtyckligt långa dokument.

För att lyssna på noterna live fungerar mig veterligen endast [Soundslices XML-visare](https://www.soundslice.com/musicxml-viewer/).
Med den verkar man kunna lyssna även på långa trumnoter.
