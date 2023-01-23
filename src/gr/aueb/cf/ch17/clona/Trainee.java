package gr.aueb.cf.ch17.clona;

import java.io.Serializable;
import java.util.Objects;

public class Trainee implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private City city;
    private transient int hashcode; // not serializable εξαιρείται απο το serialization

    public Trainee() {
    }

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    //    copy constructor
    public Trainee(Trainee trainee) {
        this.name = trainee.name;
        this.city = new City(trainee.getCity());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    protected Trainee clone() throws CloneNotSupportedException {
        Trainee trainee = (Trainee) super.clone();
        City city = new City(this.getCity().getDescription());
        trainee.setCity(city);
        return trainee;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Trainee trainee = (Trainee) o;
//        return Objects.equals(getName(), trainee.getName()) && Objects.equals(getCity(), trainee.getCity());
//    }

//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//
//        result = prime * result + ((name == null) ? 0 : name.hashCode());
//        result = prime * result + ((city == null) ? 0 : city.hashCode());
//
//        return result;
//    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Trainee trainee = (Trainee) o;
//
//        if (hashcode != trainee.hashcode) return false;
//        if (getName() != null ? !getName().equals(trainee.getName()) : trainee.getName() != null) return false;
//        return getCity() != null ? getCity().equals(trainee.getCity()) : trainee.getCity() == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = getName() != null ? getName().hashCode() : 0;
//        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
//        result = 31 * result + hashcode;
//        return result;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trainee trainee = (Trainee) o;

        if (hashcode != trainee.hashcode) return false;
        if (!getName().equals(trainee.getName())) return false;
        return getCity().equals(trainee.getCity());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getCity().hashCode();
        result = 31 * result + hashcode;
        return result;
    }
}
