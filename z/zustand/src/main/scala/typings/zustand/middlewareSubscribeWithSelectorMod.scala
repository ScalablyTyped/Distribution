package typings.zustand

import typings.std.Omit
import typings.zustand.anon.EqualityFn
import typings.zustand.zustandVanillaMod.StateCreator
import typings.zustand.zustandVanillaMod.StoreMutatorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareSubscribeWithSelectorMod {
  
  @JSImport("zustand/middleware/subscribeWithSelector", "subscribeWithSelector")
  @js.native
  val subscribeWithSelector: SubscribeWithSelector_ = js.native
  
  @js.native
  trait StoreSubscribeWithSelector[T] extends StObject {
    
    def subscribe(listener: js.Function2[/* selectedState */ T, /* previousSelectedState */ T, Unit]): js.Function0[Unit] = js.native
    def subscribe[U](
      selector: js.Function1[/* state */ T, U],
      listener: js.Function2[/* selectedState */ U, /* previousSelectedState */ U, Unit]
    ): js.Function0[Unit] = js.native
    def subscribe[U](
      selector: js.Function1[/* state */ T, U],
      listener: js.Function2[/* selectedState */ U, /* previousSelectedState */ U, Unit],
      options: EqualityFn[U]
    ): js.Function0[Unit] = js.native
  }
  
  @js.native
  trait SubscribeWithSelector_ extends StObject {
    
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
  
  type WithSelectorSubscribe[S] = Write[S, StoreSubscribeWithSelector[Any]]
  
  type Write[T, U] = (Omit[T, /* keyof U */ String]) & U
  
  /* augmented module */
  object zustandVanillaAugmentingMod {
    
    trait StoreMutators[S, A] extends StObject {
      
      @JSName("zustand/subscribeWithSelector")
      var zustandSlashsubscribeWithSelector: WithSelectorSubscribe[S]
    }
    object StoreMutators {
      
      inline def apply[S, A](zustandSlashsubscribeWithSelector: WithSelectorSubscribe[S]): StoreMutators[S, A] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("zustand/subscribeWithSelector")(zustandSlashsubscribeWithSelector.asInstanceOf[js.Any])
        __obj.asInstanceOf[StoreMutators[S, A]]
      }
      
      extension [Self <: StoreMutators[?, ?], S, A](x: Self & (StoreMutators[S, A])) {
        
        inline def setZustandSlashsubscribeWithSelector(value: WithSelectorSubscribe[S]): Self = StObject.set(x, "zustand/subscribeWithSelector", value.asInstanceOf[js.Any])
      }
    }
  }
}
