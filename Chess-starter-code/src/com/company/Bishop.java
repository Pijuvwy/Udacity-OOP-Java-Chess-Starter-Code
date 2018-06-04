package com.company;

class Bishop extends Piece{

    // default constructor for Bishop
    Bishop(){
        //TODO Lesson 4 part 9 Super
        this.position = new Position(0, 4);       // init first position for Bishop
        this.name = "bishop";                            // init the name
    }
    // Method of class Bishop that overrides the method of class Piece
    boolean isValidMove(Position newPosition){
        //TODO Lesson 4 part 9 Super
        //TODO Lesson 4 part 7 Overriding methods
            return false;       // =false if is an invalid move for Bishop

    }
}
