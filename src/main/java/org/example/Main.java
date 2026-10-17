package org.example;

import java.util.*;
import java.util.stream.IntStream;
import java.util.Collections;

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

        //pb 2 a) adaugare note
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
        }

        //b1) sortare alfabetica
        Collections.sort(studenti, new ByGroupsComparator());
        System.out.println("Sortati dupa grupa, nume si prenume:");
        for (Student s : studenti) {
            System.out.println(s);
        }
        System.out.println();

        //b2) sortare descrescatoare a mediilor pentru integralisti
        List<Student> integralisti =  new ArrayList<>();
        List<Student> restantieri =   new ArrayList<>();
        for (Student s : studenti) {
            if (s.esteIntegralist()) {
                integralisti.add(s);
            }
            else  {
                restantieri.add(s);
            }
        }
        Collections.sort(integralisti, new ByGradesComparator());
        System.out.println("Integralisti sortati descrescator dupa medie: ");
        for (Student s : integralisti) {
            System.out.println(s);
            System.out.println("Media: " + s.medie());
        }
        System.out.println();

        //b3) sortare crescatoare a numarului de restante pentru restantieri
        Collections.sort(restantieri, new ByFailsComparator());
        System.out.println("Restantieri sortati crescator dupa nr de restante:");
        for (Student s : restantieri) {
            System.out.println(s);
            System.out.println("Numar de restante: " + s.numarRestante());
        }
    }
}
