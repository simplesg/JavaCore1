package StreamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamAPI {
    static int increment = 1;

    public static void main(String[] args) {

        StreamAPI streamAPI = new StreamAPI();
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 1, 1, 5);
        List<String> stringList = Arrays.asList("1", "2", "3", "4", "5");
        List<Character> characterList = Arrays.asList('1', 'a', 'b', '3', '5');
        printLines();
        streamAPI.multipliedList(integerList);
        printLines();
        streamAPI.reverseTheString("Java Sorin Gorea Core");
        printLines();
        streamAPI.getNelement(integerList, 3).forEach(System.out::println);
        printLines();
        streamAPI.convertStringToInteger(stringList).forEach(integer -> System.out.println(integer.getClass()));
        printLines();
        streamAPI.MaxAndMin(integerList);
        printLines();
        streamAPI.minAndMaxChar(characterList);
        printLines();
        streamAPI.removeDuplicates(integerList).forEach(System.out::println);
        printLines();
        streamAPI.readFile();


    }


    void multipliedList(List<Integer> list) {
        list
                .stream()
                .map(integer -> integer * 2)
                .forEach(System.out::println);
    }

    void reverseTheString(String string) {
        System.out.println(Stream.of(string)
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining()));
    }

    List<Integer> getNelement(List<Integer> list, int index) {
        return list
                .stream()
                .skip(index - 1)
                .limit(1)
                .collect(Collectors.toList());
    }

    List<Integer> convertStringToInteger(List<String> list) {
        return list
                .stream()
                .flatMapToInt(string -> IntStream.of(Integer.parseInt(string)))
                .boxed()
                .collect(Collectors.toList());
    }

    void MaxAndMin(List<Integer> list) {
        System.out.println("Maximum value is " + list.stream().max(Integer::compare).get());
        System.out.println("Minimum value is " + list.stream().min(Integer::compare).get());
    }

    void minAndMaxChar(List<Character> characters) {
        System.out.println("Minimum char value is: " + characters.stream().min(Character::compareTo).get());
        System.out.println("Maximum char value is: " + characters.stream().max(Character::compareTo).get());
    }

    List<Integer> removeDuplicates(List<Integer> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    void readFile() {
        try {
            Stream<String> stringStream = Files.lines(Paths.get("C:\\Users\\sgorea\\IdeaProjects\\JavaCore1\\src\\StreamAPI\\file.txt"));
            stringStream.forEach(System.out::print);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void printLines() {
        System.out.println("TASK " + increment);
        System.out.println("---------------------------------------");
        System.out.println(" ");
        increment++;
    }

}
