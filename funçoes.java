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

    public static void media(int a,int b,int c,int d){
        int i = (a + b +c +d)/4;
        JOptionPane.showMessageDialog(null,"A media é "+i);
    }


    public static void main(){

    }
}