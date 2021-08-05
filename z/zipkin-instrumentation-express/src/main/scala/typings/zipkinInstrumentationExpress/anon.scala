package typings.zipkinInstrumentationExpress

import typings.zipkin.mod.Tracer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Port extends StObject {
    
    var port: js.UndefOr[Double] = js.undefined
    
    var tracer: Tracer
  }
  object Port {
    
    inline def apply(tracer: Tracer): Port = {
      val __obj = js.Dynamic.literal(tracer = tracer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Port]
    }
    
    extension [Self <: Port](x: Self) {
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setTracer(value: Tracer): Self = StObject.set(x, "tracer", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoteServiceName extends StObject {
    
    var remoteServiceName: js.UndefOr[String] = js.undefined
    
    var tracer: Tracer
  }
  object RemoteServiceName {
    
    inline def apply(tracer: Tracer): RemoteServiceName = {
      val __obj = js.Dynamic.literal(tracer = tracer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteServiceName]
    }
    
    extension [Self <: RemoteServiceName](x: Self) {
      
      inline def setRemoteServiceName(value: String): Self = StObject.set(x, "remoteServiceName", value.asInstanceOf[js.Any])
      
      inline def setRemoteServiceNameUndefined: Self = StObject.set(x, "remoteServiceName", js.undefined)
      
      inline def setTracer(value: Tracer): Self = StObject.set(x, "tracer", value.asInstanceOf[js.Any])
    }
  }
}
