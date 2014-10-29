package org.tongqing

/**
 * Author: TQui 
 * CreatedDate: 10/16/14.
 */
class GreetingInScala {
  def greet() {
    println("Invoke Scala method")
    val delegate = new GreetingInJava
    println("Delegate to Java method")
    delegate.greet()
  }
}
