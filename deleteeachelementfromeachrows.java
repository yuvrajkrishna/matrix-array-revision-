public class deleteeachelementfromeachrows {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0; i < row; i++){
            int max = 0;
            for(int j = 0 ; j < col; j++){
                if(arr[i][max] < arr[i][j]){
                    max = j;
                }
            }
            delete(arr, i, max);
        }
        col--;
        for(int i = 0; i < row ; i++){
            for(int j = 0; j < col ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void delete(int arr[][],int row ,int pos){
        for(int i = pos ; i < arr[0].length-1; i++){
            arr[row][i] = arr[row][i+1];
        }
    }
}
