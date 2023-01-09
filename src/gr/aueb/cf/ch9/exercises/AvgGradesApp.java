package gr.aueb.cf.ch9.exercises;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AvgGradesApp {
    final static Path path = Paths.get("c:/Users/gvogi/desktop/log.txt");
    final static Path studentAvgGrades = Paths.get("c:/Users/gvogi/desktop/primOut.txt");
    final static int TOTAL_NUM_OF_GRADES = 2;

    public static void main(String[] args) {
        try {
            calculateAvg();
        } catch (IOException e) {
            System.out.println("Could not find/read file or directory!");
        }
    }

    public static void calculateAvg() throws IOException  {
        String readLine;
        String[] studentsAndGrades;
        String outputStudentAvg;

        try (BufferedReader bf = new BufferedReader(new FileReader("c:/Users/gvogi/desktop/grades.txt", StandardCharsets.UTF_8))) {
            while ((readLine = bf.readLine()) != null) {
                studentsAndGrades = readLine.split(" +");
                String firstname = studentsAndGrades[0];
                String lastname = studentsAndGrades[1];
                double grade1 = Double.parseDouble(studentsAndGrades[2]);
                double grade2 = Double.parseDouble(studentsAndGrades[3]);

                if (!((grade1 < 0 ) || (grade1 > 10 ) || (grade2 < 0) || (grade2 > 10 ))){
                    PrintStream ps = new PrintStream(new FileOutputStream(studentAvgGrades.toFile(), true),
                            true, StandardCharsets.UTF_8);
                        double avgGrades = (grade1 + grade2) / TOTAL_NUM_OF_GRADES;
                        outputStudentAvg = (firstname + " " + lastname + " " + avgGrades);
                        ps.println(outputStudentAvg);
                } else {
                    log("Βαθμός εκτός βαθμολογικής κλίμακας για τον μαθητή:", firstname, lastname);
                }
            }
        } catch(IOException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static void log(String... messages) throws IOException {
        try (PrintStream ps = new PrintStream(new FileOutputStream(path.toFile(), true))){
            for (String message : messages) {
                ps.printf("%s", message + " ");
            }
            ps.println();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
