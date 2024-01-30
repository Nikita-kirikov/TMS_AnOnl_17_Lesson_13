package task2;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/*
Создать коллекцию класса ArrayList со значениями имен всех студентов в группе
С помощью stream:
- Вернуть количество людей с вашими именами (вне зависимости от регистра букв ???? причему тут регистр?)
- Выбрать все имена, начинающиеся на "a" (вне зависимости от региста букв)
- Отсортировать и вернуть первый элемент коллекции или empty@, если коллекция пуста
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Marat");
        names.add("Viktor");
        names.add("Anastasia");
        names.add("Nikita");
        names.add("Vladimir");

        int count = (int) names.stream().count();
        System.out.println("Count - " + count);

        Optional<String> name = Optional.ofNullable(String.valueOf(names.stream().
                filter(n -> n.toLowerCase().
                        charAt(0) == 'a').
                sorted().
                findFirst()));

        if (name.isPresent()) {
            System.out.println(name);
        }


    }
}
