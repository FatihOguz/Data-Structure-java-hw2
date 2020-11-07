/**
 * @author Fatih OGUZ
 */

import java.util.ArrayList;

/**
 * branch store shipments . transportational personnel and branch employee works for branch
 */
public class Branch {
    /**
     * shipments store knowledge of shipments
     */
    private ArrayList<Shipment> shipments ;
    /**
     * branchName is name of branch
     */
    private String branchName = new String();

    /**
     * NO PARAMETER CONSTRUCTOR
     */
    public Branch() {
        System.out.println("not named branchName");
        shipments = new ArrayList<Shipment>();
    }

    /**
     * @param branchName is name of branch
     */
    public Branch(String branchName) {
        try{
            this.branchName = branchName;
        }
        catch(Exception ex){
            System.err.println("Error occurred. Wrong type");
        }
        finally {

        }
        shipments = new ArrayList<Shipment>();
    }

    /**
     *
     * @return arrayList. store shipments
     */
    public ArrayList<Shipment> getShipments() {
        return shipments;
    }

    /**
     *
     * @param shipments arraylist. store shipments
     */
    public void setShipments(ArrayList<Shipment> shipments) {
        this.shipments = shipments;
    }

    /**
     *
     * @return branch name
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
     * @return knowledge of shipment, and name of the branch where the cargo is located
     */


    @Override
    public String toString() {
        return "Branch{" +
                "shipments=" + shipments +
                ", branchName='" + branchName + '\'' +
                '}';
    }
}
