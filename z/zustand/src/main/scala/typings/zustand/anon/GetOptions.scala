package typings.zustand.anon

import typings.std.Partial
import typings.zustand.middlewarePersistMod.PersistListener
import typings.zustand.middlewarePersistMod.PersistOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOptions[S, Ps] extends StObject {
  
  def clearStorage(): Unit
  
  def getOptions(): Partial[PersistOptions[S, Ps]]
  
  def hasHydrated(): Boolean
  
  def onFinishHydration(fn: PersistListener[S]): js.Function0[Unit]
  
  def onHydrate(fn: PersistListener[S]): js.Function0[Unit]
  
  def rehydrate(): js.Promise[Unit]
  
  def setOptions(options: Partial[PersistOptions[S, Ps]]): Unit
}
object GetOptions {
  
  inline def apply[S, Ps](
    clearStorage: () => Unit,
    getOptions: () => Partial[PersistOptions[S, Ps]],
    hasHydrated: () => Boolean,
    onFinishHydration: PersistListener[S] => js.Function0[Unit],
    onHydrate: PersistListener[S] => js.Function0[Unit],
    rehydrate: () => js.Promise[Unit],
    setOptions: Partial[PersistOptions[S, Ps]] => Unit
  ): GetOptions[S, Ps] = {
    val __obj = js.Dynamic.literal(clearStorage = js.Any.fromFunction0(clearStorage), getOptions = js.Any.fromFunction0(getOptions), hasHydrated = js.Any.fromFunction0(hasHydrated), onFinishHydration = js.Any.fromFunction1(onFinishHydration), onHydrate = js.Any.fromFunction1(onHydrate), rehydrate = js.Any.fromFunction0(rehydrate), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[GetOptions[S, Ps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOptions[?, ?], S, Ps] (val x: Self & (GetOptions[S, Ps])) extends AnyVal {
    
    inline def setClearStorage(value: () => Unit): Self = StObject.set(x, "clearStorage", js.Any.fromFunction0(value))
    
    inline def setGetOptions(value: () => Partial[PersistOptions[S, Ps]]): Self = StObject.set(x, "getOptions", js.Any.fromFunction0(value))
    
    inline def setHasHydrated(value: () => Boolean): Self = StObject.set(x, "hasHydrated", js.Any.fromFunction0(value))
    
    inline def setOnFinishHydration(value: PersistListener[S] => js.Function0[Unit]): Self = StObject.set(x, "onFinishHydration", js.Any.fromFunction1(value))
    
    inline def setOnHydrate(value: PersistListener[S] => js.Function0[Unit]): Self = StObject.set(x, "onHydrate", js.Any.fromFunction1(value))
    
    inline def setRehydrate(value: () => js.Promise[Unit]): Self = StObject.set(x, "rehydrate", js.Any.fromFunction0(value))
    
    inline def setSetOptions(value: Partial[PersistOptions[S, Ps]] => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
  }
}
