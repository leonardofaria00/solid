package com.domain.solid.srp;

import java.util.Calendar;

/*
 * Uma classe coesa é aquela que contém apenas uma única responsabilidade.
 * Ou seja, ela toma conta de apenas um conceito dentro do sistema.
 * Classes coesas tendem a ser menores, e por consequência, mais fáceis de serem
 * lidas e mantidas. Elas também tendem a ser mais reutilizáveis, afinal são mais fáceis.
 */
public class Programa {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setId(1);
		funcionario.setNome("Leonardo");
		funcionario.setSalarioBase(2000.0);
		funcionario.setCargo(Cargo.DESENVOLVEDOR);
		funcionario.setDataDeAdmissao(Calendar.getInstance());

		new CalculadoraDeSalario().calcula(funcionario);
	}
}
