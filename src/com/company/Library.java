package com.company;//class Library
//contains look() function that describes the Library and mentions Hermione character in the room
//contains use() function that outputs the user doing an action with the object
//contains talk() function that prints an output of the character speaking to the user

public class Library {

	public void look() 
	{
		System.out.print("You look around the magnificient library of Hogwarts. You are astonished looking at\n" +
	"several books floating in the air. In the centre of the library, you find Hermione lost in her books.\n");
	}
	
	public void use(String useinput) 
    { 
		if (useinput == "book")
		{
			System.out.println("You have picked up a book. The title says 'Diary of The Half-Blood Prince'.\n"+
		"You open the book and start to read the pages. You don't understand anything. You keep it down.\n");    
		}
		if (useinput == "quill") 
		{
			System.out.println("You have picked up a quill. You write in a piece of paper the following,"+
								" 'Hermione is a nerd...'	\n");
		}
    }
	
	public void talk() 
    { 
		System.out.println("You: How do you pronounce Leviosa?");
		System.out.println("Hermione: OMG! It's pronounced Levi'oosa. Not leviosa!");
		System.out.println("You: *giggles*");
		System.out.println("Hermione: Instead of wasting my time, read that book or take that quill and complete your essay!");
    }
	
}
