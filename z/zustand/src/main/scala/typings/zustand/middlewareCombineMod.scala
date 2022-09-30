package typings.zustand

import typings.std.Omit
import typings.zustand.zustandVanillaMod.StateCreator
import typings.zustand.zustandVanillaMod.StoreMutatorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareCombineMod {
  
  @JSImport("zustand/middleware/combine", "combine")
  @js.native
  val combine: Combine_ = js.native
  
  @js.native
  trait Combine_ extends StObject {
    
    def apply[T /* <: js.Object */, U /* <: js.Object */, Mps /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */, Mcs /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */](initialState: T, additionalStateCreator: StateCreator[T, Mps, Mcs, U]): StateCreator[Write[T, U], Mps, Mcs, Write[T, U]] = js.native
  }
  
  type Write[T, U] = (Omit[T, /* keyof U */ String]) & U
}
