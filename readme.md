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

3. If both have 40 the players are deuce. a. If the game is in deuce, the winner of a ball will have advantage and game ball. b. If the player with advantage wins the ball he wins the game c. If the player without advantage wins they are back at deuce.