public class Java52 {
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "world";

        String s3 = s1+ s2;
        //Function concat => connect string
        String s4 = s1.concat(s2);
        System.out.println("s3: "+s3);
        System.out.println("s4: "+s4);
        System.out.println("--------------");
        //Function replace
        String s5= "Java.com";
        String s6 = s5.replaceAll("Java","Hello");
        System.out.println("s6: "+s6);
        System.out.println("--------------");
        //Function toLowerCase, toUpperCase
        String s7 = s3.toLowerCase();
        String s8 = s3.toUpperCase();
        System.out.println("s7: "+s7);
        System.out.println("s8: "+s8);
        System.out.println("--------------");
        //Function trim()=> delete spaces at begin of string
        String s9 = "   Hello world, good morning.";
        System.out.println(s9.trim());

        System.out.println("--------------");
        //Function subString -> cut String
        System.out.println(s9.substring(15));
        System.out.println(s9.substring(15,20));



    }

}
