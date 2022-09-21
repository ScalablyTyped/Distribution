package typings.zwitch

import typings.std.Parameters
import typings.std.Record
import typings.std.ReturnType
import typings.zwitch.mod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call[UnknownHandler /* <: Handler */, InvalidHandler /* <: Handler */, KnownHandler /* <: Handler */] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param parameters because its type Parameters<UnknownHandler> is not an array type */ parameters: Parameters[InvalidHandler | KnownHandler | UnknownHandler]
    ): ReturnType[UnknownHandler] = js.native
    
    var handlers: Record[String, KnownHandler] = js.native
    
    var invalid: InvalidHandler = js.native
    
    var unknown: UnknownHandler = js.native
  }
  
  trait Handlers[UnknownHandler /* <: Handler */, InvalidHandler /* <: Handler */, KnownHandler /* <: Handler */] extends StObject {
    
    var handlers: js.UndefOr[Record[String, KnownHandler]] = js.undefined
    
    var invalid: js.UndefOr[InvalidHandler] = js.undefined
    
    var unknown: js.UndefOr[UnknownHandler] = js.undefined
  }
  object Handlers {
    
    inline def apply[UnknownHandler /* <: Handler */, InvalidHandler /* <: Handler */, KnownHandler /* <: Handler */](): Handlers[UnknownHandler, InvalidHandler, KnownHandler] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Handlers[UnknownHandler, InvalidHandler, KnownHandler]]
    }
    
    extension [Self <: Handlers[?, ?, ?], UnknownHandler /* <: Handler */, InvalidHandler /* <: Handler */, KnownHandler /* <: Handler */](x: Self & (Handlers[UnknownHandler, InvalidHandler, KnownHandler])) {
      
      inline def setHandlers(value: Record[String, KnownHandler]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setInvalid(value: InvalidHandler): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setUnknown(value: UnknownHandler): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
      
      inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
}
