package com.company;

import java.util.Scanner;

public class anglais {

    public static void main(String[] args) {
        // INTRO
        // *note* if you see SM if some places of the survey, just  shorten version of (Social Media)

        System.out.println("""
                ________________________________________
                |                                       |\s
                |       Do You Control Social Media     | \s
                | Or Do You Let Social Media Control You| \s
                |  (Social Media Addiction Survey)      | \s
                |_______________________________________|""");

        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Note:When responding to a question, write everything EXACTLY AS YOU SEE IT
                Also, you have the option to choose between the letter that is in the ()perenteces, or the full response
                For example: (a)john doe is a goat.
                 You can choose either(a) or john doe is a goat
                but you still must write them the exact way you see them^  \s""");

        System.out.println();
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
                However, today, we're gonna see, if you control social media, or does social media control you?\uD83D\uDE33  Please be honest when answering the questions.Are you ready?
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
        System.out.println("Question #1:" +
                           "\sSoo," + name + ",how long have you been using social media" +
                           "\sNote:This is in general, no just a specific social network" +
                           "\s(1)1-2 years" +
                           "\s(2)3-6 years" +
                           "\s(3)6+ years" +
                           "\s:");

        String length = scan.nextLine();

        switch (length) {
            case "1", "1-2 years" -> {
                score += 1;
                System.out.println("Pretty recent and new to the social network world arent ya?");
            }
            case "2", "3-6 years" -> {
                score += 2;
                System.out.println("A bit used  to the game and been here for a while....");
            }
            case "3", "6+ years" -> {
                score += 3;
                System.out.println("GEEZZZ, You been in the game for a hella long time ");
            }
        }

        // Question #2

        System.out.println();
        System.out.println("Question #2:" +
                           "\nOnto the next question," + name + "" +
                           "\nWhen it comes your usage on these social networks(in general)" +
                           "\nHow long do you normally spend on social media(Be honest)" +
                           "\nLess than a hour" +
                           "\n1-2 hrs" +
                           "\n2.4+ hrs" +
                           "\n:");
        String question2 = scan.nextLine();
        if ("Less than a hour".equals(question2)) {
            score += 1;
        } else if ("1-2 hours".equals(question2)) {
            score += 2;


        } else if ("2.4+ hrs".equals(question2)) {
            score += 3;
        }

        //Question 3 intro
        System.out.println();
        System.out.println("Onto question 3," + name);
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

        if ("a".equals(mornin) || "Brush my teeth".equals(mornin)) {
            System.out.println("Get them teeth cleaned g \uD83D\uDE24\uD83D\uDE24 \uD83D\uDCAA\uD83C\uDFFE");
            score += 1;


        } else if ("b".equals(mornin) || "Hop on the gram/snap and check to see whats going on in the world".equals(mornin)) {
            score += 3;

        } else if ("morning routine".equals(mornin) || "other".equals(mornin)) {
            System.out.println("Understandable");
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

        switch (reaction) {
            case "a", "Check out the notification and end up being distracted from my work" -> {
                System.out.println("Hey bro, put the phone down\uD83D\uDE11.And go back to work");
                score += 3;
            }
            case "b", "Probably notice it, but still focus on my work. I'll check it after" -> {
                System.out.println();
                score += 2;
            }
            case "c", "What notification" -> {
                System.out.println("Here's a \uD83C\uDF6A\uD83E\uDD5B");
                score += 1;
            }
        }
        //question 5
        System.out.println();

        System.out.println("""
                Question #5:
                Lets say, you made a post or a tweet
                but  you didn't get the # of shares,tweets,likes you were expecting
                What would you do in this situation?""");
        System.out.println();

        System.out.println("(a)Still keep the post up" +
                           "\s(b)Remove the post asap" +
                           ":");

        String reality = scan.nextLine();

        if ("a".equals(reality) || "Still keep the post up".equals(reality)) {
            score += 1;

        } else if("b".equals(reality) || "Remove the post asap".equals(reality)) {
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
        switch (allnighter) {
            case "a", "yes" -> {
                System.out.println("BOI PUT THE PHONE DOWN, AND  GO TO SLEEP");
                score += 3;
            }
            case "b","nope, i gotta sleep"-> {
                System.out.println("THAT'S GOOD YOU GETTING REST, I RESPECT DAT");
                score += 1;
            }
        }
        // question 7
        System.out.println();

        System.out.println("""
                #Question 7:
                If you were given a million bucks if you were able to leave all optional social medias/technolgies
                for 30 days, how do you think you will be/do. Be honest*
                *NOTE:OPTIONAL TECHNOLGIES/SOCIAL MEDIA are apps/websites/services that aren't neccesary for work
                Or a very important role in daily routine.  Optional technolgies consist of things we may use for entertainment \s""");

        System.out.println();

        System.out.println("\s(a)I wouldn't really mind being away from them for a while. Free money" +
                           "\s(b)What about my likes,post and friends? i need to keep up with them" + "" +
                           "\n:");

        String optional = scan.nextLine();
        if ("a".equals(optional) || "I wouldn't really mind being away from them for a while. Free money".equals(optional)) {
            System.out.println("Damn right easy money\uD83D\uDCB4 \uD83D\uDCB5\uD83D\uDCB4\uD83D\uDCB7\uD83D\uDCB6");
            score += 1;

        } else if("b".equals(optional) || "What about my likes,post and friends? i need to keep up with them".equals(optional)) {
            System.out.println("But what about the easy money \uD83E\uDDD0,\uD83D\uDCB4 \uD83D\uDCB5\uD83D\uDCB4\uD83D\uDCB7\uD83D\uDCB6");
            score += 3;

        }
        System.out.println();
        // question 8
        System.out.println("""
                Question #8:
                If on these social media platforms, do you compare yourself to others
                Can consist of comparing yourself to the following: # of likes, what a friend is posting(party, vaction in Aruba)
                # of followers between you and a friend, or trying to copy a very popular influncer.\s""");

        System.out.println();
        System.out.println("\s(a)I do compare myself on these platforms" +
                           "\s(b)I don't compare myself on these platforms" +
                           "\s:");

        String comparison = scan.nextLine();

        switch (comparison) {
            case "a", "I do compare myself on these platforms" -> score += 1;
            case "b","I don't compare myself on these platforms"-> score += 3;
        }
        // question #9
        System.out.println("""
                Question #9:
                When scrolling through these social media sites/apps,
                And lets say you're on Instagram, and you see one of your friends and you see them
                at a party, and they're getting turn up, and you see a bunch of other people you might know/see,
                and because of this, you start experiencing FOMO(Fear of missing out), and start feeling upset and angry
                since you couldn't attends this event.
                If in a similar situation like this, what would you do?
                (a)don't even bother with the post and keep scrolling
                (b)if i start experiencing emotions, i'll get off the site/app immediately and do something more productive
                (c)keep looking at the post or similar post, and allow myself to experience  FOMO"
                :""");

        String FOMO = scan.nextLine();

        switch (FOMO) {
            case "a", "don't even bother with the post and keep scrolling" -> score += 1;
            case "b", "if i start experiencing emotions, i'll get off the site/app immediately and do something more productive " -> score += 2;
            case "c", "keep looking at the post or similar post, and allow myself to experience  FOMO" -> {
                score += 3;
                System.out.println();
            }
        }

        // Question 10

        System.out.println("""
                Question #10:
                Mainly applies to US, but can apply other countries as well.
                When  scrolling through newsfeeds on social media sites,
                Do these events/information from these social media sites
                End up having a effect(especially a mental effect), on your views on these situations
                Despite the accuracy/nature of the information/source?
                (e)The information does effect my views on a situation
                (ne)The information barely, if not doesn't have any effect on my views on a situation\s
                (n)The information doesn't really effect my views on a situation, but i might gain interest""");

        String newsfeed2 = scan.nextLine();

        if ("e".equals(newsfeed2) || "The information does effect my views on a situation".equals(newsfeed2)) {
            score += 3;
        } else if ("ne".equals(newsfeed2) || "The information barely, if not doesn't have any effect on my views on a situation".equals(newsfeed2)) {
            score += 1;
        } else if ("n".equals(newsfeed2) || "The information doesn't really effect my views on a situation, but i might gain interest".equals(newsfeed2)) {
            score += 2;
        }


            // QUESTION #11 FINALE
        System.out.println("""
                Question #11:
                Are you ready
                yes
                no
                :""");

        String finalconfirmation = scan.nextLine();
        if ("yes".equals(finalconfirmation) || "no".equals(finalconfirmation)) {
            System.out.println("We gonna finish it\uD83D\uDE08\uD83D\uDE08");
        }
        System.out.println("Final question....." +
                "\sDoes the color red trigger/capture your attention(notification icons)?\uD83E\uDDD0" +
                "\s(a)It captures me" +
                "\s(b)i might notice it, but i wont be triggered" +
                "\s(c)Nope it doesn't capture/trigger my attention ");
        System.out.println();
        String triggercolor = scan.nextLine();

        switch (triggercolor) {
            case "a", "It captures me" -> score += 3;
            case "b", "i might notice it, but i wont be triggered" -> score += 2;
            case "c", "Nope it doesn't capture/trigger my attention" -> score += 1;
        }

        int fin = score;
        System.out.println("Final score:" + (fin) + "/31");


        String finalcharts = "| %-15s | %-4d |%n";

//chart which reveals the scoring/grading based on users response from the following 11 questions.  Basically reveals the categorization of user

        System.out.format("+-----------------+------+----------+%n");
        System.out.format("|   Name of user: | " + name + "    |%n");
        System.out.format("+-----------------+------+----------+%n");
        System.out.format("| Score of out 31 | " + fin + "     |%n");
        System.out.format("+-----------------+------+---------+%n");
        System.out.format("| Score between 0-14     | Low usage|%n");
        System.out.format("+-----------------+------+----------+%n");
        System.out.format("| Score between 15-22| Average usage|%n");
        System.out.format("+-----------------+------+----------|%n");
        System.out.format("| Score of 23+  | Heavy Usage.      |%n");
        System.out.format("+-----------------+------+---------+|%n");

        System.out.println();

        int overall = score;
 // users with score of greater than 0 but less than 15 is considered a low SM user
        if (overall > 0 && overall <= 15){
            System.out.println("|User is in control of social media.|");
// users with a score greater than 16, but less than 23 are considered average/moderate users
        }else if(overall >= 16 && overall<23){
            System.out.println("""
                    |Average usage. Social Media doesn't isn't control of user, but not to the point of being considered a low usage user. But still conscious about usage|
                    Tips for Average usage users:

                    •Be mindful of your actions on social media(how long do you spend on social in a day, pattern of social media use,\s
                    does seeing something on your Instagram feed result in you having negative emotions). use them with intent

                    •Set times when you can only access your phone or social media sites. \s
                    So something like, any time prior to noon, I can’t be on social media. \s
                    Or once it hits 9:30pm, I can’t be on my phone with the exception of answering calls

                    •With the exception of calls/maybe messages, turn of all  notifications.  Do you really think you need to know that your friend like your post?

                    •Start unfollowing social media pages that don’t bring any value to you or distracts you(meme/trendy pages).\s
                    And replace them that do bring value(motivation groups)

                    •	Remove all social media apps off phone
                    •	If you do want to use social media: use the browser versions of the apps

                    """);
// user with score greater than 23, is a high usage user.
        }else if(overall >= 23){
            System.out.println("""
                    |Heavy Usage. Social Media does influence user. SM in control of user.|
                    But although you may use these sites a lot, there are some ways to combat it:

                    Tips to control social media"•
                    •Be mindful of your actions on social media(how long do you spend on social in a day, pattern of social media use,\s
                    does seeing something on your Instagram feed result in you having negative emotions). use them with intent

                    •With the exception of calls/maybe messages, turn of all  notifications. \s
                    Do you really think you need to know that your friend like your post?

                    •Create a distance between you and your devices. Or no device zones. \s
                    Rules such as not sleeping with your phone right next to you, or I can’t use my phone when I’m in my room, or If I am at a family reunion

                    •If you ever feel boredom, or tempting to go on social media sites, switch to a hobby(preferably one off the screen like reading, learning a new language, cooking,\s
                    or some activity like going for a walk at the park, playing basketball with a friend(s), or workout(without any devices).\s
                    Possibilities are endless(just make sure their positive/beneficial habits tho

                    •Remove all social media apps off phone.If you do want to  still use social media: use the browser versions of the apps

                    •Set times when you can only access your phone or social media sites. \s
                    So something like, any time prior to noon, I can’t be on social media.  Or once it hits 9:30pm, I can’t be on my phone with the exception of answering calls

                    """);

        }

            System.out.println();
            System.out.println("Want some extra tips\t" +name+ "?" +
                    "\s(y)yes" +
                    "\s(n)no");
            String calnewport = scan.nextLine();

// cal newport "digital minimalism book tips".  Tips based on his book/mixture of my own tips
            if("n".equals(calnewport) || "no".equals(calnewport)){
                System.out.println("Well than, thank you for filling out this survey," +name+", I hope you learned a thing or two" +
                        "\nAnd think about these tips next time you use social Media.  Have a blessed day\uD83D\uDE42");
                            System.exit(0);
            }else{
                System.out.println("""
                        Note, some of these tips are from Cal Newport's book(Digital Minaimalism) which is a book i recommend you read:
                        •Start a Thirty day detox
                        •During detox, replace all optional technologies(unless they serve a very very very important role in your life such as being used for a job), a
                        and replace them with high leisure activities

                        •Once thirty days end, carefully reintroduce optional technologies in ya life,\s
                        but remember the following:

                        •Does it…:
                        •1. Serve something you deeply value (offering some benefit is not enough).\s
                        •2. Be the best way to use technology to serve this value (if it’s not, replace it with something better).\s
                        •3. Have a role in your life that is constrained with a standard operating procedure that specifies when and how you use it.”

                         •If you are tempting to use phone, or don’t want to access at certain times of the day, switch it to greyscale,\s
                         which results in your phone going from color to black and white.

                         •If you really want to go far, switch your phone(smartphone) into a dumb phone which allows you to do what you want to do,\s
                         rather than doing something completely random.  Maybe if you want, switch to a flip phone

                         •Depending on your browser(might be better for chrome/Firefox browsers),\s
                         add extensions that block help with potentially falling into s internet rabbit holes (DF YouTube, Stay Focused, Self-control

                         Learn to balance.  Remember there is a real world outside of your phone.\s
                         Despite all the crazy stuff going on, life’s still  beautiful. Get ya some sun

                         •Become more knowledgeable on the issue and why social networks are  designed to be addictive.  \s

                         Thank you for completeting this survey, and have a blessed day!"

                        """);
            }




    }
}


