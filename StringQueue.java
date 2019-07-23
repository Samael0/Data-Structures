class StringQueue{
    Node front; //Front of line
    Node rear; //Back of line

    //Creation of a node
    class Node{
        String message;
        Node next;
        
        //Constructor
        Node(String m){
            message = m;
            next = null;
        }

        //retrieve the data
        public String getString(){
            return message;
        }

        //retrieve the node pointing to
        public Node getNext(){
            return next;
        }

        //set the pointer to next node
        public void setNext(Node n){
            next = n;
        }

    }

    //////////////////////////
    //Outer Class Beginning//
    /////////////////////////

    //Back to outer class and constructor
    public StringQueue(){
        front = null;
        rear = null;
    }

    //enqueue to the queue
    public void enqueue(String m){
        Node newNode = new Node(m);
        if(rear == null){
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    //dequeue from the line (fifo)
    public String dequeue(){
        if(front == null){
            return null;
        }
        Node temp = front;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return temp.message;
    }

    //print out the queue
    public void print(){
        Node curr = front;
        while(curr != null){
            System.out.println(curr.message + " ");
            curr = curr.next;
        }
    }

    //debugging purposes
    public static void main(String[] args) {
        StringQueue myStringQueue = new StringQueue();

        myStringQueue.enqueue("One");
        myStringQueue.enqueue("Two");
        myStringQueue.enqueue("Three");
        System.out.println(" ");
        myStringQueue.print();
        myStringQueue.dequeue();
        myStringQueue.print();

    }

}