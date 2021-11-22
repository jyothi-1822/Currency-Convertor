package Classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class currencyGraphics extends JFrame implements ActionListener {
String[] currencies = {"IND","CAD","AUS","EURO","SGD","PKR","JPY","MXN","IDR","UAED"};
	private JPanel contentPane;
	private JTextField txtTo;
	private JTextField textField;
	private JTextField textField_1;
	public JComboBox comboboxmain;
	public JComboBox combobox2;
	public JSpinner spin;
	public JButton buttonconvert;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currencyGraphics frame = new currencyGraphics();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public currencyGraphics() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox(currencies);
		comboBox.setBounds(110, 71, 117, 20);
		comboBox.setSelectedIndex(0);
		contentPane.add(comboBox);
		comboboxmain = comboBox;

		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(26, 71, 74, 20);
		spin = spinner;
		//System.out.println(spin);
		contentPane.add(spinner);
		
		txtTo = new JTextField();
		txtTo.setEditable(false);
		txtTo.setText("To");
		txtTo.setBounds(237, 71, 30, 20);
		contentPane.add(txtTo);
		txtTo.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox(currencies);
		comboBox_1.setSelectedIndex(1);
		comboBox_1.setBounds(296, 71, 104, 20);
		contentPane.add(comboBox_1);
		JButton btnConvert = new JButton("Convert");
		btnConvert.setBounds(146, 131, 104, 23);
		contentPane.add(btnConvert);
		buttonconvert = btnConvert;
		combobox2 = comboBox_1;
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCurrencyConverter.setBounds(110, 11, 214, 29);
		contentPane.add(lblCurrencyConverter);
		
		textField_1 = new JTextField();
		textField_1.setBounds(159, 189, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
	
		
		//comboBox.addActionListener(this);
		//comboBox_1.addActionListener(this);
		btnConvert.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg) {
		// TODO Auto-generated method stub
		int a = comboboxmain.getSelectedIndex();
		int b = combobox2.getSelectedIndex();
		if(a==b)
			//System.out.println(spin.getValue());
			textField_1.setText(String.valueOf(spin.getValue()));

		if((JButton)arg.getSource()==buttonconvert) {

			   int var;
			   //System.out.println(spin.getValue());
			   var = (int) spin.getValue();
			   if (var < 0) {
				   textField_1.setText("Negative");
				   return;
			   }


			   currency c1 = currency.Identify(a);
			   currency c2 = currency.Identify(b);
			   double sourceip = var;
			   double answer = currency.convert(sourceip, c1, c2);
			   String toprint = String.format("%.2f", answer);
			   textField_1.setText(toprint);
		   }


		   }


		    
		
		//textField_1.setText("Other");
	//textField_1.setText(String.valueOf(a));
		   }	
	


