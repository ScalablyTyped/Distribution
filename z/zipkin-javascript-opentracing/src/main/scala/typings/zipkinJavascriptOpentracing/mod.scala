package typings.zipkinJavascriptOpentracing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zipkin-javascript-opentracing", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with typings.zipkinJavascriptOpentracing.mod.zipkinJavascriptOpentracing {
    def this(args: js.Any*) = this()
    
    /* CompleteClass */
    override def extract(format: js.Any, carrier: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def inject(span: js.Any, format: js.Any, carrier: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def startSpan(name: js.Any, args: js.Any*): js.Any = js.native
  }
  @JSImport("zipkin-javascript-opentracing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("zipkin-javascript-opentracing", "FORMAT_BINARY")
  @js.native
  def FORMAT_BINARY: String = js.native
  inline def FORMAT_BINARY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORMAT_BINARY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("zipkin-javascript-opentracing", "FORMAT_HTTP_HEADERS")
  @js.native
  def FORMAT_HTTP_HEADERS: String = js.native
  inline def FORMAT_HTTP_HEADERS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORMAT_HTTP_HEADERS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("zipkin-javascript-opentracing", "FORMAT_TEXT_MAP")
  @js.native
  def FORMAT_TEXT_MAP: String = js.native
  inline def FORMAT_TEXT_MAP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORMAT_TEXT_MAP")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def makeOptional(`val`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeOptional")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  object prototypeNamespace {
    
    object extract {
      
      inline def apply(format: js.Any, carrier: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any], carrier.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      @JSImport("zipkin-javascript-opentracing", "prototypeNamespace.extract")
      @js.native
      val ^ : js.Any = js.native
    }
    
    object inject {
      
      inline def apply(span: js.Any, format: js.Any, carrier: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(span.asInstanceOf[js.Any], format.asInstanceOf[js.Any], carrier.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("zipkin-javascript-opentracing", "prototypeNamespace.inject")
      @js.native
      val ^ : js.Any = js.native
    }
    
    object startSpan {
      
      inline def apply(name: js.Any, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      @JSImport("zipkin-javascript-opentracing", "prototypeNamespace.startSpan")
      @js.native
      val ^ : js.Any = js.native
    }
  }
  
  trait zipkinJavascriptOpentracing extends StObject {
    
    def extract(format: js.Any, carrier: js.Any): js.Any
    
    def inject(span: js.Any, format: js.Any, carrier: js.Any): Unit
    
    def startSpan(name: js.Any, args: js.Any*): js.Any
  }
  object zipkinJavascriptOpentracing {
    
    inline def apply(
      extract: (js.Any, js.Any) => js.Any,
      inject: (js.Any, js.Any, js.Any) => Unit,
      startSpan: (js.Any, /* repeated */ js.Any) => js.Any
    ): typings.zipkinJavascriptOpentracing.mod.zipkinJavascriptOpentracing = {
      val __obj = js.Dynamic.literal(extract = js.Any.fromFunction2(extract), inject = js.Any.fromFunction3(inject), startSpan = js.Any.fromFunction2(startSpan))
      __obj.asInstanceOf[typings.zipkinJavascriptOpentracing.mod.zipkinJavascriptOpentracing]
    }
    
    extension [Self <: typings.zipkinJavascriptOpentracing.mod.zipkinJavascriptOpentracing](x: Self) {
      
      inline def setExtract(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "extract", js.Any.fromFunction2(value))
      
      inline def setInject(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "inject", js.Any.fromFunction3(value))
      
      inline def setStartSpan(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "startSpan", js.Any.fromFunction2(value))
    }
  }
}
