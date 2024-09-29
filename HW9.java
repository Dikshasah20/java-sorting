public class HW9 {
    // count of 7
    /* 
    public static void main (String args[]){
        int matrix[][]= {{4,7,8},{8,8,7}};

        int countof7= 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix[0].length;j++){
                if(matrix[i][j] == 7){
                    countof7++;
                }
            }
        }
        System.out.println("count of 7 is :" + countof7);

    }
        */


    // sumof 2nd row

    /*
    public static void main(String args[]){
        int matrix[][]={{1,4,9},{11,4,3},{2,2,3}};
        int sum =0;
        for(int j= 0 ;j <matrix[0].length;j++){
            // sum of 2nd row
            sum+= matrix[1][j];

        }
        System.out.println("sum is: " + sum);
    }
         */

    //traspose of matrix

    public static void printMatrix(int matrix[][]){
        System.out.println("The matrix is : ");
        for(int i= 0; i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.err.println();
        }
    }
    public static void main (String args[]){
        int row= 2 , col = 3;
        int matrix[][] = {{2,3,7},{5,6,7}};

        //Display original matrix
        printMatrix(matrix);

        //Transpose the matrix
        int [][] transpose = new int [col][row];
        for(int i= 0; i<row; i++){
            for(int j = 0; j< col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        //print transpose matrix
        printMatrix(transpose);


    }
}

