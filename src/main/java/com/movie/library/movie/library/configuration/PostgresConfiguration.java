package com.movie.library.movie.library.configuration;

import javax.persistence.spi.PersistenceProvider;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;

public class PostgresConfiguration extends AbstractJpaVendorAdapter {

  @Override
  public PersistenceProvider getPersistenceProvider() {
    return null;
  }
}
