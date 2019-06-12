import java.util.Scanner;


public class StringComp {
    public static void main( String[] args )
    {
        String name;
        String breed;
        int age;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Greetings. What is your pet's name, breed, age? " );
        name = keyboard.nextLine();
        breed = keyboard.nextLine();
        age = keyboard.nextInt();

        System.out.print( "What kind of animal is " + name + "? " );
        System.out.print( "How old is " + name + "? ");

        System.out.println( name + " is your " + breed + " and it is " + age );
    }
}
