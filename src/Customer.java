/**
 * @author Fatih OGUZ
 */

import java.util.ArrayList;

/**
 * customer give shipments to company(branch)
 */
public class Customer extends LocationOfShipment{
    private String name;

    /**
     *
     * @param name is name of customer
     */
    public Customer(String name) {
        this.name = new String();
        this.name = name;
    }

    /**
     * no parameter constructor
     */
    public Customer() {
        this.name = new String();
    }

    /**
     *
     * @return name of customer
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name name of customer
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param company is company system . It has administrator,branch,branchEmployee,TransportationPersonnel,Customer in it.
     * @param TrackingNumber is unique number for shipments
     *  Location is abstract method. Customer , Transportation Personnel , and BranchEmployee extends LocationOfShipment abstract class .
     *   these three class use polymorphism with  in  test class (abstract method Location)
     */
    @Override
    void Location(Company company, String TrackingNumber) {

            for (int j = 0; j < company.getBranches().size(); j++) {
                for (int k = 0; k < company.getBranches().get(j).getShipments().size(); k++) {
                    if (company.getBranches().get(j).getShipments().get(k).getTrackingNumber() == TrackingNumber) {
                        try{
                            if(company.getBranches().get(j).getShipments().get(k).getSender()== this.getName())
                            {
                                System.out.println("customer " + this.getName() +" location :"+  company.getBranches().get(j).getShipments().get(k));
                            }
                            else if(company.getBranches().get(j).getShipments().get(k).getReceiver()== this.getName())
                            {
                                System.out.println("customer " + this.getName()+  " location :" + company.getBranches().get(j).getShipments().get(k));
                            }
                            else
                            {
                                System.out.println("This customer cannot access (neither the receiver nor the sender)");
                            }
                        }catch (Exception ex){
                            System.err.println("Error occurred in call to Location Customer class ");
                        }


                    }
                }
            }
        }
    }

