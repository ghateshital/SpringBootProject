package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ashokit.dao.UserDao;

@Component
public class UserService {
    @Autowired  //field injectiom
	private UserDao dao;

	public UserService() {
		System.out.println("UserService::0- Condtructor");
	}

	@Autowired
	public UserService(UserDao dao) {
		System.out.println("UserService::Arg--Condtructro");
		this.dao = dao;
	}

	@Autowired
	public void setDao(UserDao dao) {
		System.out.println("UserDao::SetDaocalled");
		this.dao = dao;
	}

	public void getUserName(Integer id) {
		String name = dao.findNameById(id);
		System.out.println(name);
	}

}
