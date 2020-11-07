/**
 * @author Fatih OGUZ
 */

/**
 * this interface implements BranchEmployee
 * branchemployee change information of shipments via method
 */
public interface UpdateKnowledgeOfShipments {

    /**
     * @param receiver is name of receiver
     * @param TrackingNumber is unique number for shipment
     * @param company is company system . It has administrator,branch,branchEmployee,TransportationPersonnel,Customer in it.
     */
    void setReceiver(String receiver,String TrackingNumber, Company company);
    /**
     *
     * @param sender is name of sender
     * @param TrackingNumber is unique number for shipment
     * @param company is company system . It has administrator,branch,branchEmployee,TransportationPersonnel,Customer in it.
     */
    void setSender(String sender,String TrackingNumber,Company company);
    /**
     *
     * @param location is location  of shipment
     * @param TrackingNumber is unique number for shipment
     * @param company is company system . It has administrator,branch,branchEmployee,TransportationPersonnel,Customer in it.
     */
    void setLocation(String location,String TrackingNumber,Company company);
}
