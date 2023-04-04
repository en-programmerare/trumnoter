# Trumnoter
Konverterar noter för vanliga instrument till ett format där även trummor kan vara med att spela melodin.
(om trummisen är övermänsklig, det vill säga)

## Vad menas med trumnoter i detta fall?
Det är allmänt känt att en ton egentligen bara är en ljudvåg med en viss frekvens. Exempelvis har tonen a1 en frekvens på 440 Hz, alltså 440 svängningar i sekunden.
Om en trummis slår på en trumma 440 gånger i sekunden bör alltså tonen a1 uppstå. (vilket *givetvis* är möjligt)
Detta program omvandlar noter till ett format som berättar för trummisarna hur snabbt de ska spela.

## Hur konverterar jag mina noter?

### Förberedelser
1. Ladda ned filen [trummor.jar](https://github.com/en-programmerare/trumnoter/releases/tag/v0.0.1-alpha), vilken återfinns under releases.
2. Kontrollera att JVM 17+ är installerat på din dator.
3. Konvertera ditt notdokument till en **okomprimerad** MusicXML-fil. I Musescore kan detta åstadkommas så här:
    a. Öppna dina noter i Musescore.
    b. Tryck på "Exportera", vilken återfinns under menyn "Arkiv".
    c. I dialogrutan, välj filformatet "MusicXML".
    d. Välj därefter filtypen "Okomprimerad (*.musicxml)".
    e. Exportera dokumentet.
    
### Programkörning
1. Kör programmet
2. Välj den MusicXML-fil som innehåller noterna som ska konverteras.
3. Välj var trumnoterna ska sparas.
4. Välj vilken stämma som ska konverteras.
5. Lite debuginformation visas, och en MusicXML-fil med trumnoterna skapas.

## Tips på visnings- och uppspelningsprogram
Musescore är inte särskilt bra, varken på att visa eller spela upp trumnoter.
 
[Noteflight](https://www.noteflight.com/) visar noterna ganska bra, och kan användas för att konvertera resultatet till PDF. 
Eftersom Noteflight är online kan dock programmet vara ganska långsamt.
Uppspelningen slutar fungera bra med alltför långa trumnotsdokument.

För att lyssna på noterna fungerar mig veterligen endast [Soundslices XML-visare](https://www.soundslice.com/musicxml-viewer/).
Med den verkar man kunna lyssna även på långa trumnoter.
