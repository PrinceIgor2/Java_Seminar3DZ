// 3.Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.


import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
  
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(ThreadLocalRandom.current().nextInt(1, 51));
        }
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.print("минимальное -> ");
        System.out.println(list.get(0));
        System.out.print("максимальное -> ");
        System.out.println(list.get(list.size()-1));
        int sumElements = list.stream().mapToInt(integer -> integer).sum();
        System.out.print("среднее -> ");
        System.out.println((float)sumElements / list.size());
    }
}