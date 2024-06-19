package Automation.RahulShettyUdemy;

public class Random {

	public static void main(String[] args) {
        String inputString = "Hello1234";
        int[] result = sumAndCountNumbersInString(inputString);
        System.out.println("The number of digits in the string is: " + result[0]);
        System.out.println("The sum of the digits in the string is: " + result[1]);
    }

    public static int[] sumAndCountNumbersInString(String inputString) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (Character.isDigit(c)) {
                count++;
                sum += Character.getNumericValue(c);
            }
        }
        return new int[]{count, sum};
    }

}
