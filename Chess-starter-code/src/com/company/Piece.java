package com.company;

class Piece{
    Position position;
    String name;
    // Constructor init each piece as empty slot
    Piece(){
        this.position = new Position(-1, -1);       // init first position for piece
        this.name = "empty";                              // init the name
    }
    // Method of class Piece: decides if that position is within the bounds of the chess board.
    boolean isValidMove(Position newPosition){
        if(newPosition.row>=0 && newPosition.column>=0 && newPosition.row<8 && newPosition.column<8){
            return true;    // =true if is a valid move into the board bounds
        }
        else{
            return false;   // =false if is a move out of the board bounds
        }
    }
    // Method that is responsible for actually moving the piece
    // (that is, updating the position field within the field's class given a new position as a parameter)
    void movePiece(Position newPosition){
        this.position = newPosition;                                      // update the new position for queen
    }
}
