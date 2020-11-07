/**
 * this class hide knowledge of shipments
 */
public class Shipment {
    /**
     * name of sender
     */
    private String Sender ;
    /**
     * name of receiver
     */
    private String Receiver;
    /**
     * name of location
     */
    private String Location;
    /**
     * this number is unique for shipment
     */
    private String TrackingNumber ;

    /**
     *
     * @param sender is name of sender
     * @param receiver is name of receiver
     * @param location is location of shipments
     * @param trackingNumber is unique number for shipment (id)
     */
    public Shipment(String sender, String receiver, String location, String trackingNumber) {
        Sender = new String();
        Receiver = new String();
        Location = new String();
        TrackingNumber = new String();
        Sender = sender;
        Receiver = receiver;
        Location = location;
        TrackingNumber = trackingNumber;
    }

    /**
     * no parameter constructor
     */
    public Shipment() {
        Sender = new String();
        Receiver = new String();
        Location = new String();
        TrackingNumber = new String();
        System.out.println("Not sender,receiver,trackingNumber, and location");
    }

    /**
     *
     * @return name of sender
     */
    public String getSender() {
        return Sender;
    }

    /**
     *
     * @param sender change name of sender
     */
    public void setSender(String sender) {
        Sender = sender;
    }

    /**
     *
     * @return name of receiver
     */
    public String getReceiver() {
        return Receiver;
    }

    /**
     *
     * @param receiver  change name of receiver
     */
    public void setReceiver(String receiver) {
        Receiver = receiver;
    }

    /**
     *
     * @return location of shipments
     */
    public String getLocation() {
        return Location;
    }

    /**
     *
     * @param location change location of shipment
     */
    public void setLocation(String location) {
        Location = location;
    }

    /**
     *
     * @return trackingNumber is unique number of shipment(id)
     */
    public String getTrackingNumber() {
        return TrackingNumber;
    }

    /**
     *
     * @param trackingNumber change trackingNumber
     */
    public void setTrackingNumber(String trackingNumber) {
        TrackingNumber = trackingNumber;
    }

    /**
     *
     * @return names of sender , receiver and location of shipment and trackingNumber
     */
    @Override
    public String toString() {
        return "Shipment{" +
                "Sender='" + Sender + '\'' +
                ", Receiver='" + Receiver + '\'' +
                ", Location='" + Location + '\'' +
                ", TrackingNumber='" + TrackingNumber + '\'' +
                '}';
    }
}
