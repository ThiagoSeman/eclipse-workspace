package teste_publica;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class tablemodeleste  extends AbstractTableModel{
		
		private List<informacaodatela> dados = new ArrayList<>();
		private String[] colunas = {"Placar","Minimo", "Maximo","Recorde min", "Recorde max"};
		
		@Override
		public String getColumnName(int column) {
			// TODO Auto-generated method stub
			return colunas[column];
		}
		
						
		public int getColumnCount() {
			return colunas.length;
		}

		@Override
		public int getRowCount() {
			
			return dados.size();
		}

		@Override
		public Object getValueAt(int linha, int coluna) {
				
			switch (coluna) {
				case 0:
					return dados.get(linha).getPlcar();
				case 1:
					return dados.get(linha).getMinimo();
				case 3:
					return dados.get(linha).getMaximo();				
				case 4:
					return dados.get(linha).getRecorde_min();
				case 5:
					return dados.get(linha).getRecorde_max();
					
				
			}
			return null;
		
			
			
			
		}
		
		public void addRow (informacaodatela p) {
			this.dados.add(p);
			this.fireTableDataChanged();
						
			
			
		}
		
		
	}
