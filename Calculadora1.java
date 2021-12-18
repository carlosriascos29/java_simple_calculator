package com.paquete1;

import javax.swing.JOptionPane;

public class Calculadora1 {
    
    public static void main (String [] arg) {
        String menu = "* * * Menu * * * \n "
            + "Escriba el numero de la operacion que desea realizar: \n"
            + "1. Sumar \n"
            + "2. Resta \n"
            + "3. Multiplicar \n"
            + "4. Dividir \n"
            + "5. Salir \n\n";
        int control = 0;
        
        do {
            try {
                String opc = JOptionPane.showInputDialog(menu);
                control = Integer.parseInt(opc);
                String msjResultado = "El resultado es: ";
                int[] res;
                
                switch (control) {
                    case 1:
                        res = msj();
                        JOptionPane.showMessageDialog(null, msjResultado + suma(res[0], res[1]));
                        break;
                        
                    case 2:
                        res = msj();
                        JOptionPane.showMessageDialog(null, msjResultado + resta(res[0], res[1]));
                        break;
                        
                    case 3:
                        res = msj();
                        JOptionPane.showMessageDialog(null, msjResultado + multiplicacion(res[0], res[1]));
                        break;
                    
                    case 4:
                        res = msj();
                        if (res[1] == 0) {
                            JOptionPane.showMessageDialog(null, "No se puede dividir por cero.");
                        }else {
                            JOptionPane.showMessageDialog(null, msjResultado + division(res[0], res[1]));
                        }
                        break;
                }
                
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Solo puedes ingresar valores numericos.");
            }
            
        } while (control != 5 );

    }
    
    
    
    /* Funcio para capturar los valores que van a calcular. */
    private static int[] msj(){
        String numero1 = JOptionPane.showInputDialog("Ingrese el primer numero.");
        String numero2 = JOptionPane.showInputDialog("Ingrese el segundo numero.");
        
        int[] datos = new int[2];
        datos[0] = Integer.parseInt(numero1);
        datos[1] = Integer.parseInt(numero2);
        
        return datos;
    }
    
    
    
    /* Funciones para los calculos */
    private static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }
    
    private static int resta(int numero1, int numero2){
        return numero1 - numero2;
    }
    
    private static int multiplicacion(int numero1, int numero2){
        return numero1 * numero2;
    }
    
    private static double division(int numero1, int numero2){
        return (double)numero1 / (double)numero2;
    }
}
