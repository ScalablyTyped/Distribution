package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "sampler")
@js.native
object samplerNs extends js.Object {
  @js.native
  class CountingSampler ()
    extends zipkinLib.zipkinMod.zipkinNs.samplerNs.CountingSampler {
    def this(sampleRate: scala.Double) = this()
    /* CompleteClass */
    override def shouldSample(traceId: zipkinLib.zipkinMod.zipkinNs.TraceId): zipkinLib.zipkinMod.zipkinNs.optionNs.IOption[scala.Boolean] = js.native
  }
  
  @js.native
  class Sampler protected ()
    extends zipkinLib.zipkinMod.zipkinNs.samplerNs.Sampler {
    def this(evaluator: js.Function1[/* traceId */ zipkinLib.zipkinMod.zipkinNs.TraceId, scala.Boolean]) = this()
    /* CompleteClass */
    override def shouldSample(traceId: zipkinLib.zipkinMod.zipkinNs.TraceId): zipkinLib.zipkinMod.zipkinNs.optionNs.IOption[scala.Boolean] = js.native
  }
  
  def alwaysSample(traceId: zipkinLib.zipkinMod.zipkinNs.TraceId): scala.Boolean = js.native
  def neverSample(traceId: zipkinLib.zipkinMod.zipkinNs.TraceId): scala.Boolean = js.native
}

