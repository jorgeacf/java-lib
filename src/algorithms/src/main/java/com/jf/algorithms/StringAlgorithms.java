package com.jf.algorithms;

import java.util.Arrays;
import java.util.LinkedList;

public final class StringAlgorithms {


    public static final class Permutations {

        public static void permute(char[] input, int l, int r) {

            System.out.println(String.format("[DEBUG] %s %d %d", new String(input), l, r));

            int i;
            if(l == r) {
                System.out.println(input);
            }
            else {

                for(i = l; i <= r; i++) {
                    swap(input, l, i);
                    permute(input, l + 1, r);
                    swap(input, l, i);
                }
            }
        }

        private static void swap(char[] input, int a, int b) {

            char temp = input[a];
            input[a] = input[b];
            input[b] = temp;

        }

    }

    public static final class Reverse {

        public static String reverse_iterative(String input) {

            char[] array = input.toCharArray();

            for(int i = 0; i < input.length()/2; i++) {

                char temp = array[i];
                array[i] = array[input.length()-1-i];
                array[input.length()-1-i] = temp;
            }

            return new String(array);
        }

        public static String reverse_recursive(String input) {

            if (input != null && input.length() == 0) {
                return "";
            }

            return reverse_recursive(input.substring(1, input.length())) + input.substring(0, 1);
        }
    }

    public static final class ReverseNonSpecialCharacters {

        public static String reverse(String input) {

            char[] characters = input.toCharArray();

            int len = input.length();
            int pointer = len-1;

            for(int i = 0; i < len / 2; i++) {

                while (!isLetter(characters[pointer])) { pointer--; }

                if(isLetter(characters[i])) {
                    swap(characters, i, pointer);
                    pointer--;
                }

            }

            return new String(characters);
        }

        private static boolean isLetter(char character) {
            return (character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z');
        }

        private static void swap(char[] input, int a, int b) {
            char temp = input[a];
            input[a] = input[b];
            input[b] = temp;
        }
    }

    public static final class RemoveCharacter {

        public static String remove(char[] input, char character) {

            int len = input.length;
            int newLen = 0;

            for(int i = 0; i < len; i++) {

                if(input[i] != character) {
                    swap(input, newLen, i);
                    newLen++;
                }
            }
            return new String(Arrays.copyOfRange(input, 0, newLen));
        }

        private static void swap(char[] input, int a, int b) {
            char temp = input[a];
            input[a] = input[b];
            input[b] = temp;
        }
    }

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
