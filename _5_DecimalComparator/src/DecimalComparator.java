public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces
            (double firstNumber, double secondNumber){
//        firstNumber = Math.round(firstNumber * 1000.0) / 1000.0;
//        secondNumber = Math.round(secondNumber * 1000.0) / 1000.0;
        firstNumber = firstNumber * 1000;
        secondNumber = secondNumber * 1000;
        int a1 = (int) firstNumber;
        int b1 = (int) secondNumber;
        System.out.println(a1);
        System.out.println(b1);

        if(a1 == b1){
            return true;
        }
        return false;
    }
}
