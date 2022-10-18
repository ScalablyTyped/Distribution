package typings.zustand.anon

import typings.react.mod.ReactNode
import typings.zustand.vanillaMod.StoreApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children[S /* <: StoreApi[Any] */] extends StObject {
  
  var children: ReactNode
  
  def createStore(): S
}
object Children {
  
  inline def apply[S /* <: StoreApi[Any] */](createStore: () => S): Children[S] = {
    val __obj = js.Dynamic.literal(createStore = js.Any.fromFunction0(createStore))
    __obj.asInstanceOf[Children[S]]
  }
  
  extension [Self <: Children[?], S /* <: StoreApi[Any] */](x: Self & Children[S]) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCreateStore(value: () => S): Self = StObject.set(x, "createStore", js.Any.fromFunction0(value))
  }
}
