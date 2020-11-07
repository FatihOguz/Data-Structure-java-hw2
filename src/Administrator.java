/**
 * @author Fatih OGUZ
 */

/**
 *  manage(Add and delete ) transportational personnel, branch, branch employee
 */
public class Administrator {

    /**
     *
     * @param company is company system . It has administrator,branch,branchEmployee,TransportationPersonnel,Customer in it.
     * @param branch has shipments.
     */
    public void addBranch(Company company,Branch branch)
    {
       try{
           company.getBranches().add(branch);
       }
       catch (Exception ex){
           System.err.println("Error occurred in call to addBranch in Administrator class ");
       }
    }

    /**
     *
     * @param company is company system . It has administrator,branch,branchEmployee,TransportationPersonnel,Customer in it.
     * @param branch has shipments.
     */
    public void deleteBranch(Company company,Branch branch)
    {
        for(int i=0;i<company.getBranches().size();i++)
        {
            if(company.getBranches().get(i)==branch)
            {
                System.out.println("deleted branch " + company.getBranches().get(i));

                for(int j = 0 ;j< company.getBranchEmployees().size();j++){
                    if(company.getBranches().get(i).getBranchName()==company.getBranchEmployees().get(j).getBranchName()){
                        System.out.println("deleted branch employee " + company.getBranchEmployees().get(j));
                        company.getBranchEmployees().remove(j);
                    }
                }
                for(int k = 0;k< company.getBranches().get(i).getShipments().size();k++){
                    System.out.println("deleted shipments " + company.getBranches().get(i).getShipments().get(k));
                    company.getBranches().get(i).getShipments().remove(k);
                }
                company.getBranches().remove(i);

            }
            else{
                System.out.println("there is no such branch");
            }
        }

    }

    /**
     *
     * @param company is company system . It has administrator,branch,branchEmployee,TransportationPersonnel,Customer in it.
     * @param branchEmployee manage branch and shipments
     */
    public void addBranchEmployee(Company company,BranchEmployee branchEmployee) {
       try{
           company.getBranchEmployees().add(branchEmployee);
       }
       catch (Exception ex){
           System.err.println("Error occurred in call to addBranchEmployee in Administrator class ");
       }
    }

    /**
     * @param company is company system . It has administrator,branch,branchEmployee,TransportationPersonnel,Customer in it.
     * @param branchEmployee manage branch and shipments
     */
    public  void deleteBranchEmployee(Company company,BranchEmployee branchEmployee){
        for(int i = 0; i< company.getBranchEmployees().size();i++)
        {
            if(company.getBranchEmployees().get(i)==branchEmployee){
                System.out.println("deleted branch employee "+ company.getBranchEmployees().get(i));
                company.getBranchEmployees().remove(i);

            }
            else{
                System.out.println("there is no such branch employee");
            }
        }
    }

    /**
     *
     * @param company is company system . It has administrator,branch,branchEmployee,TransportationPersonnel,Customer in it.
     * @param transportationPersonnel go to shipments to address
     */
    public void addTransportationPersonnel(Company company,TransportationPersonnel transportationPersonnel) {
       try{
           company.getTransportationPersonnels().add(transportationPersonnel);
       }
       catch (Exception ex){
           System.err.println("Error occurred in call to addTransportationPersonnel in Administrator class ");
       }
    }

    /**
     * @param company is company system . It has administrator,branch,branchEmployee,TransportationPersonnel,Customer in it.
     * @param transportationPersonnel go to shipments to address
     */
    public void deleteTransportationPersonnel(Company company,TransportationPersonnel transportationPersonnel){
        for(int i = 0; i< company.getTransportationPersonnels().size();i++){
            if(company.getTransportationPersonnels().get(i)==transportationPersonnel){
                System.out.println("deleted transportation personnel "+company.getTransportationPersonnels().get(i));
                company.getTransportationPersonnels().remove(i);

            }
            else{
                System.out.println("there is no such transportation personnel");
            }
        }
    }


}
