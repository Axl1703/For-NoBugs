package practice_8.homework.generics;

public class ArrayGeneric {
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
