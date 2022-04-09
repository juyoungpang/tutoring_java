public class TwoDimensionalArray {
    public static void main(String[] args){
        //Create array
        //Using new - row 3, col 2
        int scores[][] = new int[3][2];
        //Using initializer list - row 3, col 4
        int listScores[][] = {{1,4,2,6},{6,1,8,9},{4,7,8,2}};
        //Filling in 2D array
        scores[0][0]=5;
        scores[0][1]=6;
        //***scores[0][2]는 안됨! length가 2이면 index는 1까지만!
        scores[1][0]=7;
        scores[1][1]=8;
        scores[2][0]=9;
        scores[2][1]=10;

        //Get array length - row
        System.out.println(scores.length);
        //Get array length - col
        System.out.println(scores[0].length);

        //Traversing array using for loop - row-wise
        for(int row=0;row<scores.length;row++){
            for(int col=0;col<scores[0].length;col++) {
                System.out.print(scores[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("=====================");

        //Using enhanced for loop
        for(int[] row:scores){
            for(int num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}


