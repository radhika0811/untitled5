import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        char gender = scanner.next().charAt(0);
        long uniRollNumber = scanner.nextLong();
        scanner.nextLine();
        String courseName = scanner.nextLine();
        Person myself = new Person(name,age,gender);
        Student study = new Student(name,age,gender,uniRollNumber,courseName);
        System.out.println(myself.toString());
        System.out.println(study.toString());
        scanner.close();
    }
}
