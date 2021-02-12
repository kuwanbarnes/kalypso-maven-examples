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

    }
}
