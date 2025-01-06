package linkedlist;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();

        myList.addFirst(10);
        myList.addFirst(20);
        myList.addFirst(30);

        System.out.println("Danh sach ban dau la: " + myList.toString());

        myList.addLast(40);
        myList.addLast(50);
        System.out.println("Danh sach sau khi them vao cuoi la: " + myList.toString());

        myList.add(2, 25);
        System.out.println("Danh sach sau khi them 25 vao vi tri 2: " + myList.toString());

        myList.removeFirst();
        System.out.println("Danh sach sau khi xoa phan tu dau: " + myList.toString());

        myList.removeLast();
        System.out.println("Danh sach sau khi xoa phan tu cuoi: " + myList.toString());

        myList.remove(2);
        System.out.println("Danh sach sau khi xoa phan tu o vi tri 2: " + myList.toString());

        Integer firstElement = myList.getFirst();
        System.out.println("Phan tu dau tien trong danh sach: " + firstElement);

        Integer lastElement = myList.getLast();
        System.out.println("Phan tu cuoi cung trong danh sach: " + lastElement);

        Integer elementAtIndex = myList.get(1);
        System.out.println("Phan tu o vi tri 1 trong danh sach: " + elementAtIndex);

        myList.set(1, 15);
        System.out.println("Danh sach sau khi thay the phan tu tai vi tri 1 thanh 15: " + myList.toString());

        Integer indexOfElement = myList.indexOf(20);
        System.out.println("Vi tri index cua phan tu co gia tri 20 la: " + indexOfElement);

        Integer lastIndexOfElement = myList.lastIndexOf(25);
        System.out.println("Vi tri index cuoi cung cua phan tu co gia tri 25 la: " + lastIndexOfElement);
    }
}
