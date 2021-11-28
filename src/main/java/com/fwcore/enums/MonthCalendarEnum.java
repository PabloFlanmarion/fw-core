package com.fwcore.enums;

import java.util.EnumSet;

/**
 * 
 * @author Pablo
 *
 */
public enum MonthCalendarEnum {
	JANEIRO(1, "JAN", "Janeiro"), FEVEREIRO(2, "FEV", "Fevereiro"), MARCO(3, "MAR", "Março"), ABRIL(4, "ABR", "Abril"),
	MAIO(5, "MAI", "Maio"), JUNHO(6, "JUN", "Junho"), JULHO(7, "JUL", "Julho"), AGOSTO(8, "AGO", "Agosto"),
	SETEMBRO(9, "SET", "Setembro"), OUTUBRO(10, "OUT", "Outubro"), NOVEMBRO(11, "NOV", "Novembro"),
	DEZEMBRO(12, "DEZ", "Dezembro");

	private int key;
	private String abreviacao;
	private String nome;

	private MonthCalendarEnum(int key, String abreviacao, String nome) {
		this.key = key;
		this.abreviacao = abreviacao;
		this.nome = nome;
	}

	/**
	 * @return the abreviacao
	 */
	public String getAbreviacao() {
		return abreviacao;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @return int
	 */
	public int getKey() {
		return key;
	}

	/**
	 * Recupera o nome do Mes pelo seu numero correspondente.
	 * 
	 * @param key
	 * @return
	 */
	public static String getNomeByNumero(int key) {
		for (MonthCalendarEnum mes : EnumSet.allOf(MonthCalendarEnum.class)) {
			if (mes.getKey() == key) {
				return mes.getNome();
			}
		}
		return "";
	}

	/**
	 * Recupera o nome do Mes pelo seu numero correspondente.
	 * 
	 * @param key
	 * @return
	 */
	public static String getNomeAbreviadoByNumero(int key) {
		for (MonthCalendarEnum mes : EnumSet.allOf(MonthCalendarEnum.class)) {
			if (mes.getKey() == key) {
				return mes.getAbreviacao();
			}
		}
		return "";
	}

}
