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

    public static final class Polimorphic {

        public static boolean isPolimorphic(String a, String b) {

            if(a.length() != b.length()) { return false; }

            char[] map = new char['z'-'a'];

            for(int i = 0; i < a.length(); i++) {

                int index = a.charAt(i) - 'a';

                if(map[index] == 0) { map[index] = b.charAt(i); }
                else if(map[index] != b.charAt(i)) { return false; }
            }
            return true;
        }

    }

}
