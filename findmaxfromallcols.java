public class findmaxfromallcols {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for(int i = 0; i < arr[0].length ; i++){
            int max = arr[0][i];
            for(int j = 1 ; j < arr.length ; j++){
                if(arr[j][i] > max){
                    max = arr[j][i];
                }
            }
            System.out.println(max);
        }
    }
}
