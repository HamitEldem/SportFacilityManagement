import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.ScrollPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.border.MatteBorder;

public class HomePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ImageIcon stadium = new ImageIcon(getClass().getResource("/images/D--Oym7X4AEUSus.jpg"));
	private ImageIcon logoImg = new ImageIcon(getClass().getResource("/images/logo.png"));
	private ImageIcon footballImg = new ImageIcon(getClass().getResource("/images/football.png"));
	private ImageIcon basketballImg = new ImageIcon(getClass().getResource("/images/basketball.png"));
	private ImageIcon tennisImg = new ImageIcon(getClass().getResource("/images/tennis.png"));
	private ImageIcon squashImg = new ImageIcon(getClass().getResource("/images/squash.png"));




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1192, 820);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 250, 252));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setFont(new Font("Lucida Grande", Font.PLAIN, 5));
		logo.setIcon(logoImg);
		logo.setBounds(6, 6, 178, 80);
		contentPane.add(logo);
		
		JLabel uniName = new JLabel("Bilkent University ");
		uniName.setForeground(new Color(1, 74, 150));
		uniName.setFont(new Font("Beirut", Font.PLAIN, 20));
		uniName.setBounds(95, 33, 203, 29);
		contentPane.add(uniName);
		
		JButton footballBtn = new JButton("Football");
		footballBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		footballBtn.setBounds(667, 34, 117, 29);
		contentPane.add(footballBtn);
		
		JButton basketabllBtn = new JButton("Basketball");
		basketabllBtn.setBounds(796, 34, 117, 29);
		contentPane.add(basketabllBtn);
		
		JButton tennisBtn = new JButton("Tennis");
		tennisBtn.setBounds(925, 34, 117, 29);
		contentPane.add(tennisBtn);
		
		JButton squashBtn = new JButton("Squash");
		squashBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		squashBtn.setBounds(1054, 34, 117, 29);
		contentPane.add(squashBtn);
		
		JLabel lblNewLabel = new JLabel("Sport Facility Management System");
		lblNewLabel.setForeground(new Color(225, 0, 26));
		lblNewLabel.setFont(new Font("Beirut", Font.PLAIN, 13));
		lblNewLabel.setBounds(94, 55, 283, 21);
		contentPane.add(lblNewLabel);
		
		JLabel backgroundPhoto = new JLabel("");
		backgroundPhoto.setIcon(stadium);
		backgroundPhoto.setBounds(0, 98, 1191, 436);
		contentPane.add(backgroundPhoto);
		
		JPanel panel = new JPanel();
		panel.setBounds(49, 546, 219, 210);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel footballIcon = new JLabel("");
		footballIcon.setBounds(6, 6, 35, 35);
		footballIcon.setIcon(footballImg);
		panel.add(footballIcon);
		
		
		JLabel footballLbl = new JLabel("Football");
		footballLbl.setForeground(new Color(60, 107, 37));
		footballLbl.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		footballLbl.setBounds(74, 6, 76, 35);
		panel.add(footballLbl);
		
		JLabel footballFacCount = new JLabel("There are XX football courts.");
		footballFacCount.setBounds(6, 63, 195, 16);
		panel.add(footballFacCount);
		
		JButton FootballMainBtn = new JButton("Football Page");
		FootballMainBtn.setBounds(0, 91, 213, 29);
		panel.add(FootballMainBtn);
		
		JButton footballResBtn = new JButton("Make Reservation");
		footballResBtn.setBounds(0, 132, 213, 29);
		panel.add(footballResBtn);
		
		JButton footballAdd = new JButton("Add Facility");
		footballAdd.setBounds(0, 173, 213, 29);
		panel.add(footballAdd);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(339, 546, 219, 210);
		contentPane.add(panel_1);
		
		JLabel basketballIcon = new JLabel("");
		basketballIcon.setIcon(basketballImg);
		basketballIcon.setBounds(6, 6, 35, 35);
		panel_1.add(basketballIcon);
		
		JLabel basketballLbl = new JLabel("Basketball");
		basketballLbl.setForeground(new Color(237, 155, 56));
		basketballLbl.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		basketballLbl.setBounds(65, 6, 106, 35);
		panel_1.add(basketballLbl);
		
		JLabel basketballFacCount = new JLabel("There are XX basketball courts.");
		basketballFacCount.setBounds(6, 63, 195, 16);
		panel_1.add(basketballFacCount);
		
		JButton BasketballMainBtn = new JButton("Basketball Page");
		BasketballMainBtn.setBounds(0, 91, 213, 29);
		panel_1.add(BasketballMainBtn);
		
		JButton basketballResBtn = new JButton("Make Reservation");
		basketballResBtn.setBounds(0, 132, 213, 29);
		panel_1.add(basketballResBtn);
		
		JButton basketballAdd = new JButton("Add Facility");
		basketballAdd.setBounds(0, 173, 213, 29);
		panel_1.add(basketballAdd);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(630, 546, 219, 210);
		contentPane.add(panel_1_1);
		
		JLabel tennisIcon = new JLabel("");
		tennisIcon.setIcon(tennisImg);
		tennisIcon.setBounds(6, 6, 35, 35);
		panel_1_1.add(tennisIcon);
		
		JLabel tennisLbl = new JLabel("Tennis");
		tennisLbl.setForeground(new Color(224, 208, 70));
		tennisLbl.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		tennisLbl.setBounds(83, 6, 76, 35);
		panel_1_1.add(tennisLbl);
		
		JLabel tennislFacCount = new JLabel("There are XX tennis courts.");
		tennislFacCount.setBounds(6, 63, 195, 16);
		panel_1_1.add(tennislFacCount);
		
		JButton tennisMainBtn = new JButton("Tennis Page");
		tennisMainBtn.setBounds(0, 91, 213, 29);
		panel_1_1.add(tennisMainBtn);
		
		JButton tennisResBtn = new JButton("Make Reservation");
		tennisResBtn.setBounds(0, 132, 213, 29);
		panel_1_1.add(tennisResBtn);
		
		JButton tennisAdd = new JButton("Add Facility");
		tennisAdd.setBounds(0, 173, 213, 29);
		panel_1_1.add(tennisAdd);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(925, 546, 219, 210);
		contentPane.add(panel_1_1_1);
		
		JLabel squashIcon = new JLabel("");
		squashIcon.setIcon(squashImg);
		squashIcon.setBounds(6, 6, 35, 35);
		panel_1_1_1.add(squashIcon);
		
		JLabel squashLbl = new JLabel("Squash");
		squashLbl.setForeground(new Color(98, 211, 226));
		squashLbl.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		squashLbl.setBounds(85, 6, 76, 35);
		panel_1_1_1.add(squashLbl);
		
		JLabel squashFacCount = new JLabel("There are XX squash courts.");
		squashFacCount.setBounds(6, 63, 195, 16);
		panel_1_1_1.add(squashFacCount);
		
		JButton squashMainBtn = new JButton("Squash Page");
		squashMainBtn.setBounds(0, 91, 213, 29);
		panel_1_1_1.add(squashMainBtn);
		
		JButton squashResBtn = new JButton("Make Reservation");
		squashResBtn.setBounds(0, 132, 213, 29);
		panel_1_1_1.add(squashResBtn);
		
		JButton squashAdd = new JButton("Add Facility");
		squashAdd.setBounds(0, 173, 213, 29);
		panel_1_1_1.add(squashAdd);
		

		
		
	}
}
