import java.util.HashMap;

public class Events {
	
	
	private String eventName;
	private String eventLocation;
	
	
	public static HashMap<String, Events> listEvents = new HashMap<>();

	
	public Events(String eventName, String eventLocation){
		this.eventName = eventName;
		this.eventLocation = eventLocation;
	}
	
	public String getEventName() {
		return eventName;
	}

	
	
	@Override
	public String toString() {
	        return this.eventName + " at " + this.eventLocation;	               
	   }
}
