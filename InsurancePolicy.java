package NewProject;

public class InsurancePolicy {
    private int insurancePolicyNumber;
    private String policyHolderName;
    private double premiumPerMonth;
    private boolean isActive;
   /**
    * This is the constructor which creates the object of InsurancePolicy.
    * @param number This is a unique policy number of policy holder.
    * @param name This is a  name of policy holder.
    * @param premiumPaidPerMonth This is the premium amount paid by policy holder per month
    * @param active This is the boolean which tells that policy is active.
    */
    

    public InsurancePolicy(int number,String name,double premiumPaidPerMonth,boolean active){
    	insurancePolicyNumber = number;
    	policyHolderName = name;
    	premiumPerMonth = premiumPaidPerMonth;
    	isActive = active;
    }
    /**
     * This is the method to calculate the Discount for InsurancePolicy.
     * @param amount This is the amount which PolicyHolder paid for insurancepremiumpermonth
     * @return this method return the discount.
     */
    public double calculateDiscount(double amount){
    	double discount = premiumPerMonth * amount;
    	return discount;
    }
    /**
     * This is the method which calculate the premiumperMonth.
     * @return This return the amount that policy holder paid for year.
     */
 public double calculatePerYear (){
    	double perYear = premiumPerMonth * 12;
    	return perYear;
    	
    }
    
 /**
  * This is the method which calculate new updated premium.
  * @param newPremium This parameter gives the new premium.
  */
 public void updatePremium (double newPremium){
	 premiumPerMonth = newPremium;
	
	 
 }
 public double getpremiumPerMonth() {
	 return premiumPerMonth;	
 }
}


    
