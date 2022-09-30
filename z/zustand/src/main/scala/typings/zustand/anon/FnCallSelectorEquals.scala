package typings.zustand.anon

import typings.zustand.zustandReactMod.ExtractState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallSelectorEquals[S /* <: /* import warning: importer.ImportType#apply Failed type conversion: / * Inlined zustand.zustand/react.WithReact<zustand.zustand/vanilla.StoreApi<unknown>> * /
{  setState :zustand.zustand/vanilla.SetStateInternal<unknown>, getState (): unknown, subscribe (listener : (state : unknown, prevState : unknown): void): (): void, destroy (): void,   getServerState :(): zustand.zustand/react.ExtractState<zustand.zustand/vanilla.StoreApi<unknown>> | undefined} */ js.Any */] extends StObject {
  
  def apply(): ExtractState[S] = js.native
  def apply[U](selector: js.Function1[/* state */ ExtractState[S], U]): U = js.native
  def apply[U](
    selector: js.Function1[/* state */ ExtractState[S], U],
    equals: js.Function2[/* a */ U, /* b */ U, Boolean]
  ): U = js.native
}
