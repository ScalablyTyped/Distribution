package typings.zustand

import typings.zustand.anon.UseStore
import typings.zustand.vanillaMod.StoreApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmContextMod {
  
  @JSImport("zustand/esm/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S /* <: StoreApi[Any] */](): UseStore[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[UseStore[S]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends {getState (): infer T} ? T : never
    }}}
    */
  @js.native
  trait ExtractState[S] extends StObject
  
  @js.native
  trait UseContextStore[S /* <: StoreApi[Any] */] extends StObject {
    
    def apply(): ExtractState[S] = js.native
    def apply[U](selector: js.Function1[/* state */ ExtractState[S], U]): U = js.native
    def apply[U](
      selector: js.Function1[/* state */ ExtractState[S], U],
      equalityFn: js.Function2[/* a */ U, /* b */ U, Boolean]
    ): U = js.native
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ K in keyof T ]: T[K]}
    }}}
    */
  type WithoutCallSignature[T] = T
}
