package com.ltts.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.util.Date;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import com.ltts.Configuration.MyConnection;
import com.ltts.Dao.PlayerDAO;
import com.ltts.Dao.TeamDAO;
import com.ltts.model.Player;

public class Main {

	public static void main(String[] args) throws Exception {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//player entry
		System.out.println("Enter Player Details: ");
		System.out.println("Enter Player ID: ");
		     int pno=Integer.parseInt(br.readLine());
		System.out.println("Enter Player Name:");
		     String name=br.readLine();
		     System.out.println("Enter DateOfBirth() in YYYY/MM/DD");
		     String ppno=br.readLine();
		System.out.println("Enter Skill");
		     String nname=br.readLine();
		     System.out.println("Enter Number Of Matches");
		     int pppno=Integer.parseInt(br.readLine());
		System.out.println("Enter Player Runs:");
		     int nnname=Integer.parseInt(br.readLine());
		     System.out.println("Enter Player Wickets");
		     int ppppno=Integer.parseInt(br.readLine());
		System.out.println("Enter Player Nationality");
		     String nnnname=br.readLine();
		     System.out.println("Enter Player PowerRating");
		     int pppppno=Integer.parseInt(br.readLine());
		//team entry
		System.out.println("Team Details: ");  
		    TeamDAO ttd=new TeamDAO();
		    ttd.displayTeams();
		System.out.println("Enter Team Details: ");
		System.out.println("Enter Team ID: ");
		     int tno=Integer.parseInt(br.readLine());
		//calling player objects
		     Player t=new Player(pno,name,ppno,nname,pppno,nnname,ppppno,nnnname,pppppno,tno);
		     PlayerDAO td=new PlayerDAO();
		//checking sucessfull or not
		
		  td.insertPlayer(t); 
		 
		 //System.out.println("susccessfully"+y);
	/*	//calling team objects
		//checking succesfull or not
		       boolean x=ttd.insertTeam(tt);
		       System.out.println("susccessfully"+x);*/
	}
	}
