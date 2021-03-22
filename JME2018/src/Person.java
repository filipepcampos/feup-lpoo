import java.util.Objects;

public abstract class Person implements Comparable, User {
    private String name;
    private int age;

    Person(String name){
        this.name = name;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName());
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Person)) return 1;
        return getName()==((Person) o).getName() ? 0 : 1;
    }

    @Override
    public String getUsername() {
        return name + age;
    }
}

