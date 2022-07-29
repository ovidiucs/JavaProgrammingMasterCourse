package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("My Int Value = " + myIntValue);
        System.out.println("My float Value = " + myFloatValue);
        System.out.println("My double Value = " + myDoubleValue);

        double poundToKg = 0.45359237d;
        double pounds = 20d * poundToKg;
        System.out.println("20 Pounds in Kg is = " + pounds);
    }
}