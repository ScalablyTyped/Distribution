package typings.zwitch

import typings.std.Parameters
import typings.std.Record
import typings.std.ReturnType
import typings.zwitch.mod.Handler
import typings.zwitch.mod.InvalidHandler
import typings.zwitch.mod.UnknownHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call[Handlers /* <: Record[String, Handler] */, Unknown /* <: UnknownHandler */, Invalid /* <: InvalidHandler */] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param parameters because its type Parameters<Handlers[keyof Handlers]> is not an array type */ parameters: Parameters[
          (/* import warning: importer.ImportType#apply Failed type conversion: Handlers[keyof Handlers] */ js.Any) | Unknown
        ]
    ): ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: Handlers[keyof Handlers] */ js.Any
      ] = js.native
    
    var handlers: Handlers = js.native
    
    var invalid: Invalid = js.native
    
    var unknown: Unknown = js.native
  }
}
