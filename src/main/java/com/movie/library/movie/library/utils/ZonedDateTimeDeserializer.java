package com.movie.library.movie.library.utils;


import static com.movie.library.movie.library.utils.Constants.ZONED_DATE_TIME_FORMAT;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeDeserializer extends JsonDeserializer<ZonedDateTime> {

//  @Override
//  public ZonedDateTime deserialize(JsonParser jsonParser,
//      DeserializationContext deserializationContext)
//      throws IOException {
//
//    return ZonedDateTime.parse(jsonParser.getText(),
//        DateTimeFormatter.ofPattern(ZONED_DATE_TIME_FORMAT));
//  }

  @Override
  public ZonedDateTime deserialize(JsonParser jsonParser,
      DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
//yyyy-MM-dd'T'HH:mm:ss.SSSz
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(ZONED_DATE_TIME_FORMAT);
    LocalDate localDate = LocalDate.parse(jsonParser.getText(), dateTimeFormatter);

    return localDate.atStartOfDay(ZoneOffset.UTC);
  }


}