package testTask;

public class Test {
    public static void main(String[] args) {
        double[] array = {11, 5.8, 11.1, 10.9};
        double min = Double.MAX_VALUE;
        System.out.println(min);
        for (int i = 0; i < array.length;i++){
            min = Math.min(min, array[i]);
        }
        System.out.println(min);

    }
}
