package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "Instrumentation")
@js.native
object InstrumentationNs extends js.Object {
  @js.native
  class HttpClient protected () extends js.Object {
    def this(args: zipkinLib.Anon_RemoteServiceName) = this()
    def recordError(traceId: zipkinLib.zipkinMod.TraceId, error: stdLib.Error): scala.Unit = js.native
    def recordRequest[T](request: T, url: java.lang.String, method: java.lang.String): T = js.native
    def recordResponse(traceId: zipkinLib.zipkinMod.TraceId, statusCode: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  class HttpServer protected () extends js.Object {
    def this(args: zipkinLib.Anon_HostKey) = this()
    def recordRequest(
      method: java.lang.String,
      requestUrl: java.lang.String,
      readHeader: js.Function1[/* header */ java.lang.String, zipkinLib.zipkinMod.optionNs.IOption[_]]
    ): zipkinLib.zipkinMod.TraceId = js.native
    def recordResponse(traceId: zipkinLib.zipkinMod.TraceId, statusCode: java.lang.String): scala.Unit = js.native
    def recordResponse(traceId: zipkinLib.zipkinMod.TraceId, statusCode: java.lang.String, error: stdLib.Error): scala.Unit = js.native
  }
  
}

