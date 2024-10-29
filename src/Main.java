import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static List<Rule> getKnowledge() throws FileNotFoundException, IOException
    {
        //ganti dengan lokasi project Anda nanti
        FileReader reader = new FileReader("D:\\JavaProject\\Tugas-Sistem-Pakar1\\Tugas-Sistem-Pakar1\\SistemPakar_DeteksiPenyakitTanamanJagung\\src\\knowledge_base");
        BufferedReader bufferedReader = new BufferedReader(reader);
        List<Rule> rules = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            //mengambil string bagian fact dulu baru conclussion
            rules.add(new Rule(
                    Arrays.asList(line.split("-")[0].split(",")), 
                    line.split("-")[1]));
        }
        
        bufferedReader.close();
        reader.close();
        return rules;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        UI tampilan = new UI();
        UIBulai cekBulai = new UIBulai();
        UIBlight cekBlight = new UIBlight();
        UILeafRust cekLeafRust = new UILeafRust();
        UIBurn cekBurn = new UIBurn();
        UIStemBorer cekStemBorer = new UIStemBorer();
        UICobBorer cekCobBorer = new UICobBorer();
        //tes bang
        int cat = tampilan.firstQuestion();
        tampilan.tes1(cat);
        
        switch(cat){
            case 1 -> {
                cekBulai.showQuestion();
                
                Set<String> facts  = cekBulai.getFacts();
                
                List<Rule> rules = getKnowledge();
                
                Set<String> inferedFacts = 
                InferenceForwardChaining.doForwardChaining(rules, facts);
                
                boolean bulaiIsTrue;
                
                if(inferedFacts.contains("P1"))
                    bulaiIsTrue = true;
                else
                    bulaiIsTrue = false;
                cekBulai.showConclussion(bulaiIsTrue, facts, inferedFacts);
                
                break;
            }
            case 2 -> {
                cekBlight.showQuestion();
                
                Set<String> facts  = cekBlight.getFacts();
                
                List<Rule> rules = getKnowledge();
                
                Set<String> inferedFacts = 
                InferenceForwardChaining.doForwardChaining(rules, facts);
                
                boolean blightIsTrue;
                
                if(inferedFacts.contains("P2"))
                    blightIsTrue = true;
                else
                    blightIsTrue = false;
                cekBlight.showConclussion(blightIsTrue, facts, inferedFacts);
                
                break;
            }
            case 3 -> {
                cekLeafRust.showQuestion();
                
                Set<String> facts  = cekLeafRust.getFacts();
                
                List<Rule> rules = getKnowledge();
                
                Set<String> inferedFacts = 
                InferenceForwardChaining.doForwardChaining(rules, facts);
                
                boolean leafIsTrue;
                
                if(inferedFacts.contains("P3"))
                    leafIsTrue = true;
                else
                    leafIsTrue = false;
                cekBlight.showConclussion(leafIsTrue, facts, inferedFacts);
                break;
            }
            case 4 -> {
                cekBurn.showQuestion();
                
                Set<String> facts  = cekBurn.getFacts();
                
                List<Rule> rules = getKnowledge();
                
                Set<String> inferedFacts = 
                InferenceForwardChaining.doForwardChaining(rules, facts);
                
                boolean burnIsTrue;
                
                if(inferedFacts.contains("P4"))
                    burnIsTrue = true;
                else
                    burnIsTrue = false;
                cekBlight.showConclussion(burnIsTrue, facts, inferedFacts);
                break;
            }
            case 5 -> {
                cekStemBorer.showQuestion();
                
                Set<String> facts  = cekStemBorer.getFacts();
                
                List<Rule> rules = getKnowledge();
                
                Set<String> inferedFacts = 
                InferenceForwardChaining.doForwardChaining(rules, facts);
                
                boolean stemIsTrue;
                
                if(inferedFacts.contains("P5"))
                    stemIsTrue = true;
                else
                    stemIsTrue = false;
                cekBlight.showConclussion(stemIsTrue, facts, inferedFacts);
                break;
            }
            case 6 -> {
                cekCobBorer.showQuestion();
                
                Set<String> facts  = cekCobBorer.getFacts();
                
                List<Rule> rules = getKnowledge();
                
                Set<String> inferedFacts = 
                InferenceForwardChaining.doForwardChaining(rules, facts);
                
                boolean cobIsTrue;
                
                if(inferedFacts.contains("P6"))
                    cobIsTrue = true;
                else
                    cobIsTrue = false;
                cekBlight.showConclussion(cobIsTrue, facts, inferedFacts);
                break;
            }
            default -> {
                System.out.println("Maaf kami belum bisa mendiagnosis penyakit tanaman anda");
                break;
            }      
        } 
    } 
}
