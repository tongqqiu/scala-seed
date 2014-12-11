package org.tongqing.workflow

/**
 * Created by TQui on 11/14/14.
 */
trait Task {
  var name: String
  def init(): Unit
  def abort(): Unit
  def onFinished(): Unit
  def context: ExecutionContext
}
