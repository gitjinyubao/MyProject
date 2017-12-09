
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[2];
		arr[0]=1;
		arr[1]=2;
		int start=1;
		int finish=3;
		int search=1;
		
		//显示弹出异常
		if(start<0||finish>=arr.length){
			try{
			     throw new IllegalArgumentException("srart too small or finish too big");
			}catch(IllegalArgumentException e){
				System.out.println(e);
			}
		}
		
		//隐式弹出异常
		try{
			for(int i=start;i<finish;i++){
				if(arr[i]==search){
					return;
				}
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		
		//通过调用异常类
		if(finish>=arr.length){
			throw	new MyExseption();
		}
	}
}
