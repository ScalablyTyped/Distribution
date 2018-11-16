package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_TraceId128Bit extends js.Object {
  var ctxImpl: zipkinLib.zipkinMod.zipkinNs.Context[zipkinLib.zipkinMod.zipkinNs.TraceId]
  var localEndpoint: js.UndefOr[zipkinLib.zipkinMod.zipkinNs.modelNs.Endpoint] = js.undefined
  var localServiceName: js.UndefOr[java.lang.String] = js.undefined
  var recorder: zipkinLib.zipkinMod.zipkinNs.Recorder
  var sampler: js.UndefOr[zipkinLib.zipkinMod.zipkinNs.samplerNs.Sampler] = js.undefined
  var traceId128Bit: js.UndefOr[scala.Boolean] = js.undefined
}

