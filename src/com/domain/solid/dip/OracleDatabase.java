package com.domain.solid.dip;

public class OracleDatabase implements IDatabase {

	@Override
	public void connect() {
		System.out.println("Connected with Oracle Database...");

	}

	@Override
	public void disconnect() {
		System.out.println("Disconected with Oracle Database...");

	}

}
