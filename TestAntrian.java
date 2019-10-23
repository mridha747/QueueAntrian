/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Lenovo
 */
public class TestAntrian {
    
     public static void main(String[] args) {
        Antrian letak = new Antrian(8);
         System.out.println("ANTRIAN BANK");
        letak.enqueue("Muhammad Ridha");
        letak.enqueue("Muhammad Rakha");
        letak.enqueue("Muhammad Irfan");
        
        System.out.println("-----------------------------------");

        System.out.println( letak.dequeue()+"\n");
       
        
        letak.print(); 

       



    }
}
