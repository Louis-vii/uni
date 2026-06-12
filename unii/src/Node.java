
public class Node {
    int num;
     Node head;
    Node tail;
    Node next;
    Node prev;
      public  Node(){

      }
    public Node(int num) {
        this.num = num;
    }

    public  void InsertAtTheEnd(int num) {
        Node node = new Node(num);
        if (head == null) {
            tail = node;
            head = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

    }

    public  void InsertAtTheMiddle(int num) {
        Node node = new Node(num);
        if (head == null) {
            System.out.println("list is empty");
        } else if (node.num <= head.num) {
            node.next = head;
            head = node;
        } else {
            Node ptr;
            for(ptr = head; ptr.next != null && ptr.next.num < node.num; ptr = ptr.next)


            node.next = ptr.next;
            ptr.next = node;
            if (node.next == null) {
                tail = node;
            }

        }
    }

    public  void InsertAtTheBegin(int num) {
        Node node = new Node(num);
        if (head == null) {
            tail = node;
            head = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }

    }

    public  void sort() {
        if (head != null && head.next != null) {
            for(Node p1 = head; p1.next != null; p1 = p1.next) {
                for(Node p2 = p1.next; p2 != null; p2 = p2.next) {
                    if (p1.num > p2.num) {
                        int temp = p1.num;
                        p1.num = p2.num;
                        p2.num = temp;
                    }
                }
            }

        }
    }

    public  void delete(int num) {
        Node ptr;
        for(ptr = head; ptr != null && ptr.next != null && ptr.next.num != num; ptr = ptr.next)


        ptr.next = ptr.next.next;
    }

    public  void pr() {
        for(Node ptr = head; ptr != null; ptr = ptr.next) {
            System.out.println(ptr.num);
        }

    }

    public  void prba() {
        for(Node ptr = tail; ptr != null; ptr = ptr.prev) {
            System.out.println(ptr.num);
        }

    }
}
