package teste_publica;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;


// Classe que molda a tabela no formato que traga as informaçoes claras

public class tableModel  extends AbstractTableModel{
		
		
		// declaração de variaveis
		dados dados2 = new dados();
		private String[] colunas = {"Placar","Minimo", "Maximo","Recorde min", "Recorde max"};
		
		@Override
		
		//metodo ara informar os nomes das colunas
		public String getColumnName(int column) {
			// TODO Auto-generated method stub
			return colunas[column];
		}
		
		// metodo para saber a ultima coluna				
		public int getColumnCount() {
			return colunas.length;
		}

		 // metodo para saber a quantidade de linhas adicionadas
		public int getRowCount() {
			
			return dados2.dados.size();
		}

		//metodo para adicionar as informações na tabela. 
		@Override
		public Object getValueAt(int linha, int coluna) {
				
			switch (coluna) {
				case 0:
					return dados2.dados.get(linha).getPlcar();
				case 1:
					return dados2.dados.get(linha).getMinimo();
				case 2:
					return dados2.dados.get(linha).getMaximo();				
				case 3:
					return dados2.dados.get(linha).getRecorde_min();
				case 4:
					return dados2.dados.get(linha).getRecorde_max();
					
			}
			return null;
							
		}
		
		//metodo para adicionar informaçoes na variavel dados.
		
		public void addRow (jogos p) {
			this.dados2.dados.add(p);
			
				
			
		}
		
		
			
			
			
}
		
		
	

