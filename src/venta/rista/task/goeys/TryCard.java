package venta.rista.task.goeys;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class TryCard implements ActionListener {
	
	static CardLayout cardlayout;
	static JPanel panelMain;
	static JButton btnPencetSaya;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TryCard window = new TryCard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TryCard() {
		initialize();
	}
	
	public void actionPerformed(ActionEvent e){
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelTombol = new JPanel();
		panelTombol.setBounds(0, 0, 94, 348);
		frame.getContentPane().add(panelTombol);
		panelTombol.setLayout(null);
		
		btnPencetSaya = new JButton("Pencet1");
		btnPencetSaya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPencetSaya.setBounds(10, 39, 89, 23);
		panelTombol.add(btnPencetSaya);
		
		panelMain = new JPanel();
		panelMain.setBounds(95, 0, 339, 348);
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(cardlayout = new CardLayout());
		ActionListener Al = new TryCard();
		
		
		JPanel panel1 = new JPanel();
		panelMain.add(panel1, "name_264447437774470");
		panel1.setLayout(null);
		
		JButton btnPanel = new JButton("Panel 1");
		btnPanel.setBounds(80, 129, 178, 83);
		panel1.add(btnPanel);
		
		JPanel panel2 = new JPanel();
		panelMain.add(panel2, "name_264451281389872");
		panel2.setLayout(null);
		
		JButton btnNewButton = new JButton("Panel 2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(82, 132, 178, 83);
		panel2.add(btnNewButton);
	}
}
