package nextstep.domain;

public class Position {
    private int distance;

    public Position(int distance) {
        this.distance = distance;
    }

    public void move() {
        this.distance++;
    }

    public int distance() {
        return this.distance;
    }
}
