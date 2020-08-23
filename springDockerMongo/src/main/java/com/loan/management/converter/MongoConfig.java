package com.loan.management.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;

@Configuration
public class MongoConfig {
	private final List<Converter<?, ?>> converters = new ArrayList<Converter<?, ?>>();

	@Bean
	public MongoCustomConversions mongoCustomConversions() {				
		converters.add(new ZonedDateTimeReadConverter());
		return new MongoCustomConversions(converters);
	}
}