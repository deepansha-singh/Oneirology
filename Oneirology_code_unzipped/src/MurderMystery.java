import java.util.*;

/**
 *  
 * @author Aditi
 */

class MurderMystery extends sundarta {
    int ch;
    String name;    

    public void go() {
	head();
	beautify();
	typewriter("Solving a murder mystery isn't always about wearing a black hat & rocking a cigar , this job definitely definitely requires more than that !\n" 
		+"Let's see if you can solve one....\n"
		+"\nBut before we dive in choose what you what you want to be called :\n");
	Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
	any_key();
	beautify();
	intro();
    }

    public void intro() {
	beautify();
	typewriter("You are detective "+name+".Your ability to solve mystery isn't hidden. You have solved many cases over the years.\n"	
		+"Another regular day , you walk in the office you roll back on the chair, light your cigar and start going through the local newspaper.\n"
		+"Few minutes later your secretary comes in and keeps a file in front of you...she informs you about the new case...\n"
		+"the murder of a famous buisnessman in the town.She leaves the room.you look into that blue file on your table,it reads Mr. James Murder\n"
		+"you take a deep breathe and move further in your thoughts about solving the case\n");
	any_key();
	beautify();
	typewriter("How do you want to start your investigation ? \n");
	Q1();
    }

    public void Q1() {
	mg();
	typewriter("What will be your next step?\n"
		+"\n1. Visiting the crime scene\n" 
		+"\n2. Trying to know who was Mr. James and the background information\n" 
		+"\n3. Going to the local police station to know about the matter. \n");
	ch = input();
	beautify();
	if(ch==1){
		visit();
		any_key();
		beautify();
		Q2();
		}
	else if(ch==2) {
		know();
		any_key();
		beautify();
		Q2();
		}
	else if(ch==3) {
		police();
		any_key();
		beautify();
		Q2();
		}
	else{
                typewriter("\n\nInvalid Entry!");
                any_key();
                beautify();
                Q1();
	        }
   }


   public void visit() {
	vila();
	typewriter("After a drive of about fifteen minutes , you enter into his property , a lavish bunglow with a huge back yard , with a pool.\n"
		+"You park your car & move into the villa. After the incident every thing was sealed by the local police. You go upstairs, onto Mr. James room."
		+"You see the chalked outlineof where his body was found it wasn't very far from the door of the room and was facing the window of his room.\n" 
		+"You come to the conclusion that he was attacked from backside while he was looking outside his window.\n");	
   }

   public void know() {
	typewriter("Mr. James was one of the known businessman in the city. He was certainly rich and didn't have any problems in his life."
		+"He was 28, he used to live alone in his bunglow as he was recently divorced. There were around 20 people who worked in his mansion "
		+"to help him with regular household. He was known to be a fun loving man. However, he had a bit of temper and would often indulge "
		+"in fights and argument. There were also quite a few complaints against him because of his behaviour towards women, it is also believed that his "
		+"wife divorced him because of this very reason. On his work-life, he had good relations with everybody. "
		+"However, there were a few people who were jealous of his success.\n");
   }

   public void police() {
	typewriter("You drive into the police station, Hawaldar standing at the gate greets you and takes you inside. You greet the inspector "
		+"and ask him about the case .The inspector tells you that since Mr. James was an influential personality so it is common to have"
		+" enemies in the field. So it appears to be one of them. However, the CCTV footage shows no evidence of break in and the staff present "
		+"that day also claims to have found nothing suspicious. They all saw pretty much the same thing at the crime scene."
		+" So they are finding difficulty to get a bead in this case.\n");
    }

    public void Q2() {
	beautify();
	mg();
	typewriter("What do you wish to do the next ?\n"
		+"\n1. Go back to the previous set of questions .\n"
		+"\n2. Move further with your investigation \n");
	ch = input();
	beautify();
	if(ch==1){
		Q1();
		}
	else if(ch==2) {
		further();
		beautify();
		}
	else{
                typewriter("\n\nInvalid Entry!");
                any_key();
                beautify();
                Q2();
	        }
   }

    public void further() {
	beautify();
	typewriter("Moving further with the investigation process you get back to your office. Laying back in your chair "
		+"you start to think about your investigation so far , just then,\n" 
		+"your secretary comes up with a folder that contains all the"
		+"the necessary documents regarding the case , you take a look at the documents.\n" 
		+"Which one would you feel you are going to read first?\n");
		doc();
   }

    
    public void doc() {
	typewriter("folder contains the following doccuments:\n"
		+"1. Medical report\n"
		+"2. Statement of witnesses\n" 
		+"3. Report of crime scene evidences\n");
	ch = input();
	beautify();
	if(ch==1){
		pm();
		any_key();
		beautify();
		Q3();
		}
	else if(ch==2) {
		st();
		any_key();
		beautify();
		Q3();
		}
	else if(ch==3) {
		ev();
		any_key();
		beautify();
		Q3();
		}
	else{
                typewriter("\n\nInvalid Entry!");
                any_key();
                beautify();
                doc();
	        }
   }


    public void Q3() {
	beautify();
	mg();
	typewriter("What do you wish to do next sir ? \n"
		+"1. Go back to the folder of documents \n"
		+"2. Move further with your investigation\n" 
		+"3. You have found the culprit and would like to inform the local police station about it. \n");
	ch = input();
	beautify();
	if(ch==1){
		doc();
		}
	else if(ch==2) {
		further2();
		}
	else if(ch==3) {
		ans();
		}
	else{
                typewriter("\n\nInvalid Entry!");
                any_key();
                beautify();
                Q3();
	        }
   }

    public void further2() {
	beautify();
	mg();
	typewriter("Moving further with your investigation. What do you wish to do next??\n"
		+"1. Interrogate one of the four witnesses we have\n" 
		+"2. Try to contact with his wife.\n" 
		+"3. Go and investigate with the people he worked\n");
	ch = input();
	beautify();
	if(ch==1){
		wit();
		any_key();
		beautify();
		Q4();
		}
	else if(ch==2) {
		wife();
		any_key();
		beautify();
		Q4();
		}
	else if(ch==3) {
		wrk();
		any_key();
		beautify();
		Q4();
		}
	else{
                typewriter("\n\nInvalid Entry!");
                any_key();
                beautify();
                further2();
	        }
   }

   public void Q4() {
	beautify();
	mg();
	typewriter("What will be your next step ? \n"
		+"1. Move back to the previous set of questions.  \n"
		+"2. Make your decision\n" );
	ch = input();
	beautify();
	if(ch==1){
		further2();
		}
	else if(ch==2) {
		ans();
		}
	else{
                typewriter("\n\nInvalid Entry!");
                any_key();
                beautify();
                Q4();
	        }
   }

   public void ans() {
	beautify();
	who();
	typewriter("Who do you think is the culprit ? \n"
		+"1. Sophia the maid \n"
		+"2. John the butler\n" 
		+"3. Sarah the governess\n"
		+"4. Jack the cook\n" 
		+"5. You don't know \n");
	ch = input();
	beautify();
	if(ch==1){
		congo();
		}
	else if(ch==2 || ch==3 || ch==4 || ch==5) {
		alas();
		}
	else{
                typewriter("\n\nInvalid Entry!");
                any_key();
                beautify();
                ans();
	        }
   }

    public void alas() {
	beautify();
	loose();
        typewriter("Alas ! You made the wrong decision !\n\n" 
		+"The culprit was Sophia. And her statement screamed it loud as she said she saw Mr. James laying there but according to John.\n"
		+"He turned the lights on to see Mr. James and Sarah also witnessed turning the lights on\n");
    }

    public void wife() {
	beautify();
	phone();
        typewriter("Your bad ! Mrs. James Wright isn't interested in talking about Mr. James. She straight forwarding said that."
		+" She has no role to play in the investigation and refused to speak about the same. \n");
    }

    public void wrk() {
	beautify();
	phone();
        typewriter("You are unable to find any lead as there are some people who didn't quite appreciate Mr. James, but still their is no suspicious activity around.\n");
    }


    public void congo() {
	beautify();
	bravo();
        typewriter("Congratulations "+name+" !!!\n"
		+"One more successful cases in your hands. You got the culprit !!\n" 
		+"It was indeed Sophia and her very own statement screamed it loud as she said she saw Mr. James laying there but according to John."
		+"He turned the lights on to see Mr. James and Sarah also witnessed turning the lights on.\n");
    }

    public void wit() {
	beautify();
	typewriter("On that day ,There were the following four people present in the bunglow.All four of the worked for Mr. James.\n"
		+"Who would you like to interrogate first ??\n"
		+"1. Sophia the maid \n"
		+"2. John the butler\n" 
		+"3. Sarah the governess\n"
		+"4. Jack the cook\n");
	ch = input();
	beautify();
	if(ch==1){
		typewriter("you: Tell me all you know\n"
			+"Sophia: I came to wake up Mr. James when I saw him dead, I screamed! \n"
			+"you: What was the time?\n"
			+"Sophia: Around 7:30 in the evening\n"
			+"you: Why did you decide to wake him at that time\n"
			+"Sophia: He had asked me to wake him up ,since he had a meeting at 8\n");
		any_key();
		beautify();
		Q5();
		}
	else if(ch==2) {
		typewriter("you: Tell me all you know\n"
			+"John: When I heard the scream, I ran into the room, turned on the light and saw Mr. James with a knife in his neck \n"
			+"you: What was the time?\n"
			+"John: Around 7:30 in the evening\n"
			+"you: Where was he facing and What do you think he was doing when he was attacked \n"
			+"John: His body lied facing the window,his feet towards the door,he was lying on his belly so probably he was looking out of the window\n");
		any_key();
		beautify();
		Q5();
		}
	else if(ch==3) {
		typewriter("you: Tell me all you know\n"
			+"Sarah: I rushed up alongside John, when he turned on the light, the room was all bloody.\n"
			+"you: What was the time?\n"
			+"Sarah: Around 7:30 in the evening\n"
			+"you: Was it dark at the time\n"
			+"Sarah: Yes, I could see Mr.James only after John turned the light on\n");
		any_key();
		beautify();
		Q5();
		}
	else if(ch==4) {
		typewriter("you: Tell me all you know\n"
			+"Jack: I was prepping breakfast and didn’t see anything\n"
			+"you: What was the time?\n"
			+"Jack: Around 7:30 in the evening\n"
			+"you: did you hear any screeming?did you leave the kitchen? \n"
			+"Jack: No,i was busy doing my job and i did not leave the kitchen till there were cops around\n");
		any_key();
		beautify();
		Q5();
		}
	else{
                typewriter("\n\nInvalid Entry!");
                any_key();
                beautify();
                wit();
	        }
   }

    public void Q5() {
	beautify();
	mg();
	typewriter("What will be the next step ?? \n"
		+"1. Continue with interrogation  \n"
		+"2. Move back to previous set of questions\n" );
	ch = input();
	beautify();
	if(ch==1){
		wit();
		}
	else if(ch==2) {
		further2();
		}
	else if(ch==3) {
		ans();
		}
	else{
                typewriter("\n\nInvalid Entry!");
                any_key();
                beautify();
                Q5();
	        }
   }

    public void head() {
	System.out.println("\n\n\n\n\n\n\n\n");
	System.out.print(
"                     `hdy+omNN: \n"+                        
"                     yMMMMMMMMm      \n"+                   
"                    -MMMMMMMMMM/          \n"+              
"                 :ohNMMMMMMMMMMNhyo.           \n"+         
"                :hdNMMMMMMMMMMMMMNh-                \n"+    
"                   .MMMMMMMMMMMMo                  :ds+\n"+ 
"                    +MMMMMMMMMMMy                 .N/:h\t\t\t  @         @  @     @  @ @ @    @ @ @   @ @ @ @  @ @ @           \n"+ 
"                     +MMMMMMMMMMo                 /N /h\t\t\t  @ @     @ @  @     @  @    @   @    @  @        @    @         \n"+ 
"                    :hMMMMMMMMMhhy:               :N.ho\t\t\t  @  @   @  @  @     @  @ @ @    @    @  @@ @     @ @ @        \n"+ 
"             /hdmNMMMMMMMMMMy+-` +Nh:hmy`         .md: \t\t\t  @   @ @   @  @     @  @  @     @    @  @        @  @            \n"+ 
"           .dMMMMMMMNNNMNNNNNNNds   NNMm         :MMN. \t\t\t  @    @    @   @ @ @   @   @    @ @ @   @ @ @ @  @   @      \n"+ 
"          :NMMMMMMMMMMMMMMMMMMMMMMMh  -/       .NMMMMo \n"+ 
"         /MMMMMMMMMMMMMMMMMMMMMMMMMMm.         dMMMMN- \n"+ 
"        :MMMMMMMMMMMMMMMMMMMMMMMMMMMMN-     -omMMMNs`  \t\t\t\t  @         @  @     @   @@ @   @ @ @ @  @ @ @ @  @ @ @   @    @        \n"+ 
"       -NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN:  .hMMMMN/     \t\t\t\t  @ @     @ @    @  @   @          @     @        @    @   @  @         \n"+ 
"      .NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMo+NMMMMMN`     \t\t\t\t  @  @   @  @     @      @ @       @     @@ @     @ @ @      @          \n"+ 
"     `mMMMMMMMMMMMMMMMMMMMMMMMMmNMMMMMMMMMMMMMMMd`     \t\t\t\t  @   @ @   @     @         @      @     @        @  @       @          \n"+ 
"     -MMMMMMMMMMMMMMMMMMMMMMMMMo`sNMMMMMMMMMMMN+       \t\t\t\t  @    @    @     @    @ @ @       @     @ @ @ @  @   @      @          \n"+ 
"     /dMMMMMMMMMMMMMMMMMMMMMMM+  `oNMMMMMMMNo`        \n"+ 
"       .odMMMMMMMMMMMMMMMMMMMM+    `/dNNds:           \n");
	System.out.println("\n\n\n\n\n\n\n\n");
    }

public void pm() {
		
System.out.print("\t\t\t\t\t\t\t__________________________________________________________\n");
System.out.print("\t\t\t\t\t\t\t|\t                  MEDICAL REPORT                  | \n"
	          +"\t\t\t\t\t\t\t|\t						  |\n"
	          +"\t\t\t\t\t\t\t|\t                                                  |\n"
		  +"\t\t\t\t\t\t\t|\tNAME: Mr. James Wright                            | \n"
	          +"\t\t\t\t\t\t\t|\tAGE: 28                                           |\n"
	          +"\t\t\t\t\t\t\t|\tDATE OF BIRTH: 1.01.1992                          |\n"
	          +"\t\t\t\t\t\t\t|\tDATE OF DEATH: 1.02.2020                          |\n" 
	          +"\t\t\t\t\t\t\t|\tREASON OF DEATH: Excessive blood loss             |\n"
	          +"\t\t\t\t\t\t\t|\tTIME OF DEATH: 7:00pm                             |\n"
	          +"\t\t\t\t\t\t\t|\tSEX: Male                                         |\n"
	          +"\t\t\t\t\t\t\t|\tHEIGHT: 173 cm                                    |\n"
	          +"\t\t\t\t\t\t\t|\tWEIGHT: 65 kg);                                   |\n"
		  +"\t\t\t\t\t\t\t|\tCONDUCTED BY: Dr.Alex Wisdom                      |\n"
		  +"\t\t\t\t\t\t\t|\t      REIGONAL MEDICAL EXAMINER OFFICE            |\n");
	System.out.print("\t\t\t\t\t\t\t|_________________________________________________________|\n\n");	   

}

public void st() { 
       
	System.out.print("\t\t\t\t\t\t\t__________________________________________________________\n");
System.out.print("\t\t\t\t\t\t\t|\t                  STATEMENT                       | \n"
	          +"\t\t\t\t\t\t\t|\tThere were only 4 people present in the premises  |\n"
	          +"\t\t\t\t\t\t\t|\t                                                  |\n"
	          +"\t\t\t\t\t\t\t|\t1. SOPHIA THE MAID                                |\n" 
	          +"\t\t\t\t\t\t\t|\t2. JOHN THE BUTLER                                |\n"
	          +"\t\t\t\t\t\t\t|\t3. SARAH THE GOVERNESS                            |\n"
	          +"\t\t\t\t\t\t\t|\t4. JACK THE COOK                                  |\n"
                  +"\t\t\t\t\t\t\t|\t                                                  |\n"
		  +"\t\t\t\t\t\t\t|\t                                                  |\n"
	          +"\t\t\t\t\t\t\t|\tSOPHIA: I came to wake up Mr. James               |\n"
                  +"\t\t\t\t\t\t\t|\t        when I saw him dead, I screamed!          |\n"
		  +"\t\t\t\t\t\t\t|\t                                                  |\n"
  		  +"\t\t\t\t\t\t\t|\tJOHN: When I heard the scream, I ran into         |\n"
		  +"\t\t\t\t\t\t\t|\t      the room, turned on the light and saw       |\n"
		  +"\t\t\t\t\t\t\t|\t      Mr. James with a knife in his neck.         |\n"
  		  +"\t\t\t\t\t\t\t|\t                                                  |\n"
  		  +"\t\t\t\t\t\t\t|\tSARAH: I rushed up alongside John, when he        |\n"
  		  +"\t\t\t\t\t\t\t|\t       turned on the light, the room              |\n"
  		  +"\t\t\t\t\t\t\t|\t       was all bloody                             |\n"
  		  +"\t\t\t\t\t\t\t|\t                                                  |\n"
  		  +"\t\t\t\t\t\t\t|\tJACK: I was prepping dinner                       |\n"
  		  +"\t\t\t\t\t\t\t|\t      and didn’t see anything                   |\n"
  		  +"\t\t\t\t\t\t\t|\t                                                  |\n");
	System.out.print("\t\t\t\t\t\t\t|_________________________________________________________|\n\n");	       	
             



}


public void ev() {
System.out.print("\t\t\t\t\t\t\t__________________________________________________________\n");
System.out.print("\t\t\t\t\t\t\t|\t                  CRIMESCENE                      | \n"
	          +"\t\t\t\t\t\t\t|\t						  |\n"
	          +"\t\t\t\t\t\t\t|\t                                                  |\n"
	          +"\t\t\t\t\t\t\t|\tThe murder of Mr. James Wright took place on      |\n" 
	          +"\t\t\t\t\t\t\t|\t01.02.2020 at around 7:00pm in the premices of    |\n"
	          +"\t\t\t\t\t\t\t|\this residence. He was found dead at 7:30 pm in    |\n"
	          +"\t\t\t\t\t\t\t|\this room by his maid Sophia.Local Police reached  |\n"
                  +"\t\t\t\t\t\t\t|\tthe crimescene at 7:50 pm,There was no evidence   |\n"
		  +"\t\t\t\t\t\t\t|\tof robbery or brawl between Mr.James and the      |\n"
	          +"\t\t\t\t\t\t\t|\tslayer,the room was covered with blood.           |\n"
                  +"\t\t\t\t\t\t\t|\t       				                  |\n"
		  +"\t\t\t\t\t\t\t|\t                                                  |\n"
  		  +"\t\t\t\t\t\t\t|\tEVIDENCES:                                        |\n"
		  +"\t\t\t\t\t\t\t|\t      					          |\n"
		  +"\t\t\t\t\t\t\t|\t1. Murder weapon- Kitchen knife                   |\n"
  		  +"\t\t\t\t\t\t\t|\t2. Clothes that Mr.James was wearing-             |\n"
  		  +"\t\t\t\t\t\t\t|\t             a blue night suit.                   |\n"
  		  +"\t\t\t\t\t\t\t|\t3. His Phone                                      |\n");

	System.out.print("\t\t\t\t\t\t\t|_________________________________________________________|\n\n");	       	
             
}


public void mg() {
System.out.print("\n\n");


System.out.print(
"        _:+++/.    \n"+       
"       so     /y:       \n"+  
"      h:       `d-        \n"+
"      d.        h:        \n"+
"      -s:     .oo         \n"+
"       `:+++++h-          \n"+
"              oy.         \n"+
"              `yd.        \n"+
"               `hm-       \n"+
"                `hm-      \n"+
"                 `dN.     \n"+
"                  `-      \n");
System.out.print("\n");
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

    public void who() {
	System.out.print("\n\n");
	System.out.print(
"\t       -+shdmNNNNmdhs+:\n"+
"\t    -sNMMMMMMMMMMMMMMMMMd+ \n"+  
"\t  `yMMMMMMMMMMMMMMMMMMMMMMN/  \n"+
"\t `mMMMMMMMMNmhyyhmNMMMMMMMMM+ \n"+
"\t sMMMMMMMMs-      .sMMMMMMMMM.\n"+
"\t mMMMMMMMs          hMMMMMMMM:\n"+
"\t hdddhhhh-          dMMMMMMMN.\n"+
"\t                  .yMMMMMMMN+ \n"+
"\t               `:yNMMMMMMMd:  \n"+
"\t             .omMMMMMMMmy:`   \n"+
"\t            /mMMMMMMNy/.      \n"+
"\t           .NMMMMMMy.         \n"+
"\t           :MMMMMMm           \n"+
"\t           `------          \n"+
"\t                        \n"+
"\t           :mMMMMNy     \n"+     
"\t           +MMMMMMd         \n"+  
"\t            ./oo+-       \n"); 
System.out.print("\n\n");    

}

    public void phone() {
        System.out.print("\n\n");
	System.out.print(
"\tsNMMMMMNd`    :MMmds+-\n"+
"\tyMMMMMMMM-    .oshmNMMNs- \n"+   
"\t+MMMMMMMMo          /yNMMy.   \n"+
"\t`NMMMMMMMm    :mdho   .sNMN:  \n"+
"\t +MMMMMNh:     sdNMMh:  :NMN: \n"+
"\t `yMMMh:`        .oNMN:  oMMm\n"+
"\t  `hMMh.           +dds  `ddd.\n"+
"\t   `sMMm+`          ```   ````\n"+
"\t    `/mMMd+`                \n"+
"\t      .omMMmo.    `+dmdhysso \n"+
"\t        .+dMMNh+:omMMMMMMMMMM.\n"+
"\t          `-odMMNMMMMMMMMMMMM-\n"+
"\t             `./shmMMMMMMMMMM.\n"+
"\t                 ```-/+osyyyo \n");
System.out.print("\n\n");
}


    public void vila() {
        System.out.print("\n\n");
	System.out.print(
"                           /y+:smmmmmmd/`    \n"+      
"                        .oNMMMNy/osssssss-        \n"+ 
"                        dMMM  MMM`dNNNNNNNd       \n"+ 
"                        dMMMMMMMM`NMMMMMMMN       \n"+ 
"               `` ......+oooooooo-+ooooooo+..`    \n"+ 
"            `/hNNy++hMMMMMMMMMMMMMMMMMMMMMMMM:    \n"+ 
"         `/hNh+++odNy++hMMMMMMMMMMMMMMMMMMMMM:    \n"+ 
"      `/hNh++yNMMNy+odNy++hMMMMMMMMMMMMMMMMMM:    \n"+ 
"    .`mh++yNMMMMMMMMNy+odd.oooooooooooooooooM:    \n"+  
"  -oh`.:-MMMMMMMMMMMMMM.o/-MMMMMMMMMMMMMMMN`y-    \n"+ 
"        -MMMMh/++/mMMMM.mMs+/+/NMMMMo+/++MM`      \n"+ 
"        -MMMMy   -hMMMM.mM+s   NMMMM:   .MM`      \n"+ 
"        -MMMMh   -dMMMM.mMo/   NMMMM/   :MM`      \n"+ 
"        -MMMMMMMMMMMMMM.mMMMMMMMMMMMMMMMMMM`      \n"+ 
"        -MMMMy   .dMMMM.mM+   `NMMMM:   -MM`      \n"+ 
"        -MMMMy   -hMMMM.mM+   `NMMMM:   .MM`      \n"+ 
"        -MMMMdoooomMMMM.mMyooooMMMMM:   .MM`      \n"+ 
"        .hhhhhhhhhhhhhh`shhhhhhhhhhh-___`hy`      \n");
	System.out.print("\n\n");
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