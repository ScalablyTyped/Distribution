package typings
package zipkinLib.zipkinMod.zipkinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceId extends js.Object {
  val flags: scala.Double
  val parentId: java.lang.String
  val sampled: zipkinLib.zipkinMod.zipkinNs.optionNs.IOption[scala.Boolean]
  val spanId: java.lang.String
  val traceId: java.lang.String
  def isDebug(): scala.Boolean
}

object TraceId {
  @scala.inline
  def apply(
    flags: scala.Double,
    isDebug: js.Function0[scala.Boolean],
    parentId: java.lang.String,
    sampled: zipkinLib.zipkinMod.zipkinNs.optionNs.IOption[scala.Boolean],
    spanId: java.lang.String,
    toString: js.Function0[java.lang.String],
    traceId: java.lang.String
  ): TraceId = {
    val __obj = js.Dynamic.literal(flags = flags, isDebug = isDebug, parentId = parentId, sampled = sampled, spanId = spanId, toString = toString, traceId = traceId)
  
    __obj.asInstanceOf[TraceId]
  }
}

