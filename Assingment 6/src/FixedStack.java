public class FixedStack implements IntStack {
    private int stack[];
    private int top;

    public FixedStack(int len) {
        stack = new int[len];
        top = -1;
    }

    @Override
    public void push(int data) {
        if (top == stack.length - 1) {
            System.out.println("   Stack Overflow");
        } else {
            stack[++top] = data;
            System.out.println("   Data Added!");
        }
    }

    @Override
    public int pop() {
        if (top < 0) {
            System.out.println("   Stack Underflow");
            return 0;
        } else {
            return stack[top--];
        }
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }
}