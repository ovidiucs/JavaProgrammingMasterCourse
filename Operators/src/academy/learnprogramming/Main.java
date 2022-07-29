package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = "+result);

        int previousResult = result;
        System.out.println("previous result = " + previousResult);

        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previous result = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 =" + result);

        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien.");
            System.out.println("And I am scared of aliens.");
        }
        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }
        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater then top score and less then 100");
        }
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true.");
        }
        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true.");
        }
        boolean isCar = false;
        if (isCar){
            System.out.println("This is not suppose to happen.");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("Was car is true.");
        }
        double myDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double sumBothDoubles = (myDouble + mySecondDouble) * 100.00d;
        double remainderSum = sumBothDoubles % 40.00d;
        boolean ifRemainder = (remainderSum == 0) ? true : false;
        System.out.println("Remainder is: " + ifRemainder);
        if (!ifRemainder){
            System.out.println("Got some remainder.");
        }
    }
}