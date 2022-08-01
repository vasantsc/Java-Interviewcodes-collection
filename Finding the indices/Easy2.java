import java.util.ArrayList;
import java.util.List;

public class Easy2 {
    static List<Integer> targetIndices (int[] num,int val){
        int count_target=0;
        int count_less=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==val)
                count_target++;
            if(num[i]<val)
                count_less++;
        }
        List<Integer> ans=new ArrayList<>();
        while(count_target>0){
            ans.add(count_less++);
            count_target--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] num={1,4,5,4,2,3};
        int val=4;
        List<Integer> ans=targetIndices(num, val);
        for (int i=0;i<ans.size();i++)
            System.out.print(ans.get(i)+" ");
    }
}
