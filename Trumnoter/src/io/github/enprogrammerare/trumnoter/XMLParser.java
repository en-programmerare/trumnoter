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

public class XMLParser {

	public static Document read(String xml) throws SAXException {
		try {
			return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xml)));
		} 
		catch (ParserConfigurationException | IOException e) {
			System.out.println("Här borde vi inte kunna hamna!");
			throw new SAXException("Something very weird has happened.", e);
		}
	}

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
	
	public static Document read(File file) throws SAXException, IOException {
		try {
			return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
		} 
		catch (ParserConfigurationException e) {
			System.out.println("Här borde vi inte kunna hamna!");
			throw new SAXException("Something very weird has happened.", e);
		}
	}
	
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
