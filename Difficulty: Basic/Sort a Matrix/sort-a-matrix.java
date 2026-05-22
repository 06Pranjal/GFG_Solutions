class Solution {
    int[][] sortedMatrix(int mat[][]) {
        // code here
        int c=0;
        int total=mat.length*mat[0].length;
        int[] arr=new int[total];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                arr[c++]=mat[i][j];
            }
        }
        
        for(int i=0;i<arr.length;i++){
               for(int j=0;j<(arr.length)-1;j++){
                    if(arr[j]>arr[j+1]){
                         int temp=arr[j];
                         arr[j]=arr[j+1];
                         arr[j+1]=temp;
                    }
               }

          }
          
        int p=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j]=arr[p];
                p++;
            }
        }
    return mat;
        
    }
}