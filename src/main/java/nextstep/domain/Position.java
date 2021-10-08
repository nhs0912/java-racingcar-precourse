package nextstep.domain;

public class Position {
    private static final int INIT_DISTANCE = 0;
    private int distance;

    public Position() {
        this(INIT_DISTANCE);
    }

    public Position(int distance) {
        this.distance = distance;
    }

    public void move() {
        this.distance++;
    }

    public int distance() {
        return this.distance;
    }

    public boolean isBiggerThan(Position maxPosition) {
        return this.distance > maxPosition.distance();
    }

    public boolean isSamePosition(Position carPosition) {
        return this.distance == carPosition.distance();
    }
}
