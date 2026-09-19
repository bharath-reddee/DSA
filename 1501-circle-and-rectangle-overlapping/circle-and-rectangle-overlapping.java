class Solution{
    public boolean checkOverlap(int r,int x,int y,int x1,int y1,int x2,int y2){
        int cx=x;
        if(x<x1){
            cx=x1;
        }
        else if(x>x2){
            cx=x2;
        }
        int cy=y;
        if(y<y1){
            cy=y1;
        }
        else if(y>y2){
            cy=y2;
        }
        int dx=x-cx;
        int dy=y-cy;
        return r*r>=dx*dx+dy*dy;
    }
}
   