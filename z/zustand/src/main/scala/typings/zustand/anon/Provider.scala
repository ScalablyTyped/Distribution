package typings.zustand.anon

import typings.react.mod.FunctionComponentElement
import typings.react.mod.ProviderProps
import typings.zustand.contextMod.UseContextStore
import typings.zustand.contextMod.WithoutCallSignature
import typings.zustand.vanillaMod.StoreApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provider[S /* <: StoreApi[Any] */] extends StObject {
  
  def Provider(param0: Children[S]): FunctionComponentElement[ProviderProps[js.UndefOr[S]]]
  
  var useStore: UseContextStore[S]
  
  def useStoreApi(): WithoutCallSignature[S]
}
object Provider {
  
  inline def apply[S /* <: StoreApi[Any] */](
    Provider: Children[S] => FunctionComponentElement[ProviderProps[js.UndefOr[S]]],
    useStore: UseContextStore[S],
    useStoreApi: () => WithoutCallSignature[S]
  ): Provider[S] = {
    val __obj = js.Dynamic.literal(Provider = js.Any.fromFunction1(Provider), useStore = useStore.asInstanceOf[js.Any], useStoreApi = js.Any.fromFunction0(useStoreApi))
    __obj.asInstanceOf[Provider[S]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Provider[?], S /* <: StoreApi[Any] */] (val x: Self & Provider[S]) extends AnyVal {
    
    inline def setProvider(value: Children[S] => FunctionComponentElement[ProviderProps[js.UndefOr[S]]]): Self = StObject.set(x, "Provider", js.Any.fromFunction1(value))
    
    inline def setUseStore(value: UseContextStore[S]): Self = StObject.set(x, "useStore", value.asInstanceOf[js.Any])
    
    inline def setUseStoreApi(value: () => WithoutCallSignature[S]): Self = StObject.set(x, "useStoreApi", js.Any.fromFunction0(value))
  }
}
