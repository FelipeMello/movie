package com.movie.library.movie.library.configuration;

import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import javax.persistence.spi.PersistenceProvider;
import org.springframework.boot.json.AbstractJsonParser;
import org.springframework.boot.json.JsonParseException;
import org.springframework.data.jpa.repository.query.AbstractJpaQuery;
import org.springframework.data.jpa.repository.query.JpaParametersParameterAccessor;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;

public class PostgresConfiguration extends AbstractJpaVendorAdapter {

  @Override
  public PersistenceProvider getPersistenceProvider() {
    return null;
  }
}
