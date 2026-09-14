class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1=(ay2-ay1)*(ax2-ax1);
        int area2=(by2-by1)*(bx2-bx1);


      int total=area1+area2;

        int x=Math.min(ax2,bx2);
        int y=Math.min(ay2,by2);
        int a=Math.max(ax1,bx1);
        int b=Math.max(ay1,by1);
        
        int area3=0;
        if(x>a&&y>b){
             area3=(x-a)*(y-b);
        }
        

        int ans=total-area3;

        return ans;
        
    }
}