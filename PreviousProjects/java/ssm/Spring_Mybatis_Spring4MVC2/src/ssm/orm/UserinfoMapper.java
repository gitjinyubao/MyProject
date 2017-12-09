package ssm.orm;
/*创建orm映射的操作接口：数据源映射器，映射器必须是接口;与UserinfoMapper.xml的命名空间相对应
实现了接口绑定，实现了该接口与xml映射文件的绑定，自动为我们生成接口的具体实现类;
确保映射文件（接口中的方法名与sql的xml文件中的id名称一致）*/
public interface UserinfoMapper {
	public  void insertUserinfo(Userinfo   userinfo);
}
