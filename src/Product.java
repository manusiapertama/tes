/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adam
 */
public class Product {
    private String company;
    private double price;
    private int quantitySold;
    
    public Product(String company, double price){
        this.company = company;
        this.price = price;
    }
    public void sell(){
        quantitySold++;
    }
    public void setPrice(double newPrice){
        price = newPrice;
    }
    public String toString(){
        return "Company: " +company+ " Price: " +price+ " Quantity Sold " +quantitySold;
    }
}
