package effective.ch2.r5;

import java.util.ArrayList;
import java.util.List;

public class WrongCallService {

	WrongCallDao dao;
	
	public void getUserListWithUserCount() {
		// access dao
		int count = dao.getUserList().size();
		// access dao again. it will be take much times
		List<String> userList = dao.getUserList();
		
		// do something else
	}
	
	public void getUserListWithUserCountMuchSmarter() {
		// access dao
		List<String> userList = dao.getUserList();
		// no dao access. much faster
		int count = userList.size();
		
		// do something else
	}
	
}

class WrongCallDao {
	public List<String> getUserList() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ArrayList<>();
	}
}
