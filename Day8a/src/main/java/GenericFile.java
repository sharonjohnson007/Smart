package main.java;

public class GenericFile {

    private  String name;


    public String getFileInfo() {
        return "Generic File Impl";
    }

    public static void main(String[] args) {
        GenericFile genericFile=new GenericFile();
        System.out.println(genericFile.getFileInfo());
    }
}
