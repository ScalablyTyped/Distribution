package typings.zipkin.mod

import typings.zipkin.mod.option.IOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sampler {
  
  @JSImport("zipkin", "sampler")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("zipkin", "sampler.CountingSampler")
  @js.native
  class CountingSampler () extends Sampler {
    def this(sampleRate: Double) = this()
  }
  
  @JSImport("zipkin", "sampler.Sampler")
  @js.native
  class Sampler protected () extends StObject {
    def this(evaluator: js.Function1[/* traceId */ TraceId, Boolean]) = this()
    
    def shouldSample(traceId: TraceId): IOption[Boolean] = js.native
  }
  
  inline def alwaysSample(traceId: TraceId): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("alwaysSample")(traceId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def neverSample(traceId: TraceId): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("neverSample")(traceId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
