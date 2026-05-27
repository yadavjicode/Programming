package linklist;

public class CreateLinklist {

    public static void main(String[] args) {
        Node node = new Node(10);
        node.next = new Node(20);
        node.next.next = new Node(30);

        // start traverse on linklist
        // ==========================================================>
        Node temp = node;
        while (temp != null) {
            System.out.println(temp + "--" + temp.data);
            temp = temp.next;
        }
        // end traverse on linklist
        // ==========================================================>

        // start length of linklist
        // ==========================================================>
        int lengthLinklist = 0;
        Node temp2 = node;
        while (temp2 != null) {
            temp2 = temp2.next;
            lengthLinklist = lengthLinklist + 1;
        }
        System.out.println("length of linklist-->" + lengthLinklist);

        // end length of linklist
        // ==========================================================>

        // start add a node from last position of linklist
        // ==========================================================>

        Node temp3 = node;
        while (temp3 != null) {
            temp3 = temp3.next;
        }

        temp3.next = new Node(100);

        Node temp4 = node;
        while (temp4 != null) {
            System.out.println(temp4 + "--" + temp4.data);
            temp4 = temp4.next;
        }

        // end add a node from last position of linklist
        // ==========================================================>

    }

}

class Node {
    int data;
    Node next;

    Node(int newdata) {
        this.data = newdata;
        this.next = null;
    }
}
