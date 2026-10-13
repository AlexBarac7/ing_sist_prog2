package org.example;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList(); //a
        Set<Integer> zSet = new TreeSet(); //b
        List<Integer> xMinusY = new ArrayList();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList(); //d
        List<Integer> Comune = new ArrayList();
        java.util.Random rand = new java.util.Random();
        IntStream.range(0, 5).forEach(i -> x.add(rand.nextInt(10)));
        IntStream.range(0, 7).forEach(i -> y.add(rand.nextInt(10)));
        Collections.sort(x);
        Collections.sort(y);
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        System.out.println(x);
        System.out.println(y);
        Collections.sort(xPlusY);
        System.out.println(xPlusY);
        Comune.addAll(x);
        Comune.retainAll(y);
        zSet.addAll(Comune);
        System.out.println(zSet);
        xMinusY.addAll(x);
        xMinusY.removeAll(y);
        System.out.println(xMinusY);
        for (int i = 0; i < xPlusY.size(); i++) {
            if (xPlusY.get(i) < p)
                xPlusYLimitedByP.add(xPlusY.get(i));
        }
        System.out.println(xPlusYLimitedByP);

        //pb 2
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Popescu", "Marian", "225_3"));
        studenti.add(new Student("Popescu", "Maria", "225_3"));
        studenti.add(new Student("Popa", "Marian", "225_3"));
        studenti.add(new Student("Bica", "Irina", "225_3"));
        studenti.add(new Student("Badea", "Ion", "225_1"));
        studenti.add(new Student("Cacoveanu", "Andreea", "225_1"));
        studenti.add(new Student("Onofrei", "Mircea", "225_1"));
        for (Student s : studenti) {
            s.adaugaNote();
            System.out.println(s);
        }
    }
}
