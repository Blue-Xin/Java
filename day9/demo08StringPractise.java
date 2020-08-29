package day9;

public class demo08StringPractise {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        String getString = getArrayToString(array);
        System.out.println(getString);
    }

    public static String getArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "word" + array[i] + "]";
            } else {
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }
}
