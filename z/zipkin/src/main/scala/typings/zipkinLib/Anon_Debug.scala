package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var parentId: js.UndefOr[zipkinLib.zipkinMod.optionNs.IOption[java.lang.String]] = js.undefined
  var sampled: js.UndefOr[zipkinLib.zipkinMod.optionNs.IOption[scala.Boolean]] = js.undefined
  var shared: js.UndefOr[scala.Boolean] = js.undefined
  var spanId: js.UndefOr[java.lang.String] = js.undefined
  var traceId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    parentId: zipkinLib.zipkinMod.optionNs.IOption[java.lang.String] = null,
    sampled: zipkinLib.zipkinMod.optionNs.IOption[scala.Boolean] = null,
    shared: js.UndefOr[scala.Boolean] = js.undefined,
    spanId: java.lang.String = null,
    traceId: java.lang.String = null
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (sampled != null) __obj.updateDynamic("sampled")(sampled)
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared)
    if (spanId != null) __obj.updateDynamic("spanId")(spanId)
    if (traceId != null) __obj.updateDynamic("traceId")(traceId)
    __obj.asInstanceOf[Anon_Debug]
  }
}

