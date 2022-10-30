import java.math.BigInteger;

public class BigNumber {

    public static void main(String[] args) {

        // instantiate a big number
        BigInteger a = BigInteger.valueOf(100);

        // integer too long can use string constructor
        BigInteger reallyBig = new BigInteger("2342352342342352342352342352342352342345");

        System.out.println(a.add(reallyBig));
    }
}
