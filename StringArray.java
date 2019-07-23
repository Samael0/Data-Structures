class StringArray{

    String array[];
    int count; //Counter for elements
    int capacity; //Max size for array

    //Constructor
    public StringArray(){
        array = new String[10];
        count = 0;
        capacity = 10;
    }

    //Insert into the array
    void insert(String msg){
        if(count == capacity){
            resize();
        }
        array[count] = msg;
        count++;
    }

    //Resize when array is full
    void resize(){
        String temp[] = new String[capacity * 2];
        for(int i=0;i<capacity;i++){
            temp[i] = array[i];
        }
        array = temp;
        capacity = capacity * 2;
    }

    //Delete a element
    void delete(){
        if(count > 0){
            array[count - 1] = null;
            count--;
        }
        else if(count == 0){
            System.out.println("Array is empty!");
        }
    }

    //Delete a specific string
    void deleteString(String m){
        boolean doesItContain = false;
        
        if(count == 0){
            System.out.println("Array is empty!");
        }
        else{
            for(int i=0;i<array.length;i++){
                if(array[i] == m){
                    array[i] = null;
                    doesItContain = true;
                }
            }
            if(!doesItContain){
                System.out.println("No such element to delete");
            }
        }
    }

    //Reverse the array
    void reverse(){
        String temp;
        for(int i=0;i<array.length/2;i++){
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }

    //Print out the array
    void print(){
        for(int i=0;i<capacity;i++){
            if(array[i] != null){
                System.out.println(array[i]);
            }
        }
    }
    
    //Debugging Purposes
    public static void main(String[] args) {
        StringArray str = new StringArray();

        str.insert("Hello");
        str.insert("Java");
        str.print();
        System.out.println();

        str.delete();
        str.print();
        System.out.println();

        str.insert("Java");
        str.insert("Test");
        str.deleteString("Java");
        str.print();
        System.out.println();

        
        str.reverse();
        str.print();
    }

}