package com.company.VTB;

public class Wall extends Obstacle {
   private  int height;

    public int getHeight() {
        return height;
    }

    @Override
    public int getLength() {
        return 0;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Wall(int height) {
        this.height = height;
    }

    @Override
 public   int contest(Contestant contestant) {
        return 0;
    }
}
