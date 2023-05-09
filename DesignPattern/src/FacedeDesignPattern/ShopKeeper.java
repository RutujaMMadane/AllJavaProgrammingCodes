package FacedeDesignPattern;

public class ShopKeeper {
	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop blackberry;
	public ShopKeeper()
	{
		iphone=new Iphone();
		samsung=new Samsung();
		blackberry=new BlackBerry();
	}
	public void iphoneSal() 
	{
		iphone.modelNo();
		iphone.price();
	}
	public void samsungSal() 
	{
		samsung.modelNo();
		samsung.price();
	}
	public void blackBerrySal() 
	{
		blackberry.modelNo();
		blackberry.price();
	}

}
