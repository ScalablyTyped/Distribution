package typings.zipkinInstrumentationExpress

import typings.zipkin.mod.Tracer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Port extends StObject {
    
    var port: js.UndefOr[Double] = js.native
    
    var tracer: Tracer = js.native
  }
  object Port {
    
    @scala.inline
    def apply(tracer: Tracer): Port = {
      val __obj = js.Dynamic.literal(tracer = tracer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Port]
    }
    
    @scala.inline
    implicit class PortMutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setTracer(value: Tracer): Self = StObject.set(x, "tracer", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemoteServiceName extends StObject {
    
    var remoteServiceName: js.UndefOr[String] = js.native
    
    var tracer: Tracer = js.native
  }
  object RemoteServiceName {
    
    @scala.inline
    def apply(tracer: Tracer): RemoteServiceName = {
      val __obj = js.Dynamic.literal(tracer = tracer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteServiceName]
    }
    
    @scala.inline
    implicit class RemoteServiceNameMutableBuilder[Self <: RemoteServiceName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemoteServiceName(value: String): Self = StObject.set(x, "remoteServiceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteServiceNameUndefined: Self = StObject.set(x, "remoteServiceName", js.undefined)
      
      @scala.inline
      def setTracer(value: Tracer): Self = StObject.set(x, "tracer", value.asInstanceOf[js.Any])
    }
  }
}
