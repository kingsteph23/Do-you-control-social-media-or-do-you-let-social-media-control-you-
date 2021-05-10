package com.company;

import java.util.Scanner;

public class anglais {

    public static void main(String[] args) {
        // INTRO
        System.out.println("""
                ________________________________________
                |                                       |\s
                |       Social Media Addiction          | \s
                |            Survey                     | \s
                |                                       | \s
                |_______________________________________|""");

        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello there, what is your name:");
        String name = scan.nextLine();
        System.out.println("Oh hey," + name + "!");
        System.out.println();
        System.out.println("How are you felling today?," + name + ":" +
                "\n(A)Like a million bucks,euros,pounds,pesos" +
                "\n(B)Meh" +
                "\n(C)Im just vibin atm" +
                "\n(D) I feel like (S)uger, (H), honey,(Ice), (Tea)." +
                "\n:");

        String mood = scan.nextLine();
        if (mood.equals("A") || mood.equals("Like a million bucks,euros,pounds,pesos")) {
            System.out.println("Wonderful");


        }if (mood.equals("B") || mood.equals("Meh")){
            System.out.println("Ehh, thats fine as well.");
        }else if(mood.equals("C") || mood.equals("Im just vibin atm")){
            System.out.println("How you vibin rn\uD83D\uDE33." +
                    "\sI respect the vibe\uD83D\uDC4D\uD83C\uDFFE\uD83D\uDE2B");
        }else if(mood.equals("D") || mood.equals("I feel like (S)uger, (H), honey,(Ice), (Tea).")){
            System.out.println("Thats wack\uD83E\uDD27\uD83E\uDD27");
        }
        System.out.println();

        System.out.println("Alright" +name+ "" +
                "\sSooo, as you already by the title, you are about to fill out a survey." +
                "\sWhich(depending on your responses) will see if you are either hooked or not hooked" +
                "\sto social media. In this day of age, we pretty much have all the information we need in our hands" +
                "\sLiterally! But sometimes we may take in too much of this information, and get hooked  onto this information" +
                "\sto the point we let it take up large portions of our time, which could've been used for something more useful  ");

        System.out.println();
        String prepared = scan.nextLine();
        System.out.println("However, today, we're gonna see, if you control social media," +
             "\sor does social media control you\uD83D\uDE33"+
             "\sAre you ready?" +
                "\nyes" +
                "\nnope");
        if(prepared.equals("no")){
            System.out.println("Wack\uD83D\uDE0F, but have a good day!!");
            System.exit(0);
        }else if(prepared.equals("yes")){
            System.out.println("LETS GOOOO");
        }
    }
}
