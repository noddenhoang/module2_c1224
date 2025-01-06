package arraylist;

public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println("Danh sach ban dau: " + list.toString());

        list.add(3, 100);
        System.out.println("Danh sach sau khi them phan tu 100 vao vi tri 3: " + list.toString());

        int elementAtIndex = list.get(3);
        System.out.println("Phan tu tai vi tri thu 3 la: " + elementAtIndex);

        int elementToFind = 100;
        int indexOfElement = list.indexOf(elementToFind);
        if (indexOfElement != -1) {
            System.out.println("Vi tri i cua phan tu " + elementToFind + " la: " + indexOfElement);
        } else {
            System.out.println("Khong ton tai  " + elementToFind + " trong list.");
        }

        int lastIndexOfElement = list.lastIndexOf(elementToFind);
        if (lastIndexOfElement != -1) {
            System.out.println("Vi tri index cuoi cung cua " + elementToFind + " la: " + lastIndexOfElement);
        } else {
            System.out.println("Khong ton tai  " + elementToFind + " trong list.");
        }

        list.remove(3);
        System.out.println("Danh sach sau khi xoa phan tu tai vi tri 3: " + list.toString());

        list.removeElement(100);
        System.out.println("Danh sach sau khi xoa phan tu 100: " + list.toString());
    }
}
