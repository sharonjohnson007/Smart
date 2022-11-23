package main.java;

public class ReverseString {
    public static void main(String[] args) {
        reverseWithStringConcat("javaguides");
        reverseWithStringBuilder("javaguides");
        reverseWithStringBuilderBuiltinMethod("javaguides");
    }




    public static final String reverseWithStringConcat(String string) {
        String output = new String();
        for (int i = (string.length() - 1); i >= 0; i--) {
            output += (string.charAt(i));
        }
        System.out.println("this output"+""+output);

        display(string, output);
        return output;
    }

    public static final String reverseWithStringBuilder(String string) {
        final StringBuilder builder = new StringBuilder();
        for (int i = (string.length() - 1); i >= 0; i--) {
            builder.append(string.charAt(i));
        }

        display(string, builder.toString());
        return builder.toString();
    }

    public static final String reverseWithStringBuilderBuiltinMethod(String string) {
        final StringBuilder builder = new StringBuilder(string);
        display(string, builder.reverse().toString());

        return builder.reverse().toString();
    }
    private static final void display(String original, String reverse) {
        System.out.println(original);
        System.out.println(reverse);
        System.out.println("----------------------------");
    }
}
