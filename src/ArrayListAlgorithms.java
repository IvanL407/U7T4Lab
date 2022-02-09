import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAlgorithms
{
    /** Returns true if any of the elements in stringList contain
     *  target as a substring; false otherwise.  Use indexOf instead of contains
     *  for AP practice! (although in reality, contains is preferred)
     *
     *  Does NOT mutate (modify) elements of stringList.
     *  PRECONDITION: stringList.size() > 0
     *
     *  @param stringList  original arraylist of Strings
     *  @return  true if target is found in any of the strings, false otherwise
     */
    public static boolean containsTarget(ArrayList<String> stringList, String target)
    {
        for (int i = 0; i < stringList.size(); i++)
        {
            if (stringList.get(i).indexOf(target) != -1)
            {
                return true;
            }
        }
        return false;
    }

    /** Returns number of elements in intList that are less than the
     *  average of all elements.
     *
     *  Does NOT mutate (modify) elements of intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the number of ints in intList that are less than the average
     */
    public static int belowAverage(ArrayList<Integer> intList)
    {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < intList.size(); i++)
        {
            sum += intList.get(i);
        }
        double average = (double) sum / intList.size();
        for (Integer num : intList)
        {
            if (num < average)
            {
                count++;
            }
        }
        return count;

        /** Replaces all words in wordList that end in "s" with the all-uppercase
         *  version of the word.  For example, "apples" should be replaced with "APPLES".
         *  Assume all letters of all words in wordList are lowercase initially (no need
         *  to worry about checking for case or converting first to lowercase)
         *
         *  DOES mutate (modify) elements of wordList.
         *  PRECONDITION: wordList.size() > 0
         *
         *  @param wordList  original arraylist of words
         */
//        public static void replaceWithCaps(ArrayList<String> wordList)
//        {
//            for (String word : wordList)
//            {
//                if (word.indexOf("s").equals(word.length() - 1))
//                {
//                    word.toUpperCase();
//                }
//            }
//        }

        /** Returns the index at which the minimum value of all integers in
         *  intList appears; if the minimum value appears more than once in
         *  the arraylist, return the index of the first occurrence
         *
         *  Does NOT mutate (modify) elements in intList.
         *  PRECONDITION: intList.size() > 0
         *
         *  @param intList  original arraylist of Integers
         *  @return  the index at which the minimum value occurs
         */
        public static int indexOfMinimum(ArrayList<Integer> intList)
        { /* implement this method! */ }
    }
}
