/**
 * @author Fatih OGUZ
 */

import java.util.ArrayList;

/**
 * this class has Administrator,branch,branch employee,shipments, customer , transportation personnel classes.
 *
 */
public class Company {
    /**
     * store administrator
     */
    private ArrayList<Administrator> administrators;
    /**
     * store branchEmployee
     */
    private ArrayList<BranchEmployee> branchEmployees;
    /**
     * store transportation personnel
     */
    private ArrayList<TransportationPersonnel> transportationPersonnels ;
    /**
     * store braches
     */
    private ArrayList<Branch> branches ;
    /**
     * store customer
     */
    private ArrayList<Customer> customers ;

    /**
     * NO PARAMETER CONSTRUCTOR
     */
    public Company() {
        this.administrators = new ArrayList<Administrator>();
        this.branchEmployees=new ArrayList<BranchEmployee>();
        this.transportationPersonnels = new ArrayList<TransportationPersonnel>();
        this.branches = new ArrayList<Branch>();
        this.customers =  new ArrayList<Customer>();
    }

    /**
     *
     * @param administrator manage (add and remove ) branchEmployee,TransportationPersonnel and branch
     */
    public void addAdministrator(Administrator administrator)
    {
        try{
            this.getAdministrators().add(administrator);
        }
        catch(Exception ex){
            System.err.println("Error occurred in call to addAdminsitrator in Company class");
        }

    }

    /**
     *
     * @return array list for administrator class
     */
    public ArrayList<Administrator> getAdministrators() {
        return administrators;
    }

    /**
     *
     * @param administrators manage (add and remove ) branchEmployee,TransportationPersonnel and branch
     */
    public void setAdministrators(ArrayList<Administrator> administrators) {
        this.administrators = administrators;
    }

    /**
     *
     * @return array List of branchEmplooyee class
     */

    public ArrayList<BranchEmployee> getBranchEmployees() {
        return branchEmployees;
    }

    /**
     *
     * @param branchEmployees manage branch and shipments
     */
    public void setBranchEmployees(ArrayList<BranchEmployee> branchEmployees) {
        this.branchEmployees = branchEmployees;
    }

    /**
     *
     * @return array list for transportation personnel class
     */
    public ArrayList<TransportationPersonnel> getTransportationPersonnels() {
        return transportationPersonnels;
    }

    /**
     *
     * @param transportationPersonnels deliver shipments
     */
    public void setTransportationPersonnels(ArrayList<TransportationPersonnel> transportationPersonnels) {
        this.transportationPersonnels = transportationPersonnels;
    }

    /**
     *
     * @return array list for branch class
     */
    public ArrayList<Branch> getBranches() {
        return this.branches;
    }

    /**
     *
     * @param branches store shipments
     */
    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    /**
     *
     * @return array list for customer class
     */
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    /**
     *
     * @param customers give shipment to branch
     */
    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
