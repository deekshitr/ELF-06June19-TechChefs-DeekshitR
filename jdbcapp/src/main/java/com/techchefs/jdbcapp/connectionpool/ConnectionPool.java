package com.techchefs.jdbcapp.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

import static com.techchefs.jdbcapp.connectionpool.ConnectionPoolConstants.*;

public class ConnectionPool {
	
	private Vector<Connection> connectPool = null;
	private Connection con = null;
	private static ConnectionPool poolRef = null;
	
	private int poolSize;
	private String dbUrl;
	private String userName;
	private String password;
	
	public void loadProperties() throws Exception {
		
		poolSize = Integer.parseInt(PropertyUtil.getPropertyUtil().getProperty(POOL_SIZE)) ;
		userName = PropertyUtil.getPropertyUtil().getProperty(DB_USER_NAME);
		password = PropertyUtil.getPropertyUtil().getProperty(DB_PASSWORD);
		dbUrl = PropertyUtil.getPropertyUtil().getProperty(DB_URL);
	}
	
	public void initializePool() throws Exception {
		connectPool = new Vector<Connection>();
		for(int i=0;i<poolSize;i++) {
			con = DriverManager.getConnection(dbUrl,userName,password);
			connectPool.add(con);
		}
	}
	
	private ConnectionPool() throws Exception {
		loadProperties();
		initializePool();
	}
	
	public Connection getConnectionfromPool() {
		return connectPool.remove(0);
	}
	
	public void returnConnectionToPool(Connection con) {
		connectPool.add(con); 
	}
	
	public static ConnectionPool getConnectionPool() throws Exception {
		if (poolRef == null) {
			poolRef = new ConnectionPool();
		}
		return poolRef;
	}
}
