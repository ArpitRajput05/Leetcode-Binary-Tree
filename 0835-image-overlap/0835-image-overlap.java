class Solution {
    public int solve(int r,int c,int[][] img1, int[][] img2){
        int count2=0;
         for(int i=0;i<img2.length;i++){
            for(int j=0;j<img2.length;j++){
                   int row=i+r;
                   int col=j+c;
                  if(row >= 0 && row < img1.length &&
                   col >= 0 && col < img1.length) {

                    if(img1[i][j] == 1 && img2[row][col] == 1) {
                        count2++;
                    }
                }
            }
       }
       return count2;

    }
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int max=0;
        for(int r=-n+1;r<n;r++){
            for(int c=-n+1;c<n;c++){
                int count=solve(r,c,img1,img2);
                max=Math.max(max,count);
            }
        }
        return max;
    }
}