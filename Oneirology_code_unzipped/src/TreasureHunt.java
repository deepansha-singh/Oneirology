import java.util.Scanner;

/**
 *  
 * @author Aditi
 */

class TreasureHunt extends sundarta {
    
    int ch;
    String name;
    String ans;
    String meat = "Meat";
    
    public void begin() {	
	title();
	beautify();
	typewriter("Welcome Aboard !Before we sail our way in the quest of treasure.\n" + "Choose your name Captain.\n");
	Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
	typewriter("All prepared to set sail !");
	any_key();
	beautify();
	bckstry();
    }

    public void bckstry() {
	beautify();
	typewriter(" You are Captain Haddock ! Captain "+ name +" Haddock!\n" + "Your ancestors sailed through dark and in sun. Haddock's have been known to handle the sea like no one else.\n"
                    + "However once while they were on board ,the sea took over their sail and Folklore (your ancestral ship) disappeared into the mist.\n"
                    + "It is believed that only a true Haddock will be able to make it to the treasure .Lets see if you are one ! \n"
                    + "May you have fair winds and following seas captain.\n");
	any_key();
	beautify();
	clue1();
    }

    public void clue1() {
	typewriter("\nAhoy Captain !\n" + " You are standing at a crossroad with 3 ways to choose from. It's freezing as temperature is way below the freezing point.\n"
		+ "Here goes your first clue captain:\n"
		+ "A bridge in a hollow, And a hundred going over it\n" 
		+ "No blacksmith , no mason ,Nor carpenter built it\n"
		+ "Which way will you go?\n"
		+ "\n1. First to your right ,will take you to an old dockyard shut after an accident."
		+ "\n2. Second leads to the bank of a river."
		+ "\n3. Third way leads to the top of a cliff.");
	ch = input();
	typewriter("\nAye Aye Captain!\n");
	beautify();
	if (ch == 2) {
            typewriter("\nCongratulations!\n"
	   	     + "with temperature below freezing point what you will be walking on is a frozen river");
            any_key();
            beautify();
	    conti1();
	}
	else if (ch == 1 || ch == 3) {
            dend();
	}
        else {
            zaroori();
            clue1();
	}
}

    public void conti1() {
        beautify();
	typewriter("You followed the second path crossed the river half way and cited  something huge! Really huge!! In the midst of the fog you run towards it . "
		+ "A smile pops on your face, as you see Folklore right in front of you. You feel you have won it all you bolt into the ship\n"
		+ "You see a clutter of the old, dull furniture all over the place. The old musty smell filled the atmosphere. You start to look around starting from left there a piano,\n"
		+ "the tank filled with slurry water with all sorts of dirt in it, following it is a huge cabinet with the drawers and sections, it holds a bundle of papers," 
		+ "equipments, tools , a box with hay and the whole lot of unwanted stuff to globes compasses and maps in the corner you see stamps and the ink spread all around."
		+ "Below it is huge box what looks like a coffin. As we see towards upon right there are a bunch of desks and the chairs with broken lamps ,beer bottle & paper floating all over the floor."
		+ "You take a deep breath and keep looking around for your second clue.\n");
	any_key();
	beautify();
	clue2();
    }
		
    public void clue2() {
        typewriter("Exhausted and confused you are standing in the middle of everything , here comes our second clue:\n"
		+ "\nWho makes me has no need of me."
		+ "\nWho buys me has no use of me."
		+ "\nWho uses me cannot see or feel me.\n"
		+ "What will you do Captain?\n"
		+ "\n1. Search in the tank filled with stinking water with all the dirt and flies lying dead in it."
		+ "\n2. Look into old broken boxes of hay kept at your right."
		+ "\n3. Open that big creepy box slide under the cabinet that appears to be a coffin.\n");
	ch = input();
	typewriter("\nAye Aye captain!\n");
	beautify();
	if (ch == 3) {
            typewriter("\nThat's Right!\n");
            any_key();
            beautify();
            clue3();
	}
	else if (ch == 1 || ch == 2) {
            dend();
	}
        else {
	    zaroori();
            clue2();
	}
    }

    public void clue3() {
        beautify();
	typewriter("You slowly move towards the coffin, shivering you reach out to it and slowly open it. Your heart skips a beat on that creaky sound."
                + "As the box lies open, you take a step back as an awful smell overpowers the atmosphere before you can think of anything you are greeted  with your third clue which is:\n" 
		+ "\nI have travelled around the globe "
		+ "\nWhile staying in the corner."
		+ "\n What will be your next step?\n"
		+ "\n1. Roll out the map laying next to your feet ."
		+ "\n2. Reach out to the globe on the cabinet."
		+ "\n3. Take a look at the stamp floating there \n");
	ch = input();
	typewriter("\nAye Aye captain!\n");
	beautify();
	if (ch == 3) {
            typewriter("\nBravo!It is indeed a stamp travelling the globe.\n");
            any_key();
            beautify();
            clue4();
	}
	else if ( ch == 1 || ch == 2) {
            dend();
	}
        else {
            zaroori();
            clue3();
	}
    }
		
    public void clue4() {
        beautify();
	typewriter("As you take a look at the stamp you are greeted with your next clue that says :\n"
            + "What has many keys but can't open a single lock\n"
            + "Any one of those can open your path .\n"
            + "This may be your last choice !  What will you do now? \n"
            + "\n1. Look through the hole in that broken door."
            + "\n2. Go play the piano on your left because you can't think of anything else "
            + "\n3. Search in the drawers of the cabinet.");
	ch = input();
	typewriter("\nAye Aye captain!\n");
	beautify();
	if (ch == 2) {
            typewriter("\nThat's the way it is done!  piano with all the keys..\n");
            any_key();
            beautify();
            conti2();
	}
	else if (ch == 1 || ch == 3) {
            dend();
	}
        else {
            zaroori();
            clue4();
	}
    }
		
    public void conti2() {
        beautify();
	typewriter("As soon as you play  that piano you hear a creeky noise you are dumb struck ,you cannot believe your eyes as you see a door "
                + "opening from nowhere. If this wasn't enough you see a huge man holding a huge butcher knife standing next to what you have been looking for all this while you are"
                + "confused, you don't know if you've got your treasure or not, you see it but in the shadow of a man you have no clue about. Confused ?\n");
	any_key();
        beautify();
	clue5();
    }

    public void clue5() {
        typewriter("Lets introduce you to the man standing there, His name is Paul. He is 6 feet tall. He works as an assistant at a Butcher's shop & wears size 9 shoes,"
                + "He is standing there to gaurd the treasure.He also has brought to you your last and final challenge.If you get it right, treasure is all yours."
		+ "Just in case you don't , then the knife in his hand will do the rest of the talking.... \n"
		+ "Here comes ......\n"
		+ "Your last & final question : "
		+ "You have to tell , Young man standing there 6 feet tall with shoe size 9. What does he weigh ?? \n");
	Scanner sc = new Scanner(System.in);
        ans = sc.nextLine();
	beautify();
	if(ans.equalsIgnoreCase(meat)) {
	    bravo();
            typewriter("\nCongratulations Captain !!Treasure is all yours");
	}
        else {
	    dend();
        }
    }
    
    public void dend() {
	beautify();
	loose();
	typewriter("\nAlas!\n"
		+ "That's incorrect.! Better luck next time.\n");
    }
		
    public void title() {
	System.out.println("\n\n\n\n\n\n\n\n");
	System.out.print(
 "                   |~\n" +
 "             |/    w\n" +
 "            / (   (|   \\      \t @ @ @ @   @ @ @    @ @ @ @      @ @      @ @ @    @       @   @ @ @    @ @ @ @		@     @   @       @   @       @   @ @ @ @\n" +
 "           /( (/   |)  |\\     \t    @      @    @   @           @   @    @         @       @   @    @   @		@     @   @       @   @ @     @      @\n" +
 "    ____  ( (/    (|   | )  ,  \t    @      @ @ @    @ @ @      @     @     @ @     @       @   @ @ @    @ @ @		@ @ @ @   @       @   @   @   @      @\n" +
 "   |----\\ (/ |    /|   |'\\/^;\t    @      @   @    @         @ @ @ @ @        @   @       @   @   @    @		@     @   @       @   @     @ @      @\n" +
 " \\---*---Y--+-----+---+--/(   \t    @      @    @   @ @ @ @   @       @   @ @ @      @ @ @     @    @   @ @ @ @		@     @     @ @ @     @       @      @\n" +
 "  \\------*---*--*---*--/\n" +
 "   '~~ ~~~~~~~~~~~~~~~\n");
	System.out.println("\n\n\n\n\n\n\n\n");
    }
   public void bravo() {
   System.out.print("\n\n");
System.out.print(
"\t\t\t\t\t\t\t @ @ @   @     @  @ @ @ @  @ @ @ @  @ @ @    @ @ @    #  #  #    \n"+
"\t\t\t\t\t\t\t@        @     @  @        @        @    @  @         #  #  #     \n"+
"\t\t\t\t\t\t\t@        @ @ @ @  @ @ @    @ @ @    @ @ @     @ @     #  #  #   \n"+
"\t\t\t\t\t\t\t@        @     @  @        @        @  @         @    #  #  # \n"+
"\t\t\t\t\t\t\t @ @ @   @     @  @ @ @ @  @ @ @ @  @   @   @ @ @     o  o  o    \n");


}			


  public void loose() {
    System.out.print("\n\n");
System.out.print(
"\t\t\t\t\t\t\t                    -smNMMNdo.  \n"+                  
"\t\t\t\t\t\t\t                   oMMNs+oyNMN/     \n"+              
"\t\t\t\t\t\t\t                  sMMd`    -mMN/        \n"+          
"\t\t\t\t\t\t\t                 sMMd`      -NMM/           \n"+      
"\t\t\t\t\t\t\t                sMMd`        -mMM/              \n"+  
"\t\t\t\t\t\t\t               sMMd`          -NMN/               \n"+
"\t\t\t\t\t\t\t              sMMd`   :ydds.   -mMM/              \n"+
"\t\t\t\t\t\t\t             sMMd`   -NMMMMm`   -mMN/             \n"+
"\t\t\t\t\t\t\t            sMMd`    :MMMMMN`    -mMN/            \n"+
"\t\t\t\t\t\t\t           sMMd`     :MMMMMN`     -mMN/           \n"+
"\t\t\t\t\t\t\t          sMMd`      :MMMMMN`      -mMN/          \n"+
"\t\t\t\t\t\t\t         sMMd`       :MMMMMN`       -mMN/         \n"+
"\t\t\t\t\t\t\t        sMMd`        :MMMMMN`        -mMN/        \n"+
"\t\t\t\t\t\t\t       sMMd`         :MMMMMN`         -mMN/       \n"+
"\t\t\t\t\t\t\t      sMMd`          :MMMMMN`          -mMN/      \n"+
"\t\t\t\t\t\t\t     sMMd`           :MMMMMN`           -mMM/     \n"+
"\t\t\t\t\t\t\t    sMMd`             oNMMm/             -NMN/    \n"+
"\t\t\t\t\t\t\t   sMMd`                                  -mMM/   \n"+
"\t\t\t\t\t\t\t  sMMd`                 :-                 -mMN/  \n"+
"\t\t\t\t\t\t\t sMMd`               `yMMMNo                -mMM/ \n"+
"\t\t\t\t\t\t\tsMMd`                -NMMMMm`                -mMN/\n"+
"\t\t\t\t\t\t\tNMN.                  :ymds.                  :MMm\n"+
"\t\t\t\t\t\t\tNMN:                                          +MMd\n"+
"\t\t\t\t\t\t\t:NMMdssssssssssssssssssssssssssssssssssssssssmMMd.\n"+
"\t\t\t\t\t\t\t `+hmMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNmy/ \n");

 System.out.print("\n\n");
}
}