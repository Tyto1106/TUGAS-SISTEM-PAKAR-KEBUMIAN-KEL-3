import java.util.*;


/**
 * UI sistem pakar untuk memeriksa apakah g bernilai true dari fakta a, b, c, f  
 * Sistem ini memiliki 4 pertanyaan yang akan diberikan pada user
 * 4 pertanyaan merepresentasikan 4 fakta
 * fact: a, b, c, f
 * conclussion: g
 * @author AERO
 */
public class UI {
    
    private ArrayList<String> questions;
    private int answers[];
    
    public int firstQuestion(){
        
        int gejalaPertama;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dari gejala-gejala di bawah ini mana yang ada pada tanah dilingkungan anda? \n "
                + "1. G1 \n "
                + "2. G6 \n "
                + "3. G11 \n "
                + "4. G15 \n "
                + "5. G20 \n "
                + "6. G28 \n "
                + "0. tidak satupun di atas");
        gejalaPertama = sc.nextInt();
        
        return gejalaPertama;
    }
    
    public void tes1(int a){
        System.out.println("gejala pertama adalah " + a);
    }
    
    
}
