//Justin Andres Calderon Najera
//James Josue Brenes Campos
import javax.swing.JOptionPane;

public class Problema1 {
    
    public static void main(String [] args){
        
        //Problema No.1
        String letra = JOptionPane.showInputDialog(null, "Problema #1\nIngrese una letra en mayuscula para determinar su forma");
        switch (letra){ 
            case "C","J","O","S","U" -> JOptionPane.showMessageDialog(null,"La letra " + letra + " es de forma curva");
            case "A","E","F","H","I","K","L","M","N","T","V","W","X","Y","Z" -> JOptionPane.showMessageDialog(null,"La letra " + letra + " es de forma recta");
            case "B","D","G","P","R","Ñ","Q" -> JOptionPane.showMessageDialog(null,"La letra " + letra + " es de forma mixta");
            default -> JOptionPane.showMessageDialog(null, "Valor invalido");    
        }
    
        //Problema No.2
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Problema #2\nIngrese un numero de la familia de los enteros:"));
        if(numero >= 0 && numero % 2 == 0 ){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es un numero par positivo.");
        }else if(numero >= 0 && numero % 2 != 0){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es un numero impar positivo.");
        }else if(numero < 0 && numero % 2 == 0){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es un numero par negativo.");
        }else if(numero < 0 && numero % 2 != 0){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es un numero impar negativo.");
        }else{
            JOptionPane.showMessageDialog(null, "Valor invalido");}
    }
}
