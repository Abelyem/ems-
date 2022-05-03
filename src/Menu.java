import java.util.Scanner;
import java.util.*;
import java.util.HashMap;

public class Menu {
	


	public static void MenuOptions() {
		
		System.out.println("************* MENU ************* ");
		System.out.println("                     ");
		System.out.println("1 - List All Events");
		System.out.println("2 - List an individual event");
		System.out.println("3 - Edit an event");
		System.out.println("4 - Delete an event");
		System.out.println("5 - List the attendees attending an event");
		System.out.println("6 - Add an attendee to an event");
		System.out.println("7 - Delete an attendee from an event");
		System.out.println("8 - Exit Application");
		System.out.println("                     ");
		System.out.println("Pick from one of the options above: ");

		int optionSelect;
		Scanner in = new Scanner(System.in);
		optionSelect = in.nextInt();
		
	
		
	//	Object valueEntered;
	//	valueEntered = HashMap.get(callIndividualEvent);
		
		Events e1 = new Events("Cinema", "Hackney");
		Events e2 = new Events("Skateboarding", "Brixton");
		Events e3 = new Events("Water-sports", "Westminister");
		Events e4 = new Events("Swimming", "Islington");
		Events e5 = new Events("Basketball", "Camden");
		Events e6 = new Events("Hockey", "Barnet");
		
		Events.listEvents.put(e1.getEventName(), e1);
		Events.listEvents.put(e2.getEventName(), e2);
		Events.listEvents.put(e3.getEventName(), e3);
		Events.listEvents.put(e4.getEventName(), e4);
		Events.listEvents.put(e5.getEventName(), e5);
		Events.listEvents.put(e6.getEventName(), e6);
		
		
		try{
		
			if (optionSelect == 1) {
						
			// For-loop that prints all events 
			for(String key: Events.listEvents.keySet()) {
					System.out.println(Events.listEvents.get(key));
				}
			}
			else if (optionSelect == 2) {
			
			System.out.println("Please enter the name of event you wish to see and press enter:"); 

			// Scanner that takes user input to retrieve event by Name
				Scanner individualEvent = new Scanner(System.in);
				String callIndividualEvent = individualEvent.nextLine();
				
				
			// Takes user input to search for Name of existing events
			System.out.println("Your event: " + Events.listEvents.get(callIndividualEvent));
			}
			
						
			
			else if (optionSelect == 3) {
				System.out.println("Option 3  Selected");
			}
			else if (optionSelect == 4) {
				System.out.println("Option 4  Selected");
			}
			else if (optionSelect == 5) {
				System.out.println("Option 5  Selected");
			}
			else if (optionSelect == 6) {
				System.out.println("Option 6 Selected");
			}
			else if (optionSelect == 7) {
				System.out.println("Option 7  Selected");
			}
			else if (optionSelect == 8) {
				System.out.println("Program Terminated! \n");
			}
		
			// will display full menu after any option selection
			MenuOptions();
		} 
		
		catch(java.util.InputMismatchException e) {
			System.out.println("Please enter a number between 1 and 8 " + e.getMessage());
		}
		
		catch(Exception e) {
			System.out.println("Please only enter a number between 1 and 8 " + e.getMessage());
		}
		
		MenuOptions();

	}



}