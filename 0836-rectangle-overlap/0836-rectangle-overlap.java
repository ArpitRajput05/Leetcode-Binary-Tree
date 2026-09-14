class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1=rec1[0];
        int y1=rec1[1];
        int x2=rec1[2];
        int y2=rec1[3];


        int x11=rec2[0];
        int y11=rec2[1];
        int x22=rec2[2];
        int y22=rec2[3];


         int x=Math.min(x22,x2);
         int y=Math.min(y2,y22);
        int a=Math.max(x1,x11);
        int b=Math.max(y1,y11);
        if(a<x&&b<y) return true;
        return false;




    }
}