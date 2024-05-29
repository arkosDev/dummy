package com.iarcos.orange.demo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FechaUtil {

	private FechaUtil() {
		throw new IllegalStateException("Utility class");
	}

	public static Instant getInstant() {
		final ZoneId zone = ZoneId.of("America/Mexico_City");
		return Instant.now().atZone(zone).toInstant();
	}

	public static String fechaText(Instant instant) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMd dHHmmss").withZone(ZoneId.systemDefault());
		return formatter.format(instant);
	}

}
