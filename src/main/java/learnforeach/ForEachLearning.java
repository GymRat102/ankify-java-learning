package learnforeach;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;

public class ForEachLearning {

  public static void main(String[] args) {

    List<String> strings = List.of("s1", "s2", "s3");

    // for loop
    for (String s : strings) {
      System.out.println(s);
    }

    line();

    // forEach & lambda version
    /**
     * forEach is Iterable interface's API
     *
     * accept Consumer interface: input -> no result
     */
    strings.forEach(s -> System.out.println(s)); // (argument) -> { //body }
    strings.forEach(System.out::println); // method reference

    line();

    // if we use ConsumerInterface instead, create an anonymous class
    var printConsumer = new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    };
    strings.forEach(printConsumer);

    line();

    // forEach with Collections
    List<String> names = Arrays.asList("Larry", "Steve", "James");
    names.forEach(System.out::println);

    HashSet<String> uniqueNames = new HashSet<>(names);
    uniqueNames.forEach(System.out::println);

    ArrayDeque<String> namesQueue = new ArrayDeque<>(names);
    namesQueue.forEach(System.out::println);

    line();

    // HashMap with forEach
    HashMap<String, String> namesMap = new HashMap<>();
    namesMap.put("1", "Larry");
    namesMap.put("2", "Steve");
    namesMap.put("3", "James");

    namesMap.forEach((key, value) -> System.out.println(key + " " + value)); // BiConsumer

    // TODO: the difference between for-loop and forEach --> internal or external iterator
  }

  private static void line() {
    System.out.println();
    System.out.println("************************");
    System.out.println();
  }
}
