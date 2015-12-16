package vehicle.eligibility;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Input implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Mileage")
   private long mileage;

   @org.kie.api.definition.type.Label("Age")
   private int age;

   @org.kie.api.definition.type.Label("Tier")
   private int tier;

   @org.kie.api.definition.type.Label("Product")
   private java.lang.String product;

   @org.kie.api.definition.type.Label(value = "Output List")
   private java.util.List<vehicle.eligibility.Output> outputList;

   public Input()
   {
   }

   public long getMileage()
   {
      return this.mileage;
   }

   public void setMileage(long mileage)
   {
      this.mileage = mileage;
   }

   public int getAge()
   {
      return this.age;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

   public int getTier()
   {
      return this.tier;
   }

   public void setTier(int tier)
   {
      this.tier = tier;
   }

   public java.lang.String getProduct()
   {
      return this.product;
   }

   public void setProduct(java.lang.String product)
   {
      this.product = product;
   }

   public java.util.List<vehicle.eligibility.Output> getOutputList()
   {
      return this.outputList;
   }

   public void setOutputList(java.util.List<vehicle.eligibility.Output> outputList)
   {
      this.outputList = outputList;
   }

   public Input(long mileage, int age, int tier, java.lang.String product,
         java.util.List<vehicle.eligibility.Output> outputList)
   {
      this.mileage = mileage;
      this.age = age;
      this.tier = tier;
      this.product = product;
      this.outputList = outputList;
   }

}