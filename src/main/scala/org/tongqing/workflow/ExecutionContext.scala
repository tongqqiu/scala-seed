package org.tongqing.workflow

import org.tongqing.WorkFlowSpec

/**
 * Created by TQui on 11/14/14.
 */
trait ExecutionContext {

  var runtimeID: String
  var runTimeName: String
  var spec: WorkFlowSpec
}
