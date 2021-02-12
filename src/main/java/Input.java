import com.github.javafaker.Faker;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Enter something :");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println("You entered : "+ input);
        System.out.println("Contains numbers? " + StringUtils.isNumeric(input));
        System.out.println("Flipped Case: "+ StringUtils.swapCase(input));
        System.out.println("Reversed: "+StringUtils.reverse(input));
        System.out.println();
//        System.out.println("enter name");
//        Scanner pc =new Scanner(System.in);
//        String names= pc.nextLine();
        Faker faker = new Faker();

        String name = faker.name().fullName(); // Miss Samanta Schmidt
        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton

        String streetAddress = faker.address().streetAddress();
        System.out.println(name);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(streetAddress);
    }
}
