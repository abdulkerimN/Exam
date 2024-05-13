/* dsa question 6 */


public class DeleteElementAtIndex {
    public static int[] deleteElement(int[] array, int index) {
    	int [] numbers= {3, 7, 1, 9, 4};
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index.");
            return array;
        }

        int[] newArray = new int[array.length - 1];
        int newArrayIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[newArrayIndex++] = array[i];
            }
        }
        return newArray;
    }
}