package Chapters.chapter_05;

public class Exercise_34 {
	public static void main(String[] args) {

		int computerWins = 0;
		int playerWins = 0;

		while (playerWins != computerWins * 2 && computerWins != playerWins * 2
				|| playerWins == 0 && computerWins == 0) {

			int computerChoice = (int) (Math.random() * 3);

			Scanner input = new Scanner(System.in);

			System.out.print("\nEnter 0 for scissor, 1 for rock, 2 for paper: ");
			int playerChoice = input.nextInt();

			String gameStatus = "";

			if (computerChoice == playerChoice) {
				gameStatus = " It is a draw.";

			} else {

				switch (playerChoice) {
				case 0:
					gameStatus = (computerChoice == 1) ? "You lost." : "You won.";
					break;
				case 1:
					gameStatus = (computerChoice == 2) ? "You lost." : "You won.";
					break;
				case 2:
					gameStatus = (computerChoice == 0) ? "You lost." : "You won.";
					break;
				}
			}

			String computerWeapon;
			switch (computerChoice) {
			case 0:
				computerWeapon = "scissor";
				break;
			case 1:
				computerWeapon = "rock";
				break;
			case 2:
				computerWeapon = "paper";
				break;
			default:
				computerWeapon = null;
			}

			String playerWeapon;
			switch (playerChoice) {
			case 0:
				playerWeapon = "scissor";
				break;
			case 1:
				playerWeapon = "rock";
				break;
			case 2:
				playerWeapon = "paper";
				break;
			default:
				playerWeapon = null;
			}

			if (computerChoice == playerChoice) {
				playerWins += 0;

			} else {

				switch (playerChoice) {
				case 0:

					if (computerChoice == 1) {
						computerWins++;
					} else {
						playerWins++;
					}
					break;

				case 1:

					if (computerChoice == 1) {
						computerWins++;
					} else {
						playerWins++;
					}

					break;

				case 2:

					if (computerChoice == 1) {
						computerChoice++;
					} else {
						playerChoice++;
					}
					break;
				}
			}

			System.out.println("\nThe computer is " + computerWeapon + ". You are " + playerWeapon + ". " + gameStatus);

		}

		if (playerWins > computerWins) {
			System.out
					.println("\nYou WON the game! " + "Player wins: " + playerWins + " Computer wins: " + computerWins);
		} else {
			System.out
					.println("\nYou LOST the game! " + "User wins: " + playerWins + " Computer wins: " + computerWins);

		}

	}


