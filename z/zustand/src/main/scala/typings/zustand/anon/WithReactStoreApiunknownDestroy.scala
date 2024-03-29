package typings.zustand.anon

import typings.std.Partial
import typings.zustand.reactMod.ExtractState
import typings.zustand.vanillaMod.SetStateInternal
import typings.zustand.vanillaMod.StoreApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zustand.zustand/react.WithReact<zustand.zustand/vanilla.StoreApi<unknown>> */
trait WithReactStoreApiunknownDestroy extends StObject {
  
  /**
    * @deprecated Use `unsubscribe` returned by `subscribe`
    */
  def destroy(): Unit
  
  var getServerState: js.UndefOr[js.Function0[ExtractState[StoreApi[Any]]]] = js.undefined
  
  def getState(): Any
  
  var setState: SetStateInternal[Any]
  
  def subscribe(listener: js.Function2[/* state */ Any, /* prevState */ Any, Unit]): js.Function0[Unit]
}
object WithReactStoreApiunknownDestroy {
  
  inline def apply(
    destroy: () => Unit,
    getState: () => Any,
    setState: (/* partial */ Any | Partial[Any] | (js.Function1[Any, Any | Partial[Any]]), /* replace */ js.UndefOr[Boolean]) => Unit,
    subscribe: js.Function2[/* state */ Any, /* prevState */ Any, Unit] => js.Function0[Unit]
  ): WithReactStoreApiunknownDestroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction2(setState), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[WithReactStoreApiunknownDestroy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WithReactStoreApiunknownDestroy] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGetServerState(value: () => ExtractState[StoreApi[Any]]): Self = StObject.set(x, "getServerState", js.Any.fromFunction0(value))
    
    inline def setGetServerStateUndefined: Self = StObject.set(x, "getServerState", js.undefined)
    
    inline def setGetState(value: () => Any): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    inline def setSetState(
      value: (/* partial */ Any | Partial[Any] | (js.Function1[Any, Any | Partial[Any]]), /* replace */ js.UndefOr[Boolean]) => Unit
    ): Self = StObject.set(x, "setState", js.Any.fromFunction2(value))
    
    inline def setSubscribe(value: js.Function2[/* state */ Any, /* prevState */ Any, Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
  }
}
