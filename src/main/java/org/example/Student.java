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
    public String getGrupa() {
        return grupa;
    }
    public void adaugaNote(){
        Random rand = new Random();
        for (int i = 0; i < note.size(); i++){
            note.add(rand.nextInt(10)+4);
        }
    }
    public boolean esteIntegralist(){
        return true;
    }
    public Integer medie(){
        int nr = note.size(), suma = 0, medie = 0;
        for  (int i = 0; i < note.size(); i++){
            suma += note.get(i);
    }
        medie = suma / nr;
        return medie;
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
