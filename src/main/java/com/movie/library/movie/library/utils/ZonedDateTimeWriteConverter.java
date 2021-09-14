package com.movie.library.movie.library.utils;

import java.time.ZonedDateTime;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;

public class ZonedDateTimeWriteConverter implements Converter<ZonedDateTime, Date> {

  @Override
  public Date convert(ZonedDateTime source) {
    return source == null ? null : Date.from(source.toInstant());
  }
}