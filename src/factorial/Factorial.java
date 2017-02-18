/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author Rosario López G
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int x=1;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Favor de ingresar un numero");
        int y = teclado.nextInt();
        x = factorial(x,y);
        System.out.println(x);
    }

    private static int factorial(int x, int y) {
if (y>0){
    x= factorial (x, y-1);
    x = x*y;
} else {
    x = 1;
}
return x;
    }
    }
    

