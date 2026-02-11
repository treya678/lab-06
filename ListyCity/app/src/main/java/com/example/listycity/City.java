/**
 * This is a class that defines a City.
 */
package com.example.listycity;
public class City implements Comparable<City> {
    private String city;
    private String province;

    City(String city, String province) {
        this.city = city;
        this.province = province;
    }


    String getCityName() {
        return this.city;
    }

    String getProvinceName() {
        return this.province;
    }

    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
    /**
     * Two City objects are considered equal if they have the same
     * city name and province.
     * This is required so that List.contains(), remove(), etc. work correctly.
     * @param o object to compare
     * @return true if same city name and province, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;

        City other = (City) o;

        if (this.city == null && other.city != null) return false;
        if (this.city != null && !this.city.equals(other.city)) return false;

        if (this.province == null && other.province != null) return false;
        return this.province == null || this.province.equals(other.province);
    }

    /**
     * Must match equals(): same fields used in equals must be used here.
     * @return hash code for this city
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (city == null ? 0 : city.hashCode());
        result = 31 * result + (province == null ? 0 : province.hashCode());
        return result;
    }

}

