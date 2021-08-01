package com.company.VTB;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Contestant> contestants = new ArrayList<>();
        contestants.add(new Human(100,100));
        contestants.add(new Cat(50,50));
        contestants.add(new Robot(150,150));

        List <Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new Wall(105));
        obstacles.add(new Treadmill(40));
        obstacles.add(new Treadmill(400));

        for(Contestant contestant : contestants){
            for (Obstacle obstacle : obstacles){
                if(obstacle instanceof Wall){
                    contestant.jump(obstacle.getHeight());
                } contestant.run(obstacle.getLength());

            }
        }

    }
}
