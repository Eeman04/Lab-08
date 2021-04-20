/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08q02;


public class Laptop  extends Computer{
    protected double length;
    protected double width;
    protected double height;
    protected double weight;
    public Laptop() {
        length = 0;
        width = 0;
        height = 0;
        weight = 0;
    }
    public Laptop(double wordSize,double memorySize,double storageSize,double Speed,double length,
                  double width, double height, double weight) {
        super(wordSize,memorySize,storageSize,Speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public void display() {
        super.display();
        System.out.println("Length= "+length+"'Width= "+width+"\nHeight= "+height+"\nWeight= "+weight);
    }
    
}
