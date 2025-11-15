class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next = null;
    }
}
public class Prac_3 {

    Node head=null;

    public void add(int data){
        Node newNode = new Node(data);
        // newNode.data = data;
        Node current=head;
        if(head==null){
            head = newNode;
        }else{
            
            while(current.next!=null){       //Traversing list
                current.next = newNode;
            }
            current.next = newNode;
        }
        
    }
    public void printValues(){
        Node current = head;

        while(current!=null){
            System.out.print(current.data+" "); 
            current =current.next;
        }
        System.out.println();
    } 
    //    public static void main(String[] args) {
        
    // }
}
