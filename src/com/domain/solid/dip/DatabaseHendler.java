package com.domain.solid.dip;

/*
 * Manipulador de Banco de dados
*/
public class DatabaseHendler {

	private IDatabase database;

	public DatabaseHendler(IDatabase databaseInterface) {
		this.database = databaseInterface;
	}

	public void conectar() {
		this.database.connect();
	}

	public void disconectar() {
		this.database.disconnect();
	}

}
