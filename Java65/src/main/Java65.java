package main;

import java.util.*;

public class Java65 {
    private Map<String , String> data = new TreeMap<String,String>();
    public String add(String key,String value)
    {
        return this.data.put(key, value);
    }

    public String del(String key)
    {
        return this.data.remove(key);
    }
    public String check(String key)
    {
        String rs = this.data.get(key);
        return rs;
    }

    public void printfAll(){
        Set<String>  collData = this.data.keySet();
        System.out.println(Arrays.toString(collData.toArray()));
    }

    public int printfnumber(){
        return this.data.size();
    }

    public void delAll(){
        this.data.clear();
    }
    public static void main(String[] args) {

        Java65 dic =new Java65();

        int sl=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("--------");
            System.out.println("Menu.\n" +
                    "1. Add.\n" +
                    "2. Del.\n" +
                    "3. Search.\n" +
                    "4. List.\n" +
                    "5. Printf number.\n"+
                    "6. Del All.\n" +
                    "0. Exit");
            sl=sc.nextInt();
            sc.nextLine();
            if(sl==1){
                System.out.println("Enter keywords: ");
                String key = sc.nextLine();
                System.out.println("Enter keywords meaning: ");
                String value = sc.nextLine();
                dic.add(key,value);
            } else if (sl==2||sl==3) {
                System.out.println("Enter keywords: ");
                String key =sc.nextLine();
                if(sl==2)
                {
                    dic.del(key);
                }else {
                    System.out.println("Meaning: "+dic.check(key));
                }
            } else if (sl==4) {
                dic.printfAll();
            } else if (sl==5) {
                System.out.println("Number keywords: "+dic.printfnumber());
            } else if (sl==6) {
                dic.delAll();
            }
        }while (sl!=0);
    }
}
