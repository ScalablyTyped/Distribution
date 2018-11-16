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

