package FactoryDesignPattern;

public class GetPlanFactory {
	
	public Plan getPlan(String planType)
	{
		if(planType==null)
		{
			return null;
		}
		if(planType.equalsIgnoreCase("DOMESTICPLAN"))
		{
			return new DemesticPlan();
		}
		if(planType.equalsIgnoreCase("COMMERCIALPLAN"))
		{
			return new CommercialPlan();
		}
		return null;
	}

}
