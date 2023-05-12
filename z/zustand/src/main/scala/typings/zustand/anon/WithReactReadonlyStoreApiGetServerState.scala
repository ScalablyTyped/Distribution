package typings.zustand.anon

import typings.zustand.reactMod.ExtractState
import typings.zustand.reactMod.ReadonlyStoreApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zustand.zustand/react.WithReact<zustand.zustand/react.ReadonlyStoreApi<unknown>> */
trait WithReactReadonlyStoreApiGetServerState extends StObject {
  
  var getServerState: js.UndefOr[js.Function0[ExtractState[ReadonlyStoreApi[Any]]]] = js.undefined
  
  var getState: js.Function0[Any]
  
  var subscribe: js.Function1[
    /* listener */ js.Function2[/* state */ Any, /* prevState */ Any, Unit], 
    js.Function0[Unit]
  ]
}
object WithReactReadonlyStoreApiGetServerState {
  
  inline def apply(
    getState: () => Any,
    subscribe: /* listener */ js.Function2[/* state */ Any, /* prevState */ Any, Unit] => js.Function0[Unit]
  ): WithReactReadonlyStoreApiGetServerState = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[WithReactReadonlyStoreApiGetServerState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WithReactReadonlyStoreApiGetServerState] (val x: Self) extends AnyVal {
    
    inline def setGetServerState(value: () => ExtractState[ReadonlyStoreApi[Any]]): Self = StObject.set(x, "getServerState", js.Any.fromFunction0(value))
    
    inline def setGetServerStateUndefined: Self = StObject.set(x, "getServerState", js.undefined)
    
    inline def setGetState(value: () => Any): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    inline def setSubscribe(
      value: /* listener */ js.Function2[/* state */ Any, /* prevState */ Any, Unit] => js.Function0[Unit]
    ): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
  }
}
