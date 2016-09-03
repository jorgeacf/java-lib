package com.jf.algorithms.string;

public final class EditDistance {

    public static int find(String firstInput, String secondInput) {
        return find_implementation_2(firstInput, secondInput, firstInput.length(), secondInput.length());
    }

    private static int find_implementation_1(String firstInput, String secondInput, int firstInputSize, int secondInputSize) {
        if(firstInputSize == 0) { return secondInputSize; }
        if(secondInputSize == 0) { return firstInputSize; }

        if(firstInput.charAt(firstInputSize-1) == secondInput.charAt(secondInputSize-1)) {
            return find_implementation_1(firstInput, secondInput, firstInputSize-1, secondInputSize-1);
        }

        return 1 + min(
                find_implementation_1(firstInput, secondInput, firstInputSize, secondInputSize-1),
                find_implementation_1(firstInput, secondInput, firstInputSize-1, secondInputSize),
                find_implementation_1(firstInput, secondInput, firstInputSize-1, secondInputSize-1)
        );
    }

    private static int find_implementation_2(String firstInput, String secondInput, int firstInputSize, int secondInputSize) {
        Integer[][] dp = new Integer[firstInputSize+1][secondInputSize+2];
        for(int i = 0; i <= firstInputSize; i++) {
            for(int j = 0; j <= secondInputSize; j++) {
                if(i==0) {
                 dp[i][j] = j;
                }
                else if(j==0) {
                 dp[i][j] = i;
                }
                else if(firstInput.charAt(i-1) == secondInput.charAt(j-1)) {
                 dp[i][j] = dp[i-1][j-1];
                }
                else {
                 dp[i][j] = 1 + min(
                         dp[i][j-1],
                         dp[i-1][j],
                         dp[i-1][j-1]
                    );
                }
            }
        }
        return dp[firstInputSize][secondInputSize];
    }

    private static int min(int first, int second, int third) {
        return Math.min(first, Math.min(second, third));
    }

}
