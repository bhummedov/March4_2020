package March4_2020;

public class CollumnArraySum {
    public static void main(String[] args) {
        int[][] numbers = TenByTenArray.generateArray(10);
        printRowSums(numbers);
    }

    public static void printRowSums( int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[j][i];
            }
            System.out.println("Sum of row " + (int) (i + 1) + " : " + sum);
        }
    }
}
