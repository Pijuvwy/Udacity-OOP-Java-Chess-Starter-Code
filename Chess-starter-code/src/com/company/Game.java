package com.company;


class Game{             // class creates, initialize and put pieces on the game board
    Piece [][] board;
    private Piece emptySlot = new Piece();                          // create new object emptySlot of class Piece
    // Constructor creates an empty board with emptySlot
    Game(){
        board = new Piece[8][8];
        for (int i=0; i<8; i++) {                               // initialize the board with emptySlot
            for (int j = 0; j < 8; j++) {
                // chess.board[i][j] = emptySlot;
                this.board[i][j] = emptySlot;
            }
        }
        Queen qq = new Queen();                                       // create new object qq of class Queen with position(r=0,c=4)
        this.board[qq.position.row][qq.position.column] =  qq;        // put the queen on board on initial position(r=0,c=4)
    }
    // Method to move the piece on the board from old position to new position and update queen position
    void putPiece (Queen q, Position newPosition) {
        this.board[q.position.row][q.position.column] = emptySlot;                // free the old position on board
        q.movePiece(newPosition);                                                 // update the new position for queen
        this.board[newPosition.row][newPosition.column] = q;                      // put queen in new position on board
    }
}