public class GrowableStack implements IntStack {
    private int stack[];
    private int top;

    public GrowableStack(int len) {
        stack = new int[len];
        top = -1;
    }

    @Override
    public void push(int data) {
        if (top == stack.length - 1) {
            int temp[] = new int[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
        }
        stack[++top] = data;
        System.out.println("   Data Added!");
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