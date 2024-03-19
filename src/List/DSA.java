
package List;
public class DSA {
    public static void main(String[] args) {
        Fixed_Sized_list<String> stdNames=new Fixed_Sized_list<String>();
        stdNames.add("John");
        System.out.println(stdNames.size());

        stdNames.add("Peter");
        System.out.println(stdNames.size());

        stdNames.add("Mike");
        System.out.println(stdNames.size());

        stdNames.add(1,"Joe");
        System.out.println(stdNames.size());




        //Checking if indeed Oe was added at index 1
        System.out.println(stdNames.get(1));
        stdNames.remove(2);
        System.out.println(stdNames.size());

        /*Trying to add at an index which is out of limit
        stdNames.add(8,"Evelyn");
        System.out.println("Error displays since the index is out of bounds");

        trying to add at index 5 whiles index 4 is empty
        stdNames.add(5,"Janet");
        System.out.println("Error  since there is a gap between index 3 and index 5 ");*/

        //checking if the array contains a particular item
        System.out.println(stdNames.contains("Joe"));
        System.out.println(stdNames.contains("Eunice"));

        //Adding the same name to different indexes
        stdNames.add("Mike");
        stdNames.add("Mike");
       stdNames.add("Mike");
       // stdNames.add("Mike");
       // stdNames.add("Mike");
       // stdNames.add("Mike");

// Create a method that print out the contents of the list
        System.out.println(stdNames.size());
        System.out.println("All elements in the list: " + stdNames.getAll());


//PRINTING
        int mikeOccurrences = stdNames.countOccurrences("Mike");
        System.out.println("Number of occurrences of 'Mike': " + mikeOccurrences);

        //CLEARING THETHE CONTENT OF THE LIST
        // Assuming stdNames is an instance of Fixed_Sized_list
        stdNames.clear();

        System.out.println(  "size of array : "+stdNames.size());










    }
}
