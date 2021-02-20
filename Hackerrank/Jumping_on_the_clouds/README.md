# **Jumping on Clouds**

There is a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. The player can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . The player must avoid the thunderheads. Determine the minimum number of jumps it will take to jump from the starting postion to the last cloud. It is always possible to win the game.

For each game, you will get an array of clouds numbered  if they are safe or  if they must be avoided.


## **Function Description**

Complete the jumpingOnClouds function in the editor below.

jumpingOnClouds has the following parameter(s):

- int c[n]: an array of binary integers


## **Returns**

- int: the minimum number of jumps required


## **Input Format**

The first line contains an integer **n**, the total number of clouds. The second line contains **n**  space-separated binary integers describing clouds **c[i]** where **0<= i <n**

## **Constraints**

- 2<= n <= 100

- c[i] is an element of {0,1}

- c[0]=c[n-1]=0

## **Output Format**

Print the minimum number of jumps needed to win the game.

## **Sample Input**

7

0 0 1 0 0 1 0

## **Sample Output**

4