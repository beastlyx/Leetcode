
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ["MinStack","push","push","push","push","getMin","pop","getMin","pop","getMin","pop","getMin"]
//        [[],[2],[0],[3],[0],[],[],[],[],[],[],[]]

        MinStack stack = new MinStack();
        stack.push(2);
        stack.push(0);
        stack.push(3);
        stack.push(0);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
    }
    
public static class MinStack {
    private List<Integer> list;
    private List<Integer> minList;
    private int minimum;
    
    public MinStack() {
        this.list = new ArrayList<>();
        this.minList = new ArrayList<>();
        this.minimum = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        this.minimum = Math.min(this.minimum, val);
        this.list.add(val);
        this.minList.add(this.minimum);
    }
    
    public void pop() {
        this.list.remove(this.list.get(this.list.size() - 1));
        this.minList.remove(this.list.get(this.list.size() - 1));
    }
    
    public int top() {
        return this.list.get(this.list.size() - 1);
    }
    
    public int getMin() {
        return this.minList.get(this.minList.size() - 1);
    }
}
}
