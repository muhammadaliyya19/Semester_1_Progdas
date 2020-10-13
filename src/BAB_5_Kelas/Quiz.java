package BAB_5_Kelas;

public class Quiz {
    public static void main(String[]args ){
    char [] a = {'M' , 'K' , 'D'};
    char [] b = {'Z' , 'Z' , 'Z'};
    a[0] = b[0];
    a[1] = b[1];
    a[2] = b[2];
    b[0] = 'D';
    b[1] = 'K';
    b[2] = 'M';
    for(int i = 0 ; i < a.length ; i++){
        System.out.println(b[i]);
    }
    }
    
}
