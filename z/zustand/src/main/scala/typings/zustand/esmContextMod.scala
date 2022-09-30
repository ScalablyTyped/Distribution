package typings.zustand

import org.scalablytyped.runtime.TopLevel
import typings.zustand.anon.UseStore
import typings.zustand.zustandVanillaMod.StoreApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmContextMod {
  
  @JSImport("zustand/esm/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S /* <: StoreApi[Any] */](): UseStore[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[UseStore[S]]
  
  type ExtractState[S] = Any
  
  @js.native
  trait UseContextStore[S /* <: StoreApi[Any] */] extends StObject {
    
    def apply(): ExtractState[S] = js.native
    def apply[U](selector: js.Function1[/* state */ ExtractState[S], U]): U = js.native
    def apply[U](
      selector: js.Function1[/* state */ ExtractState[S], U],
      equalityFn: js.Function2[/* a */ U, /* b */ U, Boolean]
    ): U = js.native
  }
  
  type WithoutCallSignature[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typings.zustand.zustandStrings.WithoutCallSignature & TopLevel[T]
}
