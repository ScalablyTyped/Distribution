package typings.zustand

import typings.zustand.anon.WithReactStoreApiunknown
import typings.zustand.esmReactMod.Create_
import typings.zustand.esmReactMod.ExtractState
import typings.zustand.esmVanillaMod.CreateStore_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  @JSImport("zustand/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @deprecated Use `import { create } from 'zustand'`
    */
  @JSImport("zustand/esm", JSImport.Default)
  @js.native
  val default: Create_ = js.native
  
  @JSImport("zustand/esm", "create")
  @js.native
  val create: Create_ = js.native
  
  @JSImport("zustand/esm", "createStore")
  @js.native
  val createStore: CreateStore_ = js.native
  
  inline def useStore[S /* <: WithReactStoreApiunknown */](api: S): ExtractState[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(api.asInstanceOf[js.Any]).asInstanceOf[ExtractState[S]]
  inline def useStore[S /* <: WithReactStoreApiunknown */, U](api: S, selector: js.Function1[/* state */ ExtractState[S], U]): U = (^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(api.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[U]
  inline def useStore[S /* <: WithReactStoreApiunknown */, U](
    api: S,
    selector: js.Function1[/* state */ ExtractState[S], U],
    equalityFn: js.Function2[/* a */ U, /* b */ U, Boolean]
  ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("useStore")(api.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], equalityFn.asInstanceOf[js.Any])).asInstanceOf[U]
}
