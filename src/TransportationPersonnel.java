/**
 * @author Fatih OGUZ
 */

/**
 * this class deliver shipment to customer or branch
 */
public class TransportationPersonnel extends LocationOfShipment{
    /**
     *
     * @param company is company system . It has administrator,branch,branchEmployee,TransportationPersonnel,Customer in it.
     * @param TrackingNumber is unique number for shipment
     * this method abstract. and this class , branchEmployee, and  customer extends locationofshipment abstract class.
     *  this method says  delivered . change to place of shipment
     */
    @Override
    void Location(Company company, String TrackingNumber) {

            for (int j = 0; j < company.getBranches().size(); j++) {
                for (int k = 0; k < company.getBranches().get(j).getShipments().size(); k++) {
                    try{
                        if (company.getBranches().get(j).getShipments().get(k).getTrackingNumber() == TrackingNumber) {
                            company.getBranches().get(j).getShipments().get(k).setLocation("Delivered");
                            System.out.println("Transportation Personnel Location: " + company.getBranches().get(j).getShipments().get(k));
                        }
                    }
                    catch (Exception ex){
                        System.err.println("Error occurred in call to Location in TransportationPersonnel class");
                    }

                }
            }
        }

    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        return "TransportationPersonnel{}";
    }
}
