public class FindingSmallestLargest {
    public static void main(String[] args) {
        int[] numbers = {45, 22, 89, 16, 90, 33};
        
        int smallest=numbers[0];
        int largest=numbers[0];
        
        for(int number:numbers){
            if(smallest>number){
                smallest=number;
                
            }
            if(largest<number){
                largest=number;
            }
            
        }
        System.out.println("Smallest: "+ smallest + " Largest: "+ largest);
    }
}
