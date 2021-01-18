package de.leonhard.storage.internal.provider;

import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.UtilityClass;

/**
 * Interface for registering more powerful Map/List implementation than the default JDK one's
 * examples for these implementations are FastUtils & Trove Used in {@link
 * de.leonhard.storage.internal.settings.DataType} Enum
 */
@UtilityClass
@Accessors(fluent = true, chain = true)
public class LightningProviders {

  @Setter
  private MapProvider mapProvider;
  @Setter
  private InputStreamProvider inputStreamProvider;
  @Setter
  private ExceptionHandler exceptionHandler;

  public MapProvider mapProvider() {

    if (mapProvider != null) {
      return mapProvider;
    }

    return mapProvider = new MapProvider() {
    };
  }



  public InputStreamProvider inputStreamProvider() {
    if (inputStreamProvider != null) {
      return inputStreamProvider;
    }

    return inputStreamProvider = new InputStreamProvider() {
    };
  }

  public ExceptionHandler exceptionHandler() {
    if (exceptionHandler != null) {
      return exceptionHandler;
    }

    return exceptionHandler = new ExceptionHandler() {
    };
  }
}
