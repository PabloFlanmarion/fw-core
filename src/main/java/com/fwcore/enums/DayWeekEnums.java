package com.fwcore.enums;

import java.util.EnumSet;

/**
 * 
 * @author Pablo
 *
 */
public enum DayWeekEnums {

	SEGUNDA(1, "SEG", "Segunda", "Segunda-Feira"), TERCA(2, "TER", "Terça", "Terça-Feira"),
	QUARTA(3, "QUA", "Quarta", "Quarta-Feira"), QUINTA(4, "QUI", "Quinta", "Quinta-Feira"),
	SEXTA(5, "SEX", "Sexta", "Sexta-Feira"), SABADO(6, "SAB", "Sábado", "Sábado"),
	DOMINGO(7, "DOM", "Domingo", "Domingo");

	private int key;
	private String abreviacao;
	private String nomeSimples;
	private String nomeCompleto;

	private DayWeekEnums(int key, String abrevicao, String nomeSimples, String nomeCompleto) {
		this.key = key;
		this.abreviacao = abrevicao;
		this.nomeSimples = nomeSimples;
		this.nomeCompleto = nomeCompleto;
	}

	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}

	/**
	 * @return the abreviacao
	 */
	public String getAbreviacao() {
		return abreviacao;
	}

	/**
	 * @return the nomeSimples
	 */
	public String getNomeSimples() {
		return nomeSimples;
	}

	/**
	 * @return the nomeCompleto
	 */
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	/**
	 * Recupera o Nome Simples do Dia da Semana
	 * 
	 * @param numeroDia
	 * @return
	 */
	public static String getNomeSimplesByNumero(int numeroDia) {
		for (DayWeekEnums diasSemana : EnumSet.allOf(DayWeekEnums.class)) {
			if (diasSemana.key == numeroDia) {
				return diasSemana.getNomeSimples();
			}
		}
		return "";
	}

	/**
	 * Recupera o Nome Completo do Dia da Semana
	 * 
	 * @param numeroDia
	 * @return
	 */
	public static String getNomeCompletoByNumero(int numeroDia) {
		for (DayWeekEnums diasSemana : EnumSet.allOf(DayWeekEnums.class)) {
			if (diasSemana.key == numeroDia) {
				return diasSemana.getNomeCompleto();
			}
		}
		return "";
	}

}
