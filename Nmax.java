/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Nmax extends MyBike {
private String drive;
    
    public Nmax(String name, double weight, String drive){
        super(name, weight);
        this.drive = drive;
    }
    @Override
    public String makeSound(){
        return "Nging! Nging!";
    }
    public String getDrive(){
        return drive;
    }
    public void setDrive(String drive){
        this.drive = drive;
    }
}
