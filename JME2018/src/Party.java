import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Party extends Event {
    List<Event> events;

    public Party(String title){
        super(title);
        this.events = new ArrayList<Event>();
    }

    public Party(String title, String date){
        super(title, date);
        this.events = new ArrayList<Event>();
    }

    public Party(String title, String date, String description){
        super(title, date, description);
        this.events = new ArrayList<Event>();
    }

    public Party(Event e){
        super(e);
        this.events = new ArrayList<Event>();
    }

    public void addEvent(Event e) {
        events.add(e);
    }

    @Override
    public int getAudienceCount(){
        int count = super.getAudienceCount();
        for(Event e : events){
            count += e.getAudienceCount();
        }
        return count;
    }
}
