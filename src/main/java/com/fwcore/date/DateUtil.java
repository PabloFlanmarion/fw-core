package com.fwcore.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import com.fwcore.enums.DayWeekEnums;
import com.fwcore.enums.MonthCalendarEnum;

/**
 * 
 * @author Pablo
 *
 */
public class DateUtil {

	private static DateTimeFormatter formatadorDataJuliano = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//	private static DateTimeFormatter formatadorAPIResponse = DateTimeFormatter.ofPattern("yyyy-mmdd T HH:mi:ss");
	private static DateTimeFormatter formatadorAPIResponse = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
	private static DateTimeFormatter formatadorLocalZone = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
			.withLocale(new Locale("pt", "br"));

	private DateUtil() {

	}

	/**
	 * Recupera a data atual do sistema. Formado Juliano.
	 * 
	 * @return String
	 */
	public static String getDataLocal() {
		LocalDate dateLocal = LocalDate.now();
		return dateLocal.format(formatadorDataJuliano);
	}

	/**
	 * Recupera data e hora local.
	 * 
	 * @return
	 */
	public static String getDataHoraLocal() {
		LocalDateTime dataHoraLocal = LocalDateTime.now();
		return dataHoraLocal.format(formatadorLocalZone);
	}

	public static String getDataHoraLocalAPI() {
		LocalDateTime dataHoraLocal = LocalDateTime.now();
		return dataHoraLocal.format(formatadorAPIResponse);
	}

	/**
	 * Recupera a hora atual do sistema.
	 * 
	 * @return
	 */
	public static String getHoraLocal() {
		LocalTime horaLocal = LocalTime.now();
		return horaLocal.toString();
	}

	/**
	 * Adiciona dias a uma data e recupera a nova data.
	 * 
	 * @param numeroDias
	 * @return
	 */
	public static String addDayDate(int numeroDias) {
		LocalDate dateLocal = LocalDate.now();
		return dateLocal.plusDays(numeroDias).format(formatadorDataJuliano);
	}

	/**
	 * Recupera o Dia do Mes local.
	 * 
	 * @return int
	 */
	public static int getDiaLocal() {
		LocalDate dateLocal = LocalDate.now();
		return dateLocal.getDayOfMonth();
	}

	/**
	 * Recupera o nome do Mes local.
	 * 
	 * @return String
	 */
	public static String getNomeMesLocal() {
		LocalDate dateLocal = LocalDate.now();
		return MonthCalendarEnum.getNomeByNumero(dateLocal.getMonthValue());
	}

	/**
	 * Recupera o Ano local.
	 * 
	 * @return int
	 */
	public static int getAno() {
		LocalDate dateLocal = LocalDate.now();
		return dateLocal.getYear();
	}

	/**
	 * Recupera o Dia da Semana local[NOME SIMPLES].
	 * 
	 * @return
	 */
	public static String getDiaSemanaLocal() {
		LocalDate dateLocal = LocalDate.now();
		return DayWeekEnums.getNomeSimplesByNumero(dateLocal.getDayOfWeek().getValue());
	}

}
