class StringLinkedList{
    Node head; //Front of linked list
    Node tail; //End of linked list

    //Creation of a node
    static class Node{
        String message;
        Node next;
        
        //Constructor
        Node(String m){
            message = m;
            next = null;
        }

        //retrieve the nodes data
        public String getString(){
            return message;
        }

        //retrieve the node its pointing to
        public Node getNext(){
            return next;
        }

        //set the pointer to next node
        public void setNext(Node n){
            next = n;
        }

    }

    //Back to outer class and this is constructor
    public StringLinkedList(){
        head = null;
        tail = null;
    }

    //insert a node into the linked list
    public void insert(String m){
        Node newNode = new Node(m);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    //Used for the stack
    public String pop(){
        String popped = null;
        if(head == null){
            System.out.println("Stack is Empty");
        }
        else{
            popped = head.message;
            head = head.next;
        }
        return popped;
    }

    //used for the stack
    public void push(String m){
        Node newNode = new Node(m); 
        if(head == null){ 
            head = newNode; 
        }
        else{ 
            Node temp = head; 
            head = newNode; 
            newNode.next = temp; 
        } 
    }

    //used for the stack 
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    //reverse the linked list
    public void reverse(){
        Node currTail = tail;
        Node thisNd = head;
        Node nextNd = thisNd.next;
        do{
            while(nextNd != currTail){
                thisNd = thisNd.next;
                nextNd = nextNd.next;
            }
            nextNd.next = thisNd;
            currTail = thisNd;

            thisNd = head;
            nextNd = thisNd.next;
        }
        while(currTail != head);
        head.next = null;
        Node temp = head;
        head = tail;
        tail = temp;
    }

    //print out the linked list
    public void print(){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.message + " ");
            curr = curr.next;
        }
    }

    //debugging purposes
    public static void main(String[] args) {
        StringLinkedList myLinkedList = new StringLinkedList();

        myLinkedList.insert("Hello");
        myLinkedList.insert("There");
        myLinkedList.insert("My");
        myLinkedList.insert("Friend");
        myLinkedList.insert("How");
        myLinkedList.insert("Are");
        myLinkedList.insert("Hello");
        myLinkedList.insert("There");
        myLinkedList.insert("My");
        myLinkedList.insert("Friend");
        myLinkedList.insert("How");
        myLinkedList.insert("Are");
        myLinkedList.insert("Hello");
        myLinkedList.insert("There");
        myLinkedList.insert("My");
        myLinkedList.insert("Friend");
        myLinkedList.insert("How");
        myLinkedList.insert("Are");
        myLinkedList.reverse();
        myLinkedList.print();
        

    }

}