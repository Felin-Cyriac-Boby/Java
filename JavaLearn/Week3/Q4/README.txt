Minesweeper. 

Minesweeper is a 1960s era video game played on an m-by-n grid of cells. The goal is to deduce which cells contain hidden mines using clues about the number of mines in neighboring cells. Write a program Minesweeper.java that takes three integer command-line arguments m, n, and k and prints an m-by-n grid of cells with k mines, using asterisks for mines and integers for the neighboring mine counts (with two space characters between each cell). To do so,
Generate an m-by-n grid of cells, with exactly k of the mn cells containing mines, uniformly at random.
For each cell not containing a mine, count the number of neighboring mines (above, below, left, right, or diagonal).

~/Desktop/arrays> java Minesweeper 9 9 10
0  1  *  1  0  0  0  1  *  
1  3  2  2  0  0  0  1  1  
*  2  *  1  0  0  1  1  1  
1  2  2  2  1  0  1  *  1  
0  1  2  *  1  0  1  1  1  
1  2  *  3  3  1  1  0  0  
1  *  3  *  2  *  1  0  0  
1  1  2  1  2  1  1  0  0  
0  0  0  0  0  0  0  0  0 