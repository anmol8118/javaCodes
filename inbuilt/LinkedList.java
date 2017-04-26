import java.util.*;

// Doubly LinkedList is created. Implements List and Deque
class Linkedlist
{
    public static void main(String[] args)
    {
        // constructor
        LinkedList l = new LinkedList();    // LinkedList<String> l = new LinkedList<String>();

        // copy constructor
        LinkedList ll = new LinkedList(l);    // creates a list containing elements of collection 
                                              // in the order they are returned by Collection's iterator

        // Copy Constructor
        Collection col1 = new LinkedList(ll);
        System.out.println("Copy Constructor " + col1);

        // add(element) - returns boolean
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        System.out.println("Element added " + l.add("e"));
        System.out.println("List 1 " + l);

        // add(index, element) - returns void
        // if index is out of bounds throws IndexOutOfBoundsException
        l.add(0,"0");    // add at specified position
        l.add(1,"1");
        System.out.println("Element added at index " + l);

        // addFirst(element) - returns void
        l.addFirst("f");    // add at first position

        // addLast(element) - returns void
        l.addLast("l");    // add at last position
        System.out.println("Elements added at first and last " + l);

        // addAll(Collection c) - returns boolean
        // throws NullPointerException is collection is empty
        Collection col2 = new ArrayList();
        col2.add("arr");
        col2.add(1);
        l.addAll(col2);    // add a list at back
        System.out.println("Collection added " + l);

        // addAll(Collection c) - returns boolean
        LinkedList col3 = new LinkedList();
        col3.add("A");
        col3.add("B");
        col3.add("C");
        col3.add("D");
        l.addAll(col3);
        System.out.println("Collection added " + l);

        // addAll(index, collection) - returns boolean
        // throws IndexOutOfBoundsException and NUllPointerException
        ArrayList col4 = new ArrayList();
        col4.add("arr");
        col4.add(2);
        l.addAll(0, col4);    // add a list at a particular index
        System.out.println("Collection added at index " + l);

        // clear() - returns void
        col2.clear();    // removes all the elements
        System.out.println("Clear " + col2);

        // clone() - returns Object
        // returns a shallow copy. new list is not affected by the old list once created
        Collection col5 = new LinkedList();
        col5 = (LinkedList) col3.clone();    // make a clone a list col3
        System.out.println("Clone " + col5);

        // contains(element) - returns boolean
        System.out.println("Contains " + col3.contains("A"));

        // descendingIterator() - returns Iterator<E>
        Iterator x = col3.descendingIterator();
        System.out.print("Descending Iterator ");
        while(x.hasNext())
            System.out.print(x.next() + " ");
        System.out.println();

        // element() - returns Object of Element
        // displays the element at the head of list and doesnot remove it
        // throws NoSuchElementException if list is empty
        System.out.println("Element " + col3.element());

        // get(index) - returns Object of element where index starts from 0
        // throws IndexOutOfBoundsException
        System.out.println("Get " + col3.get(1));    // returns the element at given index

        // getFirst() - returns object of element
        // throws NoSuchElementException is list is empty
        System.out.println("Get First " + col3.getFirst());    // returns the first element

        // getLast() - returns object of element
        // throws NoSuchElement if list is empty
        System.out.println("Get Last " + col3.getLast());    // returns the element at last position

        // indexOf(element) - returns int
        System.out.println("Index Of " + l.indexOf("arr"));    // returns the index of first occurence of element if found else -1

        // lastIndexOf(element) - returns int
        System.out.println("Last Index Of " + l.lastIndexOf("arr"));    // returns the last index of element if found else -1

        // listIterator(index) - returns iterator starting from index Iterator<E>
        // If the list is altered(not using the iterator) after the iterator is created 
        // then it will throw an exception ConcurrenytModificationException
        // throws IndexOutOfBoundsException 
        Iterator itr = col3.listIterator(2);
        System.out.print("List Iterator ");
        while(itr.hasNext())
            System.out.print(itr.next() + " ");
        System.out.println();
        
        // offer(element) - returns boolean
        System.out.println("Offer added " + col3.offer("F"));    // adds the element at the end of list
        System.out.println("Offer " + col3);

        // offerFirst(element) - returns boolean
        col3.offerFirst("0");    // adds the element at the first position

        // offerLast(element) - returns boolean
        col3.offerLast("G");
        System.out.println("Offer First and Last " + col3);

        // peek() - returns Object of element
        // retrieves but not removes the head of list
        System.out.println("Peek " + col3);    // returns null if list is empty

        // peekFirst() - returns object of element
        // same as peek()
        System.out.println("Peek First " + col2.peekFirst());    // returns null if list is empty

        // peekLast() - returns object of element
        // returns the tail of the list
        System.out.println("Peek Last " + col3.peekLast());    // returns null if list is empty

        // poll() - returns object of element
        // retrieves and removes the head of list
        System.out.println("Poll " + col4.poll());    // returns null if list is empty

        // pollFirst() - returns object of element
        // retriwvws and removes the head of list
        System.out.println("Poll First" + col4.poll());    // returns null is list is empty

        // pollLast() - returns object of element
        // retrieves and removes the last element of the list
        System.out.println("Poll Last " + col4.pollLast());    // returns null if list is empty

        // pop() - returns object of element
        // removes the first element of the list
        // throws NoSuchElementException is list is empty
        System.out.println("Pop " + col4.pop());

        // push(element) - returns void
        // adds the element at the head of the list
        col4.push("A");

        // remove() - returns object of element
        // retrieves and removes the first element of the list
        // throws NoSuchElementException if list is empty
        System.out.println("Remove " + col4.remove());

        // remove(index) - returns object of element
        // throws IndexOutOfBoundsException
        col3.remove(2);    // removes the element at index
        System.out.println("Remove index " + col3);
        col3.add(2,"C");

        // remove(element) - returns boolean
        col3.remove("B");
        System.out.println("Remove element " + col3);
        col3.add(1,"B");

        // removeFirst() - returns object of element
        col3.removeFirst();    // remove and returns the first element
        System.out.println("Remove First " + col3);
        col3.add(0,"A");

        // removeLast() - returns object of element
        col3.removeLast();    // remove and return the last element
        System.out.println("Remove Last " + col3);
        col3.add(3,"D");

        // removeFirstOccurence(Object o) - returns boolean
        // removes the first occurence of object o
        col3.removeFirstOccurence("D");
        System.out.println("Remove First occurenece " + col3);

        // removeLastOccurence(Object o) - returns boolean
        // removes last occurence of object o
        System.out.println("Remove Last Occurence " + col3.removeLastOccurence("F"));

        // set(index, element) - returns old element
        // throws IndexOutOfBoundsException
        col3.set(3, "E");
        System.out.println("Set " + col3);
        col3.set(3, "D");

        // size() - returns int
        System.out.println("Size " + col3.size());    // returns the number of elements

        // toArray() - returns array of Object
        Object[] s = new Object[col3.size()];
        s = col3.toArray();
        System.out.print("To array ");
        //Object[] s = col3.toArray();
        for(int i = 0; i < col3.size(); i++)
            System.out.print(s[i] + " ");
        System.out.println();

        // toArray(variable) - returns array of datatype specified by the variable
        Object[] s2 = new Object[col3.size()];
        s2 = col3.toArray(s2);
        //Object[] s = col3.toArray(s2);
        for(int i = 0; i < col3.size(); i++)
            System.out.print(s2[i] + " ");
        System.out.println();
    }
}
