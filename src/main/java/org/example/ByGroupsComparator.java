package org.example;

import java.util.Comparator;
public class ByGroupsComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        int rez = o1.getGrupa().compareTo(o2.getGrupa());
        if (rez==0)
            rez = o1.getNume().compareTo(o2.getNume());
        if (rez==0)
            rez =  o1.getPrenume().compareTo(o2.getPrenume());
        return rez;
    }
}

