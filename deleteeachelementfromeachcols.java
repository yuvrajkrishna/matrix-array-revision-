public class deleteeachelementfromeachcols {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0 ; i < col ; i++){
            int max = i;
            for(int j = 1; j < row; j++){
                if(arr[j][max] < arr[j][i]){
                    max = i;
                }
            }
        }
        row--;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0; j < col ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void delete(int arr[][],int pos , int col){
        for(int i =  pos; i < arr.length-1; i++){
            arr[col][i] = arr[col][i+1];
        }
    }
}
