package zuoshengalgorith;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Stack;

public class StackHeapOrder {
    public static void main(String[] args) {

    }

    public void stackHeapSolution(Stack<Integer> stack){
        Stack<Integer> help=new Stack<Integer>();
        while (!stack.isEmpty()){
            Integer cur=stack.pop();

            while (!help.isEmpty()&&help.peek()<cur){
                stack.push(help.pop());
            }
        }
    }
}
