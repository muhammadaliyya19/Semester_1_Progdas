package BAB_6_Kelas_String;

public class String_13_Des_016 {
    public static void main (String [] args)   {
        //PART I
        String s  = new String("hell yeah");
        
        String s1 = "Hello ladies";
        char charArray[] = new char [5]; 
        
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray,3,2);
        
        System.out.printf("s1 = %s",s1);
        System.out.printf("\nlength of s1 = %d\n",s1.length());
        System.out.println("Reverse is");
        for(int count = s1.length()-1 ; count >=0 ; count--){
            System.out.printf("%s",s1.charAt(count));
        s1.getChars(0, 5, charArray, 0);
          
        }
        /*
        PART II
        String s1 = new String ("hello");
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";
        
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.compareTo(s1));
        System.out.println(s3.compareTo(s4));
        System.out.println(s4.compareTo(s3));
        
        if(s3.equalsIgnoreCase(s4)){System.out.println("True");}
        else{System.out.println("False");}
        
        if(s3.equals(s4)){System.out.println("True");}
        else{System.out.println("False");}
        
        if(s3.regionMatches( true, 0, s4, 0, 5)){System.out.println("first 5 char of s3 and s4 match");}
        else{System.out.println("False");} 
        */
        }
    }

