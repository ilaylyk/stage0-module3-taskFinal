package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int s = 0;
        for(int n = Math.abs(number); n > 0; s += n % 10, n /= 10);
        System.out.println(s);
    }
}
