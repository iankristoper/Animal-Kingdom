package com.ian.animal_kingdom;

/**
 *
 * @author Ian Tagano
 */

public class Bird extends Animal
{
    //private data
    private boolean canFly;
    
    //constructor
    public Bird(String name, int age, String habitat, boolean canFly)
    {
        super(name, age, habitat);
        this.canFly = canFly;
    }
    
    
    //getter
    public boolean isCanFly()
    {
        return canFly;
    }
    
    
    //using the abstract methods 
    @Override 
    public void makeSound()
    {
        System.out.println("Birds will tweet");
    }
}
