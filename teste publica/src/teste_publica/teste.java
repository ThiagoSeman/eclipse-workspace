package teste_publica;

import javax.swing.*;
import java.awt.event.*;

public class teste implements ActionListener {

	JFrame janela;
	JButton buttn,buttn2,buttn3;
	String leitura;
	int minimo = 0 , maximo =0 ,rec_min = 0, rec_max = 0 , read2 = 0, jogo = 0;


	dados d = new dados();
	interfacedados p = new interfacedados();	


	public static void main(String[] args) {

		teste chama =  new teste();
		chama.mtTudo();
	}

	public void mtTudo() {

		adddadosant();

		buttn = new JButton("Adicionar Novo placar");	
		buttn.addActionListener(this);			
		buttn.setBounds(40,10,400,36);

		buttn2 = new JButton("Placar Minimo e Maximo da temporada e Qebra de recorde");	
		buttn2.addActionListener(this);			
		buttn2.setBounds(40,55,400,36);

		buttn3 = new JButton("Sair");	
		buttn3.addActionListener(this);			
		buttn3.setBounds(40,100,400,36);


		janela = new JFrame();
		janela.setLayout(null);
		janela.setTitle("Janela principal");
		janela.setSize(500, 190);
		////propriedades de adicionar 
		janela.add(buttn);
		janela.add(buttn2);
		janela.add(buttn3);

		janela.setVisible(true);
		janela.setLocationRelativeTo(null);


	}

	/* metodo para incersão de dados
	 * Fazendo o calculo de maximo e minimo
	 * e tambem o recorede maximo e minimo
	 */

	public void solicita() {

		leitura = JOptionPane.showInputDialog("Digite o Placar");
		//Converte a variavel leitura para numero inteiro
		read2 = Integer.parseInt(leitura);

		verifica();		

		adddados();


	}

	// metodo para identificar o botão acionado

	public void actionPerformed(ActionEvent e) {


		if (e.getSource() == buttn) {

			solicita();

		}else if (e.getSource() == buttn2) {

			interfacedado();			

		}else if (e.getSource() == buttn3) {

			janela.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
			System.exit(0);

		}

	}

	public void interfacedado() {

		if (jogo == 0 ) {

			JOptionPane.showMessageDialog(null, "Digite o placar Primeiro");

		}else {

			p.setVisible(true);		
		}
	}

	public void adddados() {

		jogos a = new jogos();
		a.setJogo(jogo);
		a.setPlcar(read2);
		a.setMinimo(minimo);
		a.setMaximo(maximo);
		a.setRecorde_min(rec_min);
		a.setRecorde_max(rec_max);	

		p.tableModel.addRow(a);

	}

	public void verifica() {


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

	}

	public void adddadosant() {

		read2 = 12;
		verifica();
		adddados();

		read2 = 24;
		verifica();
		adddados();

		read2 = 10;
		verifica();
		adddados();

		read2 = 24;
		verifica();
		adddados();

	}

}

