class Solution {
    public boolean isThree(int n) {
        int i,j,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0){
                c++;
            }
        }
        return(c==3);
        
    }
}
