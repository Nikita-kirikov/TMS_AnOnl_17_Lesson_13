package task1;

import java.util.ArrayList;
import java.util.OptionalDouble;

/*
Создать коллекцию класса ArrayList наполнить ее рандомными элементами типа Integer
С помощью stream:
- Удалить думбликаты
- Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
- Каждый элемлемент умножить на 2
- Отсортировать и вывести на экран первые 4 элемента
- Вывести количество элементов в стриме
- Вывести среднее арифметическое всех чисел в stream
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i < 50; i++) {
            arr.add((int) (Math.random() * 20));
        }

        arr.stream().distinct().filter(i -> i > 7 && i <= 17 && i % 2 == 0)
                .peek(System.out::println)
                .map(i -> i * 2)
                .sorted()
                .limit(4)
                .forEach(System.out::println);

        int size = (int) arr.stream().count();
        System.out.println(size);

        OptionalDouble average = arr.stream().mapToInt(x -> x).average();
        System.out.println(average);
    }
}
