package org.exoplatform.forum.service.cache.model;

import java.io.Serializable;

/**
 * @author <a href="mailto:alain.defrance@exoplatform.com">Alain Defrance</a>
 */
public interface CachedData<T> extends Serializable {

  public T build();

}
