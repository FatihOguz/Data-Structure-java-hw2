/**
 * @author Fatih OGUZ
 */

import java.util.ArrayList;

/**
 * branchEmployee extends LocationOfShipment abstract class.method of this abstract class change location of shipment
 * branchEmployee implements UpdateKnowledgeOfShipments interface .methods of these interface change (update-set) knowledge of shipments
 */
public class BranchEmployee extends LocationOfShipment implements UpdateKnowledgeOfShipments {
    /**
     * branch name is name of branch .
     */
    private String branchName;

    /**
     *
     * @param branchName name of branch
     */
    public BranchEmployee(String branchName) {
        this.branchName = new String();
        this.branchName = branchName;
    }

    /**
     * no parameter constructor
     */
    public BranchEmployee() {
        System.out.println("not branch name");
    }

    /**
     *
     * @return name of branch
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     *
     * @param branchName is name of branch
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     *
     * @param company is company system . It has administrator,branch,branchEmployee,TransportationPersonnel,Customer in it.
     * @param customer give shipment to branch
     */
   public void addCustomer(Company company, Customer customer)
    {
        try{
            company.getCustomers().add(customer);
        }
        catch(Exception ex){
                  System.err.println("ERROR OCCURRED IN CALL TO addCustomer in BranchEmployee Class");
          }

    }

    /**
     *
     * @param company is company system . It has administrator,branch,branchEmployee,TransportationPersonnel,Customer in it.
     * @param customer give shipment to branch
     */
    public void deleteCustomer(Company company,Customer customer){
       for(int i = 0;i< company.getCustomers().size();i++){
           if(company.getCustomers().get(i)==customer){
               company.getCustomers().remove(i);

           }
       }
    }

    /**
     *
     * @param receiver is name of receiver of shipment
     * @param TrackingNumber is unique number for shipment
     * @param company is company system . It has administrator,branch,branchEmployee,TransportationPersonnel,Customer in it.
     *  this method implement of UpdateKnowledgeOfShipments interface
     */
    @Override
    public void setReceiver(String receiver, String TrackingNumber,Company company) {

            for (int j = 0; j < company.getBranches().size(); j++) {
                for (int k = 0; k < company.getBranches().get(j).getShipments().size(); k++) {
                    if (company.getBranches().get(j).getShipments().get(k).getTrackingNumber() == TrackingNumber) {
                        try{
                            company.getBranches().get(j).getShipments().get(k).setReceiver(receiver);
                            System.out.println(company.getBranches().get(j).getShipments().get(k));
                        }
                        catch (Exception ex){
                            System.err.println("BranchEmployee-->setReceiver method");
                        }

                    }

                }
            }
    }

    /**
     *
     * @param sender is name of sender of shipment
     * @param TrackingNumber is unique number for shipment.
     * @param company is company system . It has administrator,branch,branchEmployee,TransportationPersonnel,Customer in it.
     */
    @Override
    public void setSender(String sender, String TrackingNumber, Company company) {

            for (int j = 0; j < company.getBranches().size(); j++) {
                for (int k = 0; k < company.getBranches().get(j).getShipments().size(); k++) {
                    if (company.getBranches().get(j).getShipments().get(k).getTrackingNumber() == TrackingNumber) {
                        company.getBranches().get(j).getShipments().get(k).setSender(sender);
                        System.out.println(company.getBranches().get(j).getShipments().get(k));
                    }

                }
            }
        }

    /**
     *
     * @param location is location of shipment
     * @param TrackingNumber is unique number for shipments
     * @param company is company system . It has administrator,branch,branchEmployee,TransportationPersonnel,Customer in it.
     */


    @Override
    public void setLocation(String location, String TrackingNumber, Company company) {

            for (int j = 0; j < company.getBranches().size(); j++) {
                for (int k = 0; k < company.getBranches().get(j).getShipments().size(); k++) {
                    if (company.getBranches().get(j).getShipments().get(k).getTrackingNumber() == TrackingNumber) {
                        company.getBranches().get(j).getShipments().get(k).setLocation(location);
                        System.out.println(company.getBranches().get(j).getShipments().get(k));
                    }
                }
            }
        }

    /**
     *
     * @param company is company system . It has administrator,branch,branchEmployee,TransportationPersonnel,Customer in it.
     * @param TrackingNumber is unique number for shipment
     */

    @Override
    void Location(Company company, String TrackingNumber) {

            for (int j = 0; j < company.getBranches().size(); j++) {
                for (int k = 0; k < company.getBranches().get(j).getShipments().size(); k++) {
                    if (company.getBranches().get(j).getShipments().get(k).getTrackingNumber() == TrackingNumber) {
                        company.getBranches().get(j).getShipments().get(k).setLocation(this.branchName);
                        System.out.println("Branch Employee Location: " +  company.getBranches().get(j).getShipments().get(k));
                    }

                }
            }
        }

    /**
     *
     * @return  branchEmployee work branch. branch name is branchName
     */
    @Override
    public String toString() {
        return "BranchEmployee{" +
                "branchName='" + branchName + '\'' +
                '}';
    }
}
