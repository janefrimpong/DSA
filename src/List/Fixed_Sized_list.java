
package List;


public class Fixed_Sized_list <E> {
    //<E> :Generic E so that our array base list would be able to create of strings,integers,doubles
    //CREATE A GENERIC ARRAY FPR STORING THE CONTENT OF THE LIST
    private E [] data;

    //Declare the default capacity of the fixed sized list
    //This will ensure if the user creates the list with the default
    // constructor,the size of the list will be declared here.
    public static final  int CAPACITY=7;

    //Declare a variable to keep track of the number of elements
    // in the list as user adds or removes elements

    private int size=0;

    //Declare constructor for creating the fixed size array

    //(A)  with default Capacity
    public Fixed_Sized_list(){
        this (CAPACITY);
    }
    //(B) with user desired capacity
    public  Fixed_Sized_list(int desiredSize){
        data=(E[])new Object[desiredSize];
    }

    //Create a method to the index [i] is wiithin the array size before any operstion can be perfomed

    public void checkIndex(int i,int n){
        if(i<0||i>=n){
            throw new IndexOutOfBoundsException("Illegal index"+i);
        }


        }
    //Create a method to add an element at a given index i
    public void add(int i,E e){
        checkIndex(i,size+1);
        if(size== data.length)
            throw new IllegalStateException("List is full");
        for(int k=size-1;k>=i;k--){
            data[k=1]=data[k];
        }


            data[i]=e;
            size++;

    }
    //create a method to allow the user add an element without specifying the index
    public void add(E e){
        int i=size;
        add(i,e);

        }
        //Create a method to remove an element at index i and return the removed element
    public E remove (int i){
        checkIndex(i,size);
        E temp=data[i];


        for (int k=i; k<size-1;k++){
            data[k]=data[k+1];
        }
        data[size-1]=null;
        size--;
        return temp;
    }
    //Create method to return the size of the list
    public int size(){
        return size;

    }
    //Create a method to check if the list is empty
    public boolean isEmpty(){
        return size==0;
    }
    //Create a method to get a particular element at an index i
    public E get(int i){
        checkIndex(i,size);
        return data[i];

    }
    //Create an element to  replace an element at a particular index i and return the replaced element
    public E set(int i,E e) throws IndexOutOfBoundsException{
        checkIndex(i , size);
        E temp=data[i];
        data[i]=e;
        return temp;

    }
    //Create a method that will check if the list contains an element
    public boolean contains(Object item){
        for (int j=0;j<size-1;j++){
            if(get(j).equals(item)){
                return true;


            }
        }
        return false;


}

   //METHOD TO GET ALL THE INDEXES OF AN ELEMENT
    public String getAll() {
        if (size == 0) {
            return "List is empty";
        } else {
            String result = "";
            for (int j = 0; j < size; j++) {
                result += data[j] + " ";
            }
            result = result+ size();
            return result;
        }
    }

    public int countOccurrences(E item) {
        int count = 0;
        for (int j = 0; j < size; j++) {
            E element = get(j);
            if (element != null && element.equals(item)) {
                count++;
            }
        }
        return count;
    }
    public void clear() {
        // Reset the data array to null references
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        // Reset the size to 0
        size = 0;
    }


}







