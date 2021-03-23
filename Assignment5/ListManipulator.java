/*
Author: Khoa Bui
Homework 5
Exercise 1
Description: This class contain 3 method require in the homework to Manipulate the list given
 */
import java.util.*;

public class ListManipulator {
    ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending) {
        if (ascending == true)
            Collections.sort(myLst);
        else
            Collections.sort(myLst, Collections.reverseOrder());
        return myLst;
    }

    ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 0; i < myLst.size(); i++) {
            if (myLst.get(i) > myLst.get(maxIndex))
                maxIndex = i;
            if (myLst.get(i) < myLst.get(minIndex))
                minIndex = i;
        }
        int numMin = myLst.get(minIndex);
        int numMax = myLst.get(maxIndex);
        myLst.set(minIndex, numMax);
        myLst.set(maxIndex, numMin);
        return myLst;
    }

    void table(ArrayList<Integer> myLst) {
        HashMap<Integer, Integer> OccurTime = new HashMap<>();
        for (int i = 0; i < myLst.size(); i++) {
            int j=1;
            if (OccurTime.containsKey(myLst.get(i)))
                j++;
            OccurTime.put(myLst.get(i),j);
        }
       // I copy the table to my list to use the function sort
        ArrayList<Map.Entry<Integer, Integer>> sortArr=new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : OccurTime.entrySet()) {
            sortArr.add(entry);
        }
        // I create the custom sort in the method call MySortTable to sort by value of the hashmap
        Comparator <Map.Entry<Integer,Integer>> mySortTable= new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };
        Collections.sort(sortArr,mySortTable);

        for (Map.Entry<Integer,Integer> entry: sortArr) {
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
    }
}
