package teste_publica;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class teste implements ActionListener {

	JFrame janela, janela2;
	JButton buttn,buttn2,buttn3;
	JDialog JanelaInterna;
	String leitura;
	int minimo = 0 , maximo =0 ,rec_min = 0, rec_max = 0 , read2 = 0, jogo = 0;
	
	
	dados d = new dados();
	
	interfacedados p = new interfacedados();
	jogos a = new jogos();
	
	public static void main(String[] args) {
		
		teste chama =  new teste();
		chama.mtTudo();
		
		
	}

	public void mtTudo() {
		
			buttn = new JButton("Novo placar");	
			buttn.addActionListener(this);			
			buttn.setBounds(250,10,200,36);
			
			buttn2 = new JButton("Minimo e Maximo da temporada");	
			buttn2.addActionListener(this);			
			buttn2.setBounds(250,50,200,36);
			
			
			buttn3 = new JButton("Qebra de recorde");	
			buttn3.addActionListener(this);			
			buttn3.setBounds(250,90,200,36);
			
		janela = new JFrame();
		janela.setLayout(null);
		janela.setTitle("Janela principal");
		janela.setSize(800, 500);
		////propriedades de adicionar 
		janela.add(buttn);
		janela.add(buttn2);
		janela.add(buttn3);
		
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		
				
	}
	
	/* metodo para incers�o de dados
	 * Fazendo o calculo de maximo e minimo
	 * e tambem o recorede maximo e minimo
	 */
	
	public void solicita() {

		leitura = JOptionPane.showInputDialog("Digite o Placar");
		
		//Converte a variavel leitura para numero inteiro
		read2 = Integer.parseInt(leitura);
		
		
		if (maximo == 0) {
			maximo = read2;
			if (minimo ==0) {
				minimo = read2;				
			}
					
			
		}else  if (read2 > maximo) {
			
			maximo = read2;
			rec_max ++;
									
		}
		if (read2 < minimo) {
			
			minimo = read2;
			rec_min++;
			
		}
		
		jogo++;		
		setar();
		
			
	}
	
	// metodo para identificar o bot�o acionado
	
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource() == buttn) {
			
			solicita();
				
		}else if (e.getSource() == buttn2) {
		
			
			min_max();
			
			
		
		}else if (e.getSource() == buttn3) {
			interfacedado();
		}
		
		
	}
		
	
		public void min_max(){
	
					
			
			for (int i = 0; i < p.tableModel.getRowCount(); i++) {
				
				for (int j = 0; j <p.tableModel.getColumnCount(); j++) {
					
					
					System.out.println(p.tableModel.getValueAt(i, j));
										
					
				}
				
								
			}
	}
	
			
	public void interfacedado() {
		
					
	System.out.println("jogo " + jogo);
	
			/*		
		a.setPlcar(read2);
		a.setMinimo(minimo);
		a.setMaximo(maximo);
		a.setRecorde_min(rec_min);
		a.setRecorde_max(rec_max);
		
		*/
		p.setVisible(true);
		
			}
	
	
	public void setar() {
		
			
		a.setPlcar(read2);
		a.setMinimo(minimo);
		a.setMaximo(maximo);
		a.setRecorde_min(rec_min);
		a.setRecorde_max(rec_max);	
		p.tableModel.addRow(a);
		
			
		
		
			
		}
			
			
		
	
		
	}
