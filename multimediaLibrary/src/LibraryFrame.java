import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import multimediaLibrary.Library;
import multimediaLibrary.Media;
import utils.Ser;

import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class LibraryFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final JButton searchButton = new JButton("Search");
	private JTextArea searchResults;
	JComboBox comboBox;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryFrame frame = new LibraryFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LibraryFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textField = new JTextField();
		textField.setBounds(10, 234, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		String[] combo = { "Title", "Author" };
		comboBox = new JComboBox(combo);
		comboBox.setBounds(116, 233, 67, 21);
		contentPane.add(comboBox);
		
		
		
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchResults.removeAll();
				Library lib = (Library) Ser.load("lib.xml");
				
				String select = (String) comboBox.getSelectedItem();
				if (select.equals("Title")) {
					select = "N";
				}
				if (select.equals("Author")) {
					select = "A";
				}
				
				
				ArrayList<Media> searchList = lib.search(select, textField.getText());
				
				//searchResults.setText("Results :");
				
				for (Media media : searchList) {
					searchResults.append(media.toString()+ "\n");
				}
				
				
				
			}
		});
		searchButton.setBounds(193, 234, 106, 19);
		contentPane.add(searchButton);
		
		searchResults = new JTextArea();
		searchResults.setBounds(10, 10, 416, 214);
		contentPane.add(searchResults);
		
		
		
		
		
		
	}
	public Library makeLibrary(){
		Library lib = new Library("Librairie du coin");
		lib.fill();
		Ser.save("lib", lib);
		return lib;
	}
}
