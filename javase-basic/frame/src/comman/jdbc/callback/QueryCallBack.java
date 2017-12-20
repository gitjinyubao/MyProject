package comman.jdbc.callback;

import java.sql.Connection;
import java.util.List;

public interface QueryCallBack<T> {
	public List<T> doSelect(Connection con);
}
