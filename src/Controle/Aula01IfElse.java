package Controle;

import javax.sql.rowset.spi.SyncResolver;
import javax.swing.JOptionPane;

public class Aula01IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o numero");
        // criação da variavel e pega o valor String digitado
        // passando ele para Integer, transformando-o em int
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0){
            JOptionPane.showMessageDialog(null, "O numero é par");
        }else {
            System.out.println("numero é impar");
        }
    }


}
