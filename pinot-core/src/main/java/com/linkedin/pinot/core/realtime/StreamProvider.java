/**
 * Copyright (C) 2014-2015 LinkedIn Corp. (pinot-core@linkedin.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.linkedin.pinot.core.realtime;

import com.linkedin.pinot.core.data.GenericRow;

public interface StreamProvider {

  /**
   *
   */
  public void init(StreamProviderConfig streamProviderConfig) throws Exception;

  /**
   *
   */
  public void start() throws Exception;

  /**
   *
   * @param offset
   */
  public void setOffset(long offset);

  /**
   * return GenericRow
   */
  public GenericRow next();

  /**
   *
   * @param offset
   * @return
   */
  public GenericRow next(long offset);

  /**
   *
   * @return
   */
  public long currentOffset();

  /**
   *
   */
  public void commit();

  /**
   *
   * @param offset
   */
  public void commit(long offset);

  /**
   *
   */
  public void shutdown() throws Exception;

}
