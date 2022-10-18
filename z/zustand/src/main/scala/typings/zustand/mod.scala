package typings.zustand

import typings.zustand.anon.WithReactStoreApiunknownDestroy
import typings.zustand.reactMod.Create
import typings.zustand.reactMod.ExtractState
import typings.zustand.vanillaMod.CreateStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zustand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("zustand", JSImport.Default)
  @js.native
  val default: Create = js.native
  
  @JSImport("zustand", "createStore")
  @js.native
  val createStore: CreateStore = js.native
  
  inline def useStore[S /* <: WithReactStoreApiunknownDestroy */](api: S): ExtractState[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(api.asInstanceOf[js.Any]).asInstanceOf[ExtractState[S]]
  inline def useStore[S /* <: WithReactStoreApiunknownDestroy */, U](api: S, selector: js.Function1[/* state */ ExtractState[S], U]): U = (^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(api.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[U]
  inline def useStore[S /* <: WithReactStoreApiunknownDestroy */, U](
    api: S,
    selector: js.Function1[/* state */ ExtractState[S], U],
    equalityFn: js.Function2[/* a */ U, /* b */ U, Boolean]
  ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(api.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], equalityFn.asInstanceOf[js.Any])).asInstanceOf[U]
}
