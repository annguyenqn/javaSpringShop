package DiamonShop.Service.User;

import DiamonShop.Entity.Users;

public interface IAccountService {
	public int AddAccount(Users user);
	public  Users   CheckAccount(Users user);
}
