public class Solution 
{
    public long reverse(long a) 
    {
        int i=0;
        long res=0;
        
        for(i=0; i<32; i++, a>>=1)
        {
            res<<=1;
            res=res+a%2;
        }
        
        return res;
    }
}
