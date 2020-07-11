package com.domain.solid.dip;

public class MySQLDatabase implements IDatabase {

	@Override
	public void connect() {
		System.out.println("Connection with MySQL Database...");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnection with MySQL Database...");

	}

}
