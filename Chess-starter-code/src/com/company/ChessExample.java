package com.company;

public class ChessExample {
    public static void main(String args[]) {
        Queen queen = new Queen();                                       // create new object queen of class Queen with position(r=0,c=4)
        Game chess = new Game();                                         // create new object chess of class Game with emptySlot
        // Example for queen valid move from (r=0,c=4) to (r=2,c=6): ----------------------
        int row = 2;
        int column = 6;
        Position testPosition = new Position(row, column);   // create new object testPosition of class Position with (r=2,c=6)
        // TODO The commented-out code below is similar to that at the bottom of Lesson 4 Part 6 The Chess Example. It is to test the validity of moves for Queen.
        // TODO After completing Lesson 4 Parts 6 to 10 you will find this test code useful.
        // TODO At that stage, un-comment the code (Highlight from /* to */ and press [ CTRL SHIFT / ] on your keyboard).
        // TODO Use the Edit Configurations menu to add a configuration with THIS class as "main".
      /*  if (queen.isValidMove(testPosition)) {              // call method isValidMove of queen object
             System.out.println("1. Yes, I can move the queen from position:[row " + queen.position.row + ", column " + queen.position.column + "]" +
                    " to new position:[row " + testPosition.row + ", column " + testPosition.column + "]");
            System.out.println("2. Before the move at position ["
                    + queen.position.row + "][" + queen.position.column + "] is the piece '"
                    + chess.board[queen.position.row][queen.position.column].name + "' and at position ["
                    + row + "][" + column + "] is the piece '"
                    + chess.board[row][column].name + "'");
            chess.putPiece(queen, testPosition);  // move the piece on the board from old position to new position and update queen position
            System.out.println("3. After  the move at position [0][4] is the piece '"
                    + chess.board[0][4].name + "' and at position ["
                    + row + "][" + column + "] is the piece '"
                    + chess.board[row][column].name + "'");
        } else {
            System.out.println("4. Nope, can't  move the queen from position:[row " + queen.position.row + ", column " + queen.position.column + "]" +
                    " to new position:[row " + testPosition.row + ", column " + testPosition.column + "]");
        }
        // Example for queen invalid move from ((r=2,c=6) to (r=4,c=10):
        row = 1;
        column = 10;
        testPosition = new Position(row, column);             // update object testPosition with (r=1,c=10)
        if (queen.isValidMove(testPosition)) {                // call method isValidMove of queen object
            System.out.println("5. Yes, I can move the queen from position:[row " + queen.position.row + ", column " + queen.position.column + "]" +
                    " to new position:[row " + testPosition.row + ", column " + testPosition.column + "]");
            chess.putPiece(queen, testPosition);  // move the piece on the board from old position to new position and update queen position
        } else {
            System.out.println("6. Nope, can't move the queen from position:[row " + queen.position.row + ", column " + queen.position.column + "]" +
                    " to new position:[row " + testPosition.row + ", column " + testPosition.column + "]");
        }*/
    }
}
