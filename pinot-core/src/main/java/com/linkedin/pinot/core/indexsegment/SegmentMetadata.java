package com.linkedin.pinot.core.indexsegment;

import org.joda.time.Interval;

import com.linkedin.pinot.core.data.Schema;
import com.linkedin.pinot.core.time.TimeGranularity;


/**
 * SegmentMetadata holds segment level management information and data statistics.
 * 
 * @author Xiang Fu <xiafu@linkedin.com>
 *
 */
public interface SegmentMetadata {
  /**
   * @return
   */
  public String getResourceName();

  /**
   * @return
   */
  public String getTableName();

  /**
   * @return
   */
  public String getIndexType();

  /**
   * @return
   */
  public TimeGranularity getTimeGranularity();

  /**
   * @return
   */
  public Interval getTimeInterval();

  /**
   * @return
   */
  public String getCrc();

  /**
   * @return
   */
  public String getVersion();

  /**
   * @return
   */
  public Schema getSchema();

  /**
   * @return
   */
  public String getShardingKey();

  /**
   * @return
   */
  public int getTotalDocs();
}