
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
		
		//��ʾ�����쳣
		if(start<0||finish>=arr.length){
			try{
			     throw new IllegalArgumentException("srart too small or finish too big");
			}catch(IllegalArgumentException e){
				System.out.println(e);
			}
		}
		
		//��ʽ�����쳣
		try{
			for(int i=start;i<finish;i++){
				if(arr[i]==search){
					return;
				}
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		
		//ͨ�������쳣��
		if(finish>=arr.length){
			throw	new MyExseption();
		}
	}
}
