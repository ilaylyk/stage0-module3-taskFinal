package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String s = String.valueOf(number);
        String result = "";
        for (int i = s.length()-1; i >= 0; i--) {
            result+=s.charAt(i);
        }
        System.out.println(Integer.parseInt(result));
    }
}
