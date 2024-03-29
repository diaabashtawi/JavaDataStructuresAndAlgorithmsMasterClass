package doublyLinkedList;

/**
 * Created By Deya Bakheet
 * Date : 3/29/2024
 * Time : 11:26 PM
 */
public class MainDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.createDoublyLinkedList(1);
        doublyLinkedList.insertDoublyLinkedList(2,0);
        doublyLinkedList.insertDoublyLinkedList(3,1);
        doublyLinkedList.insertDoublyLinkedList(4,7);
        doublyLinkedList.traverseDoublyLinkedList();
    }
}
