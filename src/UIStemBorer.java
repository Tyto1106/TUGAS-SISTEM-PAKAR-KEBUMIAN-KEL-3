import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UIStemBorer {
    private ArrayList<String> questions;
    private int answers[];

    public UIStemBorer() {
        this.answers = new int[7];
        this.questions = new ArrayList<>();
        this.setQuestions();
    }

    private void setQuestions() {
        questions.add("Apakah Anda mengalami G21?");
        questions.add("Apakah Anda mengalami G22?");
        questions.add("Apakah Anda mengalami G23?");
        questions.add("Apakah Anda mengalami G24?");
        questions.add("Apakah Anda mengalami G25?");
        questions.add("Apakah Anda mengalami G26?");
        questions.add("Apakah Anda mengalami G27?");
    }

    public void showQuestion() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        for (String q : this.questions) {
            System.out.println(q);
            System.out.println("0. Tidak    1. Ya");
            int a = sc.nextInt();
            while (a != 0 && a != 1) {
                System.out.println("Jawaban tidak sesuai!");
                a = sc.nextInt();
            }
            answers[i] = a;
            i++;
        }
    }

    public Set<String> getFacts() {
        Set<String> facts = new HashSet<>();
        if (answers[0] == 1) facts.add("G20");
        if (answers[1] == 1) facts.add("G21");
        if (answers[2] == 1) facts.add("G22");
        if (answers[3] == 1) facts.add("G23");
        if (answers[4] == 1) facts.add("G24");
        if (answers[5] == 1) facts.add("G25");
        if (answers[6] == 1) facts.add("G26");
        if (answers[7] == 1) facts.add("G27");
        return facts;
    }

    public void showConclussion(boolean blight, Set<String> facts, Set<String> inferredFacts) {
        System.out.println("All facts: " + facts);
        System.out.println("Inferred facts: " + inferredFacts);
        if (blight) {
            System.out.println("StemBorer detected.");
        } else {
            System.out.println("No StemBorer detected.");
        }
    }
}
