package March4_2020;

public class DivisableByFour {
    public static void main(String[] args) {
        int[][] numbers = TenByTenArray.generateArray(10);
        printDivisibleFour(numbers);
    }
    public static void printDivisibleFour(int[][] arr){
        for(int[] row:arr){
            for(int number:row){
                if(number%4==0)
                    System.out.print("\t"+number);
                else
                    System.out.print("\t -");
            }
            System.out.println();
        }
    }
}