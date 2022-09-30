package typings.zustand.anon

import typings.zustand.zustandReactMod.ExtractState
import typings.zustand.zustandVanillaMod.StoreApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[S /* <: StoreApi[Any] */] extends StObject {
  
  var getServerState: js.UndefOr[js.Function0[ExtractState[S]]] = js.undefined
}
object `4` {
  
  inline def apply[S /* <: StoreApi[Any] */](): `4`[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`[S]]
  }
  
  extension [Self <: `4`[?], S /* <: StoreApi[Any] */](x: Self & `4`[S]) {
    
    inline def setGetServerState(value: () => ExtractState[S]): Self = StObject.set(x, "getServerState", js.Any.fromFunction0(value))
    
    inline def setGetServerStateUndefined: Self = StObject.set(x, "getServerState", js.undefined)
  }
}
