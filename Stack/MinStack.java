package Stack;

public class MinStack {
    int n;
    int[] stack;
    boolean isEmpty;

    public MinStack() {
        n = 0;
        stack = new int[100];
        isEmpty = true;
    }

    public void push(int val) {

        if (n == stack.length) {
            grow();
        }
        stack[n] = val;
        n++;
        isEmpty = false;
    }

    public void pop() {
        if (n > 0) {
            n--;
        } else {
            isEmpty = true;
        }
    }

    public void grow() {
        int newSize = stack.length * 2;
        int[] newStack = new int[newSize];
        for (int i = 0; i < n; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
    }

    public int top() {
        if (isEmpty) {
            throw new IllegalStateException("A pilha está vazia. Não é possível acessar o topo.");
        }
        return stack[n - 1];
    }

    public void printStack() {
        for (int i = 0; i < n; i++) {
            System.out.println(stack[i] + " ");
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(2);
        minStack.push(7);
        minStack.pop();
        System.out.println(minStack.top());
        minStack.printStack();
    }
}
