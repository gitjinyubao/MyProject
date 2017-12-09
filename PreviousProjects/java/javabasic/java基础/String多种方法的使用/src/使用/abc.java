package 使用;

public class abc {
	
	    public static void main(String[] args) {
			// 定义一个字符串
			String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";
	        
	        // 出现次数
			int num = 0;
	        
	         // 循环遍历每个字符，判断是否是字符 a ，如果是，累加次数
	        /* byte[] b=s.getBytes();
			for (int u=0;u<b.length;++u                          )
			{
	            // 获取每个字符，判断是否是字符a
				if (b[u]==a)                 ) {
	                // 累加统计次数
					num++; 
				}
			}*/
			for(int i=0;i<s.length();++i)
			{
				if(s.charAt(i)=='a')//注意字符使用单引号括起来
				{
					num++;
				}
			}
			System.out.println("字符a出现的次数：" + num);
		}
	}
