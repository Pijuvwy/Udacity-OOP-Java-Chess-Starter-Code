package com.company;

public class Rook extends Piece {


    // default constructor for Rook
    Rook(){
        //TODO Lesson 4 part 9 Super
        this.position = new Position(0, 4);       // init first position for Rook
        this.name = "rook";                            // init the name
    }
    // Method of class Rook that overrides the method of class Piece
    boolean isValidMove(Position newPosition){
        //TODO Lesson 4 part 9 Super
        //TODO Lesson 4 part 7 Overriding methods
            return false;       // =false if is an invalid move for Rook

    }
}
