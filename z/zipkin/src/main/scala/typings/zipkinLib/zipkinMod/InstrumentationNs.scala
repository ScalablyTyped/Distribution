package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "Instrumentation")
@js.native
object InstrumentationNs extends js.Object {
  @js.native
  class HttpClient protected ()
    extends zipkinLib.zipkinMod.zipkinNs.InstrumentationNs.HttpClient {
    def this(args: zipkinLib.Anon_RemoteServiceName) = this()
    /* CompleteClass */
    override def recordError(traceId: zipkinLib.zipkinMod.zipkinNs.TraceId, error: stdLib.Error): scala.Unit = js.native
    /* CompleteClass */
    override def recordRequest[T](request: T, url: java.lang.String, method: java.lang.String): T = js.native
    /* CompleteClass */
    override def recordResponse(traceId: zipkinLib.zipkinMod.zipkinNs.TraceId, statusCode: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  class HttpServer protected ()
    extends zipkinLib.zipkinMod.zipkinNs.InstrumentationNs.HttpServer {
    def this(args: zipkinLib.Anon_Tracer) = this()
  }
  
}

