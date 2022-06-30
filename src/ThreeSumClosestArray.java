import java.util.Arrays;

public class ThreeSumClosestArray {

    public static int threeSumClosestArray(int arr[], int n, int sum){
    //sort it first
        Arrays.sort(arr);
        int i, j, k, count= 0;
        //start pointers from first second and last position
        for( i= 0; i<n; i++){
            j = i+1;
            k= n-1;
            // until the second point meets last
            while(j<k){
                //if its smaller then increase the count and j
                if(arr[i]+ arr[j]+ arr[k]< sum){
                    count += k-j;
                    j++;
                }
                //else look for smaller sum by decrementing the index of last pointer
                else {
                    k--;
                }
            }
        }return count;
    }

    public static void main(String[] args) {

    }
}
