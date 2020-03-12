/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    String name, response, stringIq, color, whereLive, friendName;
    int iq;

    /**
     * Insert your own greeting for your unique chatbot 
     * @return a greeting
     */
    public String getGreeting()
    {
        name = "[Haven't told me]";
        stringIq = "[Haven't told me]";
        color = "[Haven't told me]";
        whereLive = "[Haven't told me]";
        friendName = "[Haven't told me]";
        response = "";
        return "I'm Spongebob! Let's talk.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        if(negativeStatement(statement))
        {
            return response;
        }
        if(accessor(statement))
        {
            return response;
        }
        else if(familyStatement(statement))
        {
            return response;
        }
        else if(petStatement(statement))
        {
            return response;
        }
        else if(shortStatement(statement))
        {
            return response;
        }
        else if(greeting(statement))
        {
            return response;
        }
        else if(name(statement))
        {
            return response;
        }
        else if(femaleTeacher(statement))
        {
            return response;
        }
        else if(maleTeacher(statement))
        {
            return response;
        }
        else if(iq(statement))
        {
            return response;
        }
        else if(yourName(statement))
        {
            return response;
        }
        else if(howDoing(statement))
        {
            return response;
        }
        else if(jobStatement(statement))
        {
            return response;
        }
        else if(education(statement))
        {
            return response;
        }
        else if(color(statement))
        {
            return response;
        }
        else if(whereLive(statement))
        {
            return response;
        }
        else if(friend(statement))
        {
            return response;
        }
        else
        {
            response = getRandomResponse();
            return response;
        }

    }

    public boolean negativeStatement(String statement)
    {
        if (findKeyword(statement,"no") >= 0)
        {
            response = "I try to keep a positive outlook. You should too!";
            return true;
        }
        return false;
    }

    public boolean familyStatement(String statement)
    {
        if (findKeyword(statement,"mother") >= 0
        || findKeyword(statement,"father") >= 0
        || findKeyword(statement,"sister") >= 0
        || findKeyword(statement,"brother") >= 0)
        {
            response = "Wow! Sounds like you have a cool family.";
            return true;
        }
        return false;
    }

    public boolean maleTeacher(String statement)
    {
        if (findKeyword(statement,"mr") >= 0)
        {
            response = "He sounds pretty cool, like my boss, Mr. Krabs!";
            return true;
        }
        return false;
    }

    public boolean jobStatement(String statement)
    {
        if (findKeyword(statement, "Krusty Krab") >= 0
        || findKeyword(statement, "Job") >= 0
        || findKeyword(statement, "Profession") >= 0
        || findKeyword(statement, "Work") >= 0)
        {
            response = "I work at the Krusty Krab, where I am head fry cook";
            return true;
        }
        return false;
    }

    public boolean education(String statement)
    {
        if (findKeyword(statement, "school") >= 0
        || findKeyword(statement, "boating") >= 0
        || findKeyword(statement, "learn") >= 0
        || findKeyword(statement, "education") >= 0)
        {
            response = "I go to boating school, Mrs. Puff teaches.";
            return true;
        }
        return false;
    }

    public boolean femaleTeacher(String statement)
    {
        if (findKeyword(statement,"mrs") >= 0 ||
        findKeyword(statement, "ms") >= 0 ||
        findKeyword(statement, "miss") >= 0 )
        {
            response = "She sounds fun, like my friend Sandy!";
            return true;
        }
        return false;
    }

    public boolean shortStatement(String statement)
    {
        if (statement.length() <= 2 && !statement.toUpperCase().equals("HI")) {
            response = "That's a little short. Let's talk about our pets!";
            return true;
        }
        return false;
    }

    /**
     * Create our own method to respond to the keywords of your own choosing.
     * Replace the method name and construct your own if else block.
     * Put method call into the getResponse method
     */
    public boolean petStatement(String statement)
    {

        if (findKeyword(statement,"cat") >= 0
        || findKeyword(statement,"dog") >= 0
        || findKeyword(statement,"animal") >= 0
        || findKeyword(statement,"pet") >= 0
        || findKeyword(statement,"snail") >= 0
        || findKeyword(statement,"fish") >= 0)
        {
            response = "I have a pet snail named Gary.";
            return true;
        }
        return false;
    }

    /**
     * Create our own method to respond to the keywords of your own choosing.
     * Replace the method name and construct your own if else block.
     * Put method call into the getResponse method
     */
    public boolean greeting(String statement)
    {
        if (findKeyword(statement,"hi") >= 0
        || findKeyword(statement,"Hi") >= 0
        || findKeyword(statement,"hello") >= 0
        || findKeyword(statement,"Hello") >= 0
        || findKeyword(statement,"greetings") >= 0
        || findKeyword(statement,"hey") >= 0)
        {
            response = "Hello human! Let's talk!";
            return true;
        }
        return false;
    }

    /**
     * Create our own method to respond to the keywords of your own choosing.
     * Replace the method name and construct your own if else block.
     * Put method call into the getResponse method
     */
    public boolean name(String statement)
    {
        if (findKeyword(statement,"name") >= 0 
        && findKeyword(statement, "my") >= 0
        && findKeyword(statement, "friend") < 0)
        {
            if (findKeyword(statement, "what") >= 0)
            {
                response = "It's " + name;
                return true;
            }
            name = statement.substring(findKeyword(statement, "is") + 3);
            response = "Your name is " + name + "? That's a cool name!";
            return true;
        }
        return false;
    }

    public boolean accessor(String statement)
    {
        if (findKeyword(statement,"me") >= 0 
        && findKeyword(statement, "what") >= 0)
        {
            response = "Your name is " + name + ". Your iq is " + stringIq + ". Your favorite color is " + color + ". You live in " + whereLive + ". Your friend is " + friendName + ".";;
            return true;
        }
        return false;
    }

    public boolean color(String statement)
    {
        if (findKeyword(statement,"color") >= 0 
        && findKeyword(statement, "my") >= 0)
        {
            if (findKeyword(statement, "what") >= 0)
            {
                response = "It's " + color;
                return true;
            }
            color = statement.substring(findKeyword(statement, "is") + 3);
            response = "Your favorite color is " + color + "? That's a fun color!";
            return true;
        }
        return false;
    }

    public boolean whereLive(String statement)
    {
        if (findKeyword(statement,"I") >= 0 
        && findKeyword(statement, "live") >= 0)
        {
            if (findKeyword(statement, "where") >= 0)
            {
                response = "In " + whereLive;
                return true;
            }
            whereLive = statement.substring(findKeyword(statement, "in") + 3);
            response = "I wonder if " + whereLive + " is near Texas. That's where my friend Sandy is from";
            return true;
        }
        return false;
    }

    public boolean friend(String statement)
    {
        if (findKeyword(statement,"friend") >= 0 
        && findKeyword(statement, "is") >= 0)
        {
            if (findKeyword(statement, "what") >= 0)
            {
                response = "It's " + friendName;
                return true;
            }
            friendName = statement.substring(findKeyword(statement, "is") + 3);
            response = "Your friend is named " + friendName + ". My best friend is Patrick.";
            return true;
        }
        return false;
    }

    public boolean iq(String statement)
    {
        if (findKeyword(statement,"my") >= 0 
        && findKeyword(statement, "iq") >= 0)
        {

            if (findKeyword(statement, "what") >= 0)
            {
                response = stringIq;
                return true;
            }

            stringIq = statement.substring(findKeyword(statement, "is") + 3);
            iq = Integer.parseInt(stringIq);

            if (iq > 120) {
                response = "Your iq is " + stringIq + "? Wow! You're so smart!";
            } 
            else response = "Your iq is " + stringIq  + "? Pretty cool. We can't all be geniuses.";
            return true;
        }
        return false;
    }

    /**
     * Create our own method to respond to the keywords of your own choosing.
     * Replace the method name and construct your own if else block.
     * Put method call into the getResponse method
     */
    public boolean yourName(String statement)
    {
        if (findKeyword(statement,"name") >= 0 
        && findKeyword(statement, "your") >= 0)
        {
            response = "I'm Spongebob!";
            return true;
        }
        return false;
    }

    public boolean howDoing(String statement)
    {
        if (findKeyword(statement,"how") >= 0 
        && findKeyword(statement, "you") >= 0)
        {
            response = "I'm ready!";
            return true;
        }
        return false;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 10;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Let's talk about school!";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm. Seems cool!";
        }
        else if (whichResponse == 2)
        {
            response = "That's interesting. What is your name?";
        }
        else if (whichResponse == 3)
        {
            response = "Wow! Patrick will be so happy when I tell him that!";
        }
        else if (whichResponse == 4)
        {
            response = "Seems cool to me- I wonder what Squidward will think?";
        }
        else if (whichResponse == 5)
        {
            response = "Wow! Wanna talk about your job?";
        }
        else if (whichResponse == 6)
        {
            response = "Pretty cool.";
        }
        else if (whichResponse == 7)
        {
            response = "Seems cool to me. Wanna talk about your family?";
        }
        else if (whichResponse == 8)
        {
            response = "Interesting!";
        }
        else if (whichResponse == 9)
        {
            response = "Wow!";
        }

        return response;
    }

    private String greeting()
    {
        final int GREETINGS = 4;
        double r = Math.random();
        int whichResponse = (int)(r * GREETINGS);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Let's talk about school";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm. Seems cool to me.";
        }
        else if (whichResponse == 2)
        {
            response = "Let's talk about our jobs.";
        }
        else if (whichResponse == 3)
        {
            response = "Sounds cool!";
        }
        else if (whichResponse == 4)
        {
            response = "Wanna tell me more?";
        }

        return response;
    }

    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no").
     *
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @param startPos
     *            the character of the string to begin the
     *            search at
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal,
    int startPos)
    {
        String phrase = statement.trim().toLowerCase();
        goal = goal.toLowerCase();

        // The only change to incorporate the startPos is in
        // the line below
        int psn = phrase.indexOf(goal, startPos);

        // Refinement--make sure the goal isn't part of a
        // word
        while (psn >= 0)
        {
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if (psn > 0)
            {
                before = phrase.substring(psn - 1, psn);
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(
                    psn + goal.length(),
                    psn + goal.length() + 1);
            }

            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before
                    .compareTo("z") > 0)) // before is not a
                // letter
            && ((after.compareTo("a") < 0) || (after
                    .compareTo("z") > 0)))
            {
                return psn;
            }

            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal, psn + 1);

        }

        return -1;
    }

    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no"). The search
     * begins at the beginning of the string.
     * 
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword(statement, goal, 0);
    }
}


