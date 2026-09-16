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

    public static void primo (int a){
        boolean primo = true;
        for(int i=a-1; i>1; i--){
            if( a % i == 0 ){
                primo = false;
                break;
            }
            else{
                primo = true;

            }
        }
        if(primo == true){
            JOptionPane.showMessageDialog(null,"é primo");
        }
        else{
            JOptionPane.showMessageDialog(null,"não é primo");               
        }
    }

    public static int produto(int a,int b){
        int p = a*b;
        return p;

    }

    public static void tamanho(int a,int b){
        if(a>b){
        JOptionPane.showMessageDialog(null,"O maior num é " + a);
    }
        else{
            JOptionPane.showMessageDialog(null,"O maior num é " + b);        
        }
    }

    public static void main(){

    }
}