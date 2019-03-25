public class Star {
    private String name;
    private String constellation;
    private double magnitude;
    private double distance;

    public Star(String name, String constellation, double magnitude, double distance) {
        setName(name);
        setConstellation(constellation);
        setMagnitude(magnitude);
        setDistance(distance);
    }
    public String toString() {
        String result = String.format("Name: %s, Constellation: %s, Magnitude: %1.2f, Distance: %1.2f", name, constellation, magnitude, distance);
        return result;
    }

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
}
