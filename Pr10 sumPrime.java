package Pr10sumprime;
import java.math.BigInteger;

//Melvin Nguyen's (xeperia1)code
//Finds the sum of all the primes below two million.
//in progress 99% complete

public class core {
	public static void main(String[] args) {
        boolean[] array = new boolean[2000000];
        BigInteger counter = new BigInteger("0");
        for (int value = 0; value < array.length; value++) {
            array[value] = true;
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i]) {
                int j = i * i;
                while (j > 0 && j < array.length) {
                    array[j] = false;
                    j += i;
                }
            }
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i]) {
                counter = counter.add(BigInteger.valueOf(i));
            }
        }
        for (int value = 2; value < array.length; value++) {
            if(array[value]){
                System.out.println(value + ", ");
            }
        }
        System.out.println("\n" + counter);

    }

}
