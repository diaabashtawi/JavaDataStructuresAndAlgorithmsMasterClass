package doublyLinkedList;

/**
 * Created By Deya Bakheet
 * Date : 3/29/2024
 * Time : 11:29 PM
 */
public class DoublyLinkedList {

    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createDoublyLinkedList(int nodeValue) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.previous = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    public void insertDoublyLinkedList(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createDoublyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.previous = null;
            head.previous = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.previous = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.previous = newNode;
        }
        size++;
    }

    public void traverseDoublyLinkedList() {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The Doubly Linked List dose NOT exist!");
        }
        System.out.println("\n");
    }

    public void reverseTraverseDoublyLinkedList() {
        if (head != null) {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size) {
                    System.out.print("<-");
                }
                tempNode = tempNode.previous;
            }
        } else {
            System.out.println("The Doubly Linked List dose NOT exist!");
        }
        System.out.println("\n");
    }

    public boolean searchNode(int nodeValue) {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("The Node is found at location : " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node NOT found!");
        return false;
    }

    public void deleteNodeDoublyLinkedList(int location) {
        if (head == null) {
            System.out.println("The Doubly Linked List dose NOT exist!");
        } else if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
            } else {
                head = head.next;
                head.previous = null;
                size--;
            }
        } else if (location >= size) {
            DoublyNode tempNode = tail.previous;
            if (size == 1) {
                head = null;
                tail = null;
                size--;
            } else {
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.previous = tempNode;
            size--;
        }
    }

    public void deleteDoublyLinkedList(){
        DoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.previous = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The Doubly Linked List has been Deleted!");
    }

}
