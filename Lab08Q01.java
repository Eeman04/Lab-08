/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08q01;
        import java.util.Scanner;

public class Lab08Q01 {

   
    public static void main(String[] args) {
        int select;
       
       String[] s = {"Press 1 for books.\n", "Press 2 for an audio cassette.\n",
                "Press 0 to return to main menu."};
        Scanner input = new Scanner(System.in);
        System.out.println("Your choice \n" + s[0] + s[1] + s[2]);
        select = input.nextInt();
        while (select >= 1 && select< s.length) {

            if (select== 1) {
                System.out.println("Enter book title,price and page count:");
                Books b1 = new Books(input.next(), input.nextDouble(), input.nextInt());
                b1.display();
            }
            else if (select == 2) {
                System.out.println("Enter audio cassette's title,price and playing time:");
                Tape t1 = new Tape(input.next(), input.nextDouble(), input.next());
                t1.display();
            }
            else if(select == 0) {
                System.out.println("Thanks for visiting our publication centre.");
            }
            System.out.println(s[0] + s[1] + s[2]);
            select = input.nextInt();
        }
    }
    }
    

