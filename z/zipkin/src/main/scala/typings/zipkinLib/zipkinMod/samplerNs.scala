package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "sampler")
@js.native
object samplerNs extends js.Object {
  @js.native
  class CountingSampler () extends Sampler {
    def this(sampleRate: scala.Double) = this()
  }
  
  @js.native
  class Sampler protected () extends js.Object {
    def this(evaluator: js.Function1[/* traceId */ zipkinLib.zipkinMod.TraceId, scala.Boolean]) = this()
    def shouldSample(traceId: zipkinLib.zipkinMod.TraceId): zipkinLib.zipkinMod.optionNs.IOption[scala.Boolean] = js.native
  }
  
  def alwaysSample(traceId: zipkinLib.zipkinMod.TraceId): scala.Boolean = js.native
  def neverSample(traceId: zipkinLib.zipkinMod.TraceId): scala.Boolean = js.native
}

