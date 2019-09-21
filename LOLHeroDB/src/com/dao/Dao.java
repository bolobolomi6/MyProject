package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Hero;
import com.pojo.Message;
import com.pojo.User;
import com.utils.DbUtil;


public class Dao {
	DbUtil db=new DbUtil();

	public List<User> getUsers() throws SQLException {
		List<User> list=new ArrayList<User>();
		String sql="SELECT NAME,PASSWORD FROM USER";
		ResultSet rs=  db.executeQuery(sql);
		while(rs.next()) {
			User user =new User(rs.getString(1), rs.getString(2));
			list.add(user);
		}
		db.closeAll();
		return list;
	}
	public int sign(User user) {
		String sql="INSERT INTO USER(NAME,PASSWORD) VALUES(?,?)";
		int n=db.executeUpdate(sql, user.getName(),user.getPassword());
		return n;
	}
	public List<Hero> getHero() throws SQLException {
		List<Hero> list=new ArrayList<Hero>();
		String sql="SELECT ID,NAME,NICKNAME FROM HEROS";
		ResultSet rs=  db.executeQuery(sql);
		while(rs.next()) {
			Hero hero =new Hero(rs.getInt(1), rs.getString(2),rs.getString(3));
			list.add(hero);
		}
		db.closeAll();
		return list;
	}
	public int addHero(Hero hero) {
		String sql="INSERT INTO HEROS(ID,NAME,NICKNAME) VALUES(?,?,?)";
		int i=db.executeUpdate(sql, hero.getId(),hero.getName(),hero.getNickName());
		return i;
	}
	public int deletHero(int id) {
		String sql="DELETE FROM HEROS WHERE ID=?";
		int n=db.executeUpdate(sql, id);
		return n;
	}
	public int getHeroCount() throws SQLException {
		int n=0;
		String sql="SELECT COUNT(*) FROM HEROS";
		ResultSet rs= db.executeQuery(sql);
		if(rs.next()) {
			n=rs.getInt(1);
		}
		db.closeAll();
		return n;
	}
	public List<Hero> getPage(int page) throws SQLException {
		List<Hero> list=new ArrayList<Hero>();
		String sql="SELECT * FROM HEROS LIMIT ?,?";
		int num = (page-1)*10;
		ResultSet rs= db.executeQuery(sql,num,10);
		while(rs.next()) {
			Hero obj =new Hero();
			obj.setId(rs.getInt(1));
			obj.setName(rs.getString(2));
			obj.setNickName(rs.getString(3));
			list.add(obj);
		}
		db.closeAll();
		return list;
	}
	public List<Message> getMessages() throws SQLException {
		List<Message> list=new ArrayList<Message>();
		String sql="SELECT * FROM MESSAGETABLE";
		ResultSet rs=  db.executeQuery(sql);
		while(rs.next()) {
			
			Message message =new Message(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getString(4), rs.getString(5));
			list.add(message);
		}
		db.closeAll();
		return list;
	}
	public int addMessage(Message message) {
		String sql="INSERT INTO MESSAGETABLE(USERID,DATE,TITLE,CONTENTL) VALUES(?,?,?,?)";
		int i=db.executeUpdate(sql, message.getUserId(),message.getLydate(),message.getTitle(),message.getContentl());
		return i;
	}
	public int deletMessage(int id) {
		String sql="DELETE FROM MESSAGETABLE WHERE ID=?";
		int n=db.executeUpdate(sql, id);
		return n;
	}
}
