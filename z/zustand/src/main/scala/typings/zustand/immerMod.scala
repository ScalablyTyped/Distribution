package typings.zustand

import typings.std.Omit
import typings.zustand.anon.`1`
import typings.zustand.vanillaMod.StateCreator
import typings.zustand.vanillaMod.StoreMutatorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object immerMod {
  
  @JSImport("zustand/esm/middleware/immer", "immer")
  @js.native
  val immer: Immer_ = js.native
  
  @js.native
  trait Immer_ extends StObject {
    
    def apply[T, Mps /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */, Mcs /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */](
      initializer: StateCreator[
          T, 
          /* import warning: importer.ImportType#apply c repeated non-array type: Mps */ js.Array[Mps], 
          Mcs, 
          T
        ]
    ): StateCreator[
        T, 
        Mps, 
        /* import warning: importer.ImportType#apply c repeated non-array type: Mcs */ js.Array[Mcs], 
        T
      ] = js.native
  }
  
  type SkipTwo[T] = Any | js.Array[Any]
  
  type StoreImmer[S] = `1`
  
  type WithImmer[S] = Write[S, StoreImmer[S]]
  
  type Write[T, U] = (Omit[T, /* keyof U */ String]) & U
  
  /* augmented module */
  object zustandEsmVanillaAugmentingMod {
    
    trait StoreMutators[S, A] extends StObject {
      
      @JSName("zustand/immer")
      var zustandSlashimmer: WithImmer[S]
    }
    object StoreMutators {
      
      inline def apply[S, A](zustandSlashimmer: WithImmer[S]): StoreMutators[S, A] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("zustand/immer")(zustandSlashimmer.asInstanceOf[js.Any])
        __obj.asInstanceOf[StoreMutators[S, A]]
      }
      
      extension [Self <: StoreMutators[?, ?], S, A](x: Self & (StoreMutators[S, A])) {
        
        inline def setZustandSlashimmer(value: WithImmer[S]): Self = StObject.set(x, "zustand/immer", value.asInstanceOf[js.Any])
      }
    }
  }
}
