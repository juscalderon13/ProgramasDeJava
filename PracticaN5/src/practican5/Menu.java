package practican5;

import javax.swing.JOptionPane;

public class Menu {
   
    public static String menu6opciones(String titulo, String opcion1, String opcion2, String opcion3, String opcion4, String opcion5, String opcion6){
      boolean salida = false;
      String inputEleccion = "";
      do{
          inputEleccion = JOptionPane.showInputDialog(null,
              "-------------------------------------------------------"
            + "\n" + titulo
            + "\n-------------------------------------------------------"
            + "\nSeleccione una de las siguientes opciones:"
            + "\n[1] - " + opcion1
            + "\n[2] - " + opcion2
            + "\n[3] - " + opcion3
            + "\n[4] - " + opcion4
            + "\n[5] - " + opcion5
            + "\n[6] - " + opcion6);
          switch(inputEleccion){
              case "1" -> salida = true;
              case "2" -> salida = true;
              case "3" -> salida = true;
              case "4" -> salida = true;
              case "5" -> salida = true;
              case "6" -> salida = true;
              default -> salida = false;
          }
      }while(salida == false);
      return inputEleccion;
  }
}
