package typings.zipkin

import typings.zipkin.zipkinMod.optionNs.IOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var parentId: js.UndefOr[IOption[String]] = js.undefined
  var sampled: js.UndefOr[IOption[Boolean]] = js.undefined
  var shared: js.UndefOr[Boolean] = js.undefined
  var spanId: js.UndefOr[String] = js.undefined
  var traceId: js.UndefOr[String] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    parentId: IOption[String] = null,
    sampled: IOption[Boolean] = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    spanId: String = null,
    traceId: String = null
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

