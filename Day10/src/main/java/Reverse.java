package main.java;

public class Reverse {
    public static void main(String[] args) {
        reverseWithStringConcat("JOHNSON");
        reverseWithStringBuilder("SHARON");




    }



    private static final void display(String original, String reverse) {
        System.out.println(original);
        System.out.println(reverse);
        System.out.println("----------------------------");
    }



    public static final String reverseWithStringConcat(String string){
            String output = new String();
            for (int i = (string.length() - 1); i >= 0; i--) {
                output += (string.charAt(i));
            }
            display(string, output);
            return output;

    }
    public static final String reverseWithStringBuilder(String string) {
        final StringBuilder builder = new StringBuilder();
        for (int i = (string.length() - 1); i >= 0; i--) {
            builder.append(string.charAt(i));
          //  System.out.println(builder);
        }
        display(string, builder.toString());
        return builder.toString();
    }

}




