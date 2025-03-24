class ReverseLinkedList {
    Node head;
    
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    void reverse() {
        Node prev = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}
