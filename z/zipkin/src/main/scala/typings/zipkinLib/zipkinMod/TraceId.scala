package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "TraceId")
@js.native
class TraceId ()
  extends zipkinLib.zipkinMod.zipkinNs.TraceId {
  def this(args: zipkinLib.Anon_Flags) = this()
  /* CompleteClass */
  override val flags: scala.Double = js.native
  /* CompleteClass */
  override val parentId: java.lang.String = js.native
  /* CompleteClass */
  override val sampled: zipkinLib.zipkinMod.zipkinNs.optionNs.IOption[scala.Boolean] = js.native
  /* CompleteClass */
  override val spanId: java.lang.String = js.native
  /* CompleteClass */
  override val traceId: java.lang.String = js.native
  /* CompleteClass */
  override def isDebug(): scala.Boolean = js.native
}

