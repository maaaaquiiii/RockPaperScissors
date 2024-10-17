# Rock, Paper, Scissors Game
This project implements the classic Rock, Paper, Scissors game using the Model-View-Controller (MVC) design pattern. 
Players can choose to play against another player or the computer, with all input taken from the terminal.

## Project Structure

The project follows the MVC architecture:
1. Model: Contains the game logic and rules, including the moves and the comparisons between them.
2. View: Handles displaying information to the user, such as game results and messages.
3. Controller: Manages the interaction between the model and the view, as well as the overall game flow.

### Game Features
1. Play against another player.
2. Play against the computer.
3. Enumerations (Enums):
4. The project uses an enum called Move to represent the possible moves: ROCK, PAPER, SCISSORS.
5. Player Interface:
6. Defines the common action makeMove(), which is implemented by both human players and the computer.

## Installation and Execution
``
Clone the repository
``

git clone

``
Compile the project
``

`` 
Run the project
``

## Usage
```
When the game starts, you will be prompted to choose the game mode:
    Enter 1 to play against another player.
    Enter 2 to play against the computer.
If you choose to play against another player, both players must input their moves (ROCK, PAPER, or SCISSORS).
If you choose to play against the computer, only the human player will input their move.
After each round, the result will be displayed:
    Tie if both players chose the same move.
    Win or Lose based on the outcome of the game.
```

## Main Classes

```
Move: An enum that represents the possible moves (ROCK, PAPER, SCISSORS) and contains the logic to compare if one move beats another.
Player: An interface defining the makeMove() method.
HumanPlayer: Implements the Player interface and allows the user to choose a move via terminal input.
ComputerPlayer: Implements the Player interface and selects a random move.
GameView: Responsible for displaying game results to the user.
GameController: Controls the flow of the game and coordinates interaction between the model (moves) and the view.
```

### Customization

```
Add new moves: You can modify the Move enum to include additional moves and extend the game logic.
Graphical Interface: It’s possible to enhance the current text-based view by creating a graphical interface using libraries such as Swing or JavaFX.
```