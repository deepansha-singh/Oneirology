import static java.lang.Character.toLowerCase;
import java.util.Scanner;

/**
 *
 * @author Deepansha
 */

public class sundarta {
    
    public static void clear_screen() {
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {}

        for(int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
    
    public static void typewriter(String message) {
        for(int i = 0; i<message.length(); i++) {
            System.out.print(message.charAt(i));
            try {
                Thread.sleep(30);
            }
            catch(InterruptedException e) {}
       }
    }
    
    public void beautify() {
        System.out.println();
        for(int i = 0; i<168; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    public int input() {
        System.out.println("\n\nEnter your choice : ");
        Scanner obj = new Scanner(System.in);
        int option = obj.nextInt();
        return option;
    }
    
    public void any_key() {
        String leave = "exit";
        typewriter("\n\n\nPress ENTER to continue...\nType exit to leave the game...\n");
        String what_next = new String(System.console().readPassword());
        if (what_next.equalsIgnoreCase(leave)) {
            System.exit(0);
        }
    }

    public void zaroori() {
        typewriter("\n\nInvalid Entry!");
        any_key();
        beautify();
    }

}