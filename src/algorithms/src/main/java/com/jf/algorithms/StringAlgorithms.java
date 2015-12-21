package com.jf.algorithms;

import java.util.LinkedList;

public final class StringAlgorithms {


    public static final class CountValidParenthesis {

        public static int count(String input) {

            LinkedList<Integer> queue = new LinkedList<Integer>();
            queue.push(-1);

            int result = 0;
            for(int i = 0; i < input.length(); i++) {

                if(input.charAt(i) == '(') {
                    queue.push(i);
                }
                else {

                    queue.pop();

                    if(!queue.isEmpty()) {
                        result = Math.max(result, i - queue.peek());
                    }
                    else {
                        queue.push(i);
                    }

                }
            }

            return result;
        }

    }

    public static final class BalancedParenthesis {

        public static boolean isBalanced(String input) {

            LinkedList<Character> queue = new LinkedList<Character>();

            for(int i = 0; i < input.length(); i++) {

                if(input.charAt(i) == '[' || input.charAt(i) == '{' || input.charAt(i) == '(') {
                    queue.push(input.charAt(i));
                }
                else if(input.charAt(i) == ']' || input.charAt(i) == '}' || input.charAt(i) == ')') {

                    if(queue.isEmpty()) { return false; }
                    else if(!isMatch(queue.pop(), input.charAt(i))) {  return false;  }
                }
            }

            return queue.isEmpty();
        }

        private static boolean isMatch(Character a, Character b) {

            if(a == '{' && b == '}') { return true; }
            if(a == '[' && b == ']') { return true; }
            if(a == '(' && b == ')') { return true; }

            return false;
        }

    }

}
