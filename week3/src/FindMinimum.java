public class FindMinimum {
    public static void main(String[] args) {

        int length_of_args = args.length;
        if (length_of_args != 3) {
            System.out.println("You should give a score!!");
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        //boolean min_num1 = num1 < num2 && num1 < num3;
        //boolean min_num2 = num2 < num1 && num2 < num3;
        //int minimum = min_num1 ? num1:
        //                        min_num2 ? num2:num3;
        //System.out.println(minimum);

        if (num1 < num2 && num1 < num3) {
            System.out.println("The smallest number is num1: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("The smallest number is num2: " + num2);
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("The smallest number is num3: " + num3);
        } else {
            System.out.println("All numbers are equal");
        }
    }
}

