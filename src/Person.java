import javax.swing.*;

public class Person {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
                s.append(" Hello, my name is " + getName() + ".");
        if(getGender() == 'm')
          s.append(" I am a man and I am " + getAge() + " years old.");
        else
            s.append(" I am a woman and I am " + getAge() + " years old.");
        return s.toString();
    }

    public void introduction()
    {
        System.out.println(" I am a student" );
        System.out.println(" I am an undergraduate" );
        System.out.println(" I am studying computer science" );
        System.out.println(" I study in GLA University" );
        System.out.println(" I live in mathura" );

    }

}