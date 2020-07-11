package com.domain.solid.dip;
/*
 *  Dependency Inversion Principle - DIP
 */
public class Main {

	public static void main(String[] args) {

		DatabaseHendler mysql = new DatabaseHendler(new MySQLDatabase());
		DatabaseHendler oracle = new DatabaseHendler(new OracleDatabase());

		mysql.conectar();
		mysql.disconectar();
		
		oracle.conectar();
		oracle.disconectar();

	}
}
