package FactoryPattern;

public class OperationMul extends Operation{

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		double result = 0;
		result = getNumA() * getNumB();
		return result;
	}
	
}
