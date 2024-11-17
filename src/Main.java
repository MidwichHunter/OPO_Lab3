import java.util.Arrays;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создаем список типа ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                -1001, -222, -333, -4, -5325, -5234, -1613,
                426, 52321, 5325, 231, 424, 424, 642, 5436, 1251, 5326, 2623
        ));
        int i = 0; // Указатель для положительных элементов
        int n = numbers.size();
        while (i < n) {
            if (numbers.get(i) < 0) {
                // Если элемент отрицательный, перемещаем его в конец
                numbers.add(numbers.remove(i)); // Удаляем элемент и добавляем в конец
                n--; // Уменьшаем размер, так как мы удалили элемент
            } else {
                // Если элемент положительный, просто увеличиваем указатель
                i++;
            }
        }
        System.out.println(numbers);

    }
}
