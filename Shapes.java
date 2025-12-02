public class Shapes{
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
        Turtle turtle = new Turtle();
        Turtle turtle2 = new Turtle(100,100);
        Turtle turtle3 = new Turtle(-100, -100);
        
        for(int i = 0; i <=4; i++){
         turtle.forward(100);
         turtle.right(90);
         }
       
        // Task 2: Draw a regular shape many times
        for(int x = 0; x <= 5; x++){
        for(int i = 0; i <=4; i++){  
         turtle2.forward(100);
         turtle2.right(90);
         }
         }
      
        // Task 3: How many times does Turtle turn!
        int cumulativeSum = 0;
       
        // x = 1; x <=5; multiplied by i= 0; i<=4; is 5 x 5
        for(int x = 1; x <= 5; x++){
        for(int i = 0; i <=4; i++){  
         turtle3.forward(100);
         turtle3.right(90);
         cumulativeSum++;
         }
       
         }
         System.out.println("turtle3 has turned " + cumulativeSum + " times!");


        // Extension 1:


        // Extension 2:

    }
}
