package FactoryPattern;

public class TestBench {

	public static void main(String[] args) throws Exception{
		
		Operation ope = null;
		ope = OperationFactory.CreateOperation("+");
		ope.setNumA(250);
		ope.setNumB(270);
		System.out.println("计算结果是 = " + ope.getResult());
		
	}
	
}
