package exercises;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Exercise {
    private Exercise(){}

    private static final String LINE_SEPARATOR = "--------------------------------------------";
    private static final String NATURAL_NUMBER = "Argument must be natural number.";
    private static final String NATURAL_NUMBERS = "Arguments must be natural numbers.";

    /**
     * This method takes two natural numbers and finds and prints all even numbers in that interval.
     * Arguments a needs to be lesser or equal than b. Interval includes arguments.
     *
     * @param a start of interval
     * @param b end of interval
     * @return list of found even numbers or null if wrong arguments are passed
     */
    public static List<Integer> findEvenNumbInInterval(int a, int b){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Vytvorte program, ktorý načíta dve prirodzené čísla (a,b) " +
                "a vypíše všetky párne čísla z tohto intervalu. a = " + a + ", b = " + b);

        //checking if arguments are natural numbers
        if(a < 0 || b < 0) {
            System.out.println(NATURAL_NUMBERS);
            return null;
        }

        //checking if a is lesser or equal than b
        if(a >= b) {
            System.out.println("Argument a is greater or equal than b.");
            return null;
        }

        //checking whether a is even or odd or 0
        if (a == 0)
            a+=2;
        else if (a%2 == 1)
            a++;

        List<Integer> result = new ArrayList<>();
        while (a <= b){
            result.add(a);
            System.out.print(a + ", ");
            a+=2;
        }

        System.out.println();
        return result;
    }

    /**
     * This method converts argument number to binary. Argument has to be natural number.
     *
     * @param number decimal to be converted to binary
     * @return String binary form of the argument or null if not natural number
     */
    public static String toBinary(int number){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Vytvorte program, ktorý načíta prirodzené číslo v desiatkovej sústave" +
                " a prevedie ho do dvojkovej sústavy. Výsledok vypíše.");

        //checking whether argument is natural
        if (number < 0) {
            System.out.println("Argument is not natural number.");
            return null;
        }

        var result = Integer.toBinaryString(number);
        System.out.println(number + " in binary is " + result);

        return result;
    }

    /**
     * This method converts argument natural number from decimal to custom base in [2,10] interval.
     *
     * @param value in decimal
     * @param base to which first argument is converted to
     * @return String representation of value in base(base) or null if conditions failed
     */
    public static String toCustomBase(int value, int base){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Vytvorte program, ktorý načíta dve prirodzené čísla (a, 1<b<=10)" +
                " a prevedie číslo a v desiatkovej sústave do sústavy so základom b.");

        //check if 1<base<10
        if (base <= 1 || base >10) {
            System.out.println("Base has to be in interval [2,10].");
            return null;
        }

        //check if value is natural number
        if (value < 0) {
            System.out.println("Value has to be natural number.");
            return null;
        }

        int valueCopy = value; // copying initial value
        var result = new StringBuilder();

        //converting
        while (value != 0){
            result.insert(0,value%base);
            value/=base;
        }

        //printing result
        System.out.println("Number " + valueCopy + " (base 10) is " + result.toString() + " (base " + base + ").");

        return result.toString();
    }

    /**
     * This method calculates and prints digit sum of argument. Argument must be natural number.
     *
     * @param value a natural number
     * @return digit sum of passed argument or -1 if not given natural number
     */
    public static int calcDigitSum(int value){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Vytvorte program, ktorý načíta prirodzené číslo x a vypíše jeho ciferný sučet.");

        //check whether argument is natural number
        if (value < 0){
            System.out.println(NATURAL_NUMBER);
            return -1;
        }

        int valueCopy = value;
        var dSum = 0;
        while (value != 0){
            dSum+=value%10;
            value/=10;
        }

        System.out.println("Digit sum of " + valueCopy + " is " + dSum);
        return dSum;
    }

    /**
     * This method calculates and prints digit count of argument number.
     *
     * @param value natural number
     * @return digit count or 0 if not given natural number
     */
    public static int calcDigitCount(int value){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Vytvorte program, ktorý načíta prirodzené číslo x a vypíše počet cifier čísla x.");

        //check whether argument is natural number
        if (value < 0){
            System.out.println(NATURAL_NUMBER);
            return 0;
        }

        int dCount = String.valueOf(value).length();

        System.out.println(value + " is a " + dCount + " digit number.");
        return dCount;
    }

    /**
     * This method reverses an argument number in reverse.
     *
     * @param number natural number
     * @return String of reversed number or null if not natural number passed
     */
    public static String reverse(int number){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Vytvorte program, ktorý načíta prirodzené čislo x a vyrobí číslo y," +
                " ktoré má tie isté cifry ako číslo x, ale v opačnom poradí. Bez pouzitia existujucej metody v Jave.");

        //check whether argument is natural number
        if (number < 0){
            System.out.println(NATURAL_NUMBER);
            return null;
        }

        var result = new StringBuilder();
        var sNumber = String.valueOf(number);

        for (var i = 0; i < sNumber.length(); i++) {
            result.insert(0,sNumber.charAt(i));
        }

        System.out.println("Number " + number + " in reverse is " + result.toString());
        return result.toString();
    }

    /**
     * This method calculates remainder of division and prints it. Arguments must be natural numbers.
     *
     * @param x dividend
     * @param y divisor
     * @return int of remainder or -1 if conditions failed
     */
    public static int mod(int x, int y){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Vytvorte program, ktorý načíta prirodzené čísla (x, y)" +
                " a vypíše hodnotu (x mod y) bez toho, aby ste použili operáciu mod.");

        //checking if arguments are natural numbers
        if(x < 0 || y < 0) {
            System.out.println(NATURAL_NUMBERS);
            return -1;
        }

        //check division by zero
        if (y == 0){
            System.out.println("Division by zero is not allowed.");
            return -1;
        }

        int result = x-y*(x/y);

        System.out.println(x + "%" + y + "=" + result);
        return result;
    }

    /**
     * This method calculates quotient(natural). Arguments must be natural numbers.
     *
     * @param x dividend
     * @param y divisor
     * @return int quotient or -1 if conditions failed
     */
    public static int div(int x, int y){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Vytvorte program, ktorý načíta prirodzené čísla (x, y)" +
                " a vypíše hodnotu (x div y) bez toho, aby ste použili operáciu div.");

        //checking if arguments are natural numbers
        if(x < 0 || y < 0) {
            System.out.println(NATURAL_NUMBERS);
            return -1;
        }

        //check division by zero
        if (y == 0){
            System.out.println("Division by zero is not allowed.");
            return -1;
        }

        var i = 1;
        while (i*y <= x){
            i++;
        }
        i--;

        //result
        System.out.println(x + "/" + y + "=" + i);
        return i;
    }

    /**
     * This method finds number of occurences of argument y in argument x.
     *
     * @param x natural number
     * @param y number in interval [0,9]
     * @return int count or -1 if conditions failed
     */
    public static int findDigitInNumberCount(int x, int y){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Vytvorte program, ktorý načíta prirodzené čísla (x, 0<=y<=9)" +
                " a zistí, koľkokrát sa cifra y vyskytuje v zápise čísla x.");

        //check whether argument is natural number
        if (x < 0){
            System.out.println(NATURAL_NUMBER);
            return -1;
        }

        //check if 0<=y<=9
        if (y < 0 || y >9) {
            System.out.println("Y has to be in interval [0,9].");
            return -1;
        }

        var strX = String.valueOf(x);
        var count = 0;
        for (var i = 0; i < strX.length(); i++) {
            if (strX.charAt(i) == y + 48) //adding 48 to get character representation od y
                count++;
        }

        //result
        System.out.println("Digit " + y + " occurs " + count + " times in number " + x);
        return count;
    }

    /**
     * This method checks the format of argument birth number, but not other rules that apply
     * such as whether date indicated exists.
     *
     * @param birthNumb birth number to check
     * @return true for valid or false
     */
    public static boolean checkBirthNumbFormat(String birthNumb){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Napis program, ktory zisti, ci rodne cislo ma spravny format." +
                " Spravny format rodneho cisla najdite na webe.");

        //check null or blank input
        if (birthNumb == null || birthNumb.isBlank()){
            System.out.println("Invalid argument.");
            return false;
        }

        var result = birthNumb.trim().matches("^\\d{2}[0156]\\d[0-3]\\d/?\\d{3,4}$");
        System.out.println("Birth number format of " + birthNumb.trim() + " validity: " + result);

        return result;
    }

    /**
     * This method prints a difference and a sum of arguments to the console.
     *
     * @param a BigInteger
     * @param b BigInteger
     */
    public static void printDiffAndSum(BigInteger a, BigInteger b){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Napis program, ktory scita a odcita dve lubovolne velke cisla, " +
                "napriklad cislo s 150 ciframi a cislo s 50 ciframi.");

        //handle null input
        if (a == null || b == null){
            System.out.println("Arguments must not be null.");
            return;
        }

        System.out.println("Number a: " + a);
        System.out.println("Number b: " + b);

        System.out.println("a - b = " + a.subtract(b));
        System.out.println("a + b = " + a.add(b));
    }
}
