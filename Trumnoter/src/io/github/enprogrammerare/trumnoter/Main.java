package io.github.enprogrammerare.trumnoter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.Locale;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.w3c.dom.Document;

public class Main {

	public static void main(String[] args) {
		Messages messages = new Messages(Locale.getDefault().getLanguage());
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		frame.setVisible(true);
		frame.add(new JLabel(messages.get("window.content")));
		frame.setTitle(messages.get("window.title"));
		frame.setSize(100, 100);
		
		FileNameExtensionFilter filter = new FileNameExtensionFilter(messages.get("filter.name"), "xml", "musicxml");
		
		JFileChooser chooser = new JFileChooser();
		chooser.setFileFilter(filter);
		chooser.setAcceptAllFileFilterUsed(true);
		int selection = chooser.showOpenDialog(frame);
		
		if (selection != JFileChooser.APPROVE_OPTION) {
			frame.dispose();
			return;
		}
		
		File toRead = chooser.getSelectedFile();
		
		selection = chooser.showSaveDialog(frame);
		if (selection != JFileChooser.APPROVE_OPTION) {
			frame.dispose();
			return;
		}
		
		File saveTo = chooser.getSelectedFile();
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		PrintStream output = new PrintStream(baos);

		Converter converter = new Converter(output, messages);
		boolean finish = false;
		
		try {
			Document document = XMLParser.read(toRead);
			
			Part part = (Part) JOptionPane.showInputDialog(frame, messages.get("dialogue.part.content"), messages.get("dialogue.part.title"), JOptionPane.QUESTION_MESSAGE, null, converter.getParts(document), null);
			
			if (part == null)
				throw new IllegalArgumentException("Program cancelled by user.");
				
			Document result = converter.convert(document, part.number());
			XMLParser.save(result, saveTo);
			
			finish = true;
		}
		catch (Exception exc) {
			exc.printStackTrace(output);
		}
		finally {
			if (!finish)
				JOptionPane.showMessageDialog(frame, messages.get("dialogue.error.content"), messages.get("dialogue.error.title"), JOptionPane.ERROR_MESSAGE);
			
			JOptionPane.showMessageDialog(frame, baos.toString());
			frame.dispose();
			output.close();
		}
	}
}
