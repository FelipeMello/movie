package com.movie.library.movie.library.utils;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;

public class ZoneDateTimeReadConverter implements Converter<Date, ZonedDateTime> {

  @Override
  public ZonedDateTime convert (Date source) {
    return source == null ? null : ZonedDateTime.ofInstant(source.toInstant(), ZoneId.systemDefault());
  }
}