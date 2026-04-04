class ArrayImplementationStack{
    static int top=-1;
    static int arr[]=new int[5];
    public static void push(int x) {
        if(top == arr.length - 1) {
            System.out.println("Stack Overflow");
        }
        else {
            top++;
            arr[top] = x;
        }
    }
    public static void pop() {
        if(top == -1) {
            System.out.println("Stack Underflow");
        }
        else {
            System.out.println("Deleted element: " + arr[top]);
            top--;
        }
    }

    public static void peek() {
        if(top == -1) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Top element: " + arr[top]);
        }
    }

    public static void display() {
        if(top == -1) {
            System.out.println("Stack is empty");
        }
        else {
            for(int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);

        display();

        pop();

        peek();

        display();
    }
}