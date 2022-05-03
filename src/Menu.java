import java.util.Scanner;
import java.util.*;
import java.util.HashMap;

public class Menu {
	


	public static void MenuOptions() {
		
		Scanner in = new Scanner(System.in);

		
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
		optionSelect = in.nextInt();
		in.nextLine();
			
		
		Events e1 = new Events("1", "Cinema");
		Events e2 = new Events("2", "Skateboarding");
		Events e3 = new Events("3", "Water-sports");
		Events e4 = new Events("4", "Swimming");
		Events e5 = new Events("5", "Basketball");
		Events e6 = new Events("6", "Hockey");
		
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
			
			System.out.println("Please enter the corresponding number of the event you wish to see and press enter:"); 

			// Scanner that takes user input to retrieve event by Name
				String callIndividualEvent = in.nextLine();
			
			
			// If else block to ensure an event is returned, and to prompt user action if
			// no event (null) is returned 
			
				boolean result = Events.listEvents.get(callIndividualEvent) != null;

				if(!result) {
					System.out.println("You've entered an incorrect number, please select option 1 to"
							+ " see all event names and their corresponding number again.");
				}
				
				else {
					// Takes user input to search for Name of existing events
					System.out.println("Your event: " + Events.listEvents.get(callIndividualEvent));
				}			
			}
						
			else if (optionSelect == 3) {
				
				System.out.println("Please enter the the corresponding number of the event you'd like to edit");
				
				Scanner toEditEvent = in;
				String keyFromUser = in.nextLine();

				System.out.println("New event name to replace previous: ");
				String newEventName = toEditEvent.nextLine();
				
				
				Events newEdit = Events.listEvents.get(keyFromUser);
				System.out.println(newEdit);
				newEdit.setNewEvent(newEventName);
				System.out.println(newEdit);
				Events.listEvents.replace(keyFromUser, newEdit);
				System.out.println(Events.listEvents);
							
			}
			
			else if (optionSelect == 4) {
				
				Scanner userInputToDelete = in;
		
				System.out.println("Event number to be removed: ");
				String toDelete = userInputToDelete.nextLine(); 
				
				// Converting user input to an int to use within if block
				int toDeleteInt = Integer.parseInt(toDelete);
				
					//if block to allow deletion of existing key-pair values - 
					// goes to else block if user attempts to remove an event key which does not exist 
				
					if(toDeleteInt <= Events.listEvents.size()) {
						Events.listEvents.remove(toDelete);
						System.out.println(Events.listEvents);
					}
					else {
						System.out.println("No event removed - please re-visit events list and re-attempt.");
					}			
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
				
				// no longer displays menu and closes application
				// optionSelect is set as an integer
				System.exit(optionSelect);
			}
			else {
				System.out.println("Please enter a number between 1 and 8 ");
			}
		
			// will display full menu after any option selection
			MenuOptions();
			
			
		} // end of try block 
		
		catch(Exception e){
			System.out.println("Please only enter a number between 1 and 8 ");
		}
		
		finally {
			System.out.println("Please only enter a number between 1 and 8 ");
		}
									
		MenuOptions();

	}
}