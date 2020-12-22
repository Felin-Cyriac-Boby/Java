Random walk. A Java programmer begins walking aimlessly. At each time step, she takes one step in a random direction (either north, east, south, or west), each with probability 25%. She stops once she is at Manhattan distance r from the starting point. How many steps will the random walker take? This process is known as a two-dimensional random walk.

Write a program RandomWalker.java that takes an integer command-line argument r and simulates the motion of a random walk until the random walker is at Manhattan distance r from the starting point. Print the coordinates at each step of the walk (including the starting and ending points), treating the starting point as (0, 0). Also, print the total number of steps taken.

~/Desktop/loops> java RandomWalker 5

(0, 0)

(0, 1)

(1, 1)

(1, 2)

(1, 3)

(0, 3)

(-1, 3)

(-1, 2)

(-2, 2)

(-2, 1)

(-1, 1)

(-1, 0)

(-2, 0)

(-2, -1)

(-3, -1)

(-3, -2)

steps = 15
