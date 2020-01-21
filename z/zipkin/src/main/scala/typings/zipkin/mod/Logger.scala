package typings.zipkin.mod

import typings.zipkin.mod.model.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Logger (or transport) is what the Recorder uses to send spans to Zipkin.
  * @see https://github.com/openzipkin/zipkin-js/#transports Official transport implementations
  */
trait Logger extends js.Object {
  def logSpan(span: Span): Unit
}

object Logger {
  @scala.inline
  def apply(logSpan: Span => Unit): Logger = {
    val __obj = js.Dynamic.literal(logSpan = js.Any.fromFunction1(logSpan))
  
    __obj.asInstanceOf[Logger]
  }
}

