class Solution {
    static void reverseArray(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
    }
    static void rotateArr(int arr[], int d) {
        
        // code here
        if(arr.length == 0) return;
            d = d % arr.length;

            reverseArray(arr,0,d-1);


            reverseArray(arr,d, arr.length-1);


            reverseArray(arr,0, arr.length-1);


    }

    
}
