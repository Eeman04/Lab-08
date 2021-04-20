/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08q01;


public class Publication {
    protected String title;
    protected double price;
    public Publication(){
    }
    public Publication(String Title,double Price){
        this.title = Title;
        this.price = Price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
     public String getTitle() {
        return title;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void display(){
        System.out.println(title + " for $ " + price);
}
}
