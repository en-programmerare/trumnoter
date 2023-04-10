package io.github.enprogrammerare.trumnoter;

public class MusicXMLTemplates {
	
	/**
	 * A MusicXML template containing an empty staff for a wood block.
	 */
	public static final String EMPTY_WOOD_BLOCK_TEMPLATE = """
			<?xml version="1.0" encoding="UTF-8"?>
			<!DOCTYPE score-partwise PUBLIC "-//Recordare//DTD MusicXML 4.0 Partwise//EN" "http://www.musicxml.org/dtds/partwise.dtd">
			<score-partwise version="4.0">
			  <work>
			    <work-title>Namnlös not</work-title>
			    </work>
			  <identification>
			    <encoding>
			      <software>Trumnoter 0.0.0.0.0.0.1</software>
			      <encoding-date>2023-03-29</encoding-date>
			      <supports element="accidental" type="yes"/>
			      <supports element="beam" type="yes"/>
			      <supports element="print" attribute="new-page" type="no"/>
			      <supports element="print" attribute="new-system" type="no"/>
			      <supports element="stem" type="yes"/>
			      </encoding>
			    </identification>
			  <part-list>
			    <score-part id="P1">
			      <part-name>Träblock</part-name>
			      <part-abbreviation>Tr.bl.</part-abbreviation>
			      <score-instrument id="P1-I77">
			        <instrument-name>High Wood Block</instrument-name>
			        </score-instrument>
			      <score-instrument id="P1-I78">
			        <instrument-name>Low Wood Block</instrument-name>
			        </score-instrument>
			      <midi-device port="1"></midi-device>
			      <midi-instrument id="P1-I77">
			        <midi-channel>10</midi-channel>
			        <midi-program>49</midi-program>
			        <midi-unpitched>77</midi-unpitched>
			        <volume>78.7402</volume>
			        <pan>0</pan>
			        </midi-instrument>
			      <midi-instrument id="P1-I78">
			        <midi-channel>10</midi-channel>
			        <midi-program>49</midi-program>
			        <midi-unpitched>78</midi-unpitched>
			        <volume>78.7402</volume>
			        <pan>0</pan>
			        </midi-instrument>
			      </score-part>
			    </part-list>
			  <part id="P1">
			    </part>
			  </score-partwise>
						""";

	private MusicXMLTemplates() {
	}

}
