/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08q01;


public class Tape extends Publication {
    
     protected String play_time;
    public Tape(){
    }
    public Tape(String Title,double Price,String PlayingTime){
        super(Title,Price);
        this.play_time = PlayingTime;
    }
    public void setPlaying_time(String playing_time) {
        this.play_time = playing_time;
    }
    public String getPlaying_time() {
        return play_time;
    }
     @Override
    public void display() {
        super.display();
        System.out.println("Playing time = " + play_time);
    }
    
}
