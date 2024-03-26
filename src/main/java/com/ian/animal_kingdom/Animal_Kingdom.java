package com.ian.animal_kingdom;

/**
 *
 * @author Ian Tagano
 */

public class Animal_Kingdom 
{

    public static void main(String[] args) 
    {
        Mammal lion = new Mammal("lions", 12, "savannah", true);
        Reptile snake = new Reptile("snakes", 3, "rainforest", true);
        Bird pigeon = new Bird("pigeon", 1, "mountains", true);
        
        System.out.println("Mammal");
        System.out.println("Name: " + lion.getName());
        System.out.println("Age: " + lion.getAge());
        System.out.println("Habitat: " + lion.getHabitat());
        System.out.println("Warm Blooded: " + lion.getBloodStatus());
        lion.makeSound();
        
        System.out.println("\nBird");
        System.out.println("Name: " + pigeon.getName());
        System.out.println("Age: " + pigeon.getAge());
        System.out.println("Habitat: " + pigeon.getHabitat());
        System.out.println("Can fly: " + pigeon.isCanFly());
        pigeon.makeSound();
        
        System.out.println("\nReptiles");
        System.out.println("Name: " + snake.getName());
        System.out.println("Age: " + snake.getAge());
        System.out.println("Habitat: " + snake.getHabitat());
        System.out.println("Warm Blooded: " + snake.getBloodStatus());
        snake.makeSound();
    }
}
