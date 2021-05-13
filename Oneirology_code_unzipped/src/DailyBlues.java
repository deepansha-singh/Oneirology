import java.util.Scanner;

/**
 *  
 * @author Deepansha
 */

class DailyBlues extends sundarta {
    
    int h_end = 0;
    int s_end = 0;
    int rs = 0;
    int sp = 0;
    String name;
    int choice;
    
    public void narrative() {
        heading();
        beautify();
        typewriter("Now Player, before we directly jump into the land of Lucid Dreams, our Master here is kind enough to let you have an opportunity to decide what you'd like to be known as (instead of just referring to you as a useless peasant 'that you are').\n" +
                "See, you didn't like that, right? This is how every conversation feels like in the life of a mentally stressed person.\n" +
                "By letting you into the realm of Daily Blues, Master provides you the opportunity to explore and experience what a day in the life of any socially-pressured person feels like.\n" +
                "Now,\n" +
                "Quickly enter your name Player: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        typewriter("\nWith, the formalities all done and dealt with, off we go!");
        any_key();
        beautify();
        morning_dilemma();
    }

    public void morning_dilemma() {
        beautify();
        typewriter("\nDead tired, exhausted, if not physically but mentally, even if you just woke up from yet another night of drug-induced restless sleep, staring at an equally boring ceiling;\n\n" +
                "While your alarm for school rings even after what seems like the 100th snooze of the morning, you lay wide awake in your bed, contemplating what to do next...\n" +
                "1.	 Try being optimistic and get out of your bed.\n" +
                "2.	 You are too exhausted to even move, thus, try going back to sleep.\n" +
                "3.	 You're straight-up lazy, and the pills on your bedside table look pretty tempting.\n" +
                "\nTime is precious; take your pick quick, because honey, the school-bus driver isn't exactly fond of you.\n");
        choice = input();
        beautify();
        if (choice == 1) {
            h_end++;
            if ((rs == 1) && (sp == 1)) {
                typewriter("\nKnock! Knock!\n" +
                        "Did I interrupt your game?\n" +
                        "Well at least that was enough to wake you up from your slumber, slowpoke!\n" +
                        "\nCongratulations on missing the entire day of school!\n" +
                        "\nThe master hopes you'd come back when you'd have a better alarm clock.");
                any_key();
                beautify();
                return;
            }
            else if ((rs == 1) || (sp == 1)) {
                late_to_school();
            }
            else {
                on_time_to_school();
            }
        }
        else if (choice == 2) {
            rs++;
            if (rs == 2) {
                typewriter("\nKnock! Knock!\n" +
                        "Did I interrupt your game?\n" +
                        "Sorry \"peasant\", Master doesn't deem you fit to handle the life of an already upset person.\n" +
                        "Therefore, " + name + " you've been demoted.\n" +
                        "Go back and learn the basics of a Healthy Lifestyle.\n" +
                        "Until then, Ciao!!");
                any_key();
                beautify();
                return;
            }
            typewriter("\nTossing, turning, you try to go back to sleep...");
            any_key();
            morning_dilemma();
        }
        else if (choice == 3) {
            s_end++;
            sp++;
            if (sp == 2) {
                typewriter("\nKnock! Knock!\n" +
                        "Did I interrupt your game?\n" +
                        "So did you!\n" +
                        "Not something as miniscule as a game but an entire life!\n" +
                        "Your protagonist died of drug overdose :) \n" +
                        "Congratulations, you SADIST!");
                any_key();
                beautify();
                return;
            }
            typewriter("\nFrustrated enough, you grab another handfull of the pills and down them in another futile attempt at peace...");
            any_key();
            morning_dilemma();
        }
        else {
            zaroori();
            morning_dilemma();
        }
    }

    public void on_time_to_school() {
        beautify();
        h_end++;
        typewriter("\n\nSometimes you climb out of bed in the morning and you think I'm not going to make but you laugh inside, remembering all the times you felt that way.\n" +
                "\nSo alas, you woke up and got ready on time. \n" +
                "You knew it would be a long day ahead, yet you decided to hold yourself together and just make it through the day.\n" +
                "Trudging down the same old paths, you reached your school.\n" +
                "You knew the routine;\n" +
                "\nKeep your hood up, head down. Don't bother anyone, hide in the shadows and no one would mind you.\n" +
                "\nMaking your way to class, you find your seat, put-in your ear plugs and wait for the teacher to come and start her blabbering.");
        any_key();
        beautify();
        attention();   
    }

    public void late_to_school() {
        beautify();
        s_end++;
        typewriter("\nYou're proud that you tried, you knew you did yourself some good, but when was it enough?\n" +
                "You were late yet again, hopefully, you'll make it past the Gate-Inspection Teacher without any hassles, or it'd mean more unnecessary conversations.\n" +
                "You see the gates of the hell-hole (aka school) come into view and so does the stout, balding teacher who almost seemed to be sneering at you for giving him more records to put in his register.\n" +
                "As soon as you step in, all you hear is his bickering as to if you can't drag yourself enough to come on time, why'd you even bother to come and trouble not only yourself but others as well, it's not like any one wanted you to be here or even knew of your existence.\n" +
                "Wanting all of this to be done and over with as soon as possible, you decided to do what you're best at: Keep your head down low and look at your feet, pretending to be remorseful, as if you'd actually reflect upon your actions.\n" +
                "After that verbal bashing session was over, you were pretty much expecting a similar reaction as soon as you enter the class-room with a side of a ton of attention from your peers.\n" +
                "So, as stealthily as possible, you slid open the doors of the dreaded room, expecting utter silence, all eyes on you and the deadly stare of the angry teacher for you would’ve interrupted her session.\n" +
                "\nBut seems as if the lord was happy that you're trying;\n" +
                "The Teacher was LATE!!\n" +
                "Thus, you find your seat, put-in your ear plugs and wait for the teacher to come and start her blabbering.");
        any_key();
        beautify();
        attention();
    }

    public void attention() {
        beautify();
        typewriter("\nA few minutes later, the teacher waltzed in and you are forced to pause your favorite podcast.\n" +
                "In the middle of the boring History class you can almost feel yourself drifting far away into your own train of anxious thoughts of self-pity. Somewhere in between you started staring outside the class window counting the number of leaves on the withering tree standing outside in the school ground.\n\n" +
                "\"" + name + " ! " + name.toUpperCase() + " !!\"\n" +
                "\nYou're shook out of your daydream by someone calling you out as if there were no tomorrow.\n" +
                "Startled, you stand up.\n" +
                "The teacher starts in an almost mocking tone;\n" +
                "\"Now that I have your attention child, would you please like to enlighten everyone with the answer to my question?\"\n" +
                "Lost, you almost panic realizing that you've got an audience and all eyes are on you.\n" +
                "Trying to get a grip on yourself, you somehow manage to stutter out the words,\n" +
                "\"Ehh, umm, what was the question again?\"\n" +
                "As soon as those words are out, you regret them already.\n" +
                "You're met with a roar of laughter from your classmates and yet another disappointed sigh from the teacher.\n" +
                "\"" + name + ", child, I'll let it slide this one last time, just give me the answer to the question on the slide.\"\n" +
                "You take a few seconds to muster up the courage to look up towards the lecture presentation.\n" +
                "\n\nQues: What is a handwritten composition on paper, bark, cloth, metal, palm leaf or any other material dating back at least seventy-five years that has significant scientific, historical or aesthetic value called?\n" +
                "1.	 Inscription\n" +
                "2.	 Manuscript\n" +
                "3.	 Fossil");
        choice = input();
        if (choice == 2) {
            h_end++;
            typewriter("\nYes, you hadn't been keeping up with your studies these days, but the teacher couldn't really expect you NOT to know the answer to THIS?!\n" +
                "You were equally surprised as to a question like this could make into the syllabus for your year!\n" +
                "\"Knock, knock! Anybody home?! Give me the answer already, if you don't know it, say it! Don't go around wasting everybody's time!\"\n" +
                "Now, that brought you back.\n" +
                "You were confident about your answer, but all you could manage to stutter out was,\n" +
                "\"Uhh... Option 2, I guess...\"\n" +
                "Your lack of finality aggravated the teacher even more, quite to the amusement of your fellow mates.\n" +
                "\n\"LOUDER AND CLEARER " + name.toUpperCase() + " !!\"\n" +
                "\n\"Manuscript; the answer is Manuscript.\"\n" +
                "\n\"Now, it wasn't so hard, was it? It's good to see you keeping up with your studies child, but try paying more attention in class next time.\"\n" +
                "And the rest of the lecture continued, until the bell rang and you had the opportunity to finally leave.");
            any_key();
            beautify();
            nerd_bully();
        }
        else if ((choice == 1) || (choice == 3)) {
            s_end++;
            typewriter("\nYou hadn't been keeping up with your studies these days, and the teacher couldn't really expect you to know the answer to THIS?!\n" +
                "You were equally surprised as to a question like this could make into the syllabus for your year!\n" +
                "\"Knock, knock! Anybody home?! Give me the answer already, if you don't know it, say it! Don't go around wasting everybody's time!\"\n" +
                "Now, that brought you back.\n" +
                "You had NO idea as to what was the answer supposed to be, but all you could manage to stutter out was,\n" +
                "\n\"Uhh... I don't know\"\n" +
                "Your lack of finality aggravated the teacher even more, quite to the amusement of your fellow mates.\n" +
                "\"Now, what in the love of lord, is wrong with you these days, child. You haven't been keeping up in any of your classes, your performance has only deteriorated these past days?! I can at least expect you to pay attention in class instead of counting the number of clouds in the sky today!\"\n" +
                "\nEmbarrassed and feeling equally humiliated, you kept your head and took your seat again as you could still hear the gnawing cackles of some of your classmates.\n" +
                "And the rest of the lecture continued, until the bell rang and you had the opportunity to finally leave.");
            any_key();
            beautify();
            freak_bully();
        }
        else {
            zaroori();
            attention();
        }
    }

    public void nerd_bully() {
        beautify();
        typewriter("\nKind of satisfied with yourself for at least answering the teacher and not making a complete fool out of yourself, you start putting your things back into your bag, when suddenly your books are snatched out of your hands and you realize you have been pushed onto the ground. All this commotion attracts quite some audience as you come face-to-face with the Principal's son, aka the Big-Bad-Bully of the school, for he could always get away with anything and everything he did, so much as to even the teachers were fed up and had given up on schooling him back into lines of humanity.\n" +
                "Now, that you managed to stand back up, you see the usual suspects, the Bully and his clique.\n" +
                "It was nothing new, and by now, even you were used to their routine and were already anticipating the next series of their actions.\n" +
                "Push.\n" +
                "\"You think you're all that, huh?\"\n" +
                "Punch.\n" +
                "\"Such a lapdog, you are, I swear!\"\n" +
                "\"You freak, loner bastard!\"\n" +
                "Push.\n" +
                "\"All you'll ever be good at will be licking up your books, you waste of space.\"\n" +
                "Punch.\n" +
                "\"Why don't you do everyone around here a favor and cut yourself a little deeper than every time and actually die, you scum!\"\n" +
                "Push.\n" +
                "You knew, there'd be at least 3-4 more sets of insults coming your way.\n");
        any_key();
        beautify();
        bully();                
    }

    public void freak_bully() {
        beautify();
        typewriter("\nAlready feeling exhausted and embarrassed for making a complete fool out of yourself, you start putting your things back into your bag, when suddenly your books are snatched out of your hands and you realize you have been pushed onto the ground. All this commotion attracts quite some audience as you come face-to-face with the Principal's son, aka the Big-Bad-Bully of the school, for he could always get away with anything and everything he did, so much as to even the teachers were fed up and had given up on schooling him back into lines of humanity.\n" +
                "Now, that you managed to stand back up, you see the usual suspects, the Bully and his clique.\n" +
                "It was nothing new, and by now, even you were used to their routine and were already anticipating the next series of their actions.\n" +
                "Push.\n" +
                "\"Waddup' nerdy birdie, couldn't even answer the teacher now, could you?\"\n" +
                "Punch.\n" +
                "\"Such a lapdog, you are, I swear!\"\n" +
                "\"You freak, loner bastard!\"\n" +
                "Push.\n" +
                "\"The only purpose of your existence at the moment is to study, yet you never fail to amaze me, huh? Failing classes, are you now?.\"\n" +
                "Punch.\n" +
                "\"Why don't you do everyone around here a favor and cut yourself a little deeper than every time and actually die, you scum!\"\n" +
                "Push.\n" +
                "You knew, there'd be at least 3-4 more sets of insults coming your way.\n");
        any_key();
        beautify();
        bully();
    }

    public void bully() {
        beautify();
        typewriter("\nPondering as to what are you going to do now...\n" + "1.	 Burst out on the bully, for you've had enough.\n" +
                "2.	 Stand still, taking it all in.\n");
        choice = input();
        beautify();
        if (choice == 1) {
            h_end++;
            typewriter("\nLosing yourself, feeling as if you were tipping across the edge of your sanity, you suddenly snap!\n" +
                "Feeling as if you've had enough;\n" +
                "You Burst!\n" +
                "Burst out in tears,\n" +
                "Burst out on your bully!\n" +
                "You start screaming, shouting and talking back, something you've never done before. You start questioning him as to,\n" +
                "What have you done wrong?\n" +
                "What did you do to make yourself his prey?\n" +
                "What kind of threat did your existence pose upon him that he wanted you to kill yourself so bad?\n" +
                "Your outburst shocks you as well as everyone else in the room.\n" +
                "It feels as if the time had come to a standstill, until you couldn't take it no more. You picked up your things and walked out of the room, leaving all of the chaos behind.");
        }
        else if (choice == 2) {
            s_end++;
            typewriter("\nBeing used to all of it already, you follow your usual routine.\n" +
                "Keeping your head down low, listening to everything he has to say.\n" +
                "Silently hating yourself more with every insult, push or punch thrown your way. Hating yourself even more for not standing up for yourself, for not taking a stand, for not voicing your opinions.\n" +
                "After a few more punches, you can almost feel the end of this torment.\n" +
                "One last push, the bully comes nearer, thrusts something into your hand and whispers, \"I really thought you could use a new one.\"\n" +
                "When the bully and his clique walks off, you look into your palm to see a shiny, new blade there.\n" +
                "You wait for everyone to leave, then start picking up all your scattered belongings and start trudging out of the class.");
        }
        else {
            zaroori();
            bully();
        }
        any_key();
        beautify();
        club();
    }

    public void club() {
        beautify();
        typewriter("\nWandering around, not minding anyone in your surroundings, you find yourself moving towards the school gate, when something annoyingly bright on the school notice board catches your attention.\n" +
                "You move ahead to read what the piece of paper had to say, only to find out that most of the clubs at school were recruiting new members.\n" +
                "You are almost tempted to give in when you see the name of your favorite club...\n" +
                "\nWhat do you do?\n" +
                "1.	 Decide to give it a shot!\n" +
                "2.	 You know that you probably wouldn't make it for no one would want a freak in their clubs.\n");
        choice = input();
        if (choice == 1) {
            h_end++;
            typewriter("\nFeeling all excited and giddy to have a chance at getting into the school 'Photography Club', you go the school lounge where the recruits were supposed to happen.\n" +
                "You register yourself for the recruits and wait for your turn, looking around the photography studio, feeling all exhilarated to actually have a chance to get in and work here with others who share the same love for photography as you.\n" +
                "You hear your name being called out and realize that it's your turn for the interview. Kind of anxious and jittery, but you still walk into the room, to see a few seniors, sitting there with large welcoming smiles, not something that you'd see often.\n" +
                "Surprisingly enough, that is enough to calm your nerves and you do pretty well on the interview. The seniors were quite impressed with your shots that you showed them and by the end you were hopeful that you'd make it.\n" +
                "Deciding to call it a day, you happily start walking home, after you see your name of people who managed to get in!\n" +
                "Walking back home, usually, was the toughest task, for you had all the time in the world then to actually over-think everything you did throughout the day, but today was different! You had something occupying your mind, stopping you from actually feeling bad about yourself.");
        }
        else if (choice == 2) {
            s_end++;
            typewriter("\nYou knew you had no chance at making it into any club or even making any friends for you already had quite some reputation as the self-harming freak, you were even more bummed out than usual.\n" +
                "Deciding to call it a day, you start drag yourself home after you see the line of people wanting to register for your favorite club get longer!\n" +
                "Walking back home, usually, was the toughest task, for you had all the time in the world then to actually over-think everything you did throughout the day, and today was no different, physically you kept walking forward, but mentally, sigh, you were walking backwards, replaying everything that happened today, feeling sadder by every moment.");
        }
        else {
            zaroori();
            club();
        }
        any_key();
        beautify();
        ghar_aagaye();
    }

    public void ghar_aagaye() {
        beautify();
        typewriter("\nBy the time you reach home, you are very exhausted and all you want is to have a peaceful nap. You almost give into the temptation when you realize you've got homework to do...");
        any_key();
        beautify();
        home_work();
        beautify();
        typewriter("\nBy now, you were kind of hungry. Looking at the clock, you realize it's almost time for dinner...");
        any_key();
        beautify();
        food();
        beautify();
        typewriter("\nMaking yourself comfortable on your bed, you find yourself revisiting whatever you did throughout the day.");
        any_key();
        beautify();
        decision_maker();
        beautify();
        beautify();
    }

    public void home_work() {
        beautify();
        typewriter("\n\nWhat do you do??\n" +
                "1.	 You somehow make it to your desk and start working on your homework.\n" +
                "2.	 You've had enough for the day and decide on skipping homework.\n");
        choice = input();
        if (choice == 1) {
            h_end++;
            typewriter("\nYou realized that to do yourself any good, you had to work on it gradually, slowly. Your only resort would be taking baby-steps towards leading a \"normal\" life.\n" +
                "As you do your homework, you catch up on a lot of concepts you had skipped so far, and the constant distraction helps you keep the leash on your mind intact. After you're done, you realize that you were actually productive and got something done.");
        }
        else if (choice == 2) {
            s_end++;
            typewriter("\nWell now since you decided not to do your homework, you found yourself going back to doing what you were best at, over-thinking, over-analyzing every breath you had taken today. You felt yourself spacing out more and more, and boarding the train of self-agony that you know, would lead you to the blade kept in your bathroom shelf.\n" +
                "You shook yourself out of it, prodding for ideas and tasks to keep yourself occupied.");
        }
        else {
            zaroori();
            home_work();
        }
        any_key();
        beautify();
    }

    public void food() {
        beautify();
        typewriter("\nWhat do you do?\n" +
                "1.	 Fix yourself something to eat\n" +
                "2.	 You're simply lazy, sleep on an empty stomach\n");
        choice = input();
        if (choice == 1) {
            h_end++;
            typewriter("\nYou stand up and go out on a food-hunt into your kitchen, only to find nothing but a couple of cups of instant-ramen. Making a mental note of going grocery shopping asap, you fix yourself some ramen and relinquish your meal.");
        }
        else if (choice == 2) {
            s_end++;
            typewriter("\nYou can almost hear your stomach groaning in protest, but you're simply too lazy and tired after the day you've had to be bothered enough to get some food for yourself.");
        }
        else {
            zaroori();
            food();
        }
        any_key();
        beautify();
        
    }

    public void decision_maker() {
        beautify();
        if (s_end > h_end) {
            typewriter("\nContemplating what you did throughout the day, you are yet again disappointed by your own-self, feeling appalled in your own flesh for your decisions don't seem to account for any betterment or any of the hopes you have for yourself.\n" +
                    "Feeling as if you've had enough, you sit-up with a start, a determined, yet fierce look in your eyes.\n" +
                    "You stand-up from the bed and move into the bathroom. Searching, hunting, like a mad-person, for the only object that could help you feel better at the moment. As you get a hold of the blade sitting invitingly on your bathroom counter, you can't help but enjoy the coldness of the blade.\n" +
                    "\nBringing it up closer to your wrist, imagining the pattern you want this time around, you go for it;\n" +
                    "\nOnce. Twice. Thrice.\n" +
                    "\nAnd then you lost count.\n" +
                    "\nGoing deeper with every slit, fascinated by the droplets of red on the floor, you can almost feel yourself slipping out.\n" +
                    "Looking into the bathroom mirror, you smile, what you know is your last smile, whisper to yourself,\n" +
                    "\"You'd never be enough\"\n" +
                    "And welcome the numbness that engulfs you in what seems like your last embrace…\n" +
                    ".\n" +
                    ".\n" +
                    ".\n" +
                    ".\n" +
                    ".\n" +
                    "Well, well, well\n" +
                    "Hello there Player,\n" +
                    "Master is deeply disappointed in you.\n" +
                    "You'd better come back around when you have a better sense of humanity.\n" +
                    ".\n" +
                    ".\n" +
                    ".\n" +
                    ".\n" +
                    ".\n" +
                    "THE END");
        }
        else {
            typewriter("\nContemplating what you did throughout the day, you're almost proud of yourself and how you dealt about it. You find yourself experiencing this weird sense of calmness in your chest, something that's not normal for you. Thus, you close your eyes with a smile on your face and astonishingly sleep comes to you, without any pills tonight.\n" +
                    ".\n" +
                    ".\n" +
                    ".\n" +
                    ".\n" +
                    ".\n" +
                    "Well, well, well\n" +
                    "Hello there Player,\n" +
                    "Master appreciates your efforts and believes that you'd do good in any stressful circumstance yourself or maybe even to the extents of helping a friend in need.\n" +
                    "\nIf you ever stumble upon anyone who you think needs to know, just repeat this to them:\n" +
                    "\n\n\"Give yourself another day, another chance. You will find your courage eventually. Don't give up on yourself just yet.\"\n" +
                    ".\n" +
                    ".\n" +
                    ".\n" +
                    ".\n" +
                    ".\n" +
                    "THE END");
        }
        beautify();
        System.console().readPassword();
    }  

    public void heading() {
        System.out.println();
        System.out.print("\t     |/|\n" +
                        "\t     |/|\n" +
                        "\t     |/|\n" +
                        "\t     |/|\n" +
                        "\t     |/|\n" +
                        "\t     |/|\n" +
                        "\t     |/| / )\n" +
                        "\t     |/|/\\/\n" +
                        "\t     |/|\\/\n" +
                        "\t    (---)\t\t\t@ @ @       @ @      @ @ @ @   @       @     @     @ @ @     @        @       @  @ @ @ @    @ @ @\n" +
                        "\t    (---)\t\t\t@     @    @   @        @      @        @   @      @     @   @        @       @  @        @\n" +
                        "\t    (---)\t\t\t@     @   @     @       @      @          @        @ @ @     @        @       @  @ @ @      @ @ \n" +
                        "\t    (---)\t\t\t@     @  @ @ @ @ @      @      @          @        @     @   @        @       @  @              @\n" +
                        "\t    (---)\t\t\t@ @ @    @       @   @ @ @ @   @ @ @ @    @        @ @ @     @ @ @ @    @ @ @    @ @ @ @   @ @ @\n" +
                        "\t    /--/\\\n" +
                        "\t   / ,^./\\\n" +
                        "\t  / /   \\/\\\n" +
                        "\t / /     \\/\\\n" +
                        "\t( (       )/)\n" +
                        "\t| |       |/|\n" +
                        "\t| |       |/|\n" +
                        "\t| |       |/|\n" +
                        "\t( (       )/)\n" +
                        "\t \\ \\     / /\n" +
                        "\t  \\ `---' /\n" +
                        "\t   `-----' \n");
        System.out.println();
    }

}