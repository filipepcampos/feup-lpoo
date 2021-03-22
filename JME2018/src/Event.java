import java.util.*;

public class Event {
    Set<Person> audience;
    private String title;
    private String date = "";
    private String description = "";

    public Event(String title){
        this.title = title;
        audience = new HashSet<Person>();
    }

    public Event(String title, String date){
        this.title = title;
        this.date = date;
        audience = new HashSet<Person>();
    }

    public Event(String title, String date, String description){
        this.title = title;
        this.date = date;
        this.description = description;
        audience = new HashSet<Person>();
    }

    public Event(Event e){
        this.title = e.title;
        this.date = e.date;
        this.description = e.description;
        this.audience = e.audience;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return  title + " is a " + description + " and will be held at " + date + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(title, event.title) && Objects.equals(date, event.date) && Objects.equals(description, event.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, date, description);
    }

    public void addPerson(Person p) {
        audience.add(p);
    }

    public int getAudienceCount(){
        return audience.size();
    }
}
