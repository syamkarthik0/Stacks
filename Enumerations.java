import java.util.Enumeration;
import java.util.Stack;

public class Enumerations {
    public static void main(String[] args) {
        Stack<Person> stack = new Stack<>();
        stack.push(new Person("Karthik", 21));
        stack.push(new Person("Sai", 20));

        Enumeration<Person> enumeration = stack.elements();
        while (enumeration.hasMoreElements()) {
            Person person = enumeration.nextElement();
            System.out.println("Person Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
