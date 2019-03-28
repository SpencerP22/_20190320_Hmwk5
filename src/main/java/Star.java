import java.util.Objects;

public class Star implements Comparable<Star>{
    private String name;
    private String constellation;
    private double magnitude;
    private double distance;

    //constructor
    public Star(String name, String constellation, double magnitude, double distance) {
        setName(name);
        setConstellation(constellation);
        setMagnitude(magnitude);
        setDistance(distance);
    }
    //toString method
    @Override
    public String toString() {
        String result = String.format("Name: %s, Constellation: %s, Magnitude: %1.2f, Distance: %1.2f", name, constellation, magnitude, distance);
        return result;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setConstellation(String constellation){
        this.constellation = constellation;
    }
    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }

    //getters
    public String getName() {
        return name;
    }
    public String getConstellation() {
        return constellation;
    }
    public double getMagnitude() {
        return magnitude;
    }
    public double getDistance() {
        return distance;
    }

    //compareTo method
    public int compareTo(Star other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return Double.compare(star.magnitude, magnitude) == 0 &&
                Double.compare(star.distance, distance) == 0 &&
                Objects.equals(name, star.name) &&
                Objects.equals(constellation, star.constellation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, constellation, magnitude, distance);
    }
}
