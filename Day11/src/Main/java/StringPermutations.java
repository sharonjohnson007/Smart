package Main.java;/*package Main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPermutations {

    public List<String> permutations(String inputStr) {
        if (inputStr == null)
            return null;

        final List<String> result = new ArrayList<>();
        if (inputStr.length() < 2) {

            result.add(inputStr);
            return result;
        }

        final List<String> permutations = permutations(inputStr.substring(1));
        for (final String permutation : permutations) {
            for (int i = 0; i <= permutation.length(); i++) {
                String newPermutation = permutation.substring(0, i)
                        + inputStr.charAt(0) + permutation.substring(i);
               // System.out.println(newPermutation);
                result.add(newPermutation);
                //System.out.println(permutation.length()+permutation);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        StringPermutations permuter = new StringPermutations();
        List<String> perms = permuter.permutations("xyz");
        System.out.println(Arrays.toString(perms.toArray()));

        List<String> perms1 = permuter.permutations("abcafyt");
        System.out.println(Arrays.toString(perms1.toArray()));
    }
}*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPermutations {

    public List<String> permutations(String inputStr) {
        if (inputStr == null)
            return null;

        System.out.println("inputStr value : "+inputStr);

        final List<String> result = new ArrayList<>();
        if (inputStr.length() < 2) {
            System.out.println("Inside if part of permutations>>> inputStr : "+inputStr);
            result.add(inputStr);
            System.out.println("setting the inputstr in Result list : "+ Arrays.toString(result.toArray()));
            return result;
        }

        final List<String> permutations = permutations(inputStr.substring(1));//permutations(yz)
        System.out.println("List<String> permutations = "+ Arrays.toString(permutations.toArray()));
        for (final String permutation : permutations) {
            System.out.println(" Inside for each : String permutation : "+permutation);
            for (int i = 0; i <= permutation.length(); i++) {
                System.out.println("inside for ---------------\ni = "+i);
                String newPermutation = permutation.substring(0, i)
                        + inputStr.charAt(0) + permutation.substring(i);
                System.out.println("permutation value : "+permutation+"\n permutation.substring(0,"+i+"): "
                        +permutation.substring(0, i)
                        +" + inputStr.charAt(0) : " +  inputStr.charAt(0) +" + permutation.substring("+i+") : "+permutation.substring(i));
                System.out.println("newPermutation : "+newPermutation);
                result.add(newPermutation);
                //System.out.println(permutation.length()+permutation);
                System.out.println("Result list : "+ Arrays.toString(result.toArray()));
                System.out.println("End of for -----------------\n");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        StringPermutations permuter = new StringPermutations();
        List<String> perms = permuter.permutations("xyz");
        System.out.println("inside main list<> perms : "+Arrays.toString(perms.toArray()));

       // List<String> perms1 = permuter.permutations("abcafyt");
       // System.out.println(Arrays.toString(perms1.toArray()));
    }
}


