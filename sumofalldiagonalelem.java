public class sumofalldiagonalelem {
    public static void main(String[] args) {
        int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int mid = (arr.length-1)/2;
        int sum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
                if(i!=mid || arr[0].length%2==0){
                    sum += arr[i][i];
                    sum += arr[i][arr[i].length-1-i];
                }
            }
            if(arr.length%2 !=0){
                sum += arr[mid][mid];
            }
            System.out.println(sum);
        }
    }

