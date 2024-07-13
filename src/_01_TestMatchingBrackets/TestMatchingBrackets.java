package _01_TestMatchingBrackets;

import java.util.Stack;

public class TestMatchingBrackets {
    /*
     * Use a Stack to complete the method for checking if every opening bracket
     * has a matching closing bracket
     */
    public static boolean doBracketsMatch(String b) {
    	
    	
    	
    	
Stack<Character> stack = new Stack<Character>();

for (int i = 0; i < b.length(); i++) {
	stack.push(b.charAt(i));
}
if(b.charAt(0) == '{' && stack.size()%2 == 0 && stack.pop() == '}') {
	return true;
}

        return false;
    }
}