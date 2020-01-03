/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adam
 */
public class Television extends Product{
private String model;
    public Television(String company, double price, String model) {
        super(company, price);
        this.model = model;
    }
    public String toString(){
        return super.toString() + " model:" +model;
    }
    
}
