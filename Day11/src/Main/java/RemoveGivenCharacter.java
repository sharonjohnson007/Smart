package Main.java;

public class RemoveGivenCharacter {
    private static final String TEXT = "JaAVaA GUIDES";
    private static final char CHAR = 'a';

    public static void main(String[] args) {

        System.out.println("Input text: \n" + TEXT);
        System.out.println("Character to remove: " + CHAR + "\n");

        System.out.println("StringBuilder based solution:");
        String resultV1 = removeCharacterV1(TEXT, CHAR);
        System.out.println("Result: \n" + resultV1);


    }


    public static String removeCharacterV1(String str, char ch) {

        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input String can't be null");
        }

        StringBuilder sb = new StringBuilder();
        char[] chArray = str.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] != ch) {
                sb.append(chArray[i]);
            }
        }

        return sb.toString();
    }
}

