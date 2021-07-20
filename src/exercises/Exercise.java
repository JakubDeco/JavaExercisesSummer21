package exercises;

public class Exercise {
    private Exercise(){}

    /**
     * This method takes two natural numbers and prints all even numbers in that interval.
     * Arguments a needs to be lesser or equal than b. Interval includes arguments.
     *
     * @param a start of interval
     * @param b end of interval
     */
    public static void printEvenNumbInInterval(int a, int b){
        System.out.println("--------------------------------------------");
        System.out.println("Vytvorte program, ktorý načíta dve prirodzené čísla (a,b) " +
                "a vypíše všetky párne čísla z tohto intervalu. a = " + a + ", b = " + b);

        //checking if arguments are natural numbers
        if(a < 0 || b < 0) {
            System.out.println("One or both arguments are lesser than 0.");
            return;
        }

        //checking if a is lesser or equal than b
        if(a >= b) {
            System.out.println("Argument a is greater or equal than b.");
            return;
        }

        //checking whether a is even or odd or 0
        if (a == 0)
            a+=2;
        else if (a%2 == 1)
            a++;

        while (a <= b){
            System.out.print(a + ", ");
            a+=2;
        }

        System.out.println();
    }

    /**
     * This method prints binary form of argument number. Argument has to be natural number.
     *
     * @param number decimal to be converted to binary
     */
    public static void printToBinary(int number){
        System.out.println("--------------------------------------------");
        System.out.println("Vytvorte program, ktorý načíta prirodzené číslo v desiatkovej sústave" +
                " a prevedie ho do dvojkovej sústavy. Výsledok vypíše.");

        //checking whether argument is natural
        if (number < 0) {
            System.out.println("Argument is not natural number.");
        }

        System.out.println(number + " in binary is " + Integer.toBinaryString(number));
    }
}
