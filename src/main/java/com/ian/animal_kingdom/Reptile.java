package com.ian.animal_kingdom;

/**
 *
 * @author Ian Tagano
 */

public class Reptile extends Animal
{
    //private data
    private boolean isColdBlooded;
    
    //using constructor
    public Reptile(String name, int age, String habitat, boolean isColdBlooded)
    {
        super(name, age, habitat);
        this.isColdBlooded = isColdBlooded;
    }
    
    //getters
    public boolean getBloodStatus()
    {
        return isColdBlooded;
    }
            
    
    //using the abstract method came from the super class 
    @Override
    public void makeSound()
    {
        System.out.println("Reptile make sound");
    }
}
