package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Student {
    private String nume;
    private String prenume;
    private String grupa;
    private List<Integer> note;
    public Student(String nume, String prenume, String grupa){
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        note = new ArrayList();
    }
    public String getNume() {
        return nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public String getGrupa() {
        return grupa;
    }
    public void adaugaNote() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            note.add(rand.nextInt(7) + 4);
        }
    }
    public boolean esteIntegralist(){
        for (Integer i : note) {
            if (i<5)
                return false;
        }
        return true;
    }
    public double medie(){
        int suma = 0;
        for  (Integer nota : note){
            suma += nota;
    }
        return suma / 5.0;
}
    public int numarRestante() {
        int nr = 0;
        for (Integer nota : note) {
            if (nota < 5) {
                nr++;
            }
        }
        return nr;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nume: " + nume + "\n");
        sb.append("Prenume: " + prenume + "\n");
        sb.append("Grupa: " + grupa + "\n");
        sb.append("Note: ");
        for (Integer i : note){
            sb.append(i + " ");
        }
        return sb.toString();
    }

}
