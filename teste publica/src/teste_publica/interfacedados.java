package teste_publica;

import teste_publica.interfacedados;
import teste_publica.tableModel;

public class interfacedados extends javax.swing.JFrame  {


	// declaração de variaveis
	tableModel tableModel = new tableModel();  
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;



	public interfacedados() {
		initComponents();
		jTable1.setModel (tableModel);

	}
	// Metodo que cria a janela e a tabela                    
	private void initComponents() {


		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		jTable1.setModel(new javax.swing.table.DefaultTableModel());

		jScrollPane1.setViewportView(jTable1);
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

		getContentPane().setLayout(layout);

		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(44, 44, 44)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(53, Short.MAX_VALUE))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(14, Short.MAX_VALUE))
				);

		pack();  
	}

	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new interfacedados().setVisible(true);
			}
		});
	}




}
