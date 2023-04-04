package io.github.enprogrammerare.trumnoter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.w3c.dom.Document;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		frame.setVisible(true);
		frame.add(new JLabel("Till trumnoter"));
		frame.setTitle("trumnoter");
		frame.setSize(100, 100);
		
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Okomprimerade MusicXML-filer", "xml", "musicxml");
		
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

		Converter converter = new Converter(output);
		boolean finish = false;
		
		try {
			Document document = XMLParser.read(toRead);
			
			Part part = (Part) JOptionPane.showInputDialog(frame, "Vänligen välj en stämma att konvertera:", "Val av stämma", JOptionPane.QUESTION_MESSAGE, null, Converter.getParts(document), null);
			
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
				JOptionPane.showMessageDialog(frame, "Ett fel har uppstått under programkörning och dina noter kunde ej konverteras. På näste sida finns mer information.", "Fel", JOptionPane.ERROR_MESSAGE);
			
			JOptionPane.showMessageDialog(frame, baos.toString());
			frame.dispose();
			output.close();
		}
	}
}
