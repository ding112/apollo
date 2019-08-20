package com.ctrip.framework.foundation.spi;

import com.ctrip.framework.apollo.core.spi.Ordered;
import com.ctrip.framework.foundation.spi.provider.Provider;

public interface ProviderManager extends Ordered {
  public String getProperty(String name, String defaultValue);

  public <T extends Provider> T provider(Class<T> clazz);
}
