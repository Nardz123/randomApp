package RandomApp;

import java.util.*;

public class randomApp {
	
	//Constructor
	public randomApp() {
		System.out.println("------Welcome to Names Battle Royale!------");
		System.out.println("------Only five players may enter!--------");
		System.out.println("------The last player name will win!-------");
		
		//Calling the entryNames function
		entryNames();
		
	}
	
	//Function for players input
	public static void entryNames() {
		//Object for scanner input
		Scanner console = new Scanner (System.in);
		
		//Variable for names
	     String names;
	     //Using arraylist to store names input
	     ArrayList nameList=new ArrayList();
	     //forloop to iterate input names five times
	     for(int i=0;i<5;i++){ 
	    	System.out.print("Enter player "+(i+1) +" name here: ");
	    	names=console.nextLine();
	    	//add the input names to the arraylist
	     	nameList.add(names);
	     }
	     //Will printout the names of the inputted players
	    System.out.println("The Players are: "+nameList);
	    
	    //To loop random names selection and remove it until the arraylist is empty
	    while(!nameList.isEmpty()) {
	    	//Get the random element (Calling the getRandomelement function
	    	String loserPlayer = getRandomElement(nameList);
	    	
	    	//Will printout the random name loser
	    	System.out.println("This player is out: " + loserPlayer);
	    	
	    	//Will remove the random loser name
	    	nameList.remove(loserPlayer);
	    	
	    	//Will printout the remaining name of the players
	    	System.out.println("The remaining players are: " + nameList);
	    
	    } 
	    
	}
	
	//Function for getting the random element from the arraylist
	public static String getRandomElement(List<String> list) 
    { 
		//Object for random class
        Random rand = new Random(); 
        //return a random element from the array list
        return list.get(rand.nextInt(list.size())); 
    } 

}
