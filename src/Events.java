import java.util.HashMap;

public class Events {
	
	
	private String eventName;
	private String eventLocation;
	
	
	public static HashMap<String, Events> listEvents = new HashMap<>();

	
	public Events(String eventName, String eventLocation){
		this.eventName = eventName;
		this.eventLocation = eventLocation;
	}
	
	// getter 
	
	public String getEventName() {
		return eventName;
	}

	//setter
	
	public void setNewEvent(String newEvent) {
	    this.eventName = newEvent;
	  }

	
	@Override
	public String toString() {
	        return this.eventName + " - " + this.eventLocation;	               
	   }


}
