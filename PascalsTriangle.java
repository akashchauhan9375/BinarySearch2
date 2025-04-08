import java.util.ArrayList;
import java.util.List;

class PascalsTriangle{
    public List<List<Integer>> generate(int n){
        List<List<Integer>> result = new ArrayList<>();

        if(n == 0) return result;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        if(n==1) return result;

        for(int i=1;i<n;i++){
            List<Integer> pre = result.get(i-1);
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1;j<i-1;j++){
                row.add(pre.get(j) + pre.get(j+1));
            }
            row.add(1);
            result.add(row);

        }
        return result;
    }
}