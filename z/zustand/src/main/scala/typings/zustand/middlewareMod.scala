package typings.zustand

import typings.zustand.middlewareCombineMod.Combine_
import typings.zustand.middlewareDevtoolsMod.Devtools_
import typings.zustand.middlewareDevtoolsMod.WithDevtools
import typings.zustand.middlewarePersistMod.JsonStorageOptions
import typings.zustand.middlewarePersistMod.PersistStorage
import typings.zustand.middlewarePersistMod.Persist_
import typings.zustand.middlewarePersistMod.StateStorage
import typings.zustand.middlewarePersistMod.WithPersist
import typings.zustand.middlewareReduxMod.Redux_
import typings.zustand.middlewareReduxMod.WithRedux
import typings.zustand.middlewareSubscribeWithSelectorMod.SubscribeWithSelector_
import typings.zustand.middlewareSubscribeWithSelectorMod.WithSelectorSubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareMod {
  
  @JSImport("zustand/middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("zustand/middleware", "combine")
  @js.native
  val combine: Combine_ = js.native
  
  inline def createJSONStorage[S](getStorage: js.Function0[StateStorage]): js.UndefOr[PersistStorage[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createJSONStorage")(getStorage.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[PersistStorage[S]]]
  inline def createJSONStorage[S](getStorage: js.Function0[StateStorage], options: JsonStorageOptions): js.UndefOr[PersistStorage[S]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createJSONStorage")(getStorage.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[PersistStorage[S]]]
  
  @JSImport("zustand/middleware", "devtools")
  @js.native
  val devtools: Devtools_ = js.native
  
  @JSImport("zustand/middleware", "persist")
  @js.native
  val persist: Persist_ = js.native
  
  @JSImport("zustand/middleware", "redux")
  @js.native
  val redux: Redux_ = js.native
  
  @JSImport("zustand/middleware", "subscribeWithSelector")
  @js.native
  val subscribeWithSelector: SubscribeWithSelector_ = js.native
  
  /* augmented module */
  object zustandVanillaAugmentingMod {
    
    trait StoreMutators[S, A] extends StObject {
      
      @JSName("zustand/devtools")
      var zustandSlashdevtools: WithDevtools[S]
      
      @JSName("zustand/persist")
      var zustandSlashpersist: WithPersist[S, A]
      
      @JSName("zustand/redux")
      var zustandSlashredux: WithRedux[S, A]
      
      @JSName("zustand/subscribeWithSelector")
      var zustandSlashsubscribeWithSelector: WithSelectorSubscribe[S]
    }
    object StoreMutators {
      
      inline def apply[S, A](
        zustandSlashdevtools: WithDevtools[S],
        zustandSlashpersist: WithPersist[S, A],
        zustandSlashredux: WithRedux[S, A],
        zustandSlashsubscribeWithSelector: WithSelectorSubscribe[S]
      ): StoreMutators[S, A] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("zustand/devtools")(zustandSlashdevtools.asInstanceOf[js.Any])
        __obj.updateDynamic("zustand/persist")(zustandSlashpersist.asInstanceOf[js.Any])
        __obj.updateDynamic("zustand/redux")(zustandSlashredux.asInstanceOf[js.Any])
        __obj.updateDynamic("zustand/subscribeWithSelector")(zustandSlashsubscribeWithSelector.asInstanceOf[js.Any])
        __obj.asInstanceOf[StoreMutators[S, A]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: StoreMutators[?, ?], S, A] (val x: Self & (StoreMutators[S, A])) extends AnyVal {
        
        inline def setZustandSlashdevtools(value: WithDevtools[S]): Self = StObject.set(x, "zustand/devtools", value.asInstanceOf[js.Any])
        
        inline def setZustandSlashpersist(value: WithPersist[S, A]): Self = StObject.set(x, "zustand/persist", value.asInstanceOf[js.Any])
        
        inline def setZustandSlashredux(value: WithRedux[S, A]): Self = StObject.set(x, "zustand/redux", value.asInstanceOf[js.Any])
        
        inline def setZustandSlashsubscribeWithSelector(value: WithSelectorSubscribe[S]): Self = StObject.set(x, "zustand/subscribeWithSelector", value.asInstanceOf[js.Any])
      }
    }
  }
}
