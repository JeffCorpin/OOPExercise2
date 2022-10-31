/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Raider extends MyBike {
    private String ride;
    
    public Raider(String name, double weight, String ride){
        super(name, weight);
        this.ride = ride;
    }
    @Override
    public String makeSound(){
        return "Broom! Broom!";
    }
    public String getRide(){
        return ride;
    }
    public void setType(String drive){
        this.ride = ride;
    }
    
}
