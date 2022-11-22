package Main.java;

public class StringTrimAllWhitespace {
    public static void main(String[] args) {
        String str ="  Java    Guides    ";
       // System.out.println(str.length());
        String result = trimAllWhitespace(str);
        System.out.println(result);
    }
    public static String trimAllWhitespace(String str) {
        if (!hasLength(str)) {
            return str;
        }

        int len = str.length();
       // System.out.println(len);
        StringBuilder sb = new StringBuilder(str.length());
       // System.out.println(sb.length());
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean hasLength(String str) {
        return (str != null && !str.isEmpty());
    }

}
