package typings.zenObservableTs

import typings.std.ArrayLike
import typings.zenObservableTs.typesMod.ZenObservable.ObservableLike
import typings.zenObservableTs.zenObservableMod.Observable
import typings.zenObservableTs.zenObservableMod.Subscriber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("zen-observable-ts", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def from[R](observable: ArrayLike[R]): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
    @scala.inline
    def from[R](observable: ObservableLike[R]): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
    @scala.inline
    def from[R](observable: Observable[R]): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
    
    @scala.inline
    def of[R](args: R*): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(args.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  }
  
  object Observable {
    
    @JSImport("zen-observable-ts", "Observable")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def from[R](observable: ArrayLike[R]): typings.zenObservableTs.zenObservableMod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservableTs.zenObservableMod.Observable[R]]
    @scala.inline
    def from[R](observable: ObservableLike[R]): typings.zenObservableTs.zenObservableMod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservableTs.zenObservableMod.Observable[R]]
    @scala.inline
    def from[R](observable: typings.zenObservableTs.zenObservableMod.Observable[R]): typings.zenObservableTs.zenObservableMod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservableTs.zenObservableMod.Observable[R]]
    
    @scala.inline
    def of[R](args: R*): typings.zenObservableTs.zenObservableMod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(args.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservableTs.zenObservableMod.Observable[R]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("zen-observable-ts", "Observable")
  @js.native
  class ObservableCls[T] protected ()
    extends StObject
       with Observable[T] {
    def this(subscriber: Subscriber[T]) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("zen-observable-ts", JSImport.Default)
  @js.native
  class defaultCls[T] protected ()
    extends StObject
       with Observable[T] {
    def this(subscriber: Subscriber[T]) = this()
  }
}
