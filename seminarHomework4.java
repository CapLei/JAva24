import java.util.Arrays;
import java.util.ArrayList;

class FilterNegative{
    public static int[] filterNegative(int[] a) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : a){
            if (num >= 0){
                result.add(num);
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++){
            resultArray[i] = result.get(i);

        }
        return resultArray;
    }
}


public class seminarHomework4 {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            a = new int[]{-1, 2, -3, 4, -5, 6, -15, 15};
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        FilterNegative answer = new FilterNegative();
        String itresume_res =
        Arrays.toString(answer.filterNegative(a));
        System.out.println(itresume_res);
    }
}
