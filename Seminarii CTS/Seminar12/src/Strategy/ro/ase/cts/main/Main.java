package Strategy.ro.ase.cts.main;

import Strategy.ro.ase.cts.clase.ProbaOrala;
import Strategy.ro.ase.cts.clase.ProbaScrisa;
import Strategy.ro.ase.cts.clase.Student;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Cristina");

        student.setModSustinere(new ProbaScrisa());
        student.examinare();
    }
}
