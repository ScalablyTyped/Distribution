package typings.zustand

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmShallowMod {
  
  @JSImport("zustand/esm/shallow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof shallow` */
  inline def default[T](objA: T, objB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shallow[T](objA: T, objB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallow")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
