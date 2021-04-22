public class StringCalculator {
    public static int add(String text) {
        if(text.length() == 0) {
            return 0;
        }
        else {
            String numArr[] = text.split("[\\W]");
            int countOfNumbers = numArr.length;

            if(countOfNumbers == 1) {
                return Integer.parseInt(text);
            }
            else if(countOfNumbers == 2) {
                int num1 = Integer.parseInt(numArr[0]);
                int num2 = Integer.parseInt(numArr[1]);

                return (num1 + num2);
            }
            else {
                int sum = 0;
                for(int i = 0; i < countOfNumbers; i++) {
                    int num = Integer.parseInt(numArr[i]);
                    sum = sum + num;
                }

                return sum;
            }
        }
    }
}
