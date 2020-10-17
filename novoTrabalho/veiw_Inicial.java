import javax.swing.JOptionPane;

public class veiw_Inicial {

    static String leitura;

    public static void main(String[] args) {

        leitura = JOptionPane.showInputDialog("digite o nome do produto");

        JOptionPane.showMessageDialog(null, leitura);


    }


    
}
