/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinity;

import java.util.Scanner;

/**
 *
 * @author Jin
 */
public class Infinity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        
        Long a = sc.nextLong(16);
        Long b = sc.nextLong(16);
        Long c = a+b;
        if (c>=0x3F3F3F3F){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
                
    }
    
}
