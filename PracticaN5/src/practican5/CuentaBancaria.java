package practican5;

import javax.swing.JOptionPane;

public class CuentaBancaria {
    String numCuenta;
    String id;
    double saldo;
    double tInteres;
    
    public static void leerInfo(String numCuenta, String id, double saldo, double tInteres){
        JOptionPane.showMessageDialog(null,
                "Datos de la cuenta"
              + "\nNo. Cuenta: " + numCuenta
              + "\nIndentificacion: " + id
              + "\nSaldo: ₡" + saldo
              + "\nTasa de intereses: " + tInteres + "%");  
    }
    
    public static void calcularIntereses(double saldo, double tInteres){
        double interesesMensuales = saldo * (tInteres/100);
        double saldoConInteres = saldo + interesesMensuales;
        JOptionPane.showMessageDialog(null, "Su saldo actual es de ₡" + saldo + "\nSu saldo con los intereses mensuales sera de: ₡" + saldoConInteres);
    }
    
    public static double actualizarSaldo(double saldo, double tInteres){
        double interesesMensuales = saldo * (tInteres/100);
        double saldoConInteres = saldo + interesesMensuales;
        JOptionPane.showMessageDialog(null, "Su saldo ha sido actualizado actualmente es de ₡" + saldoConInteres);
        return saldoConInteres;
    }
    
    public static double deposito(double saldo){
        double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el deposito que desea realizar"));
        double nuevoSaldo = saldo;
        if(deposito > 0){
            nuevoSaldo = deposito + saldo;
            JOptionPane.showMessageDialog(null, "Transaccion exitosa \ndeposito completado");
        }else if(deposito <= 0){
            nuevoSaldo = saldo;
            JOptionPane.showMessageDialog(null, "Transaccion fallida \nmonto invalido");
        }
        
    return nuevoSaldo;
    }
    
    public static double retiro(double saldo){
        double retiro = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el deposito que desea realizar"));
        double nuevoSaldo = saldo;
        if(retiro <= saldo){
            nuevoSaldo = saldo - retiro;
            JOptionPane.showMessageDialog(null, "Transaccion exitosa \nretiro completado");
        }else if(retiro >= saldo){
            nuevoSaldo = saldo;
            JOptionPane.showMessageDialog(null, "Transaccion fallida \nfondos insuficientes");
        }
        
        return nuevoSaldo;
    }
}
