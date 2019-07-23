import java.util.Scanner;

class Main{
    
    public static void main(String[] args) {

        int numberOfWords = 0;
        String inputFilename = "input.txt";
        if(args.length > 0){
            inputFilename = args[0];
        }
        
        //////////
        //Array//
        /////////
        Scanner scan = null;
        
        try{
            scan = new Scanner(new java.io.File(inputFilename));
        }
        catch(java.io.FileNotFoundException f){
            System.out.println("File does not exist");
            return;
        }

        StringArray fileStringArray = new StringArray();
        if(scan != null){
            while(scan.hasNext()){
                String nextWord = scan.next();
                fileStringArray.insert(nextWord);
                numberOfWords++;
            }
        }
        long arrayStartTime = System.nanoTime();
        fileStringArray.reverse();
        long arrayElapsedTime = System.nanoTime() - arrayStartTime;
        //*************//
        //End of Array//
        //************//
        

        ////////////////
        //Linked List//
        ///////////////
        Scanner scan1 = null;
        
        try{
            scan1 = new Scanner(new java.io.File(inputFilename));
        }
        catch(java.io.FileNotFoundException f){
            System.out.println("File does not exist");
            return;
        }
        
        //Load up the text file into the Linked List
        StringLinkedList fileStringLinkedList = new StringLinkedList();
        if(scan1 != null){
            while(scan1.hasNext()){
                String nextWord = scan1.next();
                fileStringLinkedList.insert(nextWord);
            }
        }
        long LinkedListStartTime = System.nanoTime();
        fileStringLinkedList.reverse();
        long linkedListElapsedTime = System.nanoTime() - LinkedListStartTime;
        //******************//
        //End of Linked List//
        //******************//
        

        ////////////////////
        //Stack and Queue//
        ///////////////////
        Scanner scan2 = null;
        
        try{
            scan2 = new Scanner(new java.io.File(inputFilename));
        }
        catch(java.io.FileNotFoundException f){
            System.out.println("File does not exist");
            return;
        }
        
        //Load up the text file into queue
        StringQueue fileStringQueue = new StringQueue();
        if(scan2 != null){
            while(scan2.hasNext()){
                String nextWord = scan2.next();
                fileStringQueue.enqueue(nextWord);
            }
        } 

        long stackAndQueueStartTime = System.nanoTime();
        //dequeue from the queue and push into the Stack
        StringStack fileStringStack = new StringStack();
        while(fileStringQueue.front != null){
            fileStringStack.push(fileStringQueue.dequeue());
        }

        //Pop from the stack and enqueue into the queue
        while(fileStringStack.isEmpty() != true){
            fileStringQueue.enqueue(fileStringStack.pop());
        }
        long stackAndQueueElapsedTime = System.nanoTime() - stackAndQueueStartTime;
        //***********************//
        //End of Stack and Queue//
        //**********************//

        //////////////
        //Statistics//
        //////////////
        System.out.println("Number of word read in file: " +numberOfWords);
        System.out.println("Time to execute Array reversal (Nano-Seconds): " +arrayElapsedTime);
        System.out.println("Time to execute Linked List reversal (Nano-Seconds): " +linkedListElapsedTime);
        System.out.println("Time to execute Queue/Stack reversal (Nano-Seconds): " +stackAndQueueElapsedTime);

        System.out.println();
        System.out.println("Array:");
        fileStringArray.print();
        
        System.out.println();
        System.out.println("Linked List:");
        fileStringLinkedList.print();

        System.out.println();
        System.out.println("Queue:");
        fileStringQueue.print();
        //******************//
        //End of Statistics//
        //*****************//

    }
}