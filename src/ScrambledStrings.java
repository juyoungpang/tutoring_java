import java.util.List;
import java.util.ArrayList;

public class ScrambledStrings
{
    /********************** Part (a) *********************/

    /** Scrambles a given word.
     *  @param word the word to be scrambled
     *  @return the scrambled word (possibly equal to word)
     *  Precondition: word is either an empty string or contains
     *    only uppercase letters.
     *  Postcondition: the string returned was created from word
     *      as follows:
     *   - the word was scrambled, beginning at the first letter
     *      and continuing from left to right
     *   - two consecutive letters consisting of "A" followed by
     *        a letter that was not "A" were swapped
     *   - letters were swapped at most once
     */
    public static String scrambleWord(String word)
    {
        /* to be implemented in part a */
        String ret = "";
        for(int i=0;i<word.length()-1;i++){
            String firstWord = word.substring(i,i+1);
            String secondWord = word.substring(i+1,i+2);
            if(firstWord.equals("A")&&!secondWord.equals("A")){
                ret+=(secondWord+firstWord);
                i++;
            }
            else ret+=firstWord;
        }
        if(ret.length()<word.length()) return ret+word.substring(word.length()-1);
        return ret;
    }

    /********************** Test *********************/
    public static void main(String[] args)
    {
        System.out.println("\nTesting Part (a):\n");

        String[] words = {"TAN", "ABRACADABRA", "WHOA",
                "AARDVARK", "EGGS", "A", ""};
        for (String word : words)
            System.out.println(word + " becomes " + scrambleWord(word));
    }
}
