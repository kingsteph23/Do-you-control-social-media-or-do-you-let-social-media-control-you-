package com.company;

import java.util.Scanner;

public class anglais {

    public static void main(String[] args) {
        // INTRO
        // *note* if you see SM if some places of the survey, just  shorten version of (Social Media)

        System.out.println("________________________________________\n" +
                           "|                                       | \n" +
                           "|       Do You Control Social Media     |  \n" +
                           "| Or Do You Let Social Media Control You|  \n" +
                           "|  (Social Media Addiction Survey)      |  \n" +
                           "|_______________________________________|");

        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Note:When responding to a question, write everything EXACTLY AS YOU SEE IT\n" +
                           "Also, you have the option to choose between the letter that is in the ()perenteces, or the full response\n" +
                           "For example: (a)john doe is a goat.\n" +
                           " You can choose either(a) or john doe is a goat\n" +
                           "but you still must write them the exact way you see them^   ");

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
        if ("B".equals(mood) || "Meh".equals(mood)) {
            System.out.println("Ehh, that's fine as well.");
        } else if ("C".equals(mood) || "Im just vibin atm".equals(mood)) {
            System.out.println("How you vibin rn\uD83D\uDE33." +
                               "\sI respect the vibe\uD83D\uDC4D\uD83C\uDFFE\uD83D\uDE2B");
        } else if ("D".equals(mood) || "I feel like (S)uger, (H), honey,(Ice), (Tea).".equals(mood)) {
            System.out.println("That's wack\uD83E\uDD27\uD83E\uDD27");
        }
        System.out.println();

        System.out.println("Alright," + name + "" +
                           "\nSoo, as you already by the title, you are about to fill out a survey." +
                           "\nWhich(depending on your responses) will see if you are either hooked or not hooked" +
                           "\nto social media. In this day of age, we pretty much have all the information we need in our hands" +
                           "\nLiterally! But sometimes we may take in too much of this information, and get hooked  onto this information" +
                           "\nto the point we let it take up large portions of our time, which could've been used for something more useful  ");

        System.out.println();
        System.out.println("However, today, we're gonna see, if you control social media, or does social media control you?\uD83D\uDE33  Please be honest when answering the questions.Are you ready?\n" +
                           "yes\n" +
                           "nope\n" +
                           ":");
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
        System.out.println("Question 3:\n" +
                           "When you wake up in the morning, whats the first thing you do?:\n" +
                           "(a)Brush my teeth\n" +
                           "(b)Hop on the gram/snap and check to see whats going on in the world\n" +
                           "morning routine\n" +
                           "other\n" +
                           ":");
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

        System.out.println("Question 4:\n" +
                           "Another scenario: Lets say your working on some hw,\n" +
                           "You really work hard on it, putting blood,sweat,and tears into your assignment\n" +
                           "But than you hear a notification sound from your phone saying that your friend tagged you in a post\n" +
                           "liked your comment, and liked your photo.\n");

        System.out.println();


        System.out.println("What would you most likely do?\n" +
                           "(a)Check out the notification and end up being distracted from my work\n" +
                           "(b)Probably notice it, but still focus on my work. I'll check it after\n" +
                           "(c)What notification\n" +
                           ":");

        String reaction = scan.nextLine();

        if ("a".equals(reaction) || "Check out the notification and end up being distracted from my work".equals(reaction)) {
            System.out.println("Hey bro, put the phone down\uD83D\uDE11.And go back to work");
            score += 3;
        } else if ("b".equals(reaction) || "Probably notice it, but still focus on my work. I'll check it after".equals(reaction)) {
            System.out.println();
            score += 2;
        } else if ("c".equals(reaction) || "What notification".equals(reaction)) {
            System.out.println("Here's a \uD83C\uDF6A\uD83E\uDD5B");
            score += 1;
        }
        //question 5
        System.out.println();

        System.out.println("Question #5:\n" +
                           "Lets say, you made a post or a tweet\n" +
                           "but  you didn't get the # of shares,tweets,likes you were expecting\n" +
                           "What would you do in this situation?");
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

        System.out.println("#Question 6:\n" +
                           "Do you check social media in the middle night to check for updates/activity.\n" +
                           "Especially if its updates/activity on a post/tweet you made(a)yes(b)nope, i gotta sleep\n" +
                           ":");

        System.out.println();

        String allnighter = scan.nextLine();
        if ("a".equals(allnighter) || "yes".equals(allnighter)) {
            System.out.println("BOI PUT THE PHONE DOWN, AND  GO TO SLEEP");
            score += 3;
        } else if ("b".equals(allnighter) || "nope, i gotta sleep".equals(allnighter)) {
            System.out.println("THAT'S GOOD YOU GETTING REST, I RESPECT DAT");
            score += 1;
        }
        // question 7
        System.out.println();

        System.out.println("#Question 7:\n" +
                           "If you were given a million bucks if you were able to leave all optional social medias/technolgies\n" +
                           "for 30 days, how do you think you will be/do. Be honest*\n" +
                           "*NOTE:OPTIONAL TECHNOLGIES/SOCIAL MEDIA are apps/websites/services that aren't neccesary for work\n" +
                           "Or a very important role in daily routine.  Optional technolgies consist of things we may use for entertainment  ");

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
        System.out.println("Question #8:\n" +
                           "If on these social media platforms, do you compare yourself to others\n" +
                           "Can consist of comparing yourself to the following: # of likes, what a friend is posting(party, vaction in Aruba)\n" +
                           "# of followers between you and a friend, or trying to copy a very popular influncer. ");

        System.out.println();
        System.out.println("\s(a)I do compare myself on these platforms" +
                           "\s(b)I don't compare myself on these platforms" +
                           "\s:");

        String comparison = scan.nextLine();

        if ("a".equals(comparison) || "I do compare myself on these platforms".equals(comparison)) {
            score += 1;
        } else if ("b".equals(comparison) || "I don't compare myself on these platforms".equals(comparison)) {
            score += 3;
        }
        // question #9
        System.out.println("Question #9:\n" +
                           "When scrolling through these social media sites/apps,\n" +
                           "And lets say you're on Instagram, and you see one of your friends and you see them\n" +
                           "at a party, and they're getting turn up, and you see a bunch of other people you might know/see,\n" +
                           "and because of this, you start experiencing FOMO(Fear of missing out), and start feeling upset and angry\n" +
                           "since you couldn't attends this event.\n" +
                           "If in a similar situation like this, what would you do?\n" +
                           "(a)don't even bother with the post and keep scrolling\n" +
                           "(b)if i start experiencing emotions, i'll get off the site/app immediately and do something more productive\n" +
                           "(c)keep looking at the post or similar post, and allow myself to experience  FOMO\"\n" +
                           ":");

        String FOMO = scan.nextLine();

        if ("a".equals(FOMO) || "don't even bother with the post and keep scrolling".equals(FOMO)) {
            score += 1;
        } else if ("b".equals(FOMO) || "if i start experiencing emotions, i'll get off the site/app immediately and do something more productive ".equals(FOMO)) {
            score += 2;
        } else if ("c".equals(FOMO) || "keep looking at the post or similar post, and allow myself to experience  FOMO".equals(FOMO)) {
            score += 3;
            System.out.println();
        }

        // Question 10

        System.out.println("Question #10:\n" +
                           "Mainly applies to US, but can apply other countries as well.\n" +
                           "When  scrolling through newsfeeds on social media sites,\n" +
                           "Do these events/information from these social media sites\n" +
                           "End up having a effect(especially a mental effect), on your views on these situations\n" +
                           "Despite the accuracy/nature of the information/source?\n" +
                           "(e)The information does effect my views on a situation\n" +
                           "(ne)The information barely, if not doesn't have any effect on my views on a situation \n" +
                           "(n)The information doesn't really effect my views on a situation, but i might gain interest");

        String newsfeed2 = scan.nextLine();

        if ("e".equals(newsfeed2) || "The information does effect my views on a situation".equals(newsfeed2)) {
            score += 3;
        } else if ("ne".equals(newsfeed2) || "The information barely, if not doesn't have any effect on my views on a situation".equals(newsfeed2)) {
            score += 1;
        } else if ("n".equals(newsfeed2) || "The information doesn't really effect my views on a situation, but i might gain interest".equals(newsfeed2)) {
            score += 2;
        }


            // QUESTION #11 FINALE
        System.out.println("Question #11:\n" +
                           "Are you ready\n" +
                           "yes\n" +
                           "no\n" +
                           ":");

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

        if ("a".equals(triggercolor) || "It captures me".equals(triggercolor)) {
            score += 3;
        } else if ("b".equals(triggercolor) || "i might notice it, but i wont be triggered".equals(triggercolor)) {
            score += 2;
        } else if ("c".equals(triggercolor) || "Nope it doesn't capture/trigger my attention".equals(triggercolor)) {
            score += 1;
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
            System.out.println("|Average usage. Social Media doesn't isn't control of user, but not to the point of being considered a low usage user. But still conscious about usage|\n" +
                               "Tips for Average usage users:\n" +
                               "\n" +
                               "•Be mindful of your actions on social media(how long do you spend on social in a day, pattern of social media use, \n" +
                               "does seeing something on your Instagram feed result in you having negative emotions). use them with intent\n" +
                               "\n" +
                               "•Set times when you can only access your phone or social media sites.  \n" +
                               "So something like, any time prior to noon, I can’t be on social media.  \n" +
                               "Or once it hits 9:30pm, I can’t be on my phone with the exception of answering calls\n" +
                               "\n" +
                               "•With the exception of calls/maybe messages, turn of all  notifications.  Do you really think you need to know that your friend like your post?\n" +
                               "\n" +
                               "•Start unfollowing social media pages that don’t bring any value to you or distracts you(meme/trendy pages). \n" +
                               "And replace them that do bring value(motivation groups)\n" +
                               "\n" +
                               "•	Remove all social media apps off phone\n" +
                               "•	If you do want to use social media: use the browser versions of the apps\n" +
                               "\n");
// user with score greater than 23, is a high usage user.
        }else if(overall >= 23){
            System.out.println("|Heavy Usage. Social Media does influence user. SM in control of user.|\n" +
                               "But although you may use these sites a lot, there are some ways to combat it:\n" +
                               "\n" +
                               "Tips to control social media\"•\n" +
                               "•Be mindful of your actions on social media(how long do you spend on social in a day, pattern of social media use, \n" +
                               "does seeing something on your Instagram feed result in you having negative emotions). use them with intent\n" +
                               "\n" +
                               "•With the exception of calls/maybe messages, turn of all  notifications.  \n" +
                               "Do you really think you need to know that your friend like your post?\n" +
                               "\n" +
                               "•Create a distance between you and your devices. Or no device zones.  \n" +
                               "Rules such as not sleeping with your phone right next to you, or I can’t use my phone when I’m in my room, or If I am at a family reunion\n" +
                               "\n" +
                               "•If you ever feel boredom, or tempting to go on social media sites, switch to a hobby(preferably one off the screen like reading, learning a new language, cooking, \n" +
                               "or some activity like going for a walk at the park, playing basketball with a friend(s), or workout(without any devices). \n" +
                               "Possibilities are endless(just make sure their positive/beneficial habits tho\n" +
                               "\n" +
                               "•Remove all social media apps off phone.If you do want to  still use social media: use the browser versions of the apps\n" +
                               "\n" +
                               "•Set times when you can only access your phone or social media sites.  \n" +
                               "So something like, any time prior to noon, I can’t be on social media.  Or once it hits 9:30pm, I can’t be on my phone with the exception of answering calls\n" +
                               "\n");

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
                System.out.println("Note, some of these tips are from Cal Newport's book(Digital Minaimalism) which is a book i recommend you read:\n" +
                                   "•Start a Thirty day detox\n" +
                                   "•During detox, replace all optional technologies(unless they serve a very very very important role in your life such as being used for a job), a\n" +
                                   "and replace them with high leisure activities\n" +
                                   "\n" +
                                   "•Once thirty days end, carefully reintroduce optional technologies in ya life, \n" +
                                   "but remember the following:\n" +
                                   "\n" +
                                   "•Does it…:\n" +
                                   "•1. Serve something you deeply value (offering some benefit is not enough). \n" +
                                   "•2. Be the best way to use technology to serve this value (if it’s not, replace it with something better). \n" +
                                   "•3. Have a role in your life that is constrained with a standard operating procedure that specifies when and how you use it.”\n" +
                                   "\n" +
                                   " •If you are tempting to use phone, or don’t want to access at certain times of the day, switch it to greyscale, \n" +
                                   " which results in your phone going from color to black and white.\n" +
                                   "\n" +
                                   " •If you really want to go far, switch your phone(smartphone) into a dumb phone which allows you to do what you want to do, \n" +
                                   " rather than doing something completely random.  Maybe if you want, switch to a flip phone\n" +
                                   "\n" +
                                   " •Depending on your browser(might be better for chrome/Firefox browsers), \n" +
                                   " add extensions that block help with potentially falling into s internet rabbit holes (DF YouTube, Stay Focused, Self-control\n" +
                                   "\n" +
                                   " Learn to balance.  Remember there is a real world outside of your phone. \n" +
                                   " Despite all the crazy stuff going on, life’s still  beautiful. Get ya some sun\n" +
                                   "\n" +
                                   " •Become more knowledgeable on the issue and why social networks are  designed to be addictive.   \n" +
                                   "\n" +
                                   " Thank you for completeting this survey, and have a blessed day!\"\n" +
                                   "\n");
            }




    }
}


