/**
 * Copyright 2018 LinkedIn Corporation. All rights reserved. Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */
package com.linkedin.nn.params

import org.apache.spark.ml.param.{DoubleParam, ParamValidators, Params}

trait ScalarRandomProjectionLSHNNSParams extends Params {
  private[nn] val bucketWidth:  DoubleParam =
    new DoubleParam(this, "bucketWidth", "Width of the bucket", ParamValidators.gt(0))

  final def getBucketWidth: Double = $(bucketWidth)

  setDefault(bucketWidth -> 1.0)
}
