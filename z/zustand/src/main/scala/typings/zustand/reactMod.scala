package typings.zustand

import typings.zustand.anon.FnCall
import typings.zustand.anon.GetServerState
import typings.zustand.anon.WithReactStoreApiunknown
import typings.zustand.vanillaMod.Mutate
import typings.zustand.vanillaMod.StateCreator
import typings.zustand.vanillaMod.StoreApi
import typings.zustand.vanillaMod.StoreMutatorIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod {
  
  @JSImport("zustand/esm/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("zustand/esm/react", JSImport.Default)
  @js.native
  val default: Create = js.native
  
  inline def useStore[S /* <: WithReactStoreApiunknown */](api: S): ExtractState[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(api.asInstanceOf[js.Any]).asInstanceOf[ExtractState[S]]
  inline def useStore[S /* <: WithReactStoreApiunknown */, U](api: S, selector: js.Function1[/* state */ ExtractState[S], U]): U = (^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(api.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[U]
  inline def useStore[S /* <: WithReactStoreApiunknown */, U](
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
  
  type UseBoundStore[S /* <: WithReactStoreApiunknown */] = FnCall[S] & S
  
  type WithReact[S /* <: StoreApi[Any] */] = S & GetServerState[S]
}
