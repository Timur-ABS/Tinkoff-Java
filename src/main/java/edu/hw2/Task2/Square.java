package edu.hw2.Task2;

public class Square extends Rectangle {

    public Square() {
    }

    public void side(int number) {
        this.width = number;
        this.height = number;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }
}
