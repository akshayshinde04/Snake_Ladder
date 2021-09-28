package snakeladder;

   public class Snakeproblem {
	   public static void main(String[] args) {
	            int snake=1, ladder=2, player=0;
	            while (player<100) {
	            int dice=(int)(Math.random()*6+1);
	            System.out.println("The die number" +dice);

	            int check=(int)(Math.random()*3+1);
	            if (check==ladder) {
	                player= player+dice;
	            }
	            else if (check==snake) {
	                player=player-dice;
	                if (player<0) {
	                    player=0;
	                }
	            }
	            else {
	                player=player;
	            }
	            System.out.println("Player current position is: "+player);
	    }
	   }
   }
	 		

