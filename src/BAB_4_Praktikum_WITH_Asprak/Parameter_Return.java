package BAB_4_Praktikum_WITH_Asprak;

public class Parameter_Return {
    public static void main (String [] args){
        System.out.println(fungsi(5));    
        System.out.println(fungsi(20));    
        fungsi(10);
    }
    
    static int fungsi(int x){
    int y = x+5;
        System.out.println(y + "*");
    return y;

    }
}
