package com.company;

class Queen extends Piece{          // class for queen piece
    // default constructor for queen
    Queen(){
        //TODO Lesson 4 part 9 Super
        this.position = new Position(0, 4);       // init first position for queen
        this.name = "queen";                            // init the name
    }
    // Method of class Queen that overrides the method of class Piece
    boolean isValidMove(Position newPosition){
        //TODO Lesson 4 part 9 Super
        //TODO Lesson 4 part 8 Override
            return false;       // =false if is an invalid move for queen

    }
}
