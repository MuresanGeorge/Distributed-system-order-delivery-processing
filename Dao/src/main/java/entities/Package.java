package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "packages")
public class Package implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "sender_id", nullable = false)
    private User sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id", nullable = false)
    private User receiver;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "sender_city")
    private String senderCity;

    @Column(name = "receiver_city")
    private String receiverCity;

    @Column(name = "tracking")
    private boolean tracking;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSenderCity() {
        return senderCity;
    }

    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public boolean isTracking() {
        return tracking;
    }

    public void setTracking(boolean tracking) {
        this.tracking = tracking;
    }

    public Package(User sender, User receiver, String name, String description, String senderCity, String receiverCity, boolean tracking) {
        this.sender = sender;
        this.receiver = receiver;
        this.name = name;
        this.description = description;
        this.senderCity = senderCity;
        this.receiverCity = receiverCity;
        this.tracking = tracking;
    }
    public Package(){}

    @Override
    public String toString() {
        return "Package{" +
                "id=" + id +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", senderCity='" + senderCity + '\'' +
                ", receiverCity='" + receiverCity + '\'' +
                ", tracking=" + tracking +
                '}';
    }
}
