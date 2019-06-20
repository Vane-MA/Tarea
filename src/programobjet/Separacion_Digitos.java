/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programobjet;

import java.util.Scanner;

/**
 *
 * @author zinvi
 */
public class Separacion_Digitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una cifra compuesta de cinco numeros:");
        Integer numeros = entrada.nextInt();
        char[] num = numeros.toString().toCharArray();
        for (char n : num) {
            System.out.print(n + "   ");
        }
    }
}
