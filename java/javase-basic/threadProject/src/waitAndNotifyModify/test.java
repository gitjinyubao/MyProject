package waitAndNotifyModify;

/*
 * 等待唤醒：
 *       Object类中提供了三个方法：
 *       	wait():等待
 *          notify():唤醒单个线程
 *          notifyAll():唤醒所有的线程
 *       为什么这些方法不定义在Thread类中？
 *       这些方法的调用，必须通过锁对象调用，而我们刚才使用的所对象是任意锁对象
 *       所以这些方法必须定义在Object类中
 *       
 * 最终代码中：
 *         把Student的成员员变量给私有了。
 *         把设置和获取的操作给封装成了功能，并且加了同步
 *         设置或者获取的方法里面只需要调用方法即可
 *       
 */
public class test {
	
	public static void main(String[] args) {
	    Student s = new Student();
		SetStudent setStudent = new SetStudent(s);
		GetStudent getStudent = new GetStudent(s);
		setStudent.start();
		getStudent.start();
	}
}
