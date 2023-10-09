class Node{
    int val;
    Node next;
     
    Node(int val) { 
        this.val = val;
    }
   
}

public class Intersection_two_LL {
    public Node getIntersectionNode(Node head1, Node head2) {
        
        Node d1 = head1; Node d2 = head2;

        while(d1!=d2){
            if(d1==null) d1 = head2;
            if(d2==null) d2 = head1;
            
            if(d1==d2) return d1;
            
            d1 = d1.next;
            d2 = d2.next;
        }

        return d1;
    }
}