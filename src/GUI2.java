import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI2 {

	private JFrame frame;
	private static Gara g;
	private JTextField txtCod;
	private JTextField txtInfo;
	private  Gara gara1;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI2 window = new GUI2(g);
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
	public GUI2(Gara gara) {
		this.g=gara;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton AfiseazaTrenuri = new JButton("Afiseaza Trenuri");
		AfiseazaTrenuri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i=0;
				boolean a=false;
				if(txtCod.getText().equals(""))
				{
					txtInfo.setText("nu s-a introdus nimic");
				}
				else
				{
					for(Tren t :g.getTrenuriGara())
					{
						if(txtCod.getText().equals(t.getCod()))
						{
							txtInfo.setText(g.getTrenuriGara().get(i).toString());
							a=true;
						}
						i++;
					}
					if(a==false)
					{
						txtInfo.setText("Nu a fost gasit!");
					}
				}
			}
		});
		AfiseazaTrenuri.setBounds(261, 75, 121, 23);
		frame.getContentPane().add(AfiseazaTrenuri);
		
		txtCod = new JTextField();
		txtCod.setBounds(107, 76, 86, 20);
		frame.getContentPane().add(txtCod);
		txtCod.setColumns(10);
		
		JLabel lblCodTren = new JLabel("Cod Tren");
		lblCodTren.setBounds(26, 79, 46, 14);
		frame.getContentPane().add(lblCodTren);
		
		txtInfo = new JTextField();
		txtInfo.setBounds(85, 149, 339, 46);
		frame.getContentPane().add(txtInfo);
		txtInfo.setColumns(10);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(26, 165, 46, 14);
		frame.getContentPane().add(lblInfo);
	}

}
