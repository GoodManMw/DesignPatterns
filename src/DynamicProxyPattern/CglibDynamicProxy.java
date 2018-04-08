package DynamicProxyPattern;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibDynamicProxy {

	public static void main(String[] args){
		
		Enhancer en = new Enhancer();
		en.setSuperclass(HelloServiceImpl.class);
		en.setCallback(new HelloServiceMethodInterceptor());//如果不设置CallBack则使用默认的sayHello
		HelloServiceImpl hs = (HelloServiceImpl)en.create();
		hs.sayHello();
		
	}
	
}

class HelloServiceImpl{
	
	public void sayHello(){
		
		System.out.println("Hello 我是HelloServiceImpl的实现");
		
	}
	
}

class HelloServiceMethodInterceptor implements MethodInterceptor{
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("我要在实现操作之前骚一下");
		Object obj = arg3.invokeSuper(arg0, arg2);
		System.out.println("我要在实现操作之前骚两下");
		return obj;
	}
	
}
