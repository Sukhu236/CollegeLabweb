
public class Searchingforelement {
    public static void main (String[] args){
            int[] arr = {10,20,30,40,50,60,70,80,90,100};

            int search = 10 ;

            boolean found = false;

            for(int i = 0; i < arr.length; i ++){

                if(search == arr[i]){
                    System.out.println("Element you enter : " + arr[i]);
                    System.out.println("Element found at index : " + i);
                    found = true ;
                

                }
            
            }
            if(!found){

                System.out.println("Element not found");

            }
        
    }
}
