/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionsactivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author 2ndyrGroupA
 */
public class JavaCollectionsActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Number 1:
        sortedArrayList();

        //Number 2:
        rearrangeArrayList();

        //Number 3:
       ArrayList<Integer> age = new ArrayList<Integer>();
       
       age.add(45);
       age.add(12);
       age.add(56);
       age.add(8);
       age.add(23);
       age.add(35);
       age.add(16);
       age.add(25);
       age.add(27);
       age.add(9);
       preservingOrder(age);
       
       
        //Number 4: Why should we opt for isEmpty() over size?
        System.out.println("Number 4:");
        System.out.println("Why should we opt for isEmpty() over size?");
        System.out.println("=> isEmpty() is more appropriate or it is more expressive than that of size() because the code is easier to read and to maintain \n"
                + "=> and it is faster, in some cases by orders of magnitude since it directly tells us if that object is empty or not than size it just tells you the size or get the number of the elements in the list. \n");

        //Number 5: Compare and contrast the classic for loop versus foreach. What are the pros and cons of both sides?
        System.out.println("Number 5:");
        System.out.println("Compare and contrast the classic for loop versus foreach. What are the pros and cons of both sides? \n");
        System.out.println("for loop");
        System.out.println("=> a classic for loop executes blocks of code again and again until its ends its iteration and we know how many times it will execute in which it is useful when iterating overall or a subset of items, It is faster, statement is more flexible, and has a parameter of (iterator, counter, incrementor) but it is bad for code readability and increase complexity, which has its risks.");
        System.out.println("foreach loop");
        System.out.println("=> a foreach loop reads or execute every instance of the element in which  it is very useful when iterating all of the items in a collection or in arrays, low chance for errors and easier to read but you can't control the way you iterate over the array \n");

        //Number 6:
        compareSet();

        //Number 7:
        uniqueValues();

        //Number 8:
        numberOfKeys();
    }

//Write a Java function to sort a given array list.
    public static void sortedArrayList() {
        System.out.println("Number 1: " + "This is Exercise number 1 which is to sort a given array list. \n");
        List<String> names = new ArrayList<String>();
        names.add("Charlene");
        names.add("Bryan");
        names.add("Rainier");
        names.add("Dawn");
        names.add("Daven");
        names.add("Donald");
        names.add("Dave");
        names.add("D-jay");
        names.add("Princess Diana");
        names.add("Winabel");
        names.add("Wendel");
        names.add("John Kim");
        names.add("Jasmine");
        System.out.println("This is an array of names BEFORE SORTING: " + names);
        Collections.sort(names);
        System.out.println("The Sorted Names: " + names + "\n");
    }

//Write a Java function to rearrange an array list in a random order every time the function is called.
    public static void rearrangeArrayList() {
        System.out.println("Number 2: " + "This is Exercise number 2 which is to rearrange an array list in a random order every time the function is called. \n");
        List<String> friends = new ArrayList<String>();
        friends.add("Jennifer");
        friends.add("Jennie Joy");
        friends.add("Christine");
        friends.add("Marjorie");
        friends.add("Kyla Jean");
        friends.add("Precy Jean");
        friends.add("Kaith Chymbee");
        friends.add("Angelica");
        friends.add("Jolly");
        friends.add("Daryll");
        friends.add("Dave Lyndrex");
        friends.add("John Dave");
        friends.add("Sernel");
        friends.add("Jerald");
        friends.add("Jeric");
        friends.add("James Aldrin");
        friends.add("James Lloyd");
        friends.add("Guian Victor");
        friends.add("Rehnan");
        System.out.println("This is an array of my friends BEFORE REARRANGING: " + friends);
        Collections.shuffle(friends);
        System.out.println("An Array AFTER REARRANGING" + friends + "\n");
    }

//Write a Java function that takes an ArrayList of integers as a parameter and moves the minimum value in the list to the front, while preserving the order of the elements. For example: [3,8,23,91,6,1] will turn to [1,3,8,23,91,6]
    public static void preservingOrder(ArrayList<Integer> age) {
        System.out.println("Number 3: " + "This is Exercise number 2 which is to take an ArrayList of integers as a parameter and moves the minimum value in the list to the front, while preserving the order of the elements. \n");
//         public static void MinimumValue(ArrayList<Integer> arraylistInput){
     //[2,8,6,8,9,12,1,45,15]
       int orderLength = age.size();
       int min=0;
       
       for (int count=0; count <orderLength; count++){
           if(age.get(count)< age.get(min)){
               min=count;
           }
       }
       age.add(0, age.remove(min));
       System.out.println("The Preserving Order while getting the minimum value: "+ age + "\n");
    }

//Write a Java function that compares 2 sets. Return a set containing the 2 sets’ common values.
    public static void compareSet() {
        System.out.println("Number 6: " + "This is Exercise number 6 which is you compare the 2 sets and return the set with common value. \n");
        Set<String> stringOfFriendsBoysBefore = new HashSet<String>();
        stringOfFriendsBoysBefore.add("Sernel");
        stringOfFriendsBoysBefore.add("John Dave");
        stringOfFriendsBoysBefore.add("Harvey");
        stringOfFriendsBoysBefore.add("Jerald");
        stringOfFriendsBoysBefore.add("Jeric");
        stringOfFriendsBoysBefore.add("Rehnan");
        stringOfFriendsBoysBefore.add("James Aldrin");
        stringOfFriendsBoysBefore.add("John Paul");
        stringOfFriendsBoysBefore.add("Daryll");

        Set<String> stringOfFriendsBoysAfter = new HashSet<String>();
        stringOfFriendsBoysAfter.add("Jeric");
        stringOfFriendsBoysAfter.add("Daryll");
        stringOfFriendsBoysAfter.add("Rehnan");
        stringOfFriendsBoysAfter.add("James Lloyd");
        stringOfFriendsBoysAfter.add("Dave Lyndrex");
        stringOfFriendsBoysAfter.add("Guian Victor");
        stringOfFriendsBoysAfter.add("Sernel");
        stringOfFriendsBoysAfter.add("John Dave");
        stringOfFriendsBoysAfter.add("James Aldrin");

        stringOfFriendsBoysBefore.retainAll(stringOfFriendsBoysAfter);
        System.out.println("Their Common Values are: ");
        System.out.println(stringOfFriendsBoysBefore + "\n");

    }

//Write a Java function that compares 2 sets and returns a set containing the values that are unique between the 2 sets.
    public static void uniqueValues() {
        System.out.println("Number 7: " + "This is Exercise number 7 which is you compare the 2 sets and return the set with unique value. \n");
        Set<Integer> setAge1 = new HashSet<Integer>();
        setAge1.add(21);
        setAge1.add(20);
        setAge1.add(18);
        setAge1.add(19);
        setAge1.add(23);
        setAge1.add(27);
        setAge1.add(28);
        setAge1.add(15);
        setAge1.add(14);
        setAge1.add(22);
        setAge1.add(17);
        setAge1.add(16);
        setAge1.add(9);
        Set<Integer> setAge2 = new HashSet<Integer>();
        setAge2.add(21);
        setAge2.add(20);
        setAge1.add(18);
        setAge1.add(19);
        setAge1.add(23);
        setAge1.add(27);
        setAge1.add(28);
        setAge2.add(13);
        setAge2.add(11);
        setAge2.add(26);
        setAge2.add(15);
        setAge2.add(25);
        setAge2.add(10);

        Set set3 = new HashSet(setAge1);
        set3.retainAll(setAge2);
        setAge1.removeAll(set3);
        setAge2.removeAll(set3);

        //make the hashset to integer
        int[] age1 = setAge1.stream().mapToInt(Integer::intValue).toArray();
        int[] age2 = setAge2.stream().mapToInt(Integer::intValue).toArray();

        //get first the length of an array then concatenate or merge 
        int getlengthage1 = age1.length;
        int getlengthage2 = age2.length;
        int[] result = new int[getlengthage1 + getlengthage2];
        System.arraycopy(age1, 0, result, 0, getlengthage1);
        System.arraycopy(age2, 0, result, getlengthage1, getlengthage2);
        System.out.println("This are the UNIQUE Values: \n" + Arrays.toString(result) + "\n");
    }

    //Write a Java function that counts the number of keys in a map that starts with “concordia”. E.g. {concordia1: “Value given”, acconcordia: “Test”, condensada: “Sweet”} - returns 1
    public static void numberOfKeys() {
        System.out.println("Number 8: " + "This is Exercise number 8 which is to countthe number of keys. \n");
        Map<String, String> keyCount = new HashMap<String, String>();
        keyCount.put("fname", "Rafael");
        keyCount.put("lname", "Cartagena");
        keyCount.put("name", "Cymon Azucenas");
        keyCount.put("age", "20");
        keyCount.put("names", "Baldwin");
        keyCount.put("name", "Paul Allester");
        keyCount.put("name", "Jester");
        keyCount.put("age", "23");

        int count = 0;
        for (String countKey : keyCount.keySet()) {
            if (countKey.startsWith("name")) {
                count++;
            }

        }
        System.out.println("The Number of keys that starts with name (is) are: ");
        System.out.println(count + "\n");
    }
}
