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

        System.out.println("Alright," + name + "" +
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
                "\n1-2 hrs" +
                "\n3+ hrs" +
                "\n:");
        String question2 = scan.nextLine();
        if ("Less than a hour".equals(question2)) {
            score += 1;
            score += 1;

        }else if ("1-2 hours".equals(question2)) {
            score += 2;
            score += 2;

        }else if("3+ hrs".equals(question2)){
            score +=3;
            score += 3;
        }

        //Question 3
        System.out.println();
        System.out.println("Onto question 3,"+name);
        System.out.println();



            //QUESTION 3
                System.out.println("""
                        Question 3:
                        When you wake up in the morning, whats the first thing you do?:
                        (a)Brush my teeth
                        (b)Hop on the gram/snap and check to see whats going on in the world
                        morning routine
                        other
                        :""");
                System.out.println();

                String mornin = scan.nextLine();

                if("a".equals(mornin) || "Brush my teeth".equals(mornin)){
                    System.out.println("Get them teeth cleaned g \uD83D\uDE24\uD83D\uDE24 \uD83D\uDCAA\uD83C\uDFFE");
                    score += 1;
                    score += 1;

            }else if("b".equals(mornin) ||  "Hop on the gram/snap and check to see whats going on in the world".equals(mornin)){
                    score += 3;
                    score += 3;
                }else if("morning routine".equals(mornin) || "other".equals(mornin)){
                    System.out.println("Understandable");
                    score += 2;
                    score += 2;
            }
                    System.out.println();

                //question 4

            System.out.println("""
                    Question 4:
                    Another scenario: Lets say your working on some hw,
                    You really work hard on it, putting blood,sweat,and tears into your assignment
                    But than you hear a notification sound from your phone saying that your friend tagged you in a post
                    liked your comment, and liked your photo.
                    """);

            System.out.println();



            System.out.println("""
                    What would you most likely do?
                    (a)Check out the notification and end up being distracted from my work
                    (b)Probably notice it, but still focus on my work. I'll check it after
                    (c)What notification
                    :""");

        String reaction = scan.nextLine();

            if("a".equals(reaction) || "Check out the notification and end up being distracted from my work".equals(reaction)){
                System.out.println("Hey bro, put the phone down\uD83D\uDE11.And go back to work");
                score += 3;
                score += 3;

            }else if("b".equals(reaction) || "Probably notice it, but still focus on my work. I'll check it after".equals(reaction)){
                System.out.println();
                score += 2;
                score += 2;
            }else if("c".equals(reaction) || "What notification".equals(reaction)){
                System.out.println("Here's a \uD83C\uDF6A\uD83E\uDD5B");
                score += 1;
               score += 1;
            }
                //question 5
                    System.out.println();

        System.out.println("""
                Question #5
                Lets say, you made a post or a tweet
                but  you didn't get the # of shares,tweets,likes you were expecting
                What would you do in this situation?""");
        System.out.println();

        System.out.println("(a)Still keep the post up" +
                           "\s(b)Remove the post asap" +
                           ":");

        String reality = scan.nextLine();

        if("a".equals(reality) || "Still keep the post up".equals(reality)){
            score += 1;
            score += 1;
        }else{
            score += 3;
            score += 3;
        }

        // question 6

            System.out.println();

        System.out.println("""
                #Question 6:
                Do you check social media in the middle night to check for updates/activity.
                Especially if its updates/activity on a post/tweet you made(a)yes(b)nope, i gotta sleep
                :""");

        System.out.println();

        String allnighter = scan.nextLine();
        if("a".equals(allnighter) ||"yes".equals(allnighter)){
            System.out.println("BOI PUT THE PHONE DOWN, AND  GO TO SLEEP");
            score += 3;
            score += 3;

        }else{
            System.out.println("THAT'S GOOD YOU GETTING REST, I RESPECT DAT");
            score += 1;
            score += 1;
        }
            // question 7
                System.out.println();

        System.out.println("""
                #Question 7:If you were given a million bucks if you were able to leave all optional social medias/technolgies
                for 30 days, how do you think you will be/do. Be honest*
                *NOTE:OPTIONAL TECHNOLGIES/SOCIAL MEDIA are apps/websites/services that aren't neccesary for work
                Or a very important role in daily routine.  Optional technolgies consist of things we may use for entertainment \s""");

        System.out.println();

        System.out.println("(a)I wouldn't really mind being away from them for a while. Free money" +
                "(b)What about my likes,post and friends? i need to keep up with them" +
                "(c)");

        String optional = scan.nextLine();


    }
}
