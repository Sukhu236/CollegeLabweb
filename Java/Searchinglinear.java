package Java;

public class Searchinglinear {
    public static void main(String[] args) {
        int[] marks = {3,4,5,6,7,8};
        int search = 6;

            for(int i = 0; i < marks.length; i ++){

                if(marks[i] == search){

                    System.out.println("number at place --> " + i);
                    System.out.println("The number you search --> " + search);
                }
                
            }
        
    }
    
}
