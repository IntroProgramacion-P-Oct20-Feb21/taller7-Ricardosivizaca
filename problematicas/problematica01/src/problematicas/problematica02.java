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
public class problematica02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int contador = 2;
        int nm =2;
        String cadenafinal="";
        
        
        while (nm<=110) {
             System.out.printf("%s ", nm);
       contador = contador + 2;
       nm= nm+contador;
       
            }
             System.out.println();     
    }
    
}
