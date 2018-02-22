package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Name");
	JButton button2 = new JButton("View Names");
	ArrayList<String> list = new ArrayList<>();
	public static void main(String[] args) {
GuestBook book = new GuestBook();

		
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	GuestBook() {
		
		list.add("Bob Banders");
		list.add("Sandy Summers");
		list.add("Greg Ganders");
		list.add("Donny Doners");
		
		frame.setVisible(true);
		frame.pack();
		panel.add(button1);
		panel.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.add(panel);
		frame.setSize(600, 100);
	}
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
			String addName = JOptionPane.showInputDialog("Enter a Name");
			list.add(addName);
			
		}
		if(e.getSource() == button2) {
			for(int i = 0; i < list.size() ; i++) {
				System.out.println(list.get(i));
			}
		}
	}

	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
