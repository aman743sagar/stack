package QUEUE;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class quebuild {
    public static void main(String[] args) {
        Queue<Integer> st= new LinkedList<>();// ArrayDeque
        st.add(12);
        st.offer(13);
        st.offer(14);
        System.out.println("peek" +st.peek());
        System.out.println(st);
        System.out.println(st.remove());
        
    }
    
}
