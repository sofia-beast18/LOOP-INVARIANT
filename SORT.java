package INSERTION;

/**
 *
 * @author sofia
 */
public class SORT {

    public static void main(String[] args) {
        
        int[] array = new int[]{3,5,1,6,2,4};
        int aux=0;
      
        for(int i=1;i<array.length;i++){
            
            for(int j=1;j<array.length;j++){
                if(array[i]<array[j-1]){
                    aux=array[i];
                    array[i]=array[j-1];
                    array[j-1]=aux;
                }
            }
            
        }
        
        for(int i=0;i<array.length;i++){
            
            System.out.println(array[i]);
            
        }
        
        // loop invariant: let's proof this algorithm
        boolean invert=false;
        int invertv=0;
        
        for(int i=0; i<array.length-1;i++){
            if(array[i]<=array[i+1]){
                invert=true;
            }else{
                invertv=1;
            }
        }
        
        if(invertv!=0){
            invert=false;
        }
        
        System.out.println(invert);
        
        
        
        
        
        
    }
    
}
