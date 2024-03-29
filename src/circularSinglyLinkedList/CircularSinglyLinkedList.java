package circularSinglyLinkedList;

/**
 * Created By Deya Bakheet
 * Date : 3/29/2024
 * Time : 10:34 PM
 */
public class CircularSinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createCircularSingleLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertCircularSingleLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCircularSingleLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    public void traverseCircularSingleLinkedList() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        } else {
            System.out.println("\nCircular Single Linked List dose not exist");
        }
    }

    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Node Found at location : " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node NOT Found!");
        return false;
    }

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The Circular Single Linked List dose NOT exist");
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                tail = null;
                head.next = null;
                head = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head.next = null;
                tail = head = null;
                size--;
            }
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteCircularSingleLinkedList(){
        if (head == null){
            System.out.println("The Circular Single Linked List dose NOT exist");
        }else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The Circular Single Linked List has been Deleted");
        }
    }
}
