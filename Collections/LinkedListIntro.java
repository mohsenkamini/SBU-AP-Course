import java.util.*;

class Node {
    int value;
    Node next;  
    Node (int value) 
    {
        this.value=value;
    }
}
public class LinkedListIntro {
    // linked list is like a chain of arrays 
    // each of them, at the end of their part point 
    // to the next part of the linkedlist which is another
    // array.
    public static void main (String[] args) 
    {
        Node first = new Node(0) ;
        Node current = first;
        for (int i=1 ; i <5 ; i++)
        {
            current.next = new Node (i);
            current = current.next;
        }
        // for (current=first ; current!=null ; current=current.next )
            // System.out.println(current.value);
        LinkedList <String> ll = new LinkedList<String>();
        ll.add("mohsen");
        ll.add("Agha mohsen");
        ll.add("Agha mohsen 2");
        ll.add("Agha mohsen 3");
        Iterator itr = ll.iterator();
        // while (itr.hasNext())
            // System.out.println(itr.next());
        Vector vec = new Vector<String>(9);
        for (int i=0 ; i <=10 ; i++)
            vec.add("mohsen");
        System.out.println(vec.capacity());

    }
}