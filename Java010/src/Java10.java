public class Java10 {
    public static void main(String[] args) {
        //Type Casting
        int a= 10;
        int b= 5;
        System.out.println("a="+ a);
        System.out.println("b="+ b);
        //Widening Casting
        float c= a;
        float d= b;
        System.out.println("c="+ c);
        System.out.println("d="+ d);

        //Narrowing Casting
        float e= 7.5f;
        float f= 3.5f;
        System.out.println("e="+ e);
        System.out.println("f="+ f);

        int g=(int)e;
        int h=(int)f;
        System.out.println("g="+ g);
        System.out.println("h="+ h);

    }
}
