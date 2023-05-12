package typings.zwitch

import typings.std.Record
import typings.zwitch.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zwitch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zwitch[Invalid /* <: InvalidHandler */, Unknown /* <: UnknownHandler */, Handlers /* <: Record[String, Handler] */](key: String): Call[Handlers, Unknown, Invalid] = ^.asInstanceOf[js.Dynamic].applyDynamic("zwitch")(key.asInstanceOf[js.Any]).asInstanceOf[Call[Handlers, Unknown, Invalid]]
  inline def zwitch[Invalid /* <: InvalidHandler */, Unknown /* <: UnknownHandler */, Handlers /* <: Record[String, Handler] */](key: String, options: Options[Invalid, Unknown, Handlers]): Call[Handlers, Unknown, Invalid] = (^.asInstanceOf[js.Dynamic].applyDynamic("zwitch")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Call[Handlers, Unknown, Invalid]]
  
  @js.native
  trait Handler extends StObject {
    
    def apply(parameters: Any*): Any = js.native
  }
  
  @js.native
  trait InvalidHandler extends StObject {
    
    def apply(value: Any, rest: Any*): js.UndefOr[Unit | Null] = js.native
  }
  
  trait Options[Invalid /* <: InvalidHandler */, Unknown /* <: UnknownHandler */, Handlers /* <: Record[String, Handler] */] extends StObject {
    
    /**
      * Handlers to use.
      */
    var handlers: js.UndefOr[Handlers] = js.undefined
    
    /**
      * Handler to use for invalid values.
      */
    var invalid: js.UndefOr[Invalid] = js.undefined
    
    /**
      * Handler to use for unknown values.
      */
    var unknown: js.UndefOr[Unknown] = js.undefined
  }
  object Options {
    
    inline def apply[Invalid /* <: InvalidHandler */, Unknown /* <: UnknownHandler */, Handlers /* <: Record[String, Handler] */](): Options[Invalid, Unknown, Handlers] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Invalid, Unknown, Handlers]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?, ?, ?], Invalid /* <: InvalidHandler */, Unknown /* <: UnknownHandler */, Handlers /* <: Record[String, Handler] */] (val x: Self & (Options[Invalid, Unknown, Handlers])) extends AnyVal {
      
      inline def setHandlers(value: Handlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setInvalid(value: Invalid): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setUnknown(value: Unknown): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
      
      inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  @js.native
  trait UnknownHandler extends StObject {
    
    def apply(value: Any, rest: Any*): Any = js.native
  }
}
