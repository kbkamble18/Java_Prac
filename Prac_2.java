//LinkedList

public class Prac_2 {
    Node head = null;
    Node current=null;
    class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    //add - First, Last
    public void addfirst(int data){
        Node newNode = new Node(data);
        current=head;
        if(head == null){
            head = newNode;
            return;
        }else{
            while(current.next!=null){
                current = current.next;
            }
        }
        newNode.data = data;
        head = newNode;

    }

    public void delfirst(int data){
        Node newnNode = new Node(data);
        if(head==null){
            head = newnNode;
            return; 
        }
    }

    public static void main(String[] args) {
        Prac_2 ll = new Prac_2();
        ll.addfirst("1");
        ll.addfirst("Two");
        ll.addfirst("Three");
        System.out.println(ll);
    }

}
