Number Guessing Game
📌 Overview
The Number Guessing Game is a Java console application where the computer randomly selects a number between 1 and 100, and the player attempts to guess it. The game provides hints after each guess, tracks the number of attempts, calculates a score for each round, and maintains a cumulative score across multiple rounds.
✨ Features
Random number generation between 1 and 100
Unlimited guessing attempts until the correct number is found
Hint system:
Too High!
Too Low!
Input validation using exception handling
Round-based scoring system
Total score tracking
Option to play multiple rounds
Simple and interactive console interface
🛠 Technologies Used
Java
Object-Oriented Programming (OOP)
Random Class
Scanner Class
Exception Handling
Loops and Conditional Statements
📂 Project Structure
NumberGuessingGame/
│
├── NumberGuessingGame.java
├── .gitignore
└── README.md
🚀 How to Run
1. Compile the program
javac NumberGuessingGame.java
2. Run the program
java NumberGuessingGame
🎮 How to Play
The computer generates a random number between 1 and 100.
Enter your guess.
The program will display:
Too High! if your guess is greater than the target number.
Too Low! if your guess is smaller than the target number.
Continue guessing until you find the correct number.
After each round:
Your round score is calculated.
Your total score is updated.
Choose Y to play another round or N to exit the game.
📷 Sample Output
===== NUMBER GUESSING GAME =====

I have selected a number between 1 and 100.
Try to guess it!

Enter your guess: 50
Too Low!

Enter your guess: 75
Too High!

Enter your guess: 63
Correct!

You guessed the number in 3 attempts.
Round Score: 80
Total Score: 80

Play Again? (Y/N): N

===== GAME OVER =====
Final Score: 80
I Hope You enjoyed this game
Thank you for playing!
📊 Scoring System
Attempts
Score
1
100
2
90
3
80
4
70
5
60
6
50
7
40
8
30
9
20
10 or more
10 (Minimum Score)
🎯 Learning Outcomes
Random Number Generation
User Input Handling
Exception Handling
Loops and Conditional Logic
Score Calculation
Console-Based Game Development
🔮 Future Enhancements
Multiple Difficulty Levels (Easy, Medium, Hard)
Limited Number of Attempts
Leaderboard with High Scores
Timer-Based Challenge Mode
Graphical User Interface (GUI) using Java Swing or JavaFX
