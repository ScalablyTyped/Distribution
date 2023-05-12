package typings.zustand.anon

import typings.zustand.reactMod.ExtractState
import typings.zustand.reactMod.ReadonlyStoreApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[S /* <: ReadonlyStoreApi[Any] */] extends StObject {
  
  var getServerState: js.UndefOr[js.Function0[ExtractState[S]]] = js.undefined
}
object `0` {
  
  inline def apply[S /* <: ReadonlyStoreApi[Any] */](): `0`[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[S]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`[?], S /* <: ReadonlyStoreApi[Any] */] (val x: Self & `0`[S]) extends AnyVal {
    
    inline def setGetServerState(value: () => ExtractState[S]): Self = StObject.set(x, "getServerState", js.Any.fromFunction0(value))
    
    inline def setGetServerStateUndefined: Self = StObject.set(x, "getServerState", js.undefined)
  }
}
