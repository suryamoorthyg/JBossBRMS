package vehicle.eligibility;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class IsMakeEligible implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Vehicle Make")
   private java.lang.String vehicleMake;
   @org.kie.api.definition.type.Label(value = "IsMakeEligible")
   private boolean isMakeEligible;

   public IsMakeEligible()
   {
   }

   public java.lang.String getVehicleMake()
   {
      return this.vehicleMake;
   }

   public void setVehicleMake(java.lang.String vehicleMake)
   {
      this.vehicleMake = vehicleMake;
   }

   public boolean isIsMakeEligible()
   {
      return this.isMakeEligible;
   }

   public void setIsMakeEligible(boolean isMakeEligible)
   {
      this.isMakeEligible = isMakeEligible;
   }

   public IsMakeEligible(java.lang.String vehicleMake, boolean isMakeEligible)
   {
      this.vehicleMake = vehicleMake;
      this.isMakeEligible = isMakeEligible;
   }

}