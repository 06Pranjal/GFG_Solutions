class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int zeroC=0;
        int oneC=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeroC++;
            }
            else{
                oneC++;
            }
        }
        
        int i=0;
            while(zeroC!=0){
                arr[i]=0;
                zeroC--;
                i++;
            }
            while(oneC!=0){
                arr[i]=1;
                oneC--;
                i++;
            }
        
    }
}
