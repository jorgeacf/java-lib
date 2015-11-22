package com.jorgefigueiredo.algorithms;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String input = "ABC";

        StringAlgorithms.Permutations.permute(input.toCharArray(), 0 , input.length()-1);

    }
}
