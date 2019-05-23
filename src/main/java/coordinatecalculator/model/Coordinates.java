package coordinatecalculator.model;

import java.util.HashSet;
import java.util.List;

public class Coordinates {
    private final List<Coordinate> coordinates;

    public Coordinates(List<Coordinate> coordinates) {
        checkDuplicatedCoordinates(coordinates);
        this.coordinates = coordinates;
    }

    private void checkDuplicatedCoordinates(List<Coordinate> coordinates) {
        if (coordinates.size() != new HashSet<>(coordinates).size()) {
            throw new IllegalArgumentException("겹치는 좌표가 있습니다.");
        }
    }

    public Coordinate get(int index) {
        return coordinates.get(index);
    }

    public int size() {
        return coordinates.size();
    }
}