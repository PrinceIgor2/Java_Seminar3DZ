/*  2.Пусть дан произвольный список целых чисел, удалить из него четные числа  */

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(ThreadLocalRandom.current().nextInt(1, 30));
        }
        System.out.print("Начальный список: ");
        System.out.println(list);
        System.out.print("Финальный список: ");
        list.removeIf(integer -> integer % 2 == 0);
        System.out.println(list);
    }
}