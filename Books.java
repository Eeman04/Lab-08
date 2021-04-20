/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08q01;

public class Books extends Publication{
    
    protected double pg_count;
    public Books(){
    }
    public Books(String Title,double Price,double PageCount){
        super(Title,Price);
        this.pg_count = PageCount;
    }
    public void setPage_count(double page_count) {
        this.pg_count = page_count;
    }
    public double getPage_count() {
        return pg_count;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Page count = " + pg_count);
    }
}
