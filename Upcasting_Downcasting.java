package advanced_concept;//WAP on Class Typecasting to achieve 
//Upcasting(in implicit and explicit way) and Downcasting
        //Superclass
		class Animal 
		{
		    void makeSound() 
		    {
		        System.out.println("Animal makes a sound");
		    }
		}
		// Subclass
		class Dog extends Animal //overriding is been 
		//thats why it is going to child's method first
		{
		    void makeSound() 
		    {   
		        System.out.println("Dog barks");
		    }	
		    void fetch() 
		    {
		    	super.makeSound();
		        System.out.println("Dog is fetching the ball");
		    }
		}
public class Upcasting_Downcasting
{
		    public static void main(String[] args) 
		    {
		        // Upcasting
		        Animal n = new Dog(); // Implicit upcasting (Dog to Animal)
		        n.makeSound(); // animals makeSound() method is called
		        
		        
		        // Downcasting
		        //if (n instanceof Dog) { // Check before downcasting
		            Dog myDog = (Dog) n; // Explicit downcasting (Animal to Dog)
		            myDog.fetch(); // Dog's specific method
		            //object variable or reference variable
		        //} else 
		        //{
		            //System.out.println("The object is not of type Dog");
		        //}
		    }
		

		

	}

