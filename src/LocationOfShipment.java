/**
 * @author Fatih OGUZ
 */


/**
 * this class is abstract class and abstract method do setting or looking shipments.
 * BranchEmployee , and TransportationalPersonnel set  location of shipment and customer see location of shipment that use this abstract method
 * these 3 class extends this abstract class
 * using polymorphism that array list of abstract class do different three process
 */
public abstract class LocationOfShipment {
  abstract void  Location(Company company,String TrackingNumber);
}
