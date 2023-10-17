package Tasks;
public class TreeTask  {
        public static void main(String[] args) {
            String input = "(2,4), (3,4), (5,2), (6,3), (8,4)";
    
            // Remove spaces and split the input by commas
            String[] inputParts = input.replaceAll(" ", "").split(",");
    
            // Create an array to store the integers
            int[] integerArray = new int[inputParts.length];
    
            // Iterate through the input parts and parse them to integers
            for (int i = 0; i < inputParts.length; i++) {

                String[] pair = inputParts[i].replaceAll("[()]", "").split(",");
                
                int firstInt = Integer.parseInt(pair[0]);
                
                integerArray[i] = firstInt;
            }

            for(int i=0; i<integerArray.length/2; i=i+2) {
                int count = 0;
                for(int j=2; i<integerArray.length/2 - 2 ; j=j+2) {
                    if(integerArray[i]==integerArray[j]) {
                        count ++;
                    }
                    
                }
                if(count>2) {
                    System.out.println("False");
                    break;
                }
                count = 0;
                System.out.println("True");
            }
    
            // Print the integer array
            System.out.println("Integer Array:");
            for (int num : integerArray) {
                System.out.print(num + " ");
            }
        }
    }
    

