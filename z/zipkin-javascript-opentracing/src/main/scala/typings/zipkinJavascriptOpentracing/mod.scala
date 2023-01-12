package typings.zipkinJavascriptOpentracing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zipkin-javascript-opentracing", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with typings.zipkinJavascriptOpentracing.mod.zipkinJavascriptOpentracing {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    override def extract(format: Any, carrier: Any): Any = js.native
    
    /* CompleteClass */
    override def inject(span: Any, format: Any, carrier: Any): Unit = js.native
    
    /* CompleteClass */
    override def startSpan(name: Any, args: Any*): Any = js.native
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
  inline def makeOptional(`val`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeOptional")(`val`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  object prototypeNamespace {
    
    @JSImport("zipkin-javascript-opentracing", "prototypeNamespace")
    @js.native
    val ^ : js.Any = js.native
    
    inline def extract(format: Any, carrier: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(format.asInstanceOf[js.Any], carrier.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def inject(span: Any, format: Any, carrier: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(span.asInstanceOf[js.Any], format.asInstanceOf[js.Any], carrier.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def startSpan(name: Any, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("startSpan")(scala.List(name.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  }
  
  trait zipkinJavascriptOpentracing extends StObject {
    
    def extract(format: Any, carrier: Any): Any
    
    def inject(span: Any, format: Any, carrier: Any): Unit
    
    def startSpan(name: Any, args: Any*): Any
  }
  object zipkinJavascriptOpentracing {
    
    inline def apply(
      extract: (Any, Any) => Any,
      inject: (Any, Any, Any) => Unit,
      startSpan: (Any, /* repeated */ Any) => Any
    ): typings.zipkinJavascriptOpentracing.mod.zipkinJavascriptOpentracing = {
      val __obj = js.Dynamic.literal(extract = js.Any.fromFunction2(extract), inject = js.Any.fromFunction3(inject), startSpan = js.Any.fromFunction2(startSpan))
      __obj.asInstanceOf[typings.zipkinJavascriptOpentracing.mod.zipkinJavascriptOpentracing]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.zipkinJavascriptOpentracing.mod.zipkinJavascriptOpentracing] (val x: Self) extends AnyVal {
      
      inline def setExtract(value: (Any, Any) => Any): Self = StObject.set(x, "extract", js.Any.fromFunction2(value))
      
      inline def setInject(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "inject", js.Any.fromFunction3(value))
      
      inline def setStartSpan(value: (Any, /* repeated */ Any) => Any): Self = StObject.set(x, "startSpan", js.Any.fromFunction2(value))
    }
  }
}
