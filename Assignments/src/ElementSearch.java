public class ElementSearch {
  public static void main(String[] args) {
      int[] array = {5, 10, 15, 20, 25};
      int target = 15;
      boolean found = false;

      // Linear search to find the element
      for (int i = 0; i < array.length; i++) {
          if (array[i] == target) {
              found = true;
              System.out.println("Element " + target + " found at index " + i);
              break;
          }
      }

      if (!found) {
          System.out.println("Element " + target + " not found in the array.");
      }
  }
}