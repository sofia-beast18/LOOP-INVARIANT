package INSERTION;
import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class FindX {

    public static void main(String[] args) {
     
        
        
        Scanner read = new Scanner(System.in);
        
        
        System.out.println("Set the array's length");
        int l = read.nextInt();
        int[] array = new int[l];
        
        for(int i=0; i<array.length; i++){
            System.out.println((i+1) + ")Set a number: ");
            array[i]= read.nextInt();
        }
        
        System.out.println("Set the number to find: ");
        int x = read.nextInt();
        int c=0, f=0;
        
        for(int i=0; i<array.length; i++){
        if(x==array[i]){
            c++;
            f=i+1;
        }    
        }
            switch (c){
                case 0:
                    System.out.println("The number wasn't found");
                    break;
                case 1:
                    System.out.println((f));
                break;
                default: 
                break;
            }
        //LOOP INVARIANT
        
        boolean invert = false;
        int k=0;
        
        for(int i=0; i<array.length;i++){
            if((array[i]==x && i==f-1) || (array[i]!=x && i!=f-1)){
                k=1;          
        }else{
                k=0;
            }
        
        
    }
        if(k!=0){
            invert=true;
        }
        System.out.println(invert);
        
}
    }
        
