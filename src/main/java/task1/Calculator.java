package task1;

public class Calculator {

    public Calculator() {
    }

    public static <T extends Number> double sum(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number> double multiply(T a, T b){
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number> double divide(T a, T b){
        if (b.doubleValue() == 0.0){
            throw new ArithmeticException("Делить на 0 нельзя.");
        }
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number> double subtract(T a, T b){
        return a.doubleValue() - b.doubleValue();
    }


    public static void main(String[] args) {
        System.out.println(sum(5, 38.5));
        System.out.println(multiply(2.5f, 2));
        System.out.println(divide(6, 1.2f));
        System.out.println(subtract(78.45, 43.3f));
    }

}
