import java.util.stream.Collectors;
public class Solution
{
    //Use the concept of comparators
    public String largestNumber(final List<Integer> list)
    {

    List<String>result= list.stream().map(String::valueOf).collect(Collectors.toList());
        Collections.sort(result, new Comparator<String>()
        {
            public int compare(String X,String Y)
            {
                String XY=X+Y;
                String YX=Y+X;
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });

        StringBuilder sb = new StringBuilder("");
        for (String val:result) {
            sb.append(val);
        }
        return sb.toString().charAt(0) == '0' ? "0" : sb.toString();
    }
}
