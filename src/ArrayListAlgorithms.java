import java.util.ArrayList;


public class ArrayListAlgorithms
{

    /** Returns arraylist of Integers that contain all mode(s) of the int array numList.
     *  If elements in numList all appear exactly once, there is no mode, and this method
     *  should return an empty list
     *
     *  For example, if numList is: [1, 2, 3, 2, 4, 5, 5, 6],
     *  then numList contains two modes: 2, 5
     *  and this method returns an arraylist containing 2 and 5 (in any order)
     *  If numList is: [1, 2, 3, 2, 4, 5, 5, 6, 6, 7, 6],
     *  then numList contains one mode: 6
     *  and this method returns an arrayList containing 6
     *  If numList is: [1, 2, 3, 4, 5, 6], then numList contains no mode
     *  and this method returns an empty arrayList: []
     *  If numList is: [2, 2, 2, 3, 3, 3, 4, 4, 4],
     *  then numList contains three modes: 2, 3, 4
     *  and this method returns an arrayList containing 2, 3, and 4 (in any order)
     *
     *  Does NOT mutate (modify) elements in numList
     *  PRECONDITIONS: numList.length > 0
     *
     *  @param numList  numList of ints
     */
    public static ArrayList<Integer> modes(int[] numList)
    {
        ArrayList<Integer> modes = new ArrayList<Integer>();
        int max = 1;
        for (int i = 0; i < numList.length; i++)
        {
            int count = 1;
            for (int x = i + 1; x < numList.length; x++)
            {
                if (numList[i] == numList[x])
                {
                    count++;
                }
            }
            if (count > max)
            {
                max = count;
                modes.clear();
                modes.add(numList[i]);
            }
            else if (count == max && count != 1)
            {
                modes.add(numList[i]);
            }
        }
        return modes;
    }


}
