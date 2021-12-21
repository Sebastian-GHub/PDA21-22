package Großübung;

public class RugbyGame {

	public static void main(String[] args) {
		RugbyGame game = new RugbyGame();
		game.teamA.getPlayer(1).setBall(new Ball());
		game.teamA.getPlayer(1).pass(game.teamA.getPlayer(4));
		game.teamB.getPlayer(2).attack(game.teamA.getPlayer(4));
		game.teamB.getPlayer(2).pass(game.teamB.getPlayer(10));
		game.teamB.getPlayer(10).score(game.teamA.getGoal());
		game.displayScore();
		game.teamA.getPlayer(1).pass(game.teamA.getPlayer(8));
		game.teamA.getPlayer(8).score(game.teamB.getGoal());
		game.displayScore();
		
	}
	
	private Team teamA;
	private Team teamB;
	
	public RugbyGame() {
		teamA = new Team("A");
		teamB = new Team("B");
	}

	public void displayScore() {
		System.out.println(teamA.getScore() + ":" + teamB.getScore());
	}

}