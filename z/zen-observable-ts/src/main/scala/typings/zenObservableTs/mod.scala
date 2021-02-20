package typings.zenObservableTs

import typings.std.ArrayLike
import typings.zenObservableTs.typesMod.ZenObservable.ObservableLike
import typings.zenObservableTs.zenObservableMod.Observable
import typings.zenObservableTs.zenObservableMod.Subscriber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("zen-observable-ts", "default.from")
    @js.native
    def from[R](observable: ArrayLike[R]): Observable[R] = js.native
    @JSImport("zen-observable-ts", "default.from")
    @js.native
    def from[R](observable: ObservableLike[R]): Observable[R] = js.native
    @JSImport("zen-observable-ts", "default.from")
    @js.native
    def from[R](observable: Observable[R]): Observable[R] = js.native
    
    @JSImport("zen-observable-ts", "default.of")
    @js.native
    def of[R](args: R*): Observable[R] = js.native
  }
  
  object Observable {
    
    @JSImport("zen-observable-ts", "Observable.from")
    @js.native
    def from[R](observable: ArrayLike[R]): typings.zenObservableTs.zenObservableMod.Observable[R] = js.native
    @JSImport("zen-observable-ts", "Observable.from")
    @js.native
    def from[R](observable: ObservableLike[R]): typings.zenObservableTs.zenObservableMod.Observable[R] = js.native
    @JSImport("zen-observable-ts", "Observable.from")
    @js.native
    def from[R](observable: typings.zenObservableTs.zenObservableMod.Observable[R]): typings.zenObservableTs.zenObservableMod.Observable[R] = js.native
    
    @JSImport("zen-observable-ts", "Observable.of")
    @js.native
    def of[R](args: R*): typings.zenObservableTs.zenObservableMod.Observable[R] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("zen-observable-ts", "Observable")
  @js.native
  class ObservableCls[T] protected () extends Observable[T] {
    def this(subscriber: Subscriber[T]) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("zen-observable-ts", JSImport.Default)
  @js.native
  class defaultCls[T] protected () extends Observable[T] {
    def this(subscriber: Subscriber[T]) = this()
  }
}
