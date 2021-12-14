public class twoPlayers{

	public static final int noPlayOption = 0;
        public static final int ladderOption = 1;
        public static final int snakeOption = 2;
        int player = 0;
        public static void main(String[] args){
        double position = 0;
        double diceRollCount = 0;
        while (position < 100){
               double diceRoll = (Math.floor(Math.random() * 10) % 6) + 1;
		diceRollCount++;
               System.out.println("Dice rolled value: " + diceRoll);
               int option = (int) Math.floor(Math.random() * 10) % 3;
                switch (option) {
                        case noPlayOption:
                                System.out.println("Player " + player + "Position: " + position);
                                break;
                        case ladderOption:
                                if(position + diceRoll <= 100){
                                        position = position + diceRoll;
                                }
				System.out.println("Player " + player + "Position: " + position);
                                break;
                        case snakeOption:
                        	position = position - diceRoll;
                        	if (position < 0)
                        	{
                        	    position = 0;
                        	}
                        	System.out.println("Player " + player + "Position: " + position);
                        	break;
                }
		if(option == noPlayOption || option == snakeOption){
			if(player == 0){
				player = 1;
			}
			else{
				player = 0;
			}
		}
        }
         System.out.println("Player " + player + " Wins with Die Roll :" + diceRollCount);
        }
}
