package snakeladder;

   public class Snakeproblem {
	   public static void main(String[] args) {
	            int SNAKE=1, LADDER=2, Player=0;
	            while (Player<100) {
	            int dice=(int)(Math.random()*6+1);
	            System.out.println("The die number "+dice);

	            int check=(int)(Math.random()*3+1);
	            if (check==ladder) {
	                Player= Player+dice;
	                if (Player>100)
	                  Player=Player-dice;
	            }
	            else if (check==snake) {
	                Player=Player-dice;
	                if (Player<0)
	                    Player=0;
	                else if (Player>100)
	                    Player=Player-dice;
	            }
	            else {
	                Player=Player;
	            }
	            System.out.println("Player current position is: "+Player);
	        }
	   }
   } 
   
	 		

