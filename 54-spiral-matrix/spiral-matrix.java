class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr= new ArrayList<>();
        int row= matrix.length-1;
        int col= matrix[0].length-1;
        int rowBeg=0;
        int colBeg=0;

        while(rowBeg<= row && colBeg<=col)
        {
            for(int i= colBeg;i<=col;i++)
            {arr.add(matrix[rowBeg][i]);}
            rowBeg++;

            for(int i=rowBeg;i<=row;i++)
            {arr.add(matrix[i][col]);}
            col--;

            if(rowBeg<=row)
            {for(int i=col;i>=colBeg;i--)
            {arr.add(matrix[row][i]);}
            row--;
            }

            if(colBeg<=col)
            {for(int i=row;i>=rowBeg;i--)
            {arr.add(matrix[i][colBeg]);}
            colBeg++;}
        }
        return arr;
    }
}