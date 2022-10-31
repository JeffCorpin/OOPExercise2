/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class MainProgram 
{
    public static void main(String[] args){
        MyBike bike;
        Raider raider = new Raider("Raider", 2, "Suzuki");
        Nmax nmax = new Nmax ("Nmax", 5, "Yamaha");
        
        bike = raider;
                System.out.println(bike.makeSound()+ "" + "My bike name is" +bike.getName());
                System.out.println("" +nmax.getDrive());
        
        bike = nmax;
                System.out.println(bike.makeSound()+ "" + "My bike name is" +bike.getName());
                System.out.println("" +raider.getRide());           
    }
    
}
