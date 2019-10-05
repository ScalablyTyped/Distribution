package typings.zipkin.zipkinMod

import typings.zipkin.zipkinMod.option.IOption
import typings.zipkin.zipkinMod.sampler.Sampler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "sampler")
@js.native
object sampler extends js.Object {
  @js.native
  class CountingSampler () extends Sampler {
    def this(sampleRate: Double) = this()
  }
  
  @js.native
  class Sampler protected () extends js.Object {
    def this(evaluator: js.Function1[/* traceId */ TraceId, Boolean]) = this()
    def shouldSample(traceId: TraceId): IOption[Boolean] = js.native
  }
  
  def alwaysSample(traceId: TraceId): Boolean = js.native
  def neverSample(traceId: TraceId): Boolean = js.native
}

