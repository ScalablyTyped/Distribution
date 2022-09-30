package typings.zustand

import typings.zustand.anon.FnCallSelectorEquals
import typings.zustand.anon.WithReactStoreApiunknownDestroy
import typings.zustand.anon.`4`
import typings.zustand.zustandVanillaMod.Mutate
import typings.zustand.zustandVanillaMod.StateCreator
import typings.zustand.zustandVanillaMod.StoreApi
import typings.zustand.zustandVanillaMod.StoreMutatorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zustandReactMod {
  
  @JSImport("zustand/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("zustand/react", JSImport.Default)
  @js.native
  val default: Create = js.native
  
  inline def useStore[S /* <: WithReactStoreApiunknownDestroy */](api: S): ExtractState[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(api.asInstanceOf[js.Any]).asInstanceOf[ExtractState[S]]
  inline def useStore[S /* <: WithReactStoreApiunknownDestroy */, U](api: S, selector: js.Function1[/* state */ ExtractState[S], U]): U = (^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(api.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[U]
  inline def useStore[S /* <: WithReactStoreApiunknownDestroy */, U](
    api: S,
    selector: js.Function1[/* state */ ExtractState[S], U],
    equalityFn: js.Function2[/* a */ U, /* b */ U, Boolean]
  ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(api.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], equalityFn.asInstanceOf[js.Any])).asInstanceOf[U]
  
  @js.native
  trait Create extends StObject {
    
    def apply[T](): js.Function1[
        /* initializer */ StateCreator[T, js.Array[Any], js.Array[Any], T], 
        UseBoundStore[Mutate[StoreApi[T], js.Array[Any]]]
      ] = js.native
    def apply[S /* <: StoreApi[Any] */](store: S): UseBoundStore[S] = js.native
    def apply[T, Mos /* <: js.Array[js.Tuple2[StoreMutatorIdentifier, Any]] */](initializer: StateCreator[T, js.Array[Any], Mos, T]): UseBoundStore[Mutate[StoreApi[T], Mos]] = js.native
  }
  
  type ExtractState[S] = Any
  
  type UseBoundStore[S /* <: WithReactStoreApiunknownDestroy */] = FnCallSelectorEquals[S] & S
  
  type WithReact[S /* <: StoreApi[Any] */] = S & `4`[S]
}
