# Tennis

Solution for the scoring of a simple "Tennis" game, given a valid sequence of scores between 2 players, produces the winner of the game.

## Purpose

By solving the tennis problem with use of Test Driven Development (TDD) approach, getting to know further usage and benefits of using TDD in day-to-day coding and improve the overall understanding of TDD.

## Approach

Using JAVA as the base and  Maven to handle the dependencies, following the approach of TDD to achieve the solution.
Creating test cases and developing accordingly to pass the test.

##### Tennis Scoring System

1. Each player can have either of these points in one game 0 15 30 40

2. If you have 40 and you win the ball you win the game, however there are special rules.

3. If both have 40 the players are deuce. 
    1. If the game is in deuce, the winner of a ball will have advantage and game ball. 
    2. If the player with advantage wins the ball he wins the game 
    3. If the player without advantage wins they are back at deuce.
    
##### Assumptions

1. All input scores entered are valid.
2. Will not check for correct number of points.

##### Test Cases Covered

1. Setting score to Love All at the start of the game.
2. Setting score to Fifteen, Love when player 1 scores 1 point.
3. Setting score to Fifteen All when player 1 and 2 score 1 point.
4. Setting score to Thirty, Love when player 1 scores 2 points.
5. Setting score to Thirty All when player 1 and 2 score 2 points.
6. Setting score to Forty, Love when player 1 scores 3 points.
7. Setting score to Deuce when both players score 3 points.

## System Requirements
1. Java 1.6 or higher.
2. Maven - For Dependency Management (JUnit Dependency Added).
3. Intellij (or) any IDE supporting JAVA.