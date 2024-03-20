package LinkList;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

    }


    public void add(int data) {
       Node currentNode=head;
       Node newNode= new Node(data);

       if(head==null){
           head=newNode;
       }else{
           while(currentNode.next!=null){
               currentNode=currentNode.next;
           }
           currentNode.next=newNode;
       }
    }


    public void print(){
        Node currentNode = head;

        if(head!=null){
            System.out.print(head.data);
        }while(currentNode.next!=null){
            currentNode=currentNode.next;
            System.out.print(currentNode.data);
        }
    }

    public void remove(int data){
        Node currentNode = head;
        Node previousNode = null;

        System.out.println();

       while(currentNode.next!=null){

            if(currentNode.data==data){
                if(currentNode == head){
                head = currentNode.next;
            }else
                previousNode.next=currentNode.next;
            }
            previousNode=currentNode;
            currentNode=currentNode.next;
        }
    }


    public static void main(String[] args) {
        LinkList.LinkedList lister =  new LinkList.LinkedList();
        lister.add(1);
        lister.add(2);
        lister.add(3);
        lister.add(4);
        lister.add(5);

       lister.print();

        lister.remove(1);
        lister.print();
    }

}
