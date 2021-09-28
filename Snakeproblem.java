package snakeladder;

   public class Snakeproblem {
	   public static void main(String[] args) {
		   int SNAKE=1, LADDER=2, Player=0, Count=0;
	        while (Player<100) {
	            int dice=(int)(Math.random()*6+1);
	            System.out.println("Dies Number" +dice);

	            int Play=(int)(Math.random()*3+1);
	            if (Play==LADDER) {
	                Player= Player+dice;
	                if (Player>100)
	                    Player=Player-dice;
	            }
	            else if (Play==SNAKE) {
	                Player=Player-dice;
	                if (Player<0)
	                    Player=0;
	                else if (Player>100)
	                    Player=Player-dice;
	            }
	            else {
	                Player=Player+0;
	            }
	            count++;
	            System.out.println("Player current position is: "+Player);
	        }
	        System.out.println(count+" Times the dice was played.");
	        }
	   }
   
   
	 		

