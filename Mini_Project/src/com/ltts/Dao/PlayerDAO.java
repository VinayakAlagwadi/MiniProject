package com.ltts.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.ltts.Configuration.MyConnection;
import com.ltts.model.Player;

public class PlayerDAO {
	public List<Player> getAllPlayers(){
		List<Player> li=new ArrayList<Player>();
		
		return li;

}
public Player getplayerById(int id) {
	Player p=new Player();
	// p.getPlayerId()
	
	return p;
}

public boolean createPlayer() throws Exception {
	Connection mc= MyConnection.getConnection();
	
	PreparedStatement ps1=mc.prepareStatement("create table Player(playerId int(2) primary key , name varchar(20), date date, skill varchar(30), noOfmatches int, runs int, wickets int,nation varchar(30),power double,teamId int,FOREIGN KEY (teamId) REFERENCES Team(teamid))");
	
	//ps.setInt(1,getPlayerId());
	//ps.setString(2,getPlayerName());
	return ps1.execute();
	
}


public void insertPlayer(Player p) throws Exception {
	
	//Player pla = new Player();
	Connection mc=MyConnection.getConnection();
	Statement stmt = mc.createStatement();
	PreparedStatement ps=mc.prepareStatement("insert into Player values(?,?,?,?,?,?,?,?,?,?);");
	  ps.setInt(1,p.getPlayerId());
	  ps.setString(2,p.getName()); ps.setString(3,p.getDateOfBirth());
	  ps.setString(4,p.getSkill()); ps.setInt(5,p.getNumberOfMatches());
	  ps.setInt(6,p.getRuns()); ps.setInt(7,p.getWickets());
	  ps.setString(8,p.getNationality()); ps.setDouble(9,p.getPowerRating());
	  ps.setInt(10,p.getTeamId());
	 
	 System.out.println(p.getName());
	 ps.executeUpdate();	
	 System.out.println("Successfully Added");
		/*
		 * String sql =
		 * "INSERT INTO Player VALUES("+p.getPlayerId()+",'"+p.getName()+"','"+p.
		 * getDateOfBirth()+"','"+p.getSkill()+"',"+p.getNumberOfMatches()+","+p.
		 * getRuns()+","+p.getWickets()+",'"+p.getNationality()+"',"+p.
		 * getPowerRating()+","+p.getTeamId()+")"; stmt.executeUpdate(sql);
		 * System.out.println("susccefully");
		 */
		  
		 
	
}
}