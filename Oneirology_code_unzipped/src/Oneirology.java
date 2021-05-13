import java.util.Scanner;

/**
 *
 * @author Deepansha
 */

public class Oneirology extends sundarta {
    
    public static void main(String[] args) {
        int option = 0;
        int count = 1;
        while (option != 3) {
            if (count == 1) {
                home_screen();
            }
            else {
                clear_screen();
                home_screen();
            }
            count++;
            Scanner opt = new Scanner(System.in);
            option = opt.nextInt();
            if (option == 1) {
                DailyBlues db = new DailyBlues();
                db.narrative();
            }
            else if (option == 2) {
                 TreasureHunt th = new TreasureHunt();
                 th.begin();	
            }
            else if (option == 3) {
                MurderMystery mm = new MurderMystery();
                mm.go();
            }
            else if (option != 4) {
                System.out.println("\n\nSo you're just gonna be rude, huh?");
            }
            else {
                System.exit(0);
            }
        }
    }

    public static void home_screen() {
        title();
        System.out.println("Welcome to the Land Of Dreams, where you are in-charge of what happens next!\n\n" +
                        "The Game Administrator aka Master brings to you a range of Story-Lines to choose from and play around with;\n" +
                        "Take your pick Player!\n" +
                        "1.	 Daily Blues\n" +
                        "2.	 Treasure Hunt\n" +
                        "3.       Murder Mystery\n" +
                        "4.	 None of the Above <you are rude and you simply want to exit!>\n\n" +
                        "Enter the option of your choice:\n" +
                        "Please be kind enough as to NOT choose something that's not mentioned.\n" +
                        "Anyways yeah,\n" +
                        "Enter your choice already Player, the Master doesn't have the entire day!!\n\n");
    }
    
    public static void title() {
        System.out.println();
        for(int i = 0; i < 3; i++) {
            System.out.print("  *  .  . *       *    .        .        .   *    . . " +
                            " .    *        .  * . . *  .  .      .        .            * " +
                            "   *.   *         * . * .     *      *        *    " +
                            "           *   . . " +
                            "*   *    .  *      .     *   .  *   ." +
                            "      * .   *    .  .     *    .      *  .  ..  * . . " +
                            "   . .   *  . .   * . .   .  *    *            .      *   * " +
                            "    *   .  * . . . *  .  *  . . * . * . . . ." +
                            "     . .  . . *        * . . * .     * . .   . . *   * .  ");
        }
        System.out.println();
        System.out.print("\n\t\t\t ** ** ** **   **        **   ** ** **   **   ** ** **   ** ** ** **   **         ** ** ** **   ** ** **     **     ** \n" +
                           "\t\t\t **       **   ** **     **   **         **   **     **  **       **   **         **       **   **            **   ** \n" +
                           "\t\t\t **       **   **   **   **   ** ** **   **   ** ** **   **       **   **         **       **   **  ** **       ** \n" +
                           "\t\t\t **       **   **     ** **   **         **   **  **     **       **   **         **       **   **     **       ** \n" +
                           "\t\t\t ** ** ** **   **        **   ** ** **   **   **    **   ** ** ** **   ** ** **   ** ** ** **   **  ** **       ** \n");
        System.out.println();
        for(int i = 0; i < 3; i++) {
        System.out.print("  *  .  . *       *    .        .        .   *    . . " +
                        " .    *        .  * . . *  .  .      .        .            * " +
                        "   *.   *         * . * .     *      *        *    " +
                        "           *   . . " +
                        "*   *    .  *      .     *   .  *   ." +
                        "      * .   *    .  .     *    .      *  .  ..  * . . " +
                        "   . .   *  . .   * . .   .  *    *            .      *   * " +
                        "    *   .  * . . . *  .  *  . . * . * . . . ." +
                        "     . .  . . *        * . . * .     * . .   . . *   * .  ");
        }
        System.out.println();
    }

}