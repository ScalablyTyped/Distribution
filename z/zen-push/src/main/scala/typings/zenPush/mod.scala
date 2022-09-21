package typings.zenPush

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zen-push", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with PushStream[T]
  
  @js.native
  trait PushStream[T] extends StObject {
    
    def complete(): Unit = js.native
    def complete(x: Any): Unit = js.native
    
    def error(e: js.Error): Unit = js.native
    
    def next(x: T): Unit = js.native
    
    val observable: typings.zenObservable.mod.^[T] = js.native
    
    val observed: Double = js.native
  }
}
