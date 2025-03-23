class LinkedList{
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    public void insertatbeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head= newNode;
    }
    public void insertatend(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void deletefrombeginning(){
        if (head == null){
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }
    public void display(){
        Node temp = head; 
        while (temp != null){
            System.out.println(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertatbeginning(10);
        list.insertatbeginning(20);
        list.insertatend(30);
        list.display();
        list.deletefrombeginning();
        list.display();
    }
}
