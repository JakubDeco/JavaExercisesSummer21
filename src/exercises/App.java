package exercises;

import java.math.BigInteger;

public class App {
    /**
     * Main method for running exercises.
     */
    public static void main(String[] args) {
        Exercise.findEvenNumbInInterval(1,11);
        Exercise.toBinary(24);
        Exercise.toCustomBase(521,5);
        Exercise.calcDigitSum(8934);
        Exercise.calcDigitCount(123456789);
        Exercise.reverse(123456789);
        Exercise.mod(478,21);
        Exercise.div(109,10);
        Exercise.findDigitInNumberCount(1112345998,1);
        Exercise.checkBirthNumbFormat("960508/7856   ");

        var a = new BigInteger("1565464216576846213487646213467984621346798465132416547798479843131654987984635" +
                "13213165487498413121322165486879878465132101031265484786456131320035516545847654843251003456");
        var b = new BigInteger("4165465513215478798794321321165457998745132132134648478498465521303134165468" +
                "54684513203030131456486546500");
        Exercise.printDiffAndSum(a,b);
    }
}
