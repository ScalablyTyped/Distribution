package typings.zipkinJavascriptOpentracing.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zipkin-javascript-opentracing", "prototypeNamespace")
@js.native
object prototypeNamespace extends js.Object {
  
  @js.native
  object extract extends js.Object {
    
    def apply(format: js.Any, carrier: js.Any): js.Any = js.native
  }
  
  @js.native
  object inject extends js.Object {
    
    def apply(span: js.Any, format: js.Any, carrier: js.Any): Unit = js.native
  }
  
  @js.native
  object startSpan extends js.Object {
    
    def apply(name: js.Any, args: js.Any*): js.Any = js.native
  }
}
