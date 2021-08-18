package Main;

public class task4 {
    static public void main(String[] args){
        int sum = 0;
        int product = 1;


        for (String arg : args) {
            sum = sum + Integer.parseInt(arg);
        }

        System.out.println("The sum is " + sum);

        for(String arg : args){
            product = product* Integer.parseInt(arg);
        }

        System.out.println("The product is " + product);
    }
}
