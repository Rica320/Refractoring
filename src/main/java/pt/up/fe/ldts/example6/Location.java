package pt.up.fe.ldts.example6;

public class Location {
    public String latitude;
    public String longitude;
    public String name;

    Location(String locationLatitude, String locationLongitude, String locationName) {
        latitude = locationLatitude;
        longitude = locationLongitude;
        name = locationName;
    }

    public String toString() {
        return " in location " + latitude + "," + longitude + " (" + name + ")";
    }
}
