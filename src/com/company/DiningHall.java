package com.company;//class DiningHall
//contains look() function that describes the dining hall  and mentions Dumbledore character in the room
//contains use() function that outputs a random house or a random food
//contains talk() function that prints an output of the character speaking to the user

import java.util.Random;

public class DiningHall {

	
	String[] randomfood= {"Pizza", "Pasta", "Lasagna"};
	String[] house = {"Gryffindor!", "Slytherin!", "Ravenclaw!","H	ufflepuff!"};
	Random rand = new Random(); 
	
	public void look() 
	{
		System.out.print("The dining hall is the biggest open area inside Hogwarts. Professor " + 
				"Dumbledore is in the hall to welcome new students.\n");
	}
	
	
	public void use(String useinput) 
    { 
		if (useinput == "sorting hat") 
		{
			System.out.println("You walk towards the chair and you sit on it. You are nervous. The sorting hat is \n"+
		"placed on your head. He takes his sweet time choosing a house for you..." );
			System.out.print("Sorting Hat: "+house[rand.nextInt(4)]+"\n");
		
		}
		if (useinput == "plate") 
		{
			
			System.out.println("You find a huge table filled with all sorts of food. You spot your 3 most favourite food:\n" +
		"Pizza, Pasta, and Lasagna. You take your plate and decide to have " + randomfood[rand.nextInt(3)]+"\n");
		}
    }
	
	public void talk() 
    { 
		System.out.println("Dumbledore: Welcome to the dining hall! Interact with the sorting hat to be sorted\n" + 
				"into a house or grab a plate and enjoy the food served in the hall!\n");
    }
}
