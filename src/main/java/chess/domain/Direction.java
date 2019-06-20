package chess.domain;

public enum Direction {
    EAST(Vector.of(1, 0)),
    NORTHEAST(Vector.of(1, 1)),
    NORTH(Vector.of(0, 1)),
    NORTHWEST(Vector.of(-1, 1)),
    WEST(Vector.of(-1, 0)),
    SOUTHWEST(Vector.of(-1, -1)),
    SOUTH(Vector.of(0, -1)),
    SOUTHEAST(Vector.of(1, -1));

    private Vector vector;

    Direction(Vector vector) {
        this.vector = vector;
    }

    public boolean isParallelTo(Vector another) {
        return this.vector.isParallelTo(another);
    }

    public boolean isEqualTo(Vector vector) {
        return this.vector.equals(vector);
    }
}