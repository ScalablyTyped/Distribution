package typings.zipkinTransportHttp

import typings.zipkin.mod.Logger
import typings.zipkin.mod.model.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zipkin-transport-http", "HttpLogger")
  @js.native
  class HttpLogger protected ()
    extends StObject
       with Logger {
    /**
      * @constructor
      * @param {Object} options
      * @param {string} options.endpoint HTTP endpoint which spans will be sent
      * @param {number} options.httpInterval How often to sync spans.
      * @param {JsonEncoder} options.jsonEncoder JSON encoder to use when sending spans.
      * @param {number} options.timeout Timeout for HTTP Post when sending spans.
      * @param {number} options.maxPayloadSize Max payload size for zipkin span.
      * @param {Object<string, string>} options.headers Any additional HTTP headers to be sent with span.
      * @param {Agent|Function} options.agent HTTP(S) agent to use for any networking related options.
      * @param {ErrorLogger} options.log Internal error logger used within the transport.
      */
    def this(options: typings.zipkinTransportHttp.anon.Agent) = this()
    
    /* CompleteClass */
    override def logSpan(span: Span): Unit = js.native
  }
  
  type Agent = typings.node.httpMod.Agent | typings.node.httpsMod.Agent
  
  trait ErrorLogger extends StObject {
    
    def error(args: js.Any*): Unit
  }
  object ErrorLogger {
    
    @scala.inline
    def apply(error: /* repeated */ js.Any => Unit): ErrorLogger = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
      __obj.asInstanceOf[ErrorLogger]
    }
    
    @scala.inline
    implicit class ErrorLoggerMutableBuilder[Self <: ErrorLogger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    }
  }
}
