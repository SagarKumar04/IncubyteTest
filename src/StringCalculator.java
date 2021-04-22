public class StringCalculator {
    public static int add(String text) {
        if(text.length() == 0) {
            return 0;
        }
        else {
            String arr[] = text.split(",");

            if(arr.length == 1) {
                return Integer.parseInt(text);
            }
            else {
                int num1 = Integer.parseInt(arr[0]);
                int num2 = Integer.parseInt(arr[1]);

                return (num1 + num2);
            }
        }

    }
}
