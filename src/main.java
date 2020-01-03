/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author adam
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book buku1 = new Book("Gramedia", 200000, "Harry Potter","adam");
        buku1.sell();
        System.out.println(buku1.toString());
        
         Television tv1 = new Television("SONY", 1200000, "LCD");
        tv1.sell();
        System.out.println(tv1.toString());
        
    }
    
}
