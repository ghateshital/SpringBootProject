package in.ashokit.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {

	public UserDaoImpl()
	{
	System.out.println("UserDaoImpl::Condtructor");	
	}
	@Override
	public String findNameById(Integer id) {
		// TODO Auto-generated method stub
		if(id==100)
		{
			return "Raju";
		}else if(id==200)
		{
			return "Rani";
		}
		return null;
	}

}
