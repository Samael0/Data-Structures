class StringStack{
    StringLinkedList.Node top = new StringLinkedList.Node(null);
    StringLinkedList myLinkedList = new StringLinkedList(); //using the linked list in order to create a stack
    
    //Push into the stack
    public void push(String m){
        myLinkedList.push(m);
    }

    //pop from the stack (lifo)
    public String pop(){
        return myLinkedList.pop();
    }

    //print out the stack
    public void print(){
        myLinkedList.print();
    }

    //check if the stack is empty
    public boolean isEmpty(){
        return myLinkedList.isEmpty();
    }

    //debugging purposes
    public static void main(String[] args) {
        StringStack myStringStack = new StringStack();
        //myStringStack.push("Hello");
        //myStringStack.push("There!");
        myStringStack.pop();
        //myStringStack.print();
        //myStringStack.pop();
        //System.out.println(" ");
        //myStringStack.print();
    }

}
