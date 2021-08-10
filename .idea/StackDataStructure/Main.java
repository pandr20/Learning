package StackDataStructure;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        // stack = LIFO data structure. Last-In First-Out
        //         stores objects into a sort of "vertical tower"
        //         push() to add to the top
        //         pop() to remove from the top

        // uses of stacks?
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

        Stack<String> stack = new Stack<String>();



        stack.push("Minecraft");
        stack.push("COD");
        stack.push("Battlefield");
        stack.push("Apex Legends");

        String myFaveGame = stack.pop();


        System.out.println(stack.empty());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search("Minecraft"));
        System.out.println(myFaveGame);
    }
}
