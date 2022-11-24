import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
//compareToIgnoreCase
       /* String s1="Hello World";
        String s2="hello world";
        String s3="jAAava";
        String s4="java";
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s3.compareToIgnoreCase(s4));*/

//concat(String str)

         /*  String str = "javaguides";
        str = str.concat(".net");
        System.out.println("Concatenates the specified string to the end of this string : " + str);
        System.out.println("cares".concat("s"));
        System.out.println("to".concat("get"));

        //contains(CharSequence s)

        String str2 = "javaguides";
        boolean contains = str.contains("guides");
        System.out.println("Contains : " + contains);*/
//contentEquals()

        /* String str = "javaguides";
        String subStr = "javaguides";
        boolean isContentEquals = str.contentEquals(subStr);
        System.out.println("isContentEquals :: " + isContentEquals);
        isContentEquals = str.contentEquals(new StringBuffer(subStr));
        System.out.println("isContentEquals :: " + isContentEquals);*/

//endsWith(String suffix)

          /*String str = "javaguides";
        String subStr = "guides";
        boolean endsWith = str.endsWith(subStr);
        System.out.println(str + " endsWith " + subStr + "  :: " + endsWith);*/

//equals(Object anObject) and equalsIgnoreCase(String anotherString)
       /* String str = "javaguides";
         String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Good-bye";
        String s4 = "HELLO";
        System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " equals " + s3 + " -> " + s1.equals(s3));
        System.out.println(s1 + " equals " + s4 + " -> " + s1.equals(s4));
        System.out.println(s1 + " equalsIgnoreCase " + s4 + " -> " + s1.equalsIgnoreCase(s4));

        String str5 = "javaguides";
        boolean equal = str.equalsIgnoreCase("JAVAguides");
        System.out.println("Strings are equal :: " + equal);*/

// GetBytesExamples
       /* String str = "javaguides";
        // Encodes this String into a sequence of bytes using the platform's
        // default charset, storing the result into a new byte array.
        byte[] bs = str.getBytes();
        for (byte b : bs) {
            System.out.println(b);}
        String str1 = "javaguides";
            byte[] bs1 = str.getBytes(Charset.forName("UTF-8"));
            for (byte b1 : bs1) {
                System.out.println(b1);}*/
//indexOf
       /* String str = "javaguides";
        // method 1
        int index = str.indexOf("java");
        System.out.println(index);

        System.out.println("index of guides :: " + str.indexOf("guides"));
        System.out.println(" index of des :: " + str.indexOf("des"));
        System.out.println(str.indexOf('s'));
        // method 3
        System.out.println(str.indexOf('g', 0));
        // method 4
        System.out.println(str.indexOf("guides", 3));*/
 //intern()

       /* String str = "javaguides";
        String newStr = new String("javaguides");
        System.out.println(newStr.intern().equals(str));
        System.out.println(newStr.equals(str));
        newStr.intern();
        System.out.println(newStr.intern());
        str.intern();
        System.out.println(str.intern());*/

//lastIndexOf() methods

        /*String str = "javaguidesguides";
        // method1
        int lastIndexOf = str.lastIndexOf('s');
        System.out.println(" last index of given character 's' in' " + " "+ str+"' ::  " + lastIndexOf);
        lastIndexOf = str.lastIndexOf("guides");
        System.out.println(" last index of given string 'guides' in' " + " "+ str+"' ::  " + lastIndexOf);
        lastIndexOf = str.lastIndexOf("guides", 4);
        System.out.println(" last index of guides in given  string " + " "+ str+" and from index  " + lastIndexOf);
        lastIndexOf = str.lastIndexOf('g', str.length());
        System.out.println(" last index of given char ::  " + lastIndexOf);*/

   //length()
        /*String str = new String("Java Guides");
        int length = str.length();
        System.out.println(" length of the string '" + str + "' is :: " + length);*/
   //replace()

        String str = "javaguides";
        String subStr = str.replace('a', 'b');
        System.out.println("replace char 'a' with char 'b' from given string : " + subStr);
        subStr = str.replace("guides", "tutorials");
        System.out.println("replace guides with tutorials from given string : " + subStr);
        subStr = str.replaceAll("[a-z]", "java");
        System.out.println(subStr);
        subStr = str.replaceFirst("[a-z]", "java");
        System.out.println(subStr);

   //getCharsDemo
        String s = "This is a demo of the getChars method.";
        int start = 10;
        int end = 14;
        char buf[] = new char[end - start];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);




        }
    }

