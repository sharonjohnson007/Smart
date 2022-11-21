package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoStringarrays {

    private static String[] mergeStringArrays(String array1[], String array2[]) {

        if (array1 == null || array1.length == 0)
            return array2;
        if (array2 == null || array2.length == 0)
            return array1;
        List< String > firstList = Arrays.asList(array1);
        System.out.println(firstList);
        List < String > secondList = Arrays.asList(array2);
        System.out.println(secondList);

        List < String > result = new ArrayList< String >(firstList);
        List < String > tmp = new ArrayList < String > (firstList);

        System.out.println("Before retain"+secondList.toString());

        tmp.retainAll(secondList);
        System.out.println("After retain"+tmp.toString());
        result.removeAll(tmp);
        System.out.println("After remove"+result.toString());
        result.addAll(secondList);
        System.out.println("After add"+result.toString());

        return ((String[]) result.toArray(new String[result.size()]));
    }

    public static void main(String[] args) {
        String[] strArray = mergeStringArrays(new String[] {"abc", "xyz", "pqr"}, new String[] {"abc", "ABC","PQR"});
        for (String string: strArray) {
            System.out.println(string);
        }
    }




}
