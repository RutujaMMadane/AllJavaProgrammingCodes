package DecoratorDesignPattern;

public class ChineeseFood extends FoodDecorator {
	
	public ChineeseFood(Food newFood)
	{
		super(newFood);
		
	}
	public String prepareFood()
	{
		return super.prepareFood()+"With noodles";
	
	}
	public double foodPrice()
	{
		return super.foodPrice()+65.0;
	}
	

}
