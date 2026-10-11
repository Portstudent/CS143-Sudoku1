public class sodukoEngine {
   public static void main(String[] args) {
      
      Board board = new Board("data1.sdk");
      System.out.println(board);
      
   }
}

/*

 ----jGRASP exec: java sodukoEngine
/-----------\
|2..|1.5|..3|
|.54|...|71.|
|.1.|2.3|.8.|
-------------
|6.2|8.7|3.4|
|...|...|...|
|1.5|3.9|8.6|
-------------
|.2.|7.1|.6.|
|.81|...|24.|
|7..|4.2|..1|
\-----------/

 ----jGRASP: Operation complete.
*/