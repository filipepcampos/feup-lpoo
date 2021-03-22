public class Attendee extends Person{
    private boolean hasPaid = false;

    Attendee(String name) {
        super(name);
    }

    Attendee(String name, int age){
        super(name, age);
    }

    public boolean hasPaid() {
        return hasPaid;
    }

    @Override
    public String toString() {
        return "Attendee " + getName() + (hasPaid ? " has" : " hasn't") + " paid its registration.";
    }
}
