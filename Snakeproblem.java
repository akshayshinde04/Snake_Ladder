package snakeladder;

   public class Snakeproblem {
	   public static void main(String[] args) {
		    int SNAKE=1, LADDER=2, Player=0, count=0;
	        int Player1=0, Player2=0;
	        while (Player1<100 && Player2<100) 
	        {
	            int dice=(int)(Math.random()*6+1);
	            int play=(int)(Math.random()*3+1);

	            if (play==LADDER) {
	                Player= Player+dice;
	                if (Payer>100)
	                    Player=Player-dice;
	            }
	            else if (play==SNAKE) {
	                Player=Player-dice;
	                if (Player<0)
	                    Player=0;
	                else if (Player>100)
	                    Player=Player-dice;
	            }
	            if (count%2==0) {
	                Player1 = Player;
	                System.out.println("Player1 current position is: " +Player1);
	            }
	            else {
	                Player2 = Player;
	                System.out.println("Player2 current position is: "+Player2);
	            }
	            count++;
//	          System.out.println("Player current position is: "+Player);
	        }
	        System.out.println("\n"+count+" times the dice was played.\n");
	        System.out.println(Player1+" position");
	        System.out.println(Player2+" position.");

	        if (Player1>Player2)
	            System.out.println("The winner of this game is Player1");
	        else
	            System.out.println("The winner of this game is Player2");
	    }
	        }
	   
   
   
	 		

