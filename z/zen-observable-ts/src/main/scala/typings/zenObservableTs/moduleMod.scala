package typings.zenObservableTs

import typings.std.ArrayLike
import typings.zenObservable.mod.global.ZenObservable.ObservableLike
import typings.zenObservable.mod.global.ZenObservable.Subscriber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleMod {
  
  @JSImport("zen-observable-ts/module", "Observable")
  @js.native
  open class Observable[T] protected ()
    extends typings.zenObservableTs.mod.Observable[T] {
    def this(subscriber: Subscriber[T]) = this()
  }
  object Observable {
    
    @JSImport("zen-observable-ts/module", "Observable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from[R](observable: ArrayLike[R]): typings.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservable.mod.Observable[R]]
    /* static member */
    inline def from[R](observable: typings.zenObservable.mod.Observable[R]): typings.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservable.mod.Observable[R]]
    inline def from[R](observable: ObservableLike[R]): typings.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservable.mod.Observable[R]]
    
    /* static member */
    inline def of[R](items: R*): typings.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.zenObservable.mod.Observable[R]]
  }
}
