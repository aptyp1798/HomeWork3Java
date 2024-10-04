import java.util.ArrayList;
import java.util.Arrays;

class FilterStrings {
    public static String[] filterShortStrings(String[] arr) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 3 ) {
                result.add(arr[i]);
            }
        }
        String[] resultArray = new String[result.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task3 {
    public static void main(String[] args) {
        String[] arr;
        if (args.length == 0) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
                    arr = new String[]{"cat", "elephant", "dog", "giraffe"};
        } else {
            arr = args[0].split(", ");
        }
        FilterStrings answer = new FilterStrings();
        String itresume_res =
                Arrays.toString(answer.filterShortStrings(arr));
        System.out.println(itresume_res);
    }
}