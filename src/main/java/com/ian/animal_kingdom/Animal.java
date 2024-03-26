package com.ian.animal_kingdom;

/**
 *
 * @author Ian Tagano
 */

public abstract class Animal 
{
    //private data
    private String name;
    private int age;
    private String habitat;
    
    //constructor
    public Animal(String name, int age, String habitat)
    {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }
    
    
    //getters 
    public String getName()
    {
        return name;
    }
    
    //getters
    public int getAge()
    {
        return age;
    }
    
    //getters
    public String getHabitat()
    {
        return habitat;
    }
    
    
    //methods 
    public abstract void makeSound();
    
}
