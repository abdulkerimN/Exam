/* dsa question 4 Implement the bubble sort algorithm to sort an array of alphabets (ASCII).*/

public class BubbleSortAlphabets {
    public static void bubbleSort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
mystack.pop()

print(mystack.array)
print(mystack.is_full())
print(mystack.is_empty())


