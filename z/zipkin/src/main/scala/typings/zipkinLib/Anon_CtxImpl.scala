package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CtxImpl extends js.Object {
  var ctxImpl: zipkinLib.zipkinMod.Context[zipkinLib.zipkinMod.TraceId]
  var defaultTags: js.UndefOr[js.Object] = js.undefined
  var localEndpoint: js.UndefOr[zipkinLib.zipkinMod.modelNs.Endpoint] = js.undefined
  var localServiceName: js.UndefOr[java.lang.String] = js.undefined
  var log: js.UndefOr[stdLib.Console] = js.undefined
  var recorder: zipkinLib.zipkinMod.Recorder
  var sampler: js.UndefOr[zipkinLib.zipkinMod.samplerNs.Sampler] = js.undefined
  var supportsJoin: js.UndefOr[scala.Boolean] = js.undefined
  var traceId128Bit: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CtxImpl {
  @scala.inline
  def apply(
    ctxImpl: zipkinLib.zipkinMod.Context[zipkinLib.zipkinMod.TraceId],
    recorder: zipkinLib.zipkinMod.Recorder,
    defaultTags: js.Object = null,
    localEndpoint: zipkinLib.zipkinMod.modelNs.Endpoint = null,
    localServiceName: java.lang.String = null,
    log: stdLib.Console = null,
    sampler: zipkinLib.zipkinMod.samplerNs.Sampler = null,
    supportsJoin: js.UndefOr[scala.Boolean] = js.undefined,
    traceId128Bit: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CtxImpl = {
    val __obj = js.Dynamic.literal(ctxImpl = ctxImpl, recorder = recorder)
    if (defaultTags != null) __obj.updateDynamic("defaultTags")(defaultTags)
    if (localEndpoint != null) __obj.updateDynamic("localEndpoint")(localEndpoint)
    if (localServiceName != null) __obj.updateDynamic("localServiceName")(localServiceName)
    if (log != null) __obj.updateDynamic("log")(log)
    if (sampler != null) __obj.updateDynamic("sampler")(sampler)
    if (!js.isUndefined(supportsJoin)) __obj.updateDynamic("supportsJoin")(supportsJoin)
    if (!js.isUndefined(traceId128Bit)) __obj.updateDynamic("traceId128Bit")(traceId128Bit)
    __obj.asInstanceOf[Anon_CtxImpl]
  }
}

