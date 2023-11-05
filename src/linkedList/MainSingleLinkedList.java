package linkedList;

public class MainSingleLinkedList {

    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.createSingleLinkedList(5);
//        System.out.println(linkedList.head.value);
        linkedList.insertInLinkedList(6, 1);
        linkedList.insertInLinkedList(7, 3);
        linkedList.insertInLinkedList(8, 4);
        linkedList.insertInLinkedList(9, 5);
        linkedList.traverseSingleLinkedList();

    }
}
