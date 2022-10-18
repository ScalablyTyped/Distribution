package typings.zustand

import typings.std.Omit
import typings.zustand.esmVanillaMod.StateCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMiddlewareCombineMod {
  
  @JSImport("zustand/esm/middleware/combine", "combine")
  @js.native
  val combine: Combine_ = js.native
  
  type Combine_ = js.Function2[
    /* initialState */ js.Object, 
    /* additionalStateCreator */ StateCreator[js.Object, js.Array[Any], js.Array[Any], js.Object], 
    StateCreator[Write[js.Object, js.Object], js.Array[Any], js.Array[Any], Write[js.Object, js.Object]]
  ]
  
  type Write[T, U] = (Omit[T, /* keyof U */ String]) & U
}
