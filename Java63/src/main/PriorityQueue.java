package main;



public class PriorityQueue {
    public static void main(String[] args) {
        java.util.Queue<String> listST = new java.util.PriorityQueue<>();

        listST.offer("Nguyen A");
        listST.offer("Nguyen B");
        listST.offer("Nguyen D");
        listST.offer("Nguyen C");

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
