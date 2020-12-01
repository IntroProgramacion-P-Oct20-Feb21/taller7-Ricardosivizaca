/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problematicas;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Elio Sivizaca
 */
public class problematica04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            // variables 
        int numerador = 1;
        int denominador = 1;
        int contador = 1;
        
        do {
            if((contador%2)==0){
                System.out.printf("%s%d/%d ", "-", numerador, denominador);
            }else{
                System.out.printf("%s%d/%d ", "+", numerador, denominador);
            }
            contador = contador + 1;
            denominador = denominador + 2;
        }while (contador<=8);
        System.out.println();    
    }
    
}
