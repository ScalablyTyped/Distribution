package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "TraceId")
@js.native
class TraceId () extends js.Object {
  def this(args: zipkinLib.Anon_Flags) = this()
  val flags: scala.Double = js.native
  val parentId: java.lang.String = js.native
  val sampled: zipkinLib.zipkinMod.optionNs.IOption[scala.Boolean] = js.native
  val spanId: java.lang.String = js.native
  val traceId: java.lang.String = js.native
  def isDebug(): scala.Boolean = js.native
}

