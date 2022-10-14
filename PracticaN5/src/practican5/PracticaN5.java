package practican5;

import javax.swing.JOptionPane;
import static practican5.CuentaBancaria.leerInfo;
import static practican5.CuentaBancaria.calcularIntereses;
import static practican5.CuentaBancaria.actualizarSaldo;
import static practican5.CuentaBancaria.deposito;
import static practican5.CuentaBancaria.retiro;
import static practican5.Menu.menu6opciones;


public class PracticaN5 {
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "        BANCO EL CINQUITO \nBienvenido al gestor de cuentas");
       CuentaBancaria cuenta = new CuentaBancaria();
       cuenta.numCuenta = JOptionPane.showInputDialog("Ingrese el numero de cuenta");
       cuenta.id = JOptionPane.showInputDialog("Ingrese su numero de cedula");
       cuenta.saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su saldo actual"));
       cuenta.tInteres = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tasa de interes mensual"));
       boolean menu = true;
       while(menu == true){
          String seleccion = menu6opciones("                      MENU PRINCIPAL","Leer informacion de cuenta","Calcular intereses","Actualizar saldo por interes mensual", "Depositar fondos","Retirar fondos","Cerrar Aplicacion");
          switch(seleccion){
              case "1" -> leerInfo(cuenta.numCuenta, cuenta.id, cuenta.saldo, cuenta.tInteres);
              case "2" -> calcularIntereses(cuenta.saldo, cuenta.tInteres);
              case "3" -> cuenta.saldo = actualizarSaldo(cuenta.saldo, cuenta.tInteres);
              case "4" -> cuenta.saldo = deposito(cuenta.saldo);
              case "5" -> cuenta.saldo = retiro(cuenta.saldo);
              case "6" -> menu = false;
          }
       }
    }    
}
