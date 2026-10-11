import java.util.*;
import java.io.*;

public class Board {
   private char[][] arrayB = new char[9][9];
   
   
   public Board(String file) {
      
      try {
         Scanner data = new Scanner(new File(file));
         int r = 0;
         while (data.hasNext()) {
            String token = data.next();  
            
            for (int c = 0; c < token.length(); c++) {
               char chara = token.charAt(c);
               arrayB[r][c] = chara;
            }      
            r++;
         }  
      } catch (FileNotFoundException e) {
         System.out.println("File not found.");
      }
   }
   
   public String toString() {
      String returnVal = "/-----------\\";
      
      for (int r = 0; r < arrayB.length; r++) {
         if ((r % 3 == 0) && (r != 9 && r != 0)) {
            returnVal += "\n-------------";

         }
         returnVal += "\n|";
         for (int c = 0; c < arrayB[r].length; c++) {
            if ((c % 3 == 0) && (c != 9 && c != 0)) {
               returnVal += "|";
            }
            char spot = arrayB[r][c];
            returnVal += spot;
         }
         returnVal += "|";
      }
      returnVal += "\n\\-----------/";
      return returnVal;
   }
}
