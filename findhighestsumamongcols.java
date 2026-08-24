public class findhighestsumamongcols {
    public static void main(String[] args) {
        int arr [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int max = 0 ;
        for(int i = 0; i < arr[0].length; i++){
            int sum = 0;
            for(int j = 0; j < arr.length; j++){
                sum += arr[j][i];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
