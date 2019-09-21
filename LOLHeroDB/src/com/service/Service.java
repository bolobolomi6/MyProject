package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.Dao;
import com.pojo.Hero;
import com.pojo.Message;
import com.pojo.User;

public class Service {
	Dao dao = new Dao();

	public List<User> getUsers() {
		List<User> list = null;
		try {
			list = dao.getUsers();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public boolean Sign(User user) {
		int i = dao.sign(user);
		return i > 0;
	}

	public boolean addHero(Hero hero) {
		int i = dao.addHero(hero);
		return i > 0;
	}

	public boolean deletHero(int id) {
		int i = dao.deletHero(id);
		return i > 0;
	}

	public List<Hero> getHeros() {
		List<Hero> list = null;
		try {
			list = dao.getHero();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Hero> getPage(int page) {
		List<Hero> list = null;
		try {
			list = dao.getPage(page);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public int getHeroCount() {
		int count=0;
		try {
			count=dao.getHeroCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	public List<Message> getMessages() {
		List<Message> list = null;
		try {
			list = dao.getMessages();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public boolean addMessage(Message message) {
		int i = dao.addMessage(message);
		return i > 0;
	}

	public boolean deletMessage(int id) {
		int i = dao.deletMessage(id);
		return i > 0;
	}

}
