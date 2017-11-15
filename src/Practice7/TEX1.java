package Practice7;

public class TEX1 {

    public String name;
    public int age;

    public TEX1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void greet() {System.out.println(greetAsString()); }

    public String greetAsString() {

        String greet;
        if(age > 3)
            greet = String.format("Hello, I'm %s and " +
                    "I'm %d years old", name, age);
        else
            greet = "Boo, boo";
        return greet;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
