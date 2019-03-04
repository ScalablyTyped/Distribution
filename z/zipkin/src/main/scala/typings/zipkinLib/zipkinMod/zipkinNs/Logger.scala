package typings
package zipkinLib.zipkinMod.zipkinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Logger (or transport) is what the Recorder uses to send spans to Zipkin.
  * @see https://github.com/openzipkin/zipkin-js/#transports Official transport implementations
  */
trait Logger extends js.Object {
  def logSpan(span: zipkinLib.zipkinMod.zipkinNs.modelNs.Span): scala.Unit
}

object Logger {
  @scala.inline
  def apply(logSpan: js.Function1[zipkinLib.zipkinMod.zipkinNs.modelNs.Span, scala.Unit]): Logger = {
    val __obj = js.Dynamic.literal(logSpan = logSpan)
  
    __obj.asInstanceOf[Logger]
  }
}

