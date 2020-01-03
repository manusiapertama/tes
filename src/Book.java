/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adam
 */
public class Book extends Product{
    private String title, author;

    public Book(String company, double price, String title, String author) {
        super(company, price);
        this.title = title;
        this.author = author;
    }
    
     public String toString(){
        return super.toString() + " title:" +title+" author by: "+author;
    }

 
    
    
}
