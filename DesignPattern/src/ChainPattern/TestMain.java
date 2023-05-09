package ChainPattern;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chain addchain=new AddNumber();
		Chain subchain=new SubNumber();
		
		addchain.setNextChain(subchain);
		Numbers request=new Numbers(4,2, "add");
		addchain.calculate(request);

	}

}
