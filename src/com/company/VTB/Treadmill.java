package com.company.VTB;

public class Treadmill extends Obstacle{
  private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Treadmill(int length) {
        this.length = length;
    }


    @Override
    public  int contest(Contestant contestant) {


        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
