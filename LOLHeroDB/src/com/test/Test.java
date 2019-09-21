package com.test;

import java.sql.SQLException;
import java.util.List;

import com.dao.Dao;
import com.pojo.Hero;
import com.pojo.User;
import com.service.Service;

public class Test {
	public static void main(String[] args) {
		Dao dao = new Dao();
		Service service = new Service();
		// try {
		// List<User> list =dao.getUsers();
		// for (User user : list) {
		// System.out.println(user);
		// }
		// } catch (SQLException e) {
		// e.printStackTrace();
		// }
		// }

		// User user=new User("赵六","666");
		// System.out.println(dao.sign(user));

		// Hero hero=new Hero(166,"测试数据","测试数据");

		// System.out.println(dao.addHero(hero));
		// System.out.println(dao.deletHero(166));

		List<Hero> list = service.getHeros();
		for (Hero hero : list) {
			System.out.println(hero);
		}
	}

}
