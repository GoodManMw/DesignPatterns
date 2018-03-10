package FactoryPattern;

public class OperationAdd extends Operation{

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		double result = 0;
		result = getNumA() + getNumB();
		return result;
	}
	
}
