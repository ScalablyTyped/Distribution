package typings.zipkin.mod

import typings.zipkin.anon.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Request {
  
  @JSImport("zipkin", "Request")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addZipkinHeaders[T, H](req: T & Headers, traceId: TraceId): RequestZipkinHeaders[T, H] = (^.asInstanceOf[js.Dynamic].applyDynamic("addZipkinHeaders")(req.asInstanceOf[js.Any], traceId.asInstanceOf[js.Any])).asInstanceOf[RequestZipkinHeaders[T, H]]
}
