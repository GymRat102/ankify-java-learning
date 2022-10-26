package learnjavabasic;

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {

        System.out.println(2.0-1.1);

        // 判断一个 Unicode 字符是不是 Java 字母
        System.out.println(Character.isJavaIdentifierPart('$'));
        System.out.println(Character.isJavaIdentifierStart('$'));

        // 枚举类型
        Size s = Size.MEDIUM;
        System.out.println(s);

        // 整数除法 v. 浮点数除法
        System.out.println(3 / 5);
        System.out.println(3 / 5.0);
        System.out.println(3 % 5);

        // 强制类型转换 9.997 --> 9 或 10
        double x = 9.997;
        int nx = (int) x;
        System.out.println(nx);

        int nnx = (int) Math.round(x);
        System.out.println(nnx);

        int y = 3;
        y += 3.5;
        System.out.println(y);

        // 位运算符
        int n = 1;
        int fourthBitFromRight = (n & 0b1000) / 0b1000;
        System.out.println(fourthBitFromRight);

        // substring
        String greeting = "Hello";
        String sub = greeting.substring(0, 3);
        System.out.println(sub);

        // concatination
        String all = String.join(" / ", "S", "M", "L", "XL");
        System.out.println(all);

        // String equals()
        boolean sEqual = "Hello".equals(greeting);
        System.out.println(sEqual);

        System.out.println("Hel" == sub);

        // empty string or null
        String empty = "";
        String nullString;
        System.out.println(empty.length() == 0);
        System.out.println(empty.equals(""));

        // code point (Unicode) & code unit (UTF-16)
        int length = greeting.length();
        System.out.println("length of code unit: " + length);
        int cpCount = greeting.codePointCount(0, greeting.length());
        System.out.println("length of code point: " + length);
        char c = greeting.charAt(0);
        int index = greeting.offsetByCodePoints(0, 4);
        int cp = greeting.codePointAt(index);
        System.out.println(c + " " + index + " " + cp);

        String emoji = "🍺";
        System.out.println("The length of this emoji is: " + emoji.length());
        System.out.println("The length of code point is: " + emoji.codePointCount(0, emoji.length()));
        System.out.println("First code unit: " + emoji.charAt(0));
        System.out.println("First code unit: " + emoji.charAt(1));
        int indexOfEmoji = emoji.offsetByCodePoints(0, 1);
        System.out.println("Index is: " + indexOfEmoji);
        // attention below - 1 part
        System.out.println("Code point is: " + emoji.codePointAt(1));

        // Common String API
        String apiExample = "Howdy";
        String apiExample2 = "dy";
        String emptyString = "   ";

        int comparison = apiExample.compareTo(apiExample2);
        System.out.println("The result of comparison: " + comparison);

        System.out.println(emptyString.isEmpty());
        System.out.println(apiExample.endsWith(apiExample2));
        System.out.println(emptyString.replace(apiExample2, "dddyyy"));

        // String Builder
        StringBuilder builder = new StringBuilder();
        builder.append(emoji);
        builder.append(apiExample);
        System.out.println(builder);

        // Scanner

        // Scanner in = new Scanner(System.in);
        //
        // System.out.println("What is your name? ");
        // String name = in.nextLine();
        //
        // System.out.println("How old are you?");
        // int age = in.nextInt();
        //
        // System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));

        // format output
        double xformat = 10000.0 / 3.0;
        System.out.printf("%8.2f", xformat);

        String format = String.format("%8.2f", 100.0 / 3);
        System.out.println(format);

    }
}
