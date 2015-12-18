package com.jf.algorithms;

public class App {

    public static void main(String[] args) {


        String input = "jorge";

        String output = reverse(input);

        String expectedResult = "egroj";

        System.out.println(output.equals(expectedResult));

        //runListExample();

    }

    private static String reverse(String input) {

        System.out.println(input);
        if(input.equals("")) {
            return input;
        }
        else {
            String firstHalf = input.substring(0, 1);
            String secondHalf = input.substring(1, input.length());
            return reverse(secondHalf) + firstHalf;
        }

    }


    private static void runListExample() {
        Node first = new Node(1);

        Node second = new Node(2);
        first.next = second;

        Node third = new Node(3);
        second.next = third;

        Node fourth = new Node(4);
        third.next = fourth;

        Node fifth = new Node(5);
        fourth.next = fifth;

        System.out.println(find(first, 1));
    }

    private static int find(Node node, int value) {
        int index = 0;
        return find(node, value, index);
    }

    private static int find(Node node, int value, int index) {

        if(node == null) { return -1; }

        if(node.value == value) { return index; }

        return find(node.next, value, index + 1);

    }


    public static class Node {

        public int value;
        public Node next;

        public Node(int value) { this.value = value; }
    }

}
