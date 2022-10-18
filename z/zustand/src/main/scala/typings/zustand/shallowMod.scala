package typings.zustand

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shallowMod {
  
  @JSImport("zustand/shallow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](objA: T, objB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
