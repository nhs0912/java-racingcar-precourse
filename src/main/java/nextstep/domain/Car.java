package nextstep.domain;

public class Car {
    private static final int INIT_POSITION = 0;
    private Name name;
    private Position position;

    public Car(String name) {
        this(new Name(name));
    }

    public Car(Name name) {
        this.name = name;
        this.position = new Position(INIT_POSITION);
    }

    public Car(Name name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String name() {
        return this.name.name();
    }

    public void move(RandomWay randomWay) {
        if (randomWay.movable()) {
            position.move();
        }
    }

    public Position position() {
        return this.position;
    }

    public boolean isWinner(Position maxPosition) {
        return position.isSamePosition(maxPosition);
    }
}
