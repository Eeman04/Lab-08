/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08q02;
import java.util.Scanner;
public class Lab08Q02 {

    public static void main(String[] args) {
        System.out.println("Feature of Comp 01:");
        Computer c = new Computer(14,3200,2400,47);
        c.display();
        
        System.out.println("\nFeatures of Laptop:");
        Laptop l = new Laptop(25,1200,2000,24,8.5,13.2,6.4,75);
        l.display();
        
        // Using set and get methods
        System.out.println("\n Feature of Comp 02:");
        Computer c1 = new Computer();
        c1.setWord_size(84);
        c1.setMemory_size(64000);
        c1.setStorage_size(800000);
        c1.setSpeed(180);
        c1.display();

 


    }
    
}
