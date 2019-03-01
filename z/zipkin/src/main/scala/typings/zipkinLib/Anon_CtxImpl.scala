package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CtxImpl extends js.Object {
  var ctxImpl: zipkinLib.zipkinMod.zipkinNs.Context[zipkinLib.zipkinMod.zipkinNs.TraceId]
  var localEndpoint: js.UndefOr[zipkinLib.zipkinMod.zipkinNs.modelNs.Endpoint] = js.undefined
  var localServiceName: js.UndefOr[java.lang.String] = js.undefined
  var log: js.UndefOr[stdLib.Console] = js.undefined
  var recorder: zipkinLib.zipkinMod.zipkinNs.Recorder
  var sampler: js.UndefOr[zipkinLib.zipkinMod.zipkinNs.samplerNs.Sampler] = js.undefined
  var traceId128Bit: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CtxImpl {
  @scala.inline
  def apply(
    ctxImpl: zipkinLib.zipkinMod.zipkinNs.Context[zipkinLib.zipkinMod.zipkinNs.TraceId],
    recorder: zipkinLib.zipkinMod.zipkinNs.Recorder,
    localEndpoint: zipkinLib.zipkinMod.zipkinNs.modelNs.Endpoint = null,
    localServiceName: java.lang.String = null,
    log: stdLib.Console = null,
    sampler: zipkinLib.zipkinMod.zipkinNs.samplerNs.Sampler = null,
    traceId128Bit: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CtxImpl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ctxImpl")(ctxImpl)
    __obj.updateDynamic("recorder")(recorder)
    if (localEndpoint != null) __obj.updateDynamic("localEndpoint")(localEndpoint)
    if (localServiceName != null) __obj.updateDynamic("localServiceName")(localServiceName)
    if (log != null) __obj.updateDynamic("log")(log)
    if (sampler != null) __obj.updateDynamic("sampler")(sampler)
    if (!js.isUndefined(traceId128Bit)) __obj.updateDynamic("traceId128Bit")(traceId128Bit)
    __obj.asInstanceOf[Anon_CtxImpl]
  }
}

