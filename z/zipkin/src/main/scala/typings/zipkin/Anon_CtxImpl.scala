package typings.zipkin

import typings.std.Console
import typings.zipkin.zipkinMod.Context
import typings.zipkin.zipkinMod.Recorder
import typings.zipkin.zipkinMod.TraceId
import typings.zipkin.zipkinMod.modelNs.Endpoint
import typings.zipkin.zipkinMod.samplerNs.Sampler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CtxImpl extends js.Object {
  var ctxImpl: Context[TraceId]
  var defaultTags: js.UndefOr[js.Object] = js.undefined
  var localEndpoint: js.UndefOr[Endpoint] = js.undefined
  var localServiceName: js.UndefOr[String] = js.undefined
  var log: js.UndefOr[Console] = js.undefined
  var recorder: Recorder
  var sampler: js.UndefOr[Sampler] = js.undefined
  var supportsJoin: js.UndefOr[Boolean] = js.undefined
  var traceId128Bit: js.UndefOr[Boolean] = js.undefined
}

object Anon_CtxImpl {
  @scala.inline
  def apply(
    ctxImpl: Context[TraceId],
    recorder: Recorder,
    defaultTags: js.Object = null,
    localEndpoint: Endpoint = null,
    localServiceName: String = null,
    log: Console = null,
    sampler: Sampler = null,
    supportsJoin: js.UndefOr[Boolean] = js.undefined,
    traceId128Bit: js.UndefOr[Boolean] = js.undefined
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

