package collections.list;

import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {

        LinkedList<String> artists = new LinkedList<>();
        LinkedList<String> actors = new LinkedList<>();
        LinkedList<String> actresses = new LinkedList<>();

        //Let's learn methods of LinkedList

        //add methods:
            //1. add() method: This method adds element to collections.
        actors.add("Robert De Niro");
        actors.add("Morgan Freeman");
        actors.add("Denzel Washington");
        actors.add("Tom Hanks");
        System.out.println(actors); //[Robert De Niro,  Morgan Freeman, Denzel Washington, Tom Hanks]

        actresses.add("Jodie Foster");
        actresses.add("Julia Roberts");
        actresses.add("Angelina Jolie");
        actresses.add("Sandra Bullock");
        System.out.println(actresses); //[Jodie Foster, Julia Roberts, Angelina Jolie, Sandra Bullock]

            //2. add(int index, String element): This method adds element to specific index.
        actors.add(1, "Will Smith");
        System.out.println(actors); //[Robert De Niro, Will Smith, Morgan Freeman, Denzel Washington, Tom Hanks]
        actresses.add(2, "Nicole Kidman");
        System.out.println(actresses); //[Jodie Foster, Julia Roberts, Nicole Kidman, Angelina Jolie, Sandra Bullock]

            //3. addAll(Collection): This method adds first collections to second.
        System.out.println(artists); //[]
        artists.addAll(actors); // [Robert De Niro, Will Smith, Morgan Freeman, Denzel Washington, Tom Hanks]
        artists.addAll(actresses); //[Robert De Niro, Will Smith, Morgan Freeman, Denzel Washington, Tom Hanks, Jodie Foster, Julia Roberts, Nicole Kidman, Angelina Jolie, Sandra Bullock]
        System.out.println(artists); //[Robert De Niro, Will Smith, Morgan Freeman, Denzel Washington, Tom Hanks, Jodie Foster, Julia Roberts, Nicole Kidman, Angelina Jolie, Sandra Bullock]

        artists.clear();

            //4. addAll(int index, Collection): This method adds collection to specific index of second collection.
        artists.addAll(actors);
        artists.addAll(2, actresses);
        System.out.println(artists); //[Robert De Niro, Will Smith, Jodie Foster, Julia Roberts, Nicole Kidman, Angelina Jolie, Sandra Bullock, Morgan Freeman, Denzel Washington, Tom Hanks]

            //5. addFirst(E): This method adds the given object to first index.
        actors.addFirst("Antonio Banderas");
        System.out.println(actors); //[Antonio Banderas, Robert De Niro, Will Smith, Morgan Freeman, Denzel Washington, Tom Hanks]

            //6. addLast(E): This method adds given object to last index.
        actresses.addLast("Penelope Cruz");
        System.out.println(actresses); //[Jodie Foster, Julia Roberts, Nicole Kidman, Angelina Jolie, Sandra Bullock, Penelope Cruz]

        //remove methods:
            //1. remove(): This method removes the first element.
        actors.remove();
        System.out.println(actors); //[Robert De Niro, Will Smith, Morgan Freeman, Denzel Washington, Tom Hanks]

            //2. remove(int index): This method removes element in a specific index.
        actresses.remove(2);
        System.out.println(actresses); //[Jodie Foster, Julia Roberts, Angelina Jolie, Sandra Bullock, Penelope Cruz]

            //3. remove(Object o): This method removes the given object.
        actors.remove("Tom Hanks");
        System.out.println(actors); //[Robert De Niro, Will Smith, Morgan Freeman, Denzel Washington]

            //4. removeFirst(): This method removes the first element.
        actresses.removeFirst();
        System.out.println(actresses); //[Julia Roberts, Angelina Jolie, Sandra Bullock, Penelope Cruz]

            //5. removeLast(): This method removes the last element.
        actors.removeLast();
        System.out.println(actors); //[Robert De Niro, Will Smith, Morgan Freeman]

            //6. removeFirstOccurrence(Object): This method removes the first occurrence of the specified element.
        actresses.add("Angelina Jolie");  //[Julia Roberts, Angelina Jolie, Sandra Bullock, Penelope Cruz, Angelina Jolie]
        actresses.removeFirstOccurrence("Angelina Jolie");
        System.out.println(actresses);

            //7. removeLastOccurrence(Object): This method removes the last occurrence of the specified element.
        actors.add("Will Smith"); //[Robert De Niro, Will Smith, Morgan Freeman, Will Smith]
        actors.removeLastOccurrence("Will Smith");
        System.out.println(actors); //[Robert De Niro, Will Smith, Morgan Freeman]

        //clear(): This method removes all elements from this list.
        actresses.clear();

    }
}