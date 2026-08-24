public class findelementfrommatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int target = 6;
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    System.out.println("Present");
                    return;
                }
            }
        }
        System.out.println("Not Present");
    }
}
