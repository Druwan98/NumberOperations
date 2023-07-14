package exercises.numberOperation;

public class numberOperations {
    public static void main(String[] args) {
        int a = 15 + 5 - 4;
        int b = a;
        b += 1;

        int multipleOf3OrNot = b * b + 1;

        System.out.println(b);                        //output 17 is odd number
        System.out.println(multipleOf3OrNot % 3);     //output 2 is not a multiple of 3
    }
}
