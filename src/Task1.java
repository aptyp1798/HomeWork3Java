import java.util.ArrayList;
import java.util.Arrays;
class FilterNegative {
    public static int[] filterNegative(int[] a) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                temp.add(a[i]);
            }
        }
        int[] result = new int[temp.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp.get(i);
        }
        return result;
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task1 {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
                    a = new int[]{-1, 2, -3, 4, -5, 6};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        FilterNegative answer = new FilterNegative();
        String itresume_res =
                Arrays.toString(answer.filterNegative(a));
        System.out.println(itresume_res);
    }
}
