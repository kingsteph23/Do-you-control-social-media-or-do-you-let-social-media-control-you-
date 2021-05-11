package com.company;

import java.util.Scanner;

public class anglais {

    public static void main(String[] args) {
        // INTRO
        System.out.println("""
                ________________________________________
                |                                       |\s
                |       Do You Control Social Media     | \s
                | Or Do You Let Social Media Control You| \s
                |  (Social Media Addiction Survey)      | \s
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


        }
        switch (mood) {
            case "B", "Meh" -> System.out.println("Ehh, that's fine as well.");
            case "C", "Im just vibin atm" -> System.out.println("How you vibin rn\uD83D\uDE33." +
                    "\sI respect the vibe\uD83D\uDC4D\uD83C\uDFFE\uD83D\uDE2B");
            case "D", "I feel like (S)uger, (H), honey,(Ice), (Tea)." -> System.out.println("That's wack\uD83E\uDD27\uD83E\uDD27");
        }
        System.out.println();

        System.out.println("Alright" + name + "" +
                "\nSoo, as you already by the title, you are about to fill out a survey." +
                "\nWhich(depending on your responses) will see if you are either hooked or not hooked" +
                "\nto social media. In this day of age, we pretty much have all the information we need in our hands" +
                "\nLiterally! But sometimes we may take in too much of this information, and get hooked  onto this information" +
                "\nto the point we let it take up large portions of our time, which could've been used for something more useful  ");

        System.out.println();
        System.out.println("""
                However, today, we're gonna see, if you control social media,\sor does social media control you\uD83D\uDE33\sAre you ready?
                yes
                nope
                :""");
        String prepared = scan.nextLine();
        if (prepared.equals("nope")) {
            System.out.println("Wack, but have a good day!!");
            System.exit(0);
        } else if (prepared.equals("yes")) {
            System.out.println("LETS GOOOO");
        }

        int score = 0;
        //Question 1
        System.out.println("Soo," + name + ",how long have you been using social media" +
                "\sNote:This is in general, no just a specific social network" +
                "\s(1)1-2 years" +
                "\s(2)3-6 years" +
                "\s(3)6+ years" +
                "\s:");

        String length = scan.nextLine();

        if ("1".equals(length) || "1-2 years".equals(length)) {
            score += 1;
            System.out.println("Pretty recent and new to the social network world arent ya?");

        } else if ("2".equals(length) || "3-6 years".equals(length)) {
            score += 2;
            System.out.println("A bit used  to the game and been here for a while....");
        } else if ("3".equals(length) || "6+ years".equals(length)) {
            score += 3;
            System.out.println("GEEZZZ, You been in the game for a hella long time ");
        }

        // Question #2

        System.out.println();
        System.out.println("Onto the next question," + name + "" +
                "\nWhen it comes your usage on these social networks(in general)" +
                "\nHow long do you normally spend on social media(Be honest)" +
                "\nLess than a hour" +
                "\n2-3 hours" +
                "\n4+ hrs" +
                "\n:");
        String question2 = scan.nextLine();
        if ("Less than a hour".equals(question2)) {
            score += 1;
            score += 1;

        }else if ("2-3 hours".equals(question2)) {
            score += 2;
            score += 2;

        }else if("4+ hrs".equals(question2)){
            score +=3;
            score += 3;
        }

        //Question 3
        System.out.println();
        System.out.println("Onto question 3,"+name);
        System.out.println();

        //Actual question #3
        System.out.println("When scrolling through these social media sites/apps," +
                "\nAnd lets say you're on Instagram, and you see one of your friends and you see them" +
                "\nat a party, and they're getting turn up, and you see a bunch of other people you might know/see," +
                "\nand because of this, you start experiencing FOMO(Fear of missing out), and start feeling upset and angry" +
                "\nsince you couldn't attends this event.  " +
                "\nIf in a similar situation like this, what would you do?" +
                "\n(a)dont even bother with the post and keep scrolling" +
                "\n(b)if i start experiencing emotions, i'll get off the site/app immediately and do something more productive" +
                "\n(c)keep looking at the post or similar post, and allow myself to experience  FOMO" +
                "\n:");

        String FOMO = scan.nextLine();

        if ("a".equals(FOMO) || "dont even bother with the post and keep scrolling".equals(FOMO)) {
            score += 1;
            score += 1;


        } else if ("b".equals(FOMO) || "if i start experiencing emotions, i'll get off the site/app immediately and do something more productive".equals(FOMO)) {
            score += 2;
            score += 2;

        } else if ("c".equals(FOMO) || "keep looking at the post or similar post, and allow myself to experience  FOMO".equals(FOMO)) {
            score += 3;
            score += 3;

            System.out.println();
            //QUESTION 4
                System.out.println("Question 4:" +
                        "\sWhen you wake up in the morning, whats the first thing you do?:" +
                        "\s(a)Brush my teeth" +
                        "\s(b)");


        }
    }
}
