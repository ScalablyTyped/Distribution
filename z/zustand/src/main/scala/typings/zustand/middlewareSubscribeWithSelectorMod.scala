package typings.zustand

import typings.std.Omit
import typings.zustand.anon.EqualityFn
import typings.zustand.vanillaMod.StateCreator
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
  
  type SubscribeWithSelector_ = js.Function1[
    /* initializer */ StateCreator[
      Any, 
      /* import warning: importer.ImportType#apply c repeated non-array type: [] */ js.Array[js.Array[Any]], 
      js.Array[Any], 
      Any
    ], 
    StateCreator[
      Any, 
      js.Array[Any], 
      /* import warning: importer.ImportType#apply c repeated non-array type: [] */ js.Array[js.Array[Any]], 
      Any
    ]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends {getState (): infer T} ? zustand.zustand/middleware/subscribeWithSelector.Write<S, zustand.zustand/middleware/subscribeWithSelector.StoreSubscribeWithSelector<T>> : never
    }}}
    */
  @js.native
  trait WithSelectorSubscribe[S] extends StObject
  
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
