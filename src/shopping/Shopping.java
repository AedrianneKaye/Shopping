/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shopping;
import java.util.Scanner;

/**
 *
 * @author aemal4075
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        double num1,num2,num3;
        double total1, total2, total3;
        
        double USB = 19.99;
        double keyboard = 49.99;
        double mice = 25.99; 
        double tax = 0.13;  
        
        System.out.println("Enter how many USB you are purchasing " );
        num1 = keyedInput.nextDouble();
        System.out.println("Enter how many keyboard you are purchasing ");
        num2 = keyedInput.nextDouble();
        System.out.println("Enter how many mouse you are purchasing ");
        num3 = keyedInput.nextDouble();
        
        total1 = (USB * num1) * tax + (USB * num1);
        total2 = (keyboard * num2) * tax + (keyboard * num2);
        total3 = (mice * num3) * tax +(mice * num3);
        
        System.out.println("The total of USB storage is $ " + total1 + ".");
        System.out.println("The total of keyboard is $ " + total2 + ".");
        System.out.println("The total of Computer Mouse is $" + total3 + "."); 
                
        // TODO code application logic here
    }
    
}
