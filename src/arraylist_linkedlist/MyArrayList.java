package arraylist_linkedlist;

public class MyArrayList {
    private int capacity;

    private int[] array;

    private int size;

    private int[] emptyArray = {};

    public int size() {
        return size;
    }

    public MyArrayList() {
        array = emptyArray;
    }
}
