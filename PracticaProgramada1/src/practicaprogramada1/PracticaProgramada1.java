package practicaprogramada1;

import javax.swing.JOptionPane;

public class PracticaProgramada1 {
    public static void main(String[] args) {
        String letra = JOptionPane.showInputDialog(null, "Ingrese una letra en mayuscula para determinar su forma");
        switch (letra){
            case "C","J","O","S","U" -> JOptionPane.showMessageDialog(null,"La letra " + letra + " es de forma curva");
            case "A","E","F","H","I","K","L","M","N","T","V","W","X","Y","Z" -> JOptionPane.showMessageDialog(null,"La letra " + letra + " es de forma recta");
            case "B","D","G","P","R","Ñ","Q" -> JOptionPane.showMessageDialog(null,"La letra " + letra + " es de forma mixta");
            default -> JOptionPane.showMessageDialog(null, "Valor invalido");
        }
    }
}