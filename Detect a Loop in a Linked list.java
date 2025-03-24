import java.util.HashSet;

class DetectLoop {
    Node head;
    
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    boolean hasLoop() {
        HashSet<Node> nodes = new HashSet<>();
        Node temp = head;
        while (temp != null) {
            if (nodes.contains(temp)) return true;
            nodes.add(temp);
            temp = temp.next;
        }
        return false;
    }
}
