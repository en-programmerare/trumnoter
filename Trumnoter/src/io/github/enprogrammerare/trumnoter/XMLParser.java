package io.github.enprogrammerare.trumnoter;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Utility class for parsing XML documents.
 * @author en-programmerare
 *
 */
public class XMLParser {
	
	/**
	 * Reads the supplied string and converts its content into an XML document.
	 * @param xml A string containing xml.
	 * @return An XML document.
	 * @throws SAXException If the XML is malformed.
	 */
	public static Document read(String xml) throws SAXException {
		try {
			return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xml)));
		} 
		catch (ParserConfigurationException | IOException e) {
			System.out.println("Här borde vi inte kunna hamna!");
			throw new SAXException("Something very weird has happened.", e);
		}
	}
	
	/**
	 * Converts an XML document into a string.
	 * @param document A document to convert to a string.
	 * @return A string containing the XML of the supplied document.
	 */
	public static String spell(Document document) {
		try {
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			DOMSource source = new DOMSource(document);

			StringWriter output = new StringWriter();

			StreamResult result = new StreamResult(output);
			transformer.transform(source, result);

			String text = output.toString();
			
			return text;
		} 
		catch (TransformerException exception) {
			exception.printStackTrace();
		}

		return null;
	}
	
	/**
	 * Reads the supplied file and converts it into an XML document.
	 * @param file File to read.
	 * @return A document containing the contents of the file.
	 * @throws SAXException If the XML is malformed.
	 * @throws IOException If an I/O error occurs.
	 */
	public static Document read(File file) throws SAXException, IOException {
		try {
			return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
		} 
		catch (ParserConfigurationException e) {
			System.out.println("Här borde vi inte kunna hamna!");
			throw new SAXException("Something very weird has happened.", e);
		}
	}
	
	/**
	 * Saves the supplied XML document into a file.
	 * @param document XML document to save.
	 * @param saveLocation Save location.
	 */
	public static void save(Document document, File saveLocation) {
		try {
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			DOMSource source = new DOMSource(document);

			StreamResult result = new StreamResult(saveLocation);
			transformer.transform(source, result);
		} 
		catch (TransformerException exception) {
			exception.printStackTrace();
		}
	}
	
	private XMLParser() {}

}
