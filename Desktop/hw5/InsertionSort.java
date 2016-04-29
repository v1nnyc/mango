public class InsertionSort {
   public static void insertionSort(int numbers [], int numbersSize) {
      int i = 0;
      int j = 0;
      int temp = 0;  // Temporary variable for swap

      for (i = 1; i < numbersSize; ++i) {
         j = i;
         // Insert numbers[i] into sorted part 
         // stopping once numbers[i] in correct position
         while (j > 0 && numbers[j] < numbers[j - 1]) {

            // Swap numbers[j] and numbers[j - 1]
            temp = numbers[j];
            numbers[j] = numbers[j - 1];
            numbers[j - 1] = temp;
            --j;
            System.out.print("[");
         for(int k = 0; k < numbers.length; k++){
           
           System.out.print(numbers[k] + ", " );
           
         }
         System.out.print("]");
         System.out.println(" ");
         }
         
      }
   }

   public static void main(String [] args) {
      int numbers [] = {10, 2, 78, 4, 45, 32, 7, 11};
      final int NUMBERS_SIZE = 8;
      int i = 0;

      System.out.print("UNSORTED: ");
      for (i = 0; i < NUMBERS_SIZE; ++i) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();

      /* initial call to quicksort with index */
      insertionSort(numbers, NUMBERS_SIZE);

      System.out.print("SORTED: ");
      for (i = 0; i < NUMBERS_SIZE; ++i) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();

      return;
   }
}