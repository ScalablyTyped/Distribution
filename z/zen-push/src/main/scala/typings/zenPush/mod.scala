package typings.zenPush

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zen-push", JSImport.Namespace)
  @js.native
  class ^[T] ()
    extends StObject
       with PushStream[T]
  
  @js.native
  trait PushStream[T] extends StObject {
    
    def complete(): Unit = js.native
    def complete(x: js.Any): Unit = js.native
    
    def error(e: Error): Unit = js.native
    
    def next(x: T): Unit = js.native
    
    val observable: typings.zenObservable.mod.^[T] = js.native
    
    val observed: Double = js.native
  }
}
