package typings.zwitch

import typings.zwitch.anon.Call
import typings.zwitch.anon.Handlers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zwitch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zwitch[KnownHandler /* <: Handler */, UnknownHandler /* <: Handler */, InvalidHandler /* <: Handler */](key: String): Call[UnknownHandler, InvalidHandler, KnownHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("zwitch")(key.asInstanceOf[js.Any]).asInstanceOf[Call[UnknownHandler, InvalidHandler, KnownHandler]]
  inline def zwitch[KnownHandler /* <: Handler */, UnknownHandler /* <: Handler */, InvalidHandler /* <: Handler */](key: String, options: Handlers[UnknownHandler, InvalidHandler, KnownHandler]): Call[UnknownHandler, InvalidHandler, KnownHandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("zwitch")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Call[UnknownHandler, InvalidHandler, KnownHandler]]
  
  @js.native
  trait Handler extends StObject {
    
    def apply(props: Any*): Any = js.native
  }
}
