/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoscongruenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author yulissatq
 */

/**
 * Es un algoritmo utilizado para la generación de números aleatorios, mediante
 * la siguiente Formula:
 *
 * Xn+1 = (a)Xn mod m
 *
 * m = 2^d 
 * a = 3 + 8k o a = 5 + 8k
 * k = 0, 1, 2, 3... n
 * xn debe ser un numero impar
 * d debe ser entero
 * A partir de estas condiciones se logra un periodo de vida maximo:
 * periodo = m/4 = 2^d-2
 * 
 */

public class Multiplicativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // inicializacion de variables a utilizar
        int Xn;
        int xn = 0;
        int d = 0;
        int a;
        int k = 0;
        int m;
        int periodo;

        // tipo de dato que ayuda en el calculo de un numero entero
        boolean esEnterod = true;
        while (esEnterod) {
            try {
                String aux = JOptionPane.showInputDialog(null, "Para generar numeros Pseudo Aleatorios con el Metodo Congruencial Multiplicativo se neceseita calcular el parametro de 'm', m = 2^d." + "\n" + "Ingrese un valor entero para 'd':", "Metodo Congruencial Mixto: Calculo de 'm'", JOptionPane.INFORMATION_MESSAGE);
                if (aux == null) {
                    System.exit(0);
                }
                d = Integer.parseInt(aux); //Ingreso del valor de d por la interfaz
                esEnterod = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El numero ingresado no es un valor entero." + "\n" + "Ingrese un valor entero para 'd'.", "Metodo Congruencial Mixto: Calculo de 'm'", JOptionPane.ERROR_MESSAGE);
            }

        }
        
        // Calculo del parametro m
        m = (int) Math.pow(2, d);

        boolean esEnterok = true;
        while (esEnterok) {

            try {
                String aux1 = JOptionPane.showInputDialog(null, "Para calcular el parametro de 'a', se hace uso de la formula a = 5 + (8 * k)." + "\n" + " Ingrese un valor entero para 'k':", "Metodo Congruencial Mixto: Calculo de 'm'", JOptionPane.INFORMATION_MESSAGE);
                if (aux1 == null) {
                    System.exit(0);
                }
                k = Integer.parseInt(aux1); //Ingreso del valor de k por la interfaz
                esEnterok = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El numero ingresado no es un valor entero." + "\n" + "Ingrese un valor entero para 'k'.", "Metodo Congruencial Mixto: Calculo de 'a'", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Calculo del parametro a
        a = 5 + (8 * k);

        //Asignacion del valor m al valor de Periodo
        periodo = m / 4;

        boolean esImpar = true;
        while (esImpar) {
            try {
                String aux2 = JOptionPane.showInputDialog(null, "Ingrese un valor impar para la semilla 'xn':", "Metodo Congruencial Mixto: Ingreo de 'xn'", JOptionPane.INFORMATION_MESSAGE);

                if (aux2 == null) {
                    System.exit(0);
                }
                xn = Integer.parseInt(aux2);  //Ingreso del valor de xn por la interfaz
                if (xn % 2 != 0) {
                    esImpar = false;
                } else {
                    esImpar = true;
                    JOptionPane.showMessageDialog(null, "El numero ingresado no es un valor Impar." + "\n" + "Ingrese un valor impar para 'xn'.", "Metodo Congruencial Mixto: Ingreso de 'xn'", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
            }
        }

        // Calculo de los numeros aleatorios
        String resultado = "n   Xn\n";
        for (int i = 0; i < periodo; i++) {
            Xn = (int) ((xn * a) % m);
            xn = Xn;
            resultado += i + "    " + Xn + "\n";
            System.out.println(Xn);
        }
        JOptionPane.showMessageDialog(null, "Parametros:" + "\n" + "Valor m: " + m + "\n"
                + "Valor k: " + k + "\n"
                + "Valor m: " + xn + "\n\n"
                + "Numero de Periodos: " + periodo + "\n\n"
                + "Numeros generados: " + "\n" + resultado, "Numeros Pseudo Aleatorios generados con el Metodo Congruencial Multiplicativo", JOptionPane.INFORMATION_MESSAGE);// Presentacion de resultados

    }

}
