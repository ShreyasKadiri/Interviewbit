int Solution::sqrt(int A)
{
    if (A==0 || A==1)
    return A;
    
    int start=0,end = A;
    int res;
    
    while(start<=end)
    {
        int mid=start+(end-start)/2;
        if (mid<=A/mid) 
        {
            start=mid+1;
            res=mid;
        }
        else 
        end=mid-1;
    }
    return res;
}
