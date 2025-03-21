class DoublyLinkedList {
    Node head;
    
    static class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; prev = next = null; }
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.display();
    }
}
