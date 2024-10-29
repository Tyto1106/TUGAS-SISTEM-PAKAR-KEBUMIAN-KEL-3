
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bayu
 */
public class UILeafRust {
    private ArrayList<String> questions;
    private int answers[];
    
    public UILeafRust()
    {
        this.answers = new int[4];
        this.questions = new ArrayList<String>();
        this.setQuestions();
    }
    
    private void setQuestions()
    {
        //Q1
        questions.add("Apakah Anda mengalami G10?");
        //Q2
        questions.add("Apakah Anda mengalami G12?");
        //Q3
        questions.add("Apakah Anda mengalami G13?");
        //Q4
        questions.add("Apakah Anda mengalami G14?");
        
    }
    
    public void showQuestion()
    {
        Scanner sc = new Scanner(System.in);
        int i =0;
        for(String q: this.questions)
        {
            System.out.println(q);
            System.out.println("0. Tidak    1.Ya");
            int a = sc.nextInt();
            while(a != 0 && a!=1)
            {
                System.out.println("Jawaban tidak sesuai!");
                a = sc.nextInt();
            }
            answers[i] = a;
            i++;
        }
    }
    
    public Set<String> getFacts()
    {
        Set<String> facts = new HashSet<>();
        facts.add("G11");
        if(answers[0] == 1)
            facts.add("G10");
        if(answers[1] == 1)
            facts.add("G12");
        if(answers[2] == 1)
            facts.add("G13");
        if(answers[3] == 1)
            facts.add("G14");
        return facts;
    }
    
    public void showConclussion(boolean leaf, Set<String> facts, Set<String> inferedFacts)
    {
        System.out.println("All facts: " + facts);
        System.out.println("Inferred facts: " + inferedFacts);
        if(leaf == true)
        {
            System.out.println("iya iya iya Leaf Rust");
        }
        else
        {
            System.out.println("tidak tidak tidak Leaf Rust");
        }
    }
}
