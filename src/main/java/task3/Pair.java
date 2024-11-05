package task3;

public class Pair <T, V>{
    private T first;
    private  V second;


    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond(){
        return second;
    }

    @Override
    public String toString() {
        return String.format("Первое значение - %s, второе значение - %s", first, second);
    }

    public static void main(String[] args) {
        Pair<Double, String> pair = new Pair<>(3.14, "completed");
        System.out.println(pair);
    }
}
