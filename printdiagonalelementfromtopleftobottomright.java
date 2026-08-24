public class printdiagonalelementfromtopleftobottomright {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int i = 0 ;
        while(i < arr[0].length){
            System.out.println(arr[i][i]);
            i++;
        }
    }
}
