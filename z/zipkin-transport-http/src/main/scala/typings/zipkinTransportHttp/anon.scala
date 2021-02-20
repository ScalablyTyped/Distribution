package typings.zipkinTransportHttp

import org.scalablytyped.runtime.StringDictionary
import typings.node.urlMod.URL_
import typings.zipkin.mod.JsonEncoder_
import typings.zipkinTransportHttp.mod.ErrorLogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Agent extends StObject {
    
    var agent: js.UndefOr[
        typings.zipkinTransportHttp.mod.Agent | (js.Function1[/* url */ URL_, typings.zipkinTransportHttp.mod.Agent])
      ] = js.native
    
    var endpoint: String = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var httpInterval: js.UndefOr[Double] = js.native
    
    var jsonEncoder: js.UndefOr[JsonEncoder_] = js.native
    
    var log: js.UndefOr[ErrorLogger] = js.native
    
    var maxPayloadSize: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object Agent {
    
    @scala.inline
    def apply(endpoint: String): Agent = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[Agent]
    }
    
    @scala.inline
    implicit class AgentMutableBuilder[Self <: Agent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(
        value: typings.zipkinTransportHttp.mod.Agent | (js.Function1[/* url */ URL_, typings.zipkinTransportHttp.mod.Agent])
      ): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentFunction1(value: /* url */ URL_ => typings.zipkinTransportHttp.mod.Agent): Self = StObject.set(x, "agent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHttpInterval(value: Double): Self = StObject.set(x, "httpInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpIntervalUndefined: Self = StObject.set(x, "httpInterval", js.undefined)
      
      @scala.inline
      def setJsonEncoder(value: JsonEncoder_): Self = StObject.set(x, "jsonEncoder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonEncoderUndefined: Self = StObject.set(x, "jsonEncoder", js.undefined)
      
      @scala.inline
      def setLog(value: ErrorLogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setMaxPayloadSize(value: Double): Self = StObject.set(x, "maxPayloadSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPayloadSizeUndefined: Self = StObject.set(x, "maxPayloadSize", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
