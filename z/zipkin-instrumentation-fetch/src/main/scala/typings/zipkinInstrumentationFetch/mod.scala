package typings.zipkinInstrumentationFetch

import typings.zipkin.mod.Tracer
import typings.zipkinInstrumentationFetch.anon.Typeoffetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(rawFetch: Typeoffetch, options: Options): Typeoffetch = (^.asInstanceOf[js.Dynamic].apply(rawFetch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Typeoffetch]
  
  @JSImport("zipkin-instrumentation-fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var remoteServiceName: String
    
    var tracer: Tracer
  }
  object Options {
    
    @scala.inline
    def apply(remoteServiceName: String, tracer: Tracer): Options = {
      val __obj = js.Dynamic.literal(remoteServiceName = remoteServiceName.asInstanceOf[js.Any], tracer = tracer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemoteServiceName(value: String): Self = StObject.set(x, "remoteServiceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracer(value: Tracer): Self = StObject.set(x, "tracer", value.asInstanceOf[js.Any])
    }
  }
}
