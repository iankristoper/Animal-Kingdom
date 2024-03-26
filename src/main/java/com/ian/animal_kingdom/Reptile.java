package com.ian.animal_kingdom;

/**
 *
 * @author Ian Tagano
 */

public class Reptile extends Animal
{
    //private data
    private boolean canFly;
    
    //using constructor
    public Reptile(String name, int age, String habitat, boolean canFly)
    {
        super(name, age, habitat);
        this.canFly = canFly;
    }
    
    public boolean getFly()
    {
        return canFly;
    }
            
    
    
    @Override
    public void makeSound()
    {
        System.out.println("Reptile make sound");
    }
}
