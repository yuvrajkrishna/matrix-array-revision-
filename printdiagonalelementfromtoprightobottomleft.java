public class printdiagonalelementfromtoprightobottomleft{
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int i = arr[0].length-1;
        while(i >= 0){
            System.out.println(arr[i][i]);
            i--;
        }
    }
}