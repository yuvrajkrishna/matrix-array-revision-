public class minimumpathsum {

    public static void main(String[] args) {

        int arr[][] = {
            {1, 0, 1},
            {2, 4, 3},
            {1, 4, 1}
        };

        int dp[][] = new int[arr.length][arr[0].length];

        // Starting point
        dp[0][0] = arr[0][0];

        // First row
        for (int i = 1; i < arr[0].length; i++) {
            dp[0][i] = dp[0][i - 1] + arr[0][i];
        }

        // First column
        for (int i = 1; i < arr.length; i++) {
            dp[i][0] = dp[i - 1][0] + arr[i][0];
        }

        // Remaining cells
        for (int i = 1; i < arr.length; i++) {

            for (int j = 1; j < arr[i].length; j++) {

                dp[i][j] = arr[i][j]
                         + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        // Print DP matrix
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(dp[i][j] + " ");
            }

            System.out.println();
        }

        // Minimum Path Sum
        System.out.println("Minimum Path Sum: "
                + dp[arr.length - 1][arr[0].length - 1]);
    }
}