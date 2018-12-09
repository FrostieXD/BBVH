package bbvh.invoice.com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Color;

public class InvoiceCreator extends JFrame {

	private JPanel contentPane;
	private JTextField TxtDate;
	private JTextField TxtAddress;
	private JLabel lblVehicle;
	private JTextField TxtRegNo;
	private JTextField TxtWMiles;
	private JTextField TxtVehicle;
	private JTextField TxtMot;
	private JLabel LblWarranty;
	private JTextField TxtWarranty;
	private JLabel lblRoadTax;
	private JTextField TxtRoadTax;
	private JLabel LblPrice;
	private JTextField TxtPrice;
	private JLabel LblTotal;
	private JTextField TxtTotal;
	private JLabel LblTarget;
	private JTextField TxtTarget;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InvoiceCreator frame = new InvoiceCreator();
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
	public InvoiceCreator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1239, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBlackburnVanHire = new JLabel("Blackburn Van Hire & Sales LTD.");
		lblBlackburnVanHire.setBounds(245, 12, 737, 59);
		lblBlackburnVanHire.setVerticalAlignment(SwingConstants.TOP);
		lblBlackburnVanHire.setHorizontalAlignment(SwingConstants.CENTER);
		lblBlackburnVanHire.setFont(new Font("Arial Black", Font.PLAIN, 41));
		contentPane.add(lblBlackburnVanHire);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(900, 110, 50, 24);
		lblDate.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDate.setFont(new Font("Arial", Font.BOLD, 20));
		contentPane.add(lblDate);
		
		TxtDate = new JTextField();
		TxtDate.setFont(new Font("Tahoma", Font.BOLD, 16));
		TxtDate.setBounds(955, 110, 146, 26);
		contentPane.add(TxtDate);
		TxtDate.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(15, 110, 85, 24);
		lblAddress.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAddress.setFont(new Font("Arial", Font.BOLD, 20));
		contentPane.add(lblAddress);
		
		TxtAddress = new JTextField();
		TxtAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		TxtAddress.setBounds(185, 110, 490, 106);
		contentPane.add(TxtAddress);
		TxtAddress.setColumns(10);
		
		lblVehicle = new JLabel("Vehicle:");
		lblVehicle.setBounds(875, 150, 75, 24);
		lblVehicle.setHorizontalAlignment(SwingConstants.TRAILING);
		lblVehicle.setFont(new Font("Arial", Font.BOLD, 20));
		contentPane.add(lblVehicle);
		
		JLabel LblRegNo = new JLabel("Reg No:");
		LblRegNo.setFont(new Font("Arial", Font.BOLD, 20));
		LblRegNo.setBounds(875, 190, 80, 20);
		contentPane.add(LblRegNo);
		
		TxtRegNo = new JTextField();
		TxtRegNo.setFont(new Font("Tahoma", Font.BOLD, 16));
		TxtRegNo.setBounds(955, 190, 146, 26);
		contentPane.add(TxtRegNo);
		TxtRegNo.setColumns(10);
		
		JLabel lblWMiles = new JLabel("Warranted Miles:");
		lblWMiles.setFont(new Font("Arial", Font.BOLD, 20));
		lblWMiles.setBounds(15, 230, 165, 20);
		contentPane.add(lblWMiles);
		
		TxtWMiles = new JTextField();
		TxtWMiles.setFont(new Font("Tahoma", Font.BOLD, 16));
		TxtWMiles.setBounds(185, 230, 146, 26);
		contentPane.add(TxtWMiles);
		TxtWMiles.setColumns(10);
		
		TxtVehicle = new JTextField();
		TxtVehicle.setFont(new Font("Tahoma", Font.BOLD, 16));
		TxtVehicle.setBounds(955, 150, 146, 26);
		contentPane.add(TxtVehicle);
		TxtVehicle.setColumns(10);
		
		TxtMot = new JTextField();
		TxtMot.setFont(new Font("Tahoma", Font.BOLD, 16));
		TxtMot.setBounds(955, 230, 146, 26);
		contentPane.add(TxtMot);
		TxtMot.setColumns(10);
		
		JLabel lblMot = new JLabel("MOT:");
		lblMot.setFont(new Font("Arial", Font.BOLD, 20));
		lblMot.setBounds(895, 230, 55, 20);
		contentPane.add(lblMot);
		
		LblWarranty = new JLabel("Warranty:");
		LblWarranty.setFont(new Font("Arial", Font.BOLD, 20));
		LblWarranty.setBounds(15, 270, 95, 20);
		contentPane.add(LblWarranty);
		
		TxtWarranty = new JTextField();
		TxtWarranty.setFont(new Font("Tahoma", Font.BOLD, 16));
		TxtWarranty.setBounds(185, 270, 146, 26);
		contentPane.add(TxtWarranty);
		TxtWarranty.setColumns(10);
		
		lblRoadTax = new JLabel("Road Tax:");
		lblRoadTax.setFont(new Font("Arial", Font.BOLD, 20));
		lblRoadTax.setBounds(15, 350, 100, 20);
		contentPane.add(lblRoadTax);
		
		TxtRoadTax = new JTextField();
		TxtRoadTax.setFont(new Font("Tahoma", Font.BOLD, 16));
		TxtRoadTax.setBounds(185, 350, 146, 26);
		contentPane.add(TxtRoadTax);
		TxtRoadTax.setColumns(10);
		
		LblPrice = new JLabel("Price:");
		LblPrice.setFont(new Font("Arial", Font.BOLD, 20));
		LblPrice.setBounds(15, 390, 69, 20);
		contentPane.add(LblPrice);
		
		TxtPrice = new JTextField();
		TxtPrice.setFont(new Font("Tahoma", Font.BOLD, 16));
		TxtPrice.setBounds(185, 390, 146, 26);
		contentPane.add(TxtPrice);
		TxtPrice.setColumns(10);
		
		LblTotal = new JLabel("Total Due:");
		LblTotal.setFont(new Font("Arial", Font.BOLD, 20));
		LblTotal.setBounds(15, 430, 121, 20);
		contentPane.add(LblTotal);
		
		TxtTotal = new JTextField();
		TxtTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		TxtTotal.setBounds(185, 430, 146, 26);
		contentPane.add(TxtTotal);
		TxtTotal.setColumns(10);
		
		LblTarget = new JLabel("Email To:");
		LblTarget.setFont(new Font("Arial", Font.BOLD, 20));
		LblTarget.setBounds(790, 390, 95, 20);
		contentPane.add(LblTarget);
		
		TxtTarget = new JTextField();
		TxtTarget.setBounds(886, 390, 215, 26);
		contentPane.add(TxtTarget);
		TxtTarget.setColumns(10);
		
		JButton BtnSend = new JButton("Send");
		BtnSend.setForeground(Color.WHITE);
		BtnSend.setBackground(Color.BLACK);
		BtnSend.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 24));
		BtnSend.setBounds(790, 440, 310, 40);
		contentPane.add(BtnSend);
	}
}
