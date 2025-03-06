public class FindMaximum {
    public static void main(String[] args) {

        int length_of_args = args.length;
        if (length_of_args != 2) {
            System.out.println("You should give a score!!");
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        //boolean condition = num1 > num2;

        //int greatest = condition ? num1 : num2;
        //System.out.println(greatest);

        if (num1>num2){
            System.out.println("Number 1 is the maximum and it's value is: " +num1);
        }
        else if (num2>num1){
            System.out.println("Number 2 is the maximum and it's value is: " +num2);
        }
        else{
            System.out.println("Numbers are equal.");
        }
    }

}


