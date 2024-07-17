package array;

public class array01 {
    public static void main(String[] args) {

        int[][] arr = new int[5][2];

        int i = 1;

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
                System.out.print(arr[row][column]+" ");
            }
            System.out.println();
        }

//        for (int row = 0; row < arr.length; row++) {
//            for (int column = 0; column < arr[row].length; column++) {
//                System.out.print(arr[row][column] + " ");
//            }
//            System.out.println();
//        }

    }
}
