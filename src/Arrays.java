public class Arrays {
    public static void main(String[] args){
        //Create array
        //Using new
        int scores[] = new int[5];
        //Using initializer list
        int listScores[] = {1,5,2,3,4,5,6};

        //Get array length
        System.out.println(scores.length);

        //Traversing array using for loop
        for(int i=0;i<listScores.length;i++){
            System.out.print(listScores[i]+" ");
        }

        System.out.println();

        //Traversing array backwards
        for(int i=listScores.length-1;i>=0;i--){
            System.out.print(listScores[i]+" ");
        }

        System.out.println();

        //Using enhanced for loop
        for(int score:listScores){
            System.out.print(score+" ");
        }
    }
}
