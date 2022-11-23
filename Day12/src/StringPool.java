public class StringPool {
    public static void main(String[] args) {

        stringPool();

    }



    private static void stringPool(){
        String s1 = "Helloworld";
        String s2 = "Helloworld";
        String s3 = "Greeting";
        String s4 = new String("Greeting");
        String s5 = "Helloworld";

        // == operator used to check equality of reference variables.
        if(s1 == s2){
            System.out.println("Helloworld");
        }

        // s3 and s4 are not equal.
        // s3 refer to string pool
        // s4 refer to heap memory
        if(s3 == s4){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
    }


}
