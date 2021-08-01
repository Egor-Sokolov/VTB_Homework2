package com.company.VTB;

public class Robot implements Contestant {
    int HeightJump;
    int distanceRun;

    public Robot(int heightJump, int distanceRun) {
        HeightJump = heightJump;
        this.distanceRun = distanceRun;
    }

    @Override
    public void jump(int HeightWall) {
        if(HeightWall < this.HeightJump){
            System.out.println("Перепрыгнул стену");
        } else {
            System.out.println("Упал");
        }

    }

    @Override
    public void run(int LengthTreadmill) {
        if(LengthTreadmill < this.distanceRun){
            System.out.println("Пробежал");
        } else {
            System.out.println("Упал");
        }

    }
}
