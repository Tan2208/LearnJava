package main;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<String> listST = new LinkedList<String>();

        listST.offer("Nguyen A");
        listST.offer("Nguyen B");
        listST.offer("Nguyen C");
        listST.offer("Nguyen D");

        while (true){
            String name = listST.poll();
            if(name ==null)
            {
                break;
            }
            System.out.println(name);
        }
    }
}
