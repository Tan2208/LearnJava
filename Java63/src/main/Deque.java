package main;


import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {
        java.util.Deque<String> listST = new ArrayDeque<>();

        listST.offer("Nguyen A");
        listST.offer("Nguyen B");
        listST.offer("Nguyen C");
        listST.offer("Nguyen D");
        listST.offerFirst("Nguyen E");
        listST.offerLast("Nguyen F");

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
