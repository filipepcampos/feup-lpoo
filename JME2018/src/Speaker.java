import java.util.Objects;

public class Speaker extends Person {
    int fee = 0;

    Speaker(String name) {
        super(name);
    }

    Speaker(String name, int age) {
        super(name, age);
    }

    public int getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Speaker " + this.getName() + " has a fee value of " + fee + ".";
    }
}
