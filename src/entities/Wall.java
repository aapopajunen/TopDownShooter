package entities;

import model.World;

public class Wall extends StaticEntity{

    public Wall(double x, double y, double width, double height, World w) {
        super(x, y, width, height, w);
    }

    @Override
    public void update(double dt) {

    }

}
