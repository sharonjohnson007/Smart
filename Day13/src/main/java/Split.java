package main.java;

public class Split {

    public static void main(String[] args) {
        String str ="java,guides.net";
        String[] strArray = str.split(",");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        strArray = str.split(",", 2);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
