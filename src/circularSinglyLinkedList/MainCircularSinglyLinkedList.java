package circularSinglyLinkedList;

/**
 * Created By Deya Bakheet
 * Date : 3/29/2024
 * Time : 10:33 PM
 */
public class MainCircularSinglyLinkedList {
    public static void main(String[] args) {
        CircularSinglyLinkedList circularSinglyLinkedList =
                new CircularSinglyLinkedList();
        circularSinglyLinkedList.createCircularSingleLinkedList(5);
        circularSinglyLinkedList.insertCircularSingleLinkedList(12,3);
        circularSinglyLinkedList.insertCircularSingleLinkedList(14,1);
        circularSinglyLinkedList.insertCircularSingleLinkedList(32,8);
        circularSinglyLinkedList.insertCircularSingleLinkedList(66,4);
        circularSinglyLinkedList.traverseCircularSingleLinkedList();
    }
}
