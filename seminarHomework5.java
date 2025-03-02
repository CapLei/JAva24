import java.util.ArrayList;
import java.util.Arrays;

class UniqElement{
    public static int[] getUniqElement(int[] a) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : a){
            if(!result.contains(num)){
                result.add(num);
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}






public class seminarHomework5{
public static void main(String[] args){
    int[] a;
    if (args.length == 0) {
        a = new int[]{1, 2, 2, 3, 4, 4, 5};
    } else {
        a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
    }
    UniqElement answer = new UniqElement();
    String itresume_res = Arrays.toString(answer.getUniqElement(a));
    System.out.println(itresume_res);
}
}


