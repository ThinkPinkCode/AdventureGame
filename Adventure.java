import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		
		boolean playing = true; 

		
		Scanner reader = new Scanner (System.in);
		
		System.out.println
		("Let's take a road trip!" + "\n" +
		 "What's your name?");
		
		String name = reader.nextLine();
		
		System.out.println("Welcome "+ name+ "! Our roadtrip begins in Detroit, Michigan.");
		boolean keepAsking = true;
		int mpg =0;
		String car = "";
		

		
		
		System.out.println("What car will we be taking? Please select a letter." + "\n" +
				"A. 2016 Chrysler Pacifica  B. 2010 Ford F150 " + "\n" +
				"C. 2012 Toyota Prius       D. 2014 Chevrolet Camero");
		
		car = reader.nextLine();
		
			if (car.equalsIgnoreCase("A"))
				{ mpg = 28; 
				keepAsking = false;}
			
			
			else if (car.equalsIgnoreCase("B"))
				{ mpg = 21;
				  keepAsking = false;}
			
			else if (car.equalsIgnoreCase("C"))
			{ mpg = 48;
			keepAsking = false; }
			
			else if (car.equalsIgnoreCase("D"))
			{mpg = 30;
			keepAsking = false;}
			
			else
				System.out.println("Invalid entry.");
		
	
		System.out.println("Nice choice!");
		
		System.out.println("Your vehicle gets " + mpg + " mpg on the highway. We'll figure out how far we can go after we review the budget.");
		
		System.out.println("We need to buy the road trip essentials- gas and snacks." +  "\n" +
				"How much money do you have to spend total?  $ _____  (Please do not enter $ sign)");
	
		int budget = reader.nextInt();
				
		if (budget <0) {
			System.out.println("Hey, this can't be negative! What's your budget?");
			budget = reader.nextInt();
		}
		
		//not really necessary
		/*if (budget > 2000) 
			System.out.println("Hey big spender, that's a little high for this road trip. Try again!");
			budget = reader.nextInt();
		*/
		
		
		System.out.println("We have to decide how much of our budget to spend on snacks. On a scale of 1 to 10, how hungry are you? (10 is the hungriest!)");
		
		int hunger = reader.nextInt();
		
			if (hunger>10 || hunger <1){
				System.out.println("Not a valid entry, please rate your hunger on a scale of 1 to 10.");
				hunger = reader.nextInt();
			}

		
			
		
		//setting snack pay
			int foodbudget= 0;
			
				if (hunger > 8)
				 foodbudget = (int) (.3*budget); 
				
				else if (hunger > 6)
				foodbudget = (int) (.2*budget);
				
				else if (hunger > 2)
				foodbudget = (int) (.1*budget);
				
				else if( hunger > 0)
				foodbudget = (int) (.05*budget); 
			
		// food items based on budget
		System.out.println(
			"Ok! Snacks have been bought. We spent $" + foodbudget + "." + "\n" +
			"This is what we have in the cooler:");
		
		int slimJimSpend;
		int twinkieSpend;
		int turkeySandSpend;
		int rootBeerSpend;
	
		
		    slimJimSpend = (4 * foodbudget)/ 50;
		    twinkieSpend = (3 * foodbudget) / 25;
		    turkeySandSpend= (2 * foodbudget) / 4;
		    rootBeerSpend = (1 * foodbudget) / 1;
		    
		    
			if (slimJimSpend > 0){
				System.out.println(slimJimSpend + " Slim Jims" );
			}
			
			if (twinkieSpend > 0){
				System.out.println(twinkieSpend + " Twinkies" );
			}
			
			if (turkeySandSpend > 0) {
				System.out.println(turkeySandSpend + " Turkey Sandwiches");
			}
			
			if (rootBeerSpend > 0) {
				System.out.println(rootBeerSpend + " Bottles of root beer");
			}
			
	//setting gas budget
			
			int gasbudget = budget - foodbudget; 
			
			
			System.out.println("We have $" + gasbudget + " left to spend on gas.");
			
//miles to travel
			
			int gasGallons = gasbudget / 3; //assuming gas price of $3 per gallon
			int milesAvailable = gasGallons * mpg;
			
				
			

			System.out.println("Time to hit the road! Should we drive north or south?");
			String firstDirection; 
			
			reader.nextLine();
			
			firstDirection = reader.nextLine();
			
			if (firstDirection.equalsIgnoreCase("north")){
				
				if (milesAvailable >=140){
						System.out.println("We're heading north!");
						System.out.println("Our first stop is Flint, Michigan. Population 99,763. Birthplace of filmmaker Michael Moore");
						milesAvailable -= 140;
						playing = false;
					}
				else if (milesAvailable > 70 && milesAvailable <140) {
						System.out.println("Oops we have enough gas to reach our destination but not enough to make it home. You better stay home and work so you can have a bigger budget next time. Goodbye.");
						playing = false;
						}
				
				else if (milesAvailable < 70){
						System.out.println("You don't have anywhere near enough gas. You should have a staycation instead. Goodbye");
						playing = false;
						}
				}
			
			//south
			if (firstDirection.equalsIgnoreCase("south")) {
				if (milesAvailable >= 230){
					System.out.println("We're heading south!");
					System.out.println("Our first stop is Sandusky, Ohio. Population 25,340. Home of Cedar Point amusement park!");
					milesAvailable -= 230;
					}
				if (milesAvailable > 115 && milesAvailable <230) {
						System.out.println("Oops we have enough gas to reach our destination but not enough to make it home. You better stay home and work so you can have a bigger budget next time. Goodbye.");
						playing = false;
					}
				if (milesAvailable < 115){
					System.out.println("You don't have anywhere near enough gas. You should have a staycastion instead. Goodbye");
					playing = false; 
				}
			}
			
			
				//east after north
				System.out.println("Now should we travel East or West?");
				String secondDirection = reader.nextLine();
				
				if (firstDirection.equals("north")) {
				
				
					if (secondDirection.equalsIgnoreCase("East") && milesAvailable >=443) {//calc as distance to TC and back to Detroit
							System.out.println("We're heading East!");
							System.out.println("We are now in Traverse City, Michigan. Population 15,018. Home to the annual Cherry Festival.");
							System.out.println("Time to head back to Detroit.");
							System.out.println("We made it to Detroit. See you next time");
							playing = false; 
							
							}
					if (milesAvailable > 190 && milesAvailable <443){
							System.out.println("Oops we have enough gas to reach our destination but not enough to make it home. We'll head home instead. Goodbye.");
							playing = false; 
							}
					if (milesAvailable < 190) {
						System.out.println("You don't have anywhere near enough gas. We'll head home instead. Goodbye");
						playing = false;
						}
					
					// west after North
					
					if (secondDirection.equalsIgnoreCase("west") && milesAvailable >=130) {
						System.out.println("We're heading West!");
						System.out.println("We are now in Port Huron, Michigan. Population 29,331. Its population grew rapidly after the 1850s due a high rate of immigration attracted by the successful shipbuilding and lumber trade.");
						System.out.println("Time to head back to Detroit.");
						System.out.println("We made it to Detroit. See you next time");
						playing = false; 
						
						}
					if (milesAvailable > 63  && milesAvailable < 130){
							System.out.println("Oops we have enough gas to reach our destination but not enough to make it home. We'll head home instead. Goodbye.");
							playing = false; 
							}
					if (milesAvailable < 63) {
						System.out.println("You don't have anywhere near enough gas. We'll head home instead. Goodbye");
						playing = false;
						}
					}
				
				
				
				
				if (firstDirection.equalsIgnoreCase("South")){
					
					if (secondDirection.equalsIgnoreCase("west")){
						
						if (milesAvailable >=574) {//calc as distance to TC and back to Detroit
								System.out.println("We're heading West!");
								System.out.println("We are now in Chicago, Illinois. Population 2.719 million. Grab a slice of pizza and head to Second City Comedy Club!");
								System.out.println("Time to head back to Detroit.");
								System.out.println("We made it to Detroit. See you next time");
								playing = false; 
								
								}
						if (milesAvailable > 313 && milesAvailable <574){
								System.out.println("Oops we have enough gas to reach our destination but not enough to make it home. We'll head home instead. Goodbye.");
								playing = false; 
								}
						if (milesAvailable < 313) {
							System.out.println("You don't have anywhere near enough gas. We'll head home instead. Goodbye");
							playing = false;
							}
											
					}
					
					if (secondDirection.equalsIgnoreCase("east")){
							if (milesAvailable >=468) {
								System.out.println("We're heading East!");
								System.out.println("We are now in Pittsburgh, Pennsylvania. Population 305,841. Home of the 2016 Stanley Cup Champions");
								System.out.println("Time to head back to Detroit.");
								System.out.println("We made it to Detroit. See you next time");
								playing = false; 
								
								}
							if (milesAvailable > 182 && milesAvailable < 468){
									System.out.println("Oops we have enough gas to reach our destination but not enough to make it home. We'll head home instead. Goodbye.");
									playing = false; 
									}
							if (milesAvailable < 182) {
								System.out.println("You don't have anywhere near enough gas. We'll head home instead. Goodbye");
								playing = false;
								}
					}
				}
			
			
			
			}		
			}
				
			
			
			
		
			
	


	
