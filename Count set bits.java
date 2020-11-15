public class Solution{
public int countSetBits(int n){
int count=0;
if(n==0){
return 0;
}
if(n==1){
return 1;
}

while(n!=0){
n= n & (n-1);
count+=1;
}
return count;
}
}
