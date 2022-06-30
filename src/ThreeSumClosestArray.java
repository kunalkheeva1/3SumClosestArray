import java.util.Arrays;

public class ThreeSumClosestArray {

    public static int threeSumClosestArray(int arr[], int n, int sum){

        Arrays.sort(arr);
        int i, j, k, count= 0;

        for( i= 0; i<n; i++){
            j = i+1;
            k= n-1;
            while(j<k){
                if(arr[i]+ arr[j]+ arr[k]< sum){
                    count += k-j;
                    j++;
                }
                else {
                    k--;
                }
            }
        }return count;
    }

    public static void main(String[] args) {

    }
}
