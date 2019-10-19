package zuoshengalgorith;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class StackHeapOrder {
    public static void main(String[] args) {
        StackHeapOrder st = new StackHeapOrder();
        Stack<Integer> stackNumber = new Stack<Integer>();
        stackNumber.add(1);
        stackNumber.add(8);
        stackNumber.add(7);
        stackNumber.add(5);
        stackNumber.add(3);
        st.stackHeapSolution(stackNumber);
        System.out.println("测试map的遍历方式");
        Map<Integer,Integer> maptest=new HashMap<Integer, Integer>();
        maptest.put(1, 4 );
        maptest.put(2 , 5 );
        maptest.put(3 , 6 );
        st.mapTest(maptest);
    }

    /**
     * @Description: 利用两个栈实现排序
     * @Param: [stack]
     * @return: void
     * @Author: Mr.Jiang
     * @Date: 2019/10/19
     */
    public void stackHeapSolution(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<Integer>();
        while (!stack.isEmpty()) {
            Integer cur = stack.pop();

            while (!help.isEmpty() && help.peek() < cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
        System.out.println("集合的遍历方式---------");
        for (Integer x : stack) {
            System.out.println(x);
        }
        System.out.println("栈弹出的遍历方式");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    /**
    * @Description: 测试集合map的遍历方式
    * @Param: [map]
    * @return: void
    * @Author: Mr.Jiang
    * @Date: 2019/10/19
    */
    public void mapTest(Map<Integer, Integer> map) {
        System.out.println("利用最简洁、最通用的遍历方式");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
        //Java5之前的比较简洁的便利方式1
        System.out.println("----1----");
        for (Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<Integer, Integer> entry = it.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        //Java5之前的比较简洁的便利方式2
        System.out.println("----2----" );
        for (Iterator<Integer> it = map.keySet().iterator(); it.hasNext();) {
            Integer key = it.next();
            System.out.println(key + " = " + map.get(key));
        }

    }
}
