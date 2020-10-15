package Veiw;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class VeiwInicial extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldnome;
	private JButton btnSair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException  ex) {
            java.util.logging.Logger.getLogger(VeiwInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       
        }
        //</editor-fold>
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VeiwInicial frame = new VeiwInicial();
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
	public VeiwInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton.setBounds(73, 98, 89, 23);
		contentPane.add(btnNewButton);
		
		textFieldnome = new JTextField();
		textFieldnome.setBounds(73, 67, 242, 20);
		contentPane.add(textFieldnome);
		textFieldnome.setColumns(10);
		
		JLabel Txtnome = new JLabel("Nome:");
		Txtnome.setBounds(73, 53, 46, 14);
		contentPane.add(Txtnome);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnSair.setBounds(226, 98, 89, 23);
		contentPane.add(btnSair);
	}
}
