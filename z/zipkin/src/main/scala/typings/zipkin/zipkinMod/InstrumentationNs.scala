package typings.zipkin.zipkinMod

import typings.std.Error
import typings.zipkin.Anon_HostKey
import typings.zipkin.Anon_RemoteServiceName
import typings.zipkin.zipkinMod.optionNs.IOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "Instrumentation")
@js.native
object InstrumentationNs extends js.Object {
  @js.native
  class HttpClient protected () extends js.Object {
    def this(args: Anon_RemoteServiceName) = this()
    def recordError(traceId: TraceId, error: Error): Unit = js.native
    def recordRequest[T](request: T, url: String, method: String): T = js.native
    def recordResponse(traceId: TraceId, statusCode: String): Unit = js.native
  }
  
  @js.native
  class HttpServer protected () extends js.Object {
    def this(args: Anon_HostKey) = this()
    def recordRequest(method: String, requestUrl: String, readHeader: js.Function1[/* header */ String, IOption[_]]): TraceId = js.native
    def recordResponse(traceId: TraceId, statusCode: String): Unit = js.native
    def recordResponse(traceId: TraceId, statusCode: String, error: Error): Unit = js.native
  }
  
}

