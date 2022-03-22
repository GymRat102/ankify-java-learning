package learnNumberType;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Formatter;

// https://java2blog.com/format-double-to-2-decimal-places-java/#Using_BigDecimal
public class Main {
  public static void main(String[] args) {
    double d = 22.35831;

    // String.format() - static method
    System.out.println("Double upto 2 decimal places: " + String.format("%.2f", d));

    // sout printf
    System.out.printf("Double upto 2 decimal places: %.2f", d);
    System.out.println();

    // java.util.Formatter
    Formatter formatter = new Formatter();
    formatter.format("%.2f", d);
    System.out.println("Double upto 2 decimal places: " + formatter);

    // java.math.BigDecimal
    BigDecimal bd = new BigDecimal(d).setScale(2, RoundingMode.HALF_UP);
    System.out.println("Double upto 2 decimal places: " + bd.doubleValue());

    // DecimalFormat - extend NumberFormat
    DecimalFormat df = new DecimalFormat("#.##");
    df.setRoundingMode(RoundingMode.DOWN);
    System.out.println("Double upto 2 decimal places: " + df.format(d));

    // NumberFormat
    NumberFormat nf = NumberFormat.getInstance();
    nf.setMaximumFractionDigits(7);
    System.out.println("Double upto 2 decimal places: " + nf.format(d));

    System.out.println("--------------");
    System.out.println(new Main().return2DecimalString("2.345234"));
  }

  private String return2DecimalString(String s) {
    Double aDouble = Double.valueOf(s);
    BigDecimal decimal = new BigDecimal(s);
    return String.format("%.2f", decimal);
  }
}
