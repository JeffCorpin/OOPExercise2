/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public abstract class MyBike {
    protected String name;
    protected double weight;
    
    public MyBike(String name, double weight){
        this.name = name;
        this.weight = weight;
    }
    public abstract String makeSound();
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    
}
