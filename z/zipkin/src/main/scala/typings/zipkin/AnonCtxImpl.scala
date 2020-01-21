package typings.zipkin

import typings.std.Console_
import typings.zipkin.mod.Context
import typings.zipkin.mod.Recorder
import typings.zipkin.mod.TraceId
import typings.zipkin.mod.model.Endpoint
import typings.zipkin.mod.sampler.Sampler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCtxImpl extends js.Object {
  var ctxImpl: Context[TraceId]
  var defaultTags: js.UndefOr[js.Object] = js.undefined
  var localEndpoint: js.UndefOr[Endpoint] = js.undefined
  var localServiceName: js.UndefOr[String] = js.undefined
  var log: js.UndefOr[Console_] = js.undefined
  var recorder: Recorder
  var sampler: js.UndefOr[Sampler] = js.undefined
  var supportsJoin: js.UndefOr[Boolean] = js.undefined
  var traceId128Bit: js.UndefOr[Boolean] = js.undefined
}

object AnonCtxImpl {
  @scala.inline
  def apply(
    ctxImpl: Context[TraceId],
    recorder: Recorder,
    defaultTags: js.Object = null,
    localEndpoint: Endpoint = null,
    localServiceName: String = null,
    log: Console_ = null,
    sampler: Sampler = null,
    supportsJoin: js.UndefOr[Boolean] = js.undefined,
    traceId128Bit: js.UndefOr[Boolean] = js.undefined
  ): AnonCtxImpl = {
    val __obj = js.Dynamic.literal(ctxImpl = ctxImpl.asInstanceOf[js.Any], recorder = recorder.asInstanceOf[js.Any])
    if (defaultTags != null) __obj.updateDynamic("defaultTags")(defaultTags.asInstanceOf[js.Any])
    if (localEndpoint != null) __obj.updateDynamic("localEndpoint")(localEndpoint.asInstanceOf[js.Any])
    if (localServiceName != null) __obj.updateDynamic("localServiceName")(localServiceName.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (sampler != null) __obj.updateDynamic("sampler")(sampler.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsJoin)) __obj.updateDynamic("supportsJoin")(supportsJoin.asInstanceOf[js.Any])
    if (!js.isUndefined(traceId128Bit)) __obj.updateDynamic("traceId128Bit")(traceId128Bit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCtxImpl]
  }
}

