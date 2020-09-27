package com.company;//class PotionsClassroom
//contains look() function that describes potion classroom and mentions Professor Snape character in the room
//contains use() function that makes snape teach a class and prompts you to make a mixture 
		//with the item used that will give an output of whether you were successful in making the mixture or not.
//contains talk() function that prints an output of the character speaking to the user

import java.util.Random;

public class PotionsClassroom {
	
	boolean[] chance= {true,false};
	Random rand = new Random(); 
	
	public void look() 
	{
		System.out.print("The Potions classroom is filled with bottles of all sizes and shapes.\n"+
	                     "You are able to smell all kinds of funny odours in the cassroom.\n " + 
						"Across the room, you find Professor Snape frowning at you.\n");
	}
	
	public void use(String useinput) 
    { 
		if (useinput == "cauldron")
		{
			System.out.println("Professor Snape: We use a cauldron to brew large quantities of potions.\n" +
		"Each and every ingredient should be very accurately measured and mixed in the cauldron. If not, you could blow your face off!\n"+
					"Now I want you to create a cauldron of growth. One spoon from this mixture will make you one feet taller for a day.\n"+
		"However, if you get the ingredients wrong, you will become one feet short for a day!");
			
			System.out.println("\nYou look at the instruction manual. They are not clear. You mix the ingredients you feel wil get the result\n"
					+"You drink a spoon from the cauldron. You instantly become one feet ");
			
			if(chance[rand.nextInt(2)]) {
				System.out.println("taller!\n");
			}
			else
				{System.out.println("shorter!\n");}
		
			System.out.println("Professor Snape: Class Dismissed!\n");
		}
		
		if (useinput == "potion") 
		{
			System.out.println("Professor Snape: Potion making is a very dangerous procedure. If you get even one\n" + 
					"ingredient wrong, you could cause dangerous side effects! Now create a potion of good luck. If you prepare it right,\n"+
					"you will get good luck for a day. If not, the bottle will break");
			System.out.println("You look at the instruction manual. They are not clear. You mix the ingredients you feel wil get the result\n"
				+"The bottle ");
		
			if(chance[rand.nextInt(2)]) {
			System.out.println("does not break! You have successfuly made it\n");
			}
			else {
			System.out.print("breaks... Better luck next time.\n");
			}
			
			System.out.print("Professor Snape: Class Dismissed!\n");  
		}
    }
    
	public void talk() 
    { 
		
		System.out.println("Professor Snape: You are here to learn the subtle science and exact art of potion-making.\n"
				+ "You have two choices: Use a cauldron to understand the beauty of the softly simmering cauldron OR \n"
				+ "Use a potion bottle to learn the dangerous procedure of potion making\n");
	}
	
    }
	
