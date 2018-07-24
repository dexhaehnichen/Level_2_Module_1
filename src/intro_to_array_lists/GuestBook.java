package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton add = new JButton("add");
	JButton view = new JButton("view");
	ArrayList<String> list = new ArrayList<String>();
	String listS = "";

	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.run();
	}

	void run() {
		createUI();
	}

	void createUI() {
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		add.addActionListener(this);
		view.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton BP = (JButton) e.getSource();
		if (BP == add) {
			list.add(JOptionPane.showInputDialog("what would you like to add to the list"));
			System.out.println(list.size());
		} else if (BP == view) {
			int q = 1;
			for (int i = 0; i <= list.size() - 1; i++) {
				listS = listS + "Guest #" + q + " " + list.get(i) + "\n";
				System.out.println(listS);
				q++;
			}
			JOptionPane.showMessageDialog(null, listS);
		}
	}
}
