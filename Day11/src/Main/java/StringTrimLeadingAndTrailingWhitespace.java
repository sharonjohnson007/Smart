package Main.java;

public class StringTrimLeadingAndTrailingWhitespace {

    public static void main(String[] args) {
        String str = "  Java Guides ";
        //System.out.println(str.length());
        String result = trimWhitespace(str);
        System.out.println(result);
    }
    public static String trimWhitespace(String str) {
        if (!(str != null && !str.isEmpty())) {
            return str;
        }

        StringBuilder sb = new StringBuilder(str);
        //System.out.println(sb.length());
        while (sb.length() > 0 && Character.isWhitespace(sb.charAt(0))) {
            sb.deleteCharAt(0);
        }
        while (sb.length() > 0 && Character.isWhitespace(sb.charAt(sb.length() - 1))) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}

