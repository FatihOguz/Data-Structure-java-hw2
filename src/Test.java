import java.util.ArrayList;
public class Test {
    public static void main(String [] args) throws Exception {
           Company company = new Company();

        /**
         *  array list do adding  and removing
         */
        company.addAdministrator(new Administrator());
            company.getAdministrators().get(0).addBranch(company,new Branch("branchA"));
           System.out.println( company.getBranches().get(0));


           company.getAdministrators().get(0).addBranchEmployee(company,new BranchEmployee("branchX"));
           company.getAdministrators().get(0).deleteBranchEmployee(company,company.getBranchEmployees().get(0));
        company.getAdministrators().get(0).addBranchEmployee(company,new BranchEmployee("branchA"));
           System.out.println(company.getBranchEmployees().get(0));
          company.getAdministrators().get(0).addBranchEmployee(company,new BranchEmployee("branchB"));
           System.out.println(company.getBranchEmployees().get(1));
           company.getAdministrators().get(0).addBranchEmployee(company,new BranchEmployee("branchC"));
            System.out.println(company.getBranchEmployees().get(2));


           company.getAdministrators().get(0).addTransportationPersonnel(company,new TransportationPersonnel());
          company.getAdministrators().get(0).addTransportationPersonnel(company,new TransportationPersonnel());
           System.out.println(company.getTransportationPersonnels().get(0));

           company.getBranches().get(0).getShipments().add(new Shipment("fatih oguz ","mesut oguz", "branchA","2323"));
           company.getBranches().get(0).getShipments().add(new Shipment("mesut oguz","ozgun tuncbilek","branchB","2362"));
            System.out.println(company.getBranches().get(0).getShipments());

        company.getAdministrators().get(0).deleteBranch(company,company.getBranches().get(0));

        company.getAdministrators().get(0).addBranch(company,new Branch("branchA"));
        System.out.println( company.getBranches().get(0));
        company.getAdministrators().get(0).addBranchEmployee(company,new BranchEmployee("branchX"));
        company.getAdministrators().get(0).deleteBranchEmployee(company,company.getBranchEmployees().get(0));
        company.getAdministrators().get(0).addBranchEmployee(company,new BranchEmployee("branchA"));
        System.out.println(company.getBranchEmployees().get(0));
        company.getAdministrators().get(0).addBranchEmployee(company,new BranchEmployee("branchB"));
        System.out.println(company.getBranchEmployees().get(1));
        company.getAdministrators().get(0).addBranchEmployee(company,new BranchEmployee("branchC"));
        System.out.println(company.getBranchEmployees().get(2));
        company.getBranches().get(0).getShipments().add(new Shipment("fatih oguz ","mesut oguz", "branchA","2323"));
        company.getBranches().get(0).getShipments().add(new Shipment("mesut oguz","ozgun tuncbilek","branchB","2362"));
        System.out.println(company.getBranches().get(0).getShipments());

            company.getBranchEmployees().get(0).addCustomer(company,new Customer(company.getBranches().get(0).getShipments().get(0).getSender()));
           company.getBranchEmployees().get(0).addCustomer(company,new Customer(company.getBranches().get(0).getShipments().get(0).getReceiver()));
           company.getBranchEmployees().get(0).addCustomer(company , new Customer());
        /**
         * polymorphism: Location method in abstract class of LocationOfShipment
         * customer class,branchEmployee class ,TransportationPersonnel class can use
         */
        /**
         * location method of customer :only sender and receiver can reach
         */

             ArrayList <LocationOfShipment> c = new ArrayList<LocationOfShipment>();
             c.add(company.getCustomers().get(0));
             c.get(0).Location(company,"2323");
             c.add( company.getCustomers().get(1));
             c.get(1).Location(company,"2323");
             c.add( company.getCustomers().get(2));
             c.get(2).Location(company,"2323");
             c.add( company.getBranchEmployees().get(2));
             c.get(3).Location(company,"2323");
             c.add(company.getTransportationPersonnels().get(0));
             c.get(4).Location(company,"2323");
        /**
         * It can be done as in the comments line.
         * array list of abstract class save .get using
         */

        //company.getCustomers().get(0).Location(company,"2323");
              //company.getCustomers().get(1).Location(company,"2323");
              //company.getCustomers().get(2).Location(company,"2323");
              //company.getBranchEmployees().get(2).Location(company,"2323");
              //company.getTransportationPersonnels().get(0).Location(company,"2323");
        /**
         * interface methods
         */
        company.getBranchEmployees().get(0).setReceiver("atilla hun","2323",company);
        company.getBranchEmployees().get(0).setSender("kubilay metehan tac","2362",company);
        company.getBranchEmployees().get(0).setLocation("ISTANBUL","2323",company);
    }
}
