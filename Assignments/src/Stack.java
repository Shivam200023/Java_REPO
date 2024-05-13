public class Stack {
  private int maxSize;
  private int[] stackArray;
  private int top;

  public Stack(int size) {
      maxSize = size;
      stackArray = new int[maxSize];
      top = -1;
  }

  public void push(int value) {
      if (isFull()) {
          System.out.println("Stack is full. Cannot push element.");
          return;
      }
      top++;
      stackArray[top] = value;
  }

  public int pop() {
      if (isEmpty()) {
          System.out.println("Stack is empty. Cannot pop element.");
          return -1;
      }
      int poppedValue = stackArray[top];
      top--;
      return poppedValue;
  }

  public int peek() {
      if (isEmpty()) {
          System.out.println("Stack is empty. Cannot peek element.");
          return -1;
      }
      return stackArray[top];
  }

  public boolean isEmpty() {
      return top == -1;
  }

  public boolean isFull() {
      return top == maxSize - 1;
  }

  public static void main(String[] args) {
      Stack stack = new Stack(5);
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      stack.push(5);
      
      System.out.println("Stack peek: " + stack.peek());
      System.out.println("Stack pop: " + stack.pop());
      System.out.println("Stack peek after pop: " + stack.peek());
  }
}