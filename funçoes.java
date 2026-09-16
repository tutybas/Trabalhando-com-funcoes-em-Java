package funçôes;
import javax.swing.JOptionPane;

public class funçoes{
    
    public static void Dobro(int a){
        int i = a*2; 
        JOptionPane.showMessageDialog(null,"o dobro do numero é "+i);
    }

    public static int fatorial (int a){
        for(int i=a-1; i>=1; i--){
           a *= i;
        }
        return a;
    }


    public static void main(){

    }
}