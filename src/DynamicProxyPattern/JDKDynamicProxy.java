package DynamicProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy {

	public static void main(String[] args){
		
		RealSubject robj = new RealSubject();
		InvocationHandler ih = new ProxySubject(robj);
		ObjInterface pobj = (ObjInterface) Proxy.newProxyInstance(robj.getClass().getClassLoader(), robj.getClass().getInterfaces(), ih);
		pobj.proxyMethod();
		
	}
	
}

interface ObjInterface{
	
	public void proxyMethod();
	
}

class RealSubject implements ObjInterface{
	
	@Override
	public void proxyMethod() {
		// TODO Auto-generated method stub
		System.out.println("RealSubject 的实现");
	}
	
}

class ProxySubject implements InvocationHandler{
	
	private ObjInterface sub;
	
	public ProxySubject(Object obj){
		this.sub = (ObjInterface)obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("代理实现之前的操作");
		Object o = method.invoke(sub, args);
		System.out.println("代理实现之后的操作");
		return o;
	}
	
}
