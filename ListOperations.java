package lab1;
import java.util.*;

public class ListOperations {

    // 1. Adding elements
    public static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("After adding elements: " + list);
    }

    // 2. Adding element at specific index
    public static void addAtIndex(List<String> list) {
        list.add(1, "Mango");
        System.out.println("After adding at index 1: " + list);
    }

    // 3. Adding multiple elements
    public static void addMultiple(List<String> list) {
        List<String> extra = Arrays.asList("Grapes", "Pineapple");
        list.addAll(extra);
        System.out.println("After adding multiple elements: " + list);
    }

    // 4. Accessing elements
    public static void accessElements(List<String> list) {
        System.out.println("Element at index 2: " + list.get(2));
    }

    // 5. Updating elements
    public static void updateElements(List<String> list) {
        list.set(0, "Cherry");
        System.out.println("After updating: " + list);
    }

    // 6. Removing elements
    public static void removeElements(List<String> list) {
        list.remove("Banana");
        list.remove(2);
        System.out.println("After removing: " + list);
    }

    // 7. Searching elements
    public static void searchElements(List<String> list) {
        System.out.println("Contains Apple? " + list.contains("Apple"));
        System.out.println("Index of Orange: " + list.indexOf("Orange"));
    }

    // 8. List size
    public static void listSize(List<String> list) {
        System.out.println("List size: " + list.size());
    }

    // 9. Iterating over list
    public static void iterateList(List<String> list) {
        System.out.println("Using for-each loop:");
        for (String item : list) {
            System.out.println(item);
        }
    }

    // 10. Using Iterator
    public static void useIterator(List<String> list) {
        System.out.println("Using Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // 11. Sorting
    public static void sortList(List<String> list) {
        Collections.sort(list);
        System.out.println("After sorting: " + list);
    }

    // 12. Sublist
    public static void subList(List<String> list) {
        if (list.size() >= 3) {
            List<String> sub = list.subList(0, 3);
            System.out.println("Sublist (0 to 3): " + sub);
        }
    }

    // 13. Clearing the list
    public static void clearList(List<String> list) {
        list.clear();
        System.out.println("After clearing: " + list);
    }

    public static void main(String[] args) {

        System.out.println("===== ARRAYLIST OPERATIONS =====");
        List<String> arrayList = new ArrayList<>();

        addElements(arrayList);
        addAtIndex(arrayList);
        addMultiple(arrayList);
        accessElements(arrayList);
        updateElements(arrayList);
        removeElements(arrayList);
        searchElements(arrayList);
        listSize(arrayList);
        iterateList(arrayList);
        useIterator(arrayList);
        sortList(arrayList);
        subList(arrayList);
        clearList(arrayList);

        System.out.println("\n===== LINKEDLIST OPERATIONS =====");
        List<String> linkedList = new LinkedList<>();

        addElements(linkedList);
        addAtIndex(linkedList);
        addMultiple(linkedList);
        accessElements(linkedList);
        updateElements(linkedList);
        removeElements(linkedList);
        searchElements(linkedList);
        listSize(linkedList);
        iterateList(linkedList);
        useIterator(linkedList);
        sortList(linkedList);
        subList(linkedList);
        clearList(linkedList);
    }
}