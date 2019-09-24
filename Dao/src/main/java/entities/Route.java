package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "routes")
public class Route implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @JoinColumn(name = "package_id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Package clientPackage;

    @Column(name = "city")
    private String city;

    @Column(name = "time")
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Package getClientPackage() {
        return clientPackage;
    }

    public void setClientPackage(Package clientPackage) {
        this.clientPackage = clientPackage;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Route(Package clientPackage, String city, String time) {
        this.clientPackage = clientPackage;
        this.city = city;
        this.time = time;
    }
    public Route(){}

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", clientPackage=" + clientPackage +
                ", city='" + city + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}