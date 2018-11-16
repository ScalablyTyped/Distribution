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

