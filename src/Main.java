import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String args[]) {
        var stream = new Random().ints(1000, 10, 10000);

        //var collection = stream.toArray();
        //var countSimpleNums = stream.filter(x -> x % 2 == 0).count();
        //var reduce = stream.reduce((accum, x) -> accum + x);
        //stream.forEach(x -> System.out.println(x));
        //var resultInMap = stream.boxed().collect(Collectors.toMap(x -> x, x -> x*x));

        var test_text = "Привет, мир! Это строка на 2000 символов, созданная для демонстрации использования различных методов и алгоритмов в программировании. В данной строке используются разные символы, такие как буквы, цифры, знаки препинания и другие специальные символы. Это помогает нам изучать различные аспекты программирования, такие как обработка текста, поиск и замена, а также работа с разными типами данных и структурами данных. Мы также можем использовать эти методы и алгоритмы для обработки и анализа других текстовых данных, таких как статьи, медицинские данные и информация о продуктах. Важно отметить, что в данной строке нет ошибок, и она корректно с точки зрения грамматики и смысла.";
        var new_stream = Arrays.stream(test_text.split(""));

        var charFilter = new_stream.filter(x -> x.endsWith("а")).count();
        var collecting = new_stream.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        var longWordsFilter = new_stream.filter(x -> x.length() > 10).toList();
        var averageLength = new_stream.map(String::length).mapToInt(x -> x).average();
    }
}