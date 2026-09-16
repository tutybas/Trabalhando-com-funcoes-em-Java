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

    public static float radianos(float a){
        float z = (a * (float) 3.14)/180;
        return z;

    }

    public static void main(String[] args){
        boolean func = true;
        while(func){
            String opcao = JOptionPane.showInputDialog(null,"1.Cacular o dobro\n 2.Calcular o fatorial\n 3.Cacular a média\n 4.Verificar se é primo\n 5.Calcular produto\n 6.comparar tamanhos\n 7.Concerter para radianos\n 8.Sair\n\n\n");
            try{
                switch (opcao){
                    case "1":
                        int a;
                        String x =JOptionPane.showInputDialog(null,"Digite um numero");
                        a = Integer.parseInt(x);
                        Dobro(a);      
                    break;

                    case "2":
                        int a2,f2;
                        String x2 =JOptionPane.showInputDialog(null,"Digite um numero");
                        a2 = Integer.parseInt(x2);
                        f2 = fatorial(a2);
                        JOptionPane.showMessageDialog(null,"o fatorial é " + f2);
                    break;

                    case "3":
                        int a3,b3,c3,d3;
                        String x3 =JOptionPane.showInputDialog(null,"Digite a primeira nota");
                        a3 = Integer.parseInt(x3);
                        String y3 =JOptionPane.showInputDialog(null,"Digite a segunda nota");
                        b3 = Integer.parseInt(y3);
                        String w3 =JOptionPane.showInputDialog(null,"Digite a terceira nota");
                        c3 = Integer.parseInt(w3);
                        String z3 =JOptionPane.showInputDialog(null,"Digite a quarta nota");
                        d3 = Integer.parseInt(z3);
                        media(a3,b3,c3,d3);
                    break;

                    case "4":
                        int a4;
                        String x4 =JOptionPane.showInputDialog(null,"Digite um numero");
                        a4 = Integer.parseInt(x4);
                        primo(a4);
                    break;

                    case "5":
                        int a5,b5,p5;
                        String x5 =JOptionPane.showInputDialog(null,"Digite um numero");
                        a5 = Integer.parseInt(x5);
                        String y5 =JOptionPane.showInputDialog(null,"Digite outro numero");
                        b5 = Integer.parseInt(y5);
                        p5 = produto(a5,b5);
                        JOptionPane.showMessageDialog(null,"O produto é " + p5);
                    break;

                    case "6":
                        int a7,b7;
                        String x7 =JOptionPane.showInputDialog(null,"Digite um numero");
                        a7 = Integer.parseInt(x7);
                        String y7 =JOptionPane.showInputDialog(null,"Digite outro numero");
                        b7 = Integer.parseInt(y7);
                        tamanho(a7,b7);
                    break;

                    case "7":
                        float a6,r6;
                        String x6 =JOptionPane.showInputDialog(null,"Digite um grau");
                        a6 = Float.parseFloat(x6);
                        r6 = radianos(a6);
                        JOptionPane.showMessageDialog(null,"O produto é " + r6);
                    break;
                    
                    case "8":
                        func = false;
                    break;

                    default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");

                }
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Por favor, digite um numero.","ERRO!!",2);
            }
                
        }
    }
}