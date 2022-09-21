package typings.zipkinInstrumentationFetch

import typings.zipkin.mod.Tracer
import typings.zipkinInstrumentationFetch.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(rawFetch: FnCall, options: Options): FnCall = (^.asInstanceOf[js.Dynamic].apply(rawFetch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FnCall]
  
  @JSImport("zipkin-instrumentation-fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var remoteServiceName: String
    
    var serviceName: js.UndefOr[String] = js.undefined
    
    var tracer: Tracer
  }
  object Options {
    
    inline def apply(remoteServiceName: String, tracer: Tracer): Options = {
      val __obj = js.Dynamic.literal(remoteServiceName = remoteServiceName.asInstanceOf[js.Any], tracer = tracer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setRemoteServiceName(value: String): Self = StObject.set(x, "remoteServiceName", value.asInstanceOf[js.Any])
      
      inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
      
      inline def setTracer(value: Tracer): Self = StObject.set(x, "tracer", value.asInstanceOf[js.Any])
    }
  }
}
