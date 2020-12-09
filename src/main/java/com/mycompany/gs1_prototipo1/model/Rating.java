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

    public Points getPoints() {
        return points;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setPoints(Points points) {
        this.points = points;
    }
}
