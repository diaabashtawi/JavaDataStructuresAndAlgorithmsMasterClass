package linkedList;

public class SingleLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert Method SingleLinkedList
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSingleLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
        }
    }

    // Single Linked List Traversal
    public void traverseSingleLinkedList(){
        if (head == null){
            System.out.println("Single Linked List dose not exit");
        }else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.println(tempNode.value);
                if (i != size -1){
                    System.out.println("-->");
                }
                tempNode =tempNode.next;
            }
        }
        System.out.println("\n");
    }

    // Search for a node
    public boolean searchNode(int nodeValue){
        if (head != null){
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue){
                    System.out.println("Found the node at location : " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node NOT FOUND");
        return false;
    }

    // Deletion a node from Single Linked List
    public void deletionOfNode(int location){
        if (head == null) {
            System.out.println("The Single Linked List dose not exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0){
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head){
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // Delete Entire Single Linked List
    public void deleteAllSingleLinkedList(){
        head = null;
        tail = null;
        System.out.println("The Single Linked List Deleted successfully");
    }

}
