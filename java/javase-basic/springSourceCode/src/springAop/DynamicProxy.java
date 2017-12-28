package springAop;

import java.lang.reflect.Method;
import java.util.Random;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/*
 * ��̬������
 * ʵ����һ�������������ӿ�
 */
public class DynamicProxy implements MethodInterceptor {

    // ���������
    Object targetObject;

    //Generate a new class if necessary and uses the specified callbacks (if any) to create a new object instance. 
    //Uses the no-arg constructor of the superclass.
    //��̬����һ���µ��࣬ʹ�ø�����޲ι��췽������һ��ָ�����ض��ص��Ĵ���ʵ��
    public Object getProxyObject(Object object) {
        this.targetObject = object;
        //��ǿ������̬����������
        Enhancer enhancer=new Enhancer();
        //�ص�����
        enhancer.setCallback(this);
        //����������ĸ�������
        enhancer.setSuperclass(targetObject.getClass());
        //��̬�����ֽ��벢���ش������
        return enhancer.create();
    }

    // ���ط���
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        // ��֯��ĺ������ݣ���ʼʱ�� before
        long start = System.currentTimeMillis();
        lazy();

        // ���÷���
        Object result = methodProxy.invoke(targetObject, args);

        // ��֯��ĺ������ݣ�����ʱ��
        Long span = System.currentTimeMillis() - start;
        System.out.println("����ʱ��" + span);
        
        return result;
    }

    // ģ����ʱ
    public void lazy() {
        try {
            int n = (int) new Random().nextInt(500);
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
