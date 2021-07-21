package exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    private Exercise(){}

    private static final String LINE_SEPARATOR = "--------------------------------------------";
    private static final String NATURAL_NUMBER = "Argument must be natural number.";
    private static final String NATURAL_NUMBERS = "Arguments must be natural numbers.";

    /**
     * This method takes two natural numbers and prints all even numbers in that interval.
     * Arguments a needs to be lesser or equal than b. Interval includes arguments.
     *
     * @param a start of interval
     * @param b end of interval
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
     * This method prints binary form of argument number. Argument has to be natural number.
     *
     * @param number decimal to be converted to binary
     */
    public static void printToBinary(int number){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Vytvorte program, ktorý načíta prirodzené číslo v desiatkovej sústave" +
                " a prevedie ho do dvojkovej sústavy. Výsledok vypíše.");

        //checking whether argument is natural
        if (number < 0) {
            System.out.println("Argument is not natural number.");
        }

        System.out.println(number + " in binary is " + Integer.toBinaryString(number));
    }

    /**
     * This method converts argument natural number from decimal to custom base in [2,10] interval.
     *
     * @param value in decimal
     * @param base to which first argument is converted to
     */
    public static void printToCustomBase(int value, int base){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Vytvorte program, ktorý načíta dve prirodzené čísla (a, 1<b<=10)" +
                " a prevedie číslo a v desiatkovej sústave do sústavy so základom b.");

        //check if 1<base<10
        if (base <= 1 || base >=10) {
            System.out.println("Base has to be in interval [2,10].");
            return;
        }

        //check if value is natural number
        if (value < 0) {
            System.out.println("Value has to be natural number.");
            return;
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
    }

    /**
     * This method prints digit sum of argument. Argument must be natural number.
     * @param value natural number
     */
    public static void printDigitSum(int value){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Vytvorte program, ktorý načíta prirodzené číslo x a vypíše jeho ciferný sučet.");

        //check whether argument is natural number
        if (value < 0){
            System.out.println(NATURAL_NUMBER);
            return;
        }

        int valueCopy = value;
        var dSum = 0;
        while (value != 0){
            dSum+=value%10;
            value/=10;
        }

        System.out.println("Digit sum of " + valueCopy + " is " + dSum);
    }

    /**
     * This method prints digit count of argument number.
     *
     * @param value natural number
     */
    public static void printDigitCount(int value){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Vytvorte program, ktorý načíta prirodzené číslo x a vypíše počet cifier čísla x.");

        //check whether argument is natural number
        if (value < 0){
            System.out.println(NATURAL_NUMBER);
            return;
        }

        int dCount = String.valueOf(value).length();

        System.out.println(value + " is a " + dCount + " digit number.");
    }

    /**
     * This method prints argument number in reverse.
     *
     * @param number natural number
     */
    public static void printReverse(int number){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Vytvorte program, ktorý načíta prirodzené čislo x a vyrobí číslo y," +
                " ktoré má tie isté cifry ako číslo x, ale v opačnom poradí. Bez pouzitia existujucej metody v Jave.");

        //check whether argument is natural number
        if (number < 0){
            System.out.println(NATURAL_NUMBER);
            return;
        }

        var result = new StringBuilder();
        var sNumber = String.valueOf(number);

        for (var i = 0; i < sNumber.length(); i++) {
            result.insert(0,sNumber.charAt(i));
        }

        System.out.println("Number " + number + " in reverse is " + result.toString());
    }

    /**
     * This method calculates remainder of division and prints it. Arguments must be natural numbers.
     *
     * @param x dividend
     * @param y divisor
     */
    public static void printMod(int x, int y){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Vytvorte program, ktorý načíta prirodzené čísla (x, y)" +
                " a vypíše hodnotu (x mod y) bez toho, aby ste použili operáciu mod.");

        //checking if arguments are natural numbers
        if(x < 0 || y < 0) {
            System.out.println(NATURAL_NUMBERS);
            return;
        }

        //check division by zero
        if (y == 0){
            System.out.println("Division by zero is not allowed.");
            return;
        }

        int result = x-y*(x/y);

        System.out.println(x + "%" + y + "=" + result);
    }

    /**
     * This method calculates quotient(natural). Arguments must be natural numbers.
     *
     * @param x dividend
     * @param y divisor
     */
    public static void printDiv(int x, int y){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Vytvorte program, ktorý načíta prirodzené čísla (x, y)" +
                " a vypíše hodnotu (x div y) bez toho, aby ste použili operáciu div.");

        //checking if arguments are natural numbers
        if(x < 0 || y < 0) {
            System.out.println(NATURAL_NUMBERS);
            return;
        }

        //check division by zero
        if (y == 0){
            System.out.println("Division by zero is not allowed.");
            return;
        }

        var i = 1;
        while (i*y <= x){
            i++;
        }
        i--;

        //result
        System.out.println(x + "/" + y + "=" + i);
    }

    /**
     * This method finds number of occurences of argument y in argument x.
     *
     * @param x natural number
     * @param y number in interval [0,9]
     */
    public static void printDigitInNumberCount(int x, int y){
        System.out.println(LINE_SEPARATOR);
        System.out.println("Vytvorte program, ktorý načíta prirodzené čísla (x, 0<=y<=9)" +
                " a zistí, koľkokrát sa cifra y vyskytuje v zápise čísla x.");

        //check whether argument is natural number
        if (x < 0){
            System.out.println(NATURAL_NUMBER);
            return;
        }

        //check if 0<=y<=9
        if (y < 0 || y >9) {
            System.out.println("Y has to be in interval [0,9].");
            return;
        }

        var strX = String.valueOf(x);
        var count = 0;
        for (var i = 0; i < strX.length(); i++) {
            if (strX.charAt(i) == y + 48) //adding 48 to get character representation od y
                count++;
        }

        //result
        System.out.println("Digit " + y + " occurs " + count + " times in number " + x);
    }

    /**
     * This method checks the format of argument birth number, but not other rules that apply.
     *
     * @param birthNumb birth number to check
     * @return true or false
     */
    public static boolean checkBirthNumbFormat(String birthNumb){
        return false;
    }
}
