package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flags extends js.Object {
  var flags: js.UndefOr[scala.Double] = js.undefined
  var parentId: js.UndefOr[zipkinLib.zipkinMod.optionNs.IOption[java.lang.String]] = js.undefined
  var sampled: js.UndefOr[zipkinLib.zipkinMod.optionNs.IOption[scala.Boolean]] = js.undefined
  var spanId: js.UndefOr[java.lang.String] = js.undefined
  var traceId: js.UndefOr[zipkinLib.zipkinMod.optionNs.IOption[java.lang.String]] = js.undefined
}

object Anon_Flags {
  @scala.inline
  def apply(
    flags: scala.Int | scala.Double = null,
    parentId: zipkinLib.zipkinMod.optionNs.IOption[java.lang.String] = null,
    sampled: zipkinLib.zipkinMod.optionNs.IOption[scala.Boolean] = null,
    spanId: java.lang.String = null,
    traceId: zipkinLib.zipkinMod.optionNs.IOption[java.lang.String] = null
  ): Anon_Flags = {
    val __obj = js.Dynamic.literal()
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (sampled != null) __obj.updateDynamic("sampled")(sampled)
    if (spanId != null) __obj.updateDynamic("spanId")(spanId)
    if (traceId != null) __obj.updateDynamic("traceId")(traceId)
    __obj.asInstanceOf[Anon_Flags]
  }
}

