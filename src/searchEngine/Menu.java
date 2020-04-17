package searchEngine;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

	public Menu() {
		// TODO Auto-generated constructor stub
	}
	
	public static void showMenuOptions() {
		String menuOptions = "" +
		 "\nSearch Engine based on Java Tutorials" + 
		 "\n--------------------------------------" + 
		 "\n1 - Download Database." + 
		 "\n2 - Search Keywords using String matching"  + 
		 "\n3 - Search URLs using Regular Expression" + 
		 "\n4 - Frequency of all words from each File in Database" + 
		 "\n0 - Exit" + 
		 "\nSelect an Option from Menu: ";

		System.out.println(menuOptions);		
	}
	
	public static void getUsersOption(String directoryPath) throws IOException {
		
		boolean displayMenu = true;
		int option;
		Scanner input = new Scanner(System.in);
		while(displayMenu) {
			
			showMenuOptions();
	        
//		    try {
		    	
		        option = input.nextInt(); 
		        System.out.println("You selected: "+option);
		        switch(option) {
					case 1:  
							Spider.GetData();
							break;
					case 2: 
							if(!Helper.searchWordInDatabase(directoryPath)) {
								System.out.println("No matching result!");
							}
							break;
					case 3: 
							Helper.findURLsInDirectory(directoryPath);
							break;
					case 4:
							Helper.getWordsFreqInAllFiles(directoryPath);
							break;
					case 0:
							displayMenu = false;
							System.out.println("Exiting Program!");
							System.exit(0);
					default:
							System.out.print("The entered value is unrecognized!\n\n");
		       }
//		    } catch (Exception e) { 
//		    	StdOut.println("Enter input in correct format "+e);
////		    	option = Integer.parseInt(input.nextLine());
//		    }
	    }
		input.close();
		
	}

}
