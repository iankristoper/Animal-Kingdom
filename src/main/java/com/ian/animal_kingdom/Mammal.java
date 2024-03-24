package com.ian.animal_kingdom;

/**
 *
 * @author Ian Tagano
 */

public class Mammal extends Animal
{
    //priavate data
    private boolean isWarmBlooded;
    
    //using constructor
    public Mammal(String name, int age, String habitat, boolean isWarmBlooded)
    {
        super(name, age, habitat);  //assingning to main constructor
        this.isWarmBlooded = isWarmBlooded;
    }
    
    //getters
    public boolean getBloodStatus()
    {
        return isWarmBlooded;
    }
    
    //accessing methods
    @Override
    public void makeSound()
    {
        System.out.println("Mammal makes sound");
    }
}
