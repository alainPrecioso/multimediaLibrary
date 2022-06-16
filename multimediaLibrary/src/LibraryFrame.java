import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import multimediaLibrary.Library;
import utils.Ser;

import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibraryFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final JButton btnNewButton = new JButton("Search");

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
		
		JList list = new JList();
		list.setBounds(10, 10, 416, 195);
		contentPane.add(list);
		
		textField = new JTextField();
		textField.setBounds(10, 234, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(116, 233, 29, 21);
		contentPane.add(comboBox);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(155, 234, 106, 19);
		contentPane.add(btnNewButton);
	}
	public Library makeLibrary(){
		Library lib = new Library("Librairie du coin");
		lib.fill();
		Ser.save("lib", lib);
		return lib;
	}
}
