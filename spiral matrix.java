import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer> list=new ArrayList<>();
      if(matrix.length==0||matrix[0].length==0){
        return list;
      }
      int colB=0,colE=matrix[0].length-1;
      int rowB=0,rowE=matrix.length-1;
      while(colB<=colE&&rowB<=rowE){
        
      for(int i=colB;i<=colE;i++){
        list.add(matrix[rowB][i]);
      }
      rowB++;
    
      for(int i=rowB;i<=rowE;i++){
        list.add(matrix[i][colE]);
      }
      colE--;
      
      if(rowB<=rowE){
        for(int i=colE;i>=colB;i--){
            list.add(matrix[rowE][i]);
        }
         rowE--;
      }
     
      if(colB<=colE){
        for(int i=rowE;i>=rowB;i--){
            list.add(matrix[i][colB]);
        }
        colB++;
      }
      
      }

        return list;
    }
}