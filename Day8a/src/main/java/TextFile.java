package main.java;

public class TextFile extends GenericFile{

    public String getContent(){
        return "Welcome to Gcit";
    }
    public String read() {
        return this.getContent()
                .toString();
    }

    public String read(int limit) {
        return this.getContent()
                .toString()
                .substring(0, limit);
    }

    public String read(int start, int stop) {
        return this.getContent()
                .toString()
                .substring(start, stop);
    }

}
