package Stack;

class stackNode {
    int min;
    int val;
    stackNode next;
}


class MinStack {

    stackNode head;
    stackNode tail;
    int size;

    public MinStack() {
        head = null;
        tail = null;
    }

    public void push(int val) {
        stackNode node = new stackNode();
        node.val = val;
        if (head == null) {
            node.min = val;
            head = node;
            tail = node;
        } else {
            int m = Math.min(tail.min, val);
            node.min = m;
            node.next = tail;
            tail = node;
        }
    }

    public void pop() {
        if (tail.next == null) {
            head = null;
            tail = null;
        } else {
            stackNode temp = tail.next;
            tail.next = null;
            tail = temp;
        }
    }

    public int top() {
        return tail.val;
    }

    public int getMin() {
        return tail.min;
    }

}


public class MinElementStack {
    public static void main(String[] args) {

    }
}
