/*public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
    }
}
*/

public class Solution 
{
    public void setZeroes(ArrayList<ArrayList<Integer>> matrix)
    {
        boolean firstRow=false;
        boolean firstCol=false;
        int i=0;
        
        for (i=0;i<matrix.size();i++) 
        {
            if (matrix.get(i).get(0) == 0) 
            {
                firstCol = true;
                break;
            }
        }
        
        int j=0;
        for (i=0;i<matrix.get(0).size();i++) {
            if (matrix.get(0).get(i) == 0) {
                firstRow = true;
                break;
            }
        }
        
        for (i=0;i<matrix.size();i++) {
            for (j=0;j<matrix.get(0).size();j++) {
                if (matrix.get(i).get(j) == 0) {
                    matrix.get(i).set(0, 0);
                    matrix.get(0).set(j, 0);
                }
            }
        }
        
        for(i=1; i<matrix.size(); i++){
            for(j=1; j<matrix.get(i).size(); j++){
                if(matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0){
                   matrix.get(i).set(j, 0);
                }
            }
        }
        
        if(firstCol){
            for(i=0; i<matrix.size(); i++)
                matrix.get(i).set(0,0);
        }
 
        if(firstRow){
            for(i=0; i<matrix.get(0).size(); i++)
                matrix.get(0).set(i, 0);
        }
    }
}
