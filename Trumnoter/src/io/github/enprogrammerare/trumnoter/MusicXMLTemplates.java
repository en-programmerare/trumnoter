package io.github.enprogrammerare.trumnoter;

public class MusicXMLTemplates {

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

	public static String A_COUNTRY_STORY() {
		return """
				<?xml version="1.0" encoding="UTF-8"?>
				<!DOCTYPE score-partwise PUBLIC "-//Recordare//DTD MusicXML 4.0 Partwise//EN" "http://www.musicxml.org/dtds/partwise.dtd">
				<score-partwise version="4.0">
				  <work>
				    <work-title>A Country Story</work-title>
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
				    <part-group type="start" number="1">
				      <group-symbol>bracket</group-symbol>
				      </part-group>
				    <part-group type="start" number="2">
				      <group-symbol>square</group-symbol>
				      </part-group>
				    <score-part id="P1">
				      <part-name>Klarinett i B♭ 1</part-name>
				      <score-instrument id="P1-I1">
				        <instrument-name>Klarinett</instrument-name>
				        </score-instrument>
				      <midi-device id="P1-I1" port="1"></midi-device>
				      <midi-instrument id="P1-I1">
				        <midi-channel>1</midi-channel>
				        <midi-program>72</midi-program>
				        <volume>78.7402</volume>
				        <pan>0</pan>
				        </midi-instrument>
				      </score-part>
				    <score-part id="P2">
				      <part-name>Klarinett i B♭ 2</part-name>
				      <score-instrument id="P2-I1">
				        <instrument-name>Klarinett</instrument-name>
				        </score-instrument>
				      <midi-device id="P2-I1" port="1"></midi-device>
				      <midi-instrument id="P2-I1">
				        <midi-channel>2</midi-channel>
				        <midi-program>72</midi-program>
				        <volume>78.7402</volume>
				        <pan>0</pan>
				        </midi-instrument>
				      </score-part>
				    <score-part id="P3">
				      <part-name>Klarinett i B♭ 3</part-name>
				      <score-instrument id="P3-I1">
				        <instrument-name>Klarinett</instrument-name>
				        </score-instrument>
				      <midi-device id="P3-I1" port="1"></midi-device>
				      <midi-instrument id="P3-I1">
				        <midi-channel>3</midi-channel>
				        <midi-program>72</midi-program>
				        <volume>78.7402</volume>
				        <pan>0</pan>
				        </midi-instrument>
				      </score-part>
				    <score-part id="P4">
				      <part-name>Klarinett i B♭ 4</part-name>
				      <score-instrument id="P4-I1">
				        <instrument-name>Klarinett</instrument-name>
				        </score-instrument>
				      <midi-device id="P4-I1" port="1"></midi-device>
				      <midi-instrument id="P4-I1">
				        <midi-channel>4</midi-channel>
				        <midi-program>72</midi-program>
				        <volume>78.7402</volume>
				        <pan>0</pan>
				        </midi-instrument>
				      </score-part>
				    <part-group type="stop" number="2"/>
				    <part-group type="stop" number="1"/>
				    </part-list>
				  <part id="P1">
				    <measure number="0" implicit="yes">
				      <attributes>
				        <divisions>4</divisions>
				        <key>
				          <fifths>0</fifths>
				          </key>
				        <time>
				          <beats>3</beats>
				          <beat-type>4</beat-type>
				          </time>
				        <clef>
				          <sign>G</sign>
				          <line>2</line>
				          </clef>
				        <transpose>
				          <diatonic>-1</diatonic>
				          <chromatic>-2</chromatic>
				          </transpose>
				        </attributes>
				      <direction placement="above">
				        <direction-type>
				          <words font-weight="bold" font-size="12">Andante</words>
				          </direction-type>
				        <sound tempo="100"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="1">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="2">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="3">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="4">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="5">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="6">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="7">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="8">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="9">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="10">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="11">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="12">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="13">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="14">
				      <direction placement="below">
				        <direction-type>
				          <wedge type="crescendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="15">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="diminuendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="16">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="17">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="18">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="19">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <alter>-1</alter>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="20">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="21">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="22">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="23">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="24">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="25">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="26">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="27">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="28">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="29">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="30">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="31">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="32">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="33">
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="34">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="35">
				      <direction placement="below">
				        <direction-type>
				          <wedge type="diminuendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="36">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="37">
				      <print new-system="yes"/>
				      <note>
				        <rest measure="yes"/>
				        <duration>12</duration>
				        <voice>1</voice>
				        </note>
				      </measure>
				    <measure number="38">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="39">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="40">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="41">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="42">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="43">
				      <direction placement="below">
				        <direction-type>
				          <words font-family="Edwin" font-size="10" font-style="italic">decresc.</words>
				          </direction-type>
				        <direction-type>
				          <dashes type="start" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="44">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="45">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dashes type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="46">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        <notations>
				          <fermata type="upright"/>
				          </notations>
				        </note>
				      <barline location="right">
				        <bar-style>light-light</bar-style>
				        </barline>
				      </measure>
				    <measure number="47">
				      <attributes>
				        <time>
				          <beats>2</beats>
				          <beat-type>4</beat-type>
				          </time>
				        </attributes>
				      <direction placement="above">
				        <direction-type>
				          <segno/>
				          </direction-type>
				        <sound segno="segno"/>
				        </direction>
				      <direction placement="above">
				        <direction-type>
				          <words font-weight="bold" font-size="12">Allegro moderato</words>
				          </direction-type>
				        <sound tempo="137"/>
				        </direction>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="48">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="49">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="50">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="51">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="52">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="53">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="54">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="55">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="56">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="57">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="58">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="59">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="60">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="61">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="62">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="63">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="64">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>6</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>6</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="65">
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="66">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="67">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="68">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>6</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>6</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="69">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="70">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>6</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="71">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="72">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="73">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="74">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="75">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="76">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="77">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <direction placement="above">
				        <direction-type>
				          <words>Till Coda</words>
				          </direction-type>
				        <sound tocoda="codab"/>
				        </direction>
				      </measure>
				    <measure number="78">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="79">
				      <direction placement="above">
				        <direction-type>
				          <words font-style="italic">dolce</words>
				          </direction-type>
				        </direction>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="80">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="81">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="82">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="83">
				      <direction placement="below">
				        <direction-type>
				          <wedge type="crescendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="84">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="85">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="86">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="87">
				      <note>
				        <rest measure="yes"/>
				        <duration>8</duration>
				        <voice>1</voice>
				        </note>
				      </measure>
				    <measure number="88">
				      <note>
				        <rest measure="yes"/>
				        <duration>8</duration>
				        <voice>1</voice>
				        </note>
				      </measure>
				    <measure number="89">
				      <note>
				        <rest measure="yes"/>
				        <duration>8</duration>
				        <voice>1</voice>
				        </note>
				      </measure>
				    <measure number="90">
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <tie type="start"/>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <tied type="start"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="91">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <tie type="stop"/>
				        <tie type="start"/>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <tied type="stop"/>
				          <tied type="start"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="92">
				      <direction placement="below">
				        <direction-type>
				          <wedge type="diminuendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <tie type="stop"/>
				        <tie type="start"/>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <tied type="stop"/>
				          <tied type="start"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="93">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <tie type="stop"/>
				        <tie type="start"/>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <tied type="stop"/>
				          <tied type="start"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="94">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <tie type="stop"/>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <tied type="stop"/>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="95">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="96">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="97">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="98">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="99">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="crescendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="100">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="101">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="102">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="103">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="104">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="105">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="106">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="107">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="108">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="109">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="110">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="111">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="112">
				      <direction placement="below">
				        <direction-type>
				          <words font-family="Edwin" font-size="10" font-style="italic">cresc.</words>
				          </direction-type>
				        <direction-type>
				          <dashes type="start" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="113">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="114">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="115">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="116">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <accidental>flat</accidental>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="117">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="118">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dashes type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="119">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="120">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="121">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="122">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="123">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="124">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="crescendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="125">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="126">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="127">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="128">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <words>rit.</words>
				          </direction-type>
				        <direction-type>
				          <dashes type="start" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="129">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <fermata type="upright"/>
				          </notations>
				        </note>
				      <direction placement="above">
				        <direction-type>
				          <words>D.S. al Coda</words>
				          </direction-type>
				        <sound dalsegno="segno"/>
				        </direction>
				      <barline location="right">
				        <bar-style>light-light</bar-style>
				        </barline>
				      </measure>
				    <measure number="130">
				      <direction placement="above">
				        <direction-type>
				          <coda/>
				          </direction-type>
				        <sound coda="codab"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="131">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="132">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="133">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="134">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="135">
				      <print new-system="yes"/>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <words>rit.</words>
				          </direction-type>
				        <direction-type>
				          <dashes type="start" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="136">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>6</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="137">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="138">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <fermata type="upright"/>
				          </notations>
				        </note>
				      <barline location="right">
				        <bar-style>light-heavy</bar-style>
				        </barline>
				      </measure>
				    </part>
				  <part id="P2">
				    <measure number="0" implicit="yes">
				      <attributes>
				        <divisions>4</divisions>
				        <key>
				          <fifths>0</fifths>
				          </key>
				        <time>
				          <beats>3</beats>
				          <beat-type>4</beat-type>
				          </time>
				        <clef>
				          <sign>G</sign>
				          <line>2</line>
				          </clef>
				        <transpose>
				          <diatonic>-1</diatonic>
				          <chromatic>-2</chromatic>
				          </transpose>
				        </attributes>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="1">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="2">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="3">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="4">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="5">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="6">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="7">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="8">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="9">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="10">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="11">
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="12">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="13">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="14">
				      <direction placement="below">
				        <direction-type>
				          <wedge type="crescendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="15">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="diminuendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="16">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="17">
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="18">
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="crescendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="diminuendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="19">
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="20">
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="crescendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="diminuendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="21">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="22">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="23">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="24">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="25">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="26">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="27">
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="28">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="29">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="30">
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="31">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="32">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="33">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="34">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="35">
				      <direction placement="below">
				        <direction-type>
				          <wedge type="diminuendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="36">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="37">
				      <print new-system="yes"/>
				      <note>
				        <rest measure="yes"/>
				        <duration>12</duration>
				        <voice>1</voice>
				        </note>
				      </measure>
				    <measure number="38">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="39">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="40">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="41">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="42">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="43">
				      <direction placement="below">
				        <direction-type>
				          <words font-family="Edwin" font-size="10" font-style="italic">decresc.</words>
				          </direction-type>
				        <direction-type>
				          <dashes type="start" number="2"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="44">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="45">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dashes type="stop" number="2"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="46">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <pp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="36.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        <notations>
				          <fermata type="upright"/>
				          </notations>
				        </note>
				      <barline location="right">
				        <bar-style>light-light</bar-style>
				        </barline>
				      </measure>
				    <measure number="47">
				      <attributes>
				        <time>
				          <beats>2</beats>
				          <beat-type>4</beat-type>
				          </time>
				        </attributes>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="48">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="49">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="50">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="51">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="52">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="53">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="54">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="55">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="56">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="57">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="58">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="59">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="60">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="61">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="62">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="63">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="64">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="65">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="66">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="67">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="68">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="69">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="70">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="71">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="72">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="73">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="74">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="75">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="76">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="77">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="78">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="79">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="80">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="81">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="82">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="83">
				      <direction placement="below">
				        <direction-type>
				          <wedge type="crescendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="84">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="85">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="86">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="87">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="88">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="89">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="90">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="91">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="diminuendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="92">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="93">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="94">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="95">
				      <direction placement="above">
				        <direction-type>
				          <words>Solo</words>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="96">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="97">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="98">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="99">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="crescendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="100">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="101">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="102">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="103">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="104">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="105">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="106">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="107">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="108">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="109">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="110">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="111">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="112">
				      <direction placement="below">
				        <direction-type>
				          <words font-family="Edwin" font-size="10" font-style="italic">cresc.</words>
				          </direction-type>
				        <direction-type>
				          <dashes type="start" number="2"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="113">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="114">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="115">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="116">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="117">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="118">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dashes type="stop" number="2"/>
				          </direction-type>
				        </direction>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="119">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="120">
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <accidental>flat</accidental>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="121">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="122">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="123">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="124">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="125">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="126">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="127">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="128">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <words>rit.</words>
				          </direction-type>
				        <direction-type>
				          <dashes type="start" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="129">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <fermata type="upright"/>
				          </notations>
				        </note>
				      <barline location="right">
				        <bar-style>light-light</bar-style>
				        </barline>
				      </measure>
				    <measure number="130">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="131">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="132">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="133">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="134">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="135">
				      <print new-system="yes"/>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <direction placement="below">
				        <direction-type>
				          <words>rit.</words>
				          </direction-type>
				        <direction-type>
				          <dashes type="start" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="136">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="137">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="138">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <fermata type="upright"/>
				          </notations>
				        </note>
				      <barline location="right">
				        <bar-style>light-heavy</bar-style>
				        </barline>
				      </measure>
				    </part>
				  <part id="P3">
				    <measure number="0" implicit="yes">
				      <attributes>
				        <divisions>4</divisions>
				        <key>
				          <fifths>0</fifths>
				          </key>
				        <time>
				          <beats>3</beats>
				          <beat-type>4</beat-type>
				          </time>
				        <clef>
				          <sign>G</sign>
				          <line>2</line>
				          </clef>
				        <transpose>
				          <diatonic>-1</diatonic>
				          <chromatic>-2</chromatic>
				          </transpose>
				        </attributes>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="1">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="2">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="3">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="4">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="5">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="6">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="7">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="8">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="9">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="10">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="11">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="12">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="13">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="14">
				      <direction placement="below">
				        <direction-type>
				          <wedge type="crescendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="15">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="diminuendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="16">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="17">
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="18">
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="crescendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="diminuendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="19">
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="20">
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="crescendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="diminuendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="21">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="22">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="23">
				      <direction placement="below">
				        <direction-type>
				          <wedge type="crescendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="24">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="25">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="26">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="27">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="28">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="29">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="30">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="31">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="32">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="33">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="34">
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="35">
				      <direction placement="below">
				        <direction-type>
				          <wedge type="diminuendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="36">
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="37">
				      <print new-system="yes"/>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="38">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="39">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="40">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="41">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="42">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="43">
				      <direction placement="below">
				        <direction-type>
				          <words font-family="Edwin" font-size="10" font-style="italic">decresc.</words>
				          </direction-type>
				        <direction-type>
				          <dashes type="start" number="2"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="44">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="45">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dashes type="stop" number="2"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="46">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        <notations>
				          <fermata type="upright"/>
				          </notations>
				        </note>
				      <barline location="right">
				        <bar-style>light-light</bar-style>
				        </barline>
				      </measure>
				    <measure number="47">
				      <attributes>
				        <time>
				          <beats>2</beats>
				          <beat-type>4</beat-type>
				          </time>
				        </attributes>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="48">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="49">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="50">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="51">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="52">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="53">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="54">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="55">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="56">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="57">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="58">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="59">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="60">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="61">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="62">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="63">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="64">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="65">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="66">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="67">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="68">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="69">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="above" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="70">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="71">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="72">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="73">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="74">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="75">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="76">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="77">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="78">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="79">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="80">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="81">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="82">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="83">
				      <direction placement="below">
				        <direction-type>
				          <wedge type="crescendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="84">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="85">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="86">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="87">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="88">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="89">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="90">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="91">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="92">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="diminuendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="93">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="94">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="95">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="96">
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="97">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="98">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="99">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="crescendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="100">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="101">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="102">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="103">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <direction placement="above">
				        <direction-type>
				          <words>Solo</words>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="104">
				      <direction placement="below">
				        <direction-type>
				          <words font-family="Edwin" font-size="10" font-style="italic">cresc.</words>
				          </direction-type>
				        <direction-type>
				          <dashes type="start" number="2"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="105">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="106">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="107">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="108">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <accidental>flat</accidental>
				        <stem>down</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="109">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dashes type="stop" number="2"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="110">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="111">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="112">
				      <direction placement="below">
				        <direction-type>
				          <words font-family="Edwin" font-size="10" font-style="italic">cresc.</words>
				          </direction-type>
				        <direction-type>
				          <dashes type="start" number="2"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="113">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="114">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="115">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="116">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="117">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>down</stem>
				        </note>
				      </measure>
				    <measure number="118">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dashes type="stop" number="2"/>
				          </direction-type>
				        </direction>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="119">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="120">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="121">
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="122">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="123">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="124">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="125">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="126">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="127">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="128">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <words>rit.</words>
				          </direction-type>
				        <direction-type>
				          <dashes type="start" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="129">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <fermata type="upright"/>
				          </notations>
				        </note>
				      <barline location="right">
				        <bar-style>light-light</bar-style>
				        </barline>
				      </measure>
				    <measure number="130">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="131">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="132">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="133">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="134">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="135">
				      <print new-system="yes"/>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <direction placement="below">
				        <direction-type>
				          <words>rit.</words>
				          </direction-type>
				        <direction-type>
				          <dashes type="start" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>5</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>down</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="136">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="137">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="138">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <fermata type="upright"/>
				          </notations>
				        </note>
				      <barline location="right">
				        <bar-style>light-heavy</bar-style>
				        </barline>
				      </measure>
				    </part>
				  <part id="P4">
				    <measure number="0" implicit="yes">
				      <attributes>
				        <divisions>4</divisions>
				        <key>
				          <fifths>0</fifths>
				          </key>
				        <time>
				          <beats>3</beats>
				          <beat-type>4</beat-type>
				          </time>
				        <clef>
				          <sign>G</sign>
				          <line>2</line>
				          </clef>
				        <transpose>
				          <diatonic>-1</diatonic>
				          <chromatic>-2</chromatic>
				          </transpose>
				        </attributes>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="1">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="2">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="3">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="4">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="5">
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <accidental>flat</accidental>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="6">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="7">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="8">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <direction placement="above">
				        <direction-type>
				          <words>Solo</words>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="9">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="10">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="11">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="12">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="13">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="14">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="15">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="16">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="17">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="18">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="19">
				      <note>
				        <pitch>
				          <step>A</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <accidental>flat</accidental>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="20">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="21">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="22">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="23">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <alter>1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>sharp</accidental>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="24">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="25">
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <accidental>flat</accidental>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="26">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="27">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="28">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="29">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="30">
				      <note>
				        <pitch>
				          <step>G</step>
				          <alter>1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <accidental>sharp</accidental>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <alter>1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="31">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="32">
				      <note>
				        <pitch>
				          <step>F</step>
				          <alter>1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <accidental>sharp</accidental>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="33">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <alter>1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <accidental>sharp</accidental>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="34">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <alter>1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <accidental>sharp</accidental>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="35">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <alter>1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <accidental>sharp</accidental>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="36">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="37">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="38">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="39">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="40">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="41">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="42">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="43">
				      <direction placement="below">
				        <direction-type>
				          <words font-family="Edwin" font-size="10" font-style="italic">decresc.</words>
				          </direction-type>
				        <direction-type>
				          <dashes type="start" number="2"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="44">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="45">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dashes type="stop" number="2"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="46">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>12</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <dot/>
				        <stem>up</stem>
				        <notations>
				          <fermata type="upright"/>
				          </notations>
				        </note>
				      <barline location="right">
				        <bar-style>light-light</bar-style>
				        </barline>
				      </measure>
				    <measure number="47">
				      <attributes>
				        <time>
				          <beats>2</beats>
				          <beat-type>4</beat-type>
				          </time>
				        </attributes>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="48">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="49">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="50">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="51">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="52">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="53">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="54">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="55">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="56">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="57">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="58">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="59">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="60">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="61">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="62">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="63">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="64">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="65">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="66">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="67">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="68">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="69">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="70">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="71">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="72">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="73">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="74">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <accent/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="75">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="76">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="77">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="78">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>6</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <dot/>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="79">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="80">
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="81">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="82">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="83">
				      <direction placement="below">
				        <direction-type>
				          <wedge type="crescendo" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="84">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>natural</accidental>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="85">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <wedge type="stop" number="1"/>
				          </direction-type>
				        </direction>
				      </measure>
				    <measure number="86">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="87">
				      <note>
				        <rest measure="yes"/>
				        <duration>8</duration>
				        <voice>1</voice>
				        </note>
				      </measure>
				    <measure number="88">
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <tie type="start"/>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <tied type="start"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="89">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <tie type="stop"/>
				        <tie type="start"/>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <tied type="stop"/>
				          <tied type="start"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="90">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <tie type="stop"/>
				        <tie type="start"/>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <tied type="stop"/>
				          <tied type="start"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="91">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <tie type="stop"/>
				        <tie type="start"/>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <tied type="stop"/>
				          <tied type="start"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="92">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <tie type="stop"/>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <tied type="stop"/>
				          </notations>
				        </note>
				      </measure>
				    <measure number="93">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="94">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="95">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="96">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="97">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="98">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="99">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="100">
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>natural</accidental>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="101">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="102">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="103">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mp/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="71.11"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="104">
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="105">
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="106">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="107">
				      <note>
				        <pitch>
				          <step>C</step>
				          <alter>1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>sharp</accidental>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <alter>1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <alter>1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <alter>1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="108">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="109">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="110">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="111">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="112">
				      <direction placement="below">
				        <direction-type>
				          <words font-family="Edwin" font-size="10" font-style="italic">cresc.</words>
				          </direction-type>
				        <direction-type>
				          <dashes type="start" number="2"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>flat</accidental>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <alter>-1</alter>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="113">
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>B</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="114">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="115">
				      <note>
				        <pitch>
				          <step>C</step>
				          <alter>1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <accidental>sharp</accidental>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <alter>1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <alter>1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <alter>1</alter>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="116">
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="117">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="118">
				      <print new-page="yes"/>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <dashes type="stop" number="2"/>
				          </direction-type>
				        </direction>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="119">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <f/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="106.67"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <articulations>
				            <tenuto/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="120">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="121">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">continue</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="122">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="123">
				      <note>
				        <pitch>
				          <step>A</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="124">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="125">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="126">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="127">
				      <print new-system="yes"/>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="128">
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <direction placement="below">
				        <direction-type>
				          <words>rit.</words>
				          </direction-type>
				        <direction-type>
				          <dashes type="start" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        </note>
				      </measure>
				    <measure number="129">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        <stem>up</stem>
				        <notations>
				          <fermata type="upright"/>
				          </notations>
				        </note>
				      <barline location="right">
				        <bar-style>light-light</bar-style>
				        </barline>
				      </measure>
				    <measure number="130">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        </note>
				      </measure>
				    <measure number="131">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="132">
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="133">
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <p/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="54.44"/>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="134">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="135">
				      <print new-system="yes"/>
				      <direction placement="below">
				        <direction-type>
				          <dynamics>
				            <mf/>
				            </dynamics>
				          </direction-type>
				        <sound dynamics="88.89"/>
				        </direction>
				      <direction placement="below">
				        <direction-type>
				          <words>rit.</words>
				          </direction-type>
				        <direction-type>
				          <dashes type="start" number="1"/>
				          </direction-type>
				        </direction>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>3</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <dot/>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <slur type="start" placement="below" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>F</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>1</duration>
				        <voice>1</voice>
				        <type>16th</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <beam number="2">backward hook</beam>
				        <notations>
				          <slur type="stop" number="1"/>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>D</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">begin</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      <note>
				        <pitch>
				          <step>E</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        <beam number="1">end</beam>
				        <notations>
				          <articulations>
				            <staccato/>
				            </articulations>
				          </notations>
				        </note>
				      </measure>
				    <measure number="136">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <rest/>
				        <duration>4</duration>
				        <voice>1</voice>
				        <type>quarter</type>
				        </note>
				      </measure>
				    <measure number="137">
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      <note>
				        <pitch>
				          <step>G</step>
				          <octave>3</octave>
				          </pitch>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        <stem>up</stem>
				        </note>
				      <note>
				        <rest/>
				        <duration>2</duration>
				        <voice>1</voice>
				        <type>eighth</type>
				        </note>
				      </measure>
				    <measure number="138">
				      <note>
				        <pitch>
				          <step>C</step>
				          <octave>4</octave>
				          </pitch>
				        <duration>8</duration>
				        <voice>1</voice>
				        <type>half</type>
				        <stem>up</stem>
				        <notations>
				          <fermata type="upright"/>
				          </notations>
				        </note>
				      <barline location="right">
				        <bar-style>light-heavy</bar-style>
				        </barline>
				      </measure>
				    </part>
				  </score-partwise>
							""";
	}

	private MusicXMLTemplates() {
	}

}
