package comman.jdbc.callback;

import java.sql.Connection;

public interface UpdateCallBack {
	public int doUpdate(Connection con);
}
