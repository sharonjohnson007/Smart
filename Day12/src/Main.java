public class Main {
    public static void main(String[] args) {
//charAt()
        String str = "Welcome to string handling guide";
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(5);
        char ch3 = str.charAt(11);
        char ch4 = str.charAt(20);
        System.out.println("Character at 0 index is: " + ch1);
        System.out.println("Character at 5th index is: " + ch2);
        System.out.println("Character at 11th index is: " + ch3);
        System.out.println("Character at 20th index is: " + ch4);
//first and last index()
        String str1 = "Java Guides";
        int strLength = str.length();
        // Fetching first character
        System.out.println("Character at 0 index is: " + str.charAt(0));
        // The last Character is present at the string length-1 index
        System.out.println("Character at last index is: " + str.charAt(strLength - 1));
//codePointAt()
        String str2 = "javaguides";
        int unicode = str.codePointAt(0);
        System.out.println("the character (Unicode code point) at the specified index is :: " + unicode);
//CodePointBefore()
        String str3 = "javaguides";
        int unicode1 = str.codePointBefore(1);
        System.out.println("the character (Unicode code point)" + "  at the before specified index is :: " + unicode);


    }
}
