package com.mycompany.gs1_prototipo1.model;

import com.mycompany.gs1_prototipo1.model.types.Points;

public class Rating {
    private String comment;
    private Points points;

    public Rating(String comment, Points points) {
        this.comment = comment;
        this.points = points;
    }

    public Rating(Points points) {
        this.points = points;
    }

    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setPoints(Points points) {
        this.points = points;
    }
    public int getPoints() {
        Points point = this.points;
        switch (point) {
            case cero:
                return 0;
            case uno:  
                return 1;
            case dos:  
                return 2;
            case tres:  
                return 3;
            case cuatro:  
                return 4;
            case cinco:  
                return 5;
            default: return -1;
        }
    }
 
}
