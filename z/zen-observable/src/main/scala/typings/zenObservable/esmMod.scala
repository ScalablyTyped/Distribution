package typings.zenObservable

import typings.std.ArrayLike
import typings.zenObservable.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  @JSImport("zen-observable/esm", JSImport.Default)
  @js.native
  class default[T] protected () extends ^[T] {
    def this(subscriber: typings.zenObservable.mod.global.ZenObservable.Subscriber[T]) = this()
  }
  object default {
    
    @JSImport("zen-observable/esm", "default.from")
    @js.native
    def from[R](observable: ArrayLike[R]): typings.zenObservable.mod.Observable[R] = js.native
    /* static member */
    @JSImport("zen-observable/esm", "default.from")
    @js.native
    def from[R](observable: typings.zenObservable.mod.Observable[R]): typings.zenObservable.mod.Observable[R] = js.native
    @JSImport("zen-observable/esm", "default.from")
    @js.native
    def from[R](observable: typings.zenObservable.mod.global.ZenObservable.ObservableLike[R]): typings.zenObservable.mod.Observable[R] = js.native
    
    /* static member */
    @JSImport("zen-observable/esm", "default.of")
    @js.native
    def of[R](items: R*): typings.zenObservable.mod.Observable[R] = js.native
  }
  
  @JSImport("zen-observable/esm", "Observable")
  @js.native
  class Observable[T] protected () extends ^[T] {
    def this(subscriber: typings.zenObservable.mod.global.ZenObservable.Subscriber[T]) = this()
  }
  object Observable {
    
    @JSImport("zen-observable/esm", "Observable.from")
    @js.native
    def from[R](observable: ArrayLike[R]): typings.zenObservable.mod.Observable[R] = js.native
    /* static member */
    @JSImport("zen-observable/esm", "Observable.from")
    @js.native
    def from[R](observable: typings.zenObservable.mod.Observable[R]): typings.zenObservable.mod.Observable[R] = js.native
    @JSImport("zen-observable/esm", "Observable.from")
    @js.native
    def from[R](observable: typings.zenObservable.mod.global.ZenObservable.ObservableLike[R]): typings.zenObservable.mod.Observable[R] = js.native
    
    /* static member */
    @JSImport("zen-observable/esm", "Observable.of")
    @js.native
    def of[R](items: R*): typings.zenObservable.mod.Observable[R] = js.native
  }
  
  @JSImport("zen-observable/esm", "combineLatest")
  @js.native
  def combineLatest(): ^[scala.Nothing] = js.native
  @JSImport("zen-observable/esm", "combineLatest")
  @js.native
  def combineLatest[A](a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A]): ^[js.Array[A]] = js.native
  @JSImport("zen-observable/esm", "combineLatest")
  @js.native
  def combineLatest[T](observables: typings.zenObservable.mod.global.ZenObservable.ObservableLike[T]*): ^[js.Array[T]] = js.native
  @JSImport("zen-observable/esm", "combineLatest")
  @js.native
  def combineLatest[A, B](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B]
  ): ^[js.Tuple2[A, B]] = js.native
  @JSImport("zen-observable/esm", "combineLatest")
  @js.native
  def combineLatest[A, B, C](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C]
  ): ^[js.Tuple3[A, B, C]] = js.native
  @JSImport("zen-observable/esm", "combineLatest")
  @js.native
  def combineLatest[A, B, C, D](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D]
  ): ^[js.Tuple4[A, B, C, D]] = js.native
  @JSImport("zen-observable/esm", "combineLatest")
  @js.native
  def combineLatest[A, B, C, D, E](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typings.zenObservable.mod.global.ZenObservable.ObservableLike[E]
  ): ^[js.Tuple5[A, B, C, D, E]] = js.native
  @JSImport("zen-observable/esm", "combineLatest")
  @js.native
  def combineLatest[A, B, C, D, E, F](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typings.zenObservable.mod.global.ZenObservable.ObservableLike[E],
    f: typings.zenObservable.mod.global.ZenObservable.ObservableLike[F]
  ): ^[js.Tuple6[A, B, C, D, E, F]] = js.native
  
  @JSImport("zen-observable/esm", "merge")
  @js.native
  def merge(): ^[scala.Nothing] = js.native
  @JSImport("zen-observable/esm", "merge")
  @js.native
  def merge[A](a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A]): ^[A] = js.native
  @JSImport("zen-observable/esm", "merge")
  @js.native
  def merge[T](observables: typings.zenObservable.mod.global.ZenObservable.ObservableLike[T]*): ^[T] = js.native
  @JSImport("zen-observable/esm", "merge")
  @js.native
  def merge[A, B](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B]
  ): ^[A | B] = js.native
  @JSImport("zen-observable/esm", "merge")
  @js.native
  def merge[A, B, C](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C]
  ): ^[A | B | C] = js.native
  @JSImport("zen-observable/esm", "merge")
  @js.native
  def merge[A, B, C, D](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D]
  ): ^[A | B | C | D] = js.native
  @JSImport("zen-observable/esm", "merge")
  @js.native
  def merge[A, B, C, D, E](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typings.zenObservable.mod.global.ZenObservable.ObservableLike[E]
  ): ^[A | B | C | D | E] = js.native
  @JSImport("zen-observable/esm", "merge")
  @js.native
  def merge[A, B, C, D, E, F](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typings.zenObservable.mod.global.ZenObservable.ObservableLike[E],
    f: typings.zenObservable.mod.global.ZenObservable.ObservableLike[F]
  ): ^[A | B | C | D | E | F] = js.native
  
  @JSImport("zen-observable/esm", "zip")
  @js.native
  def zip(): ^[scala.Nothing] = js.native
  @JSImport("zen-observable/esm", "zip")
  @js.native
  def zip[A](a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A]): ^[js.Array[A]] = js.native
  @JSImport("zen-observable/esm", "zip")
  @js.native
  def zip[T](observables: typings.zenObservable.mod.global.ZenObservable.ObservableLike[T]*): ^[js.Array[T]] = js.native
  @JSImport("zen-observable/esm", "zip")
  @js.native
  def zip[A, B](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B]
  ): ^[js.Tuple2[A, B]] = js.native
  @JSImport("zen-observable/esm", "zip")
  @js.native
  def zip[A, B, C](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C]
  ): ^[js.Tuple3[A, B, C]] = js.native
  @JSImport("zen-observable/esm", "zip")
  @js.native
  def zip[A, B, C, D](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D]
  ): ^[js.Tuple4[A, B, C, D]] = js.native
  @JSImport("zen-observable/esm", "zip")
  @js.native
  def zip[A, B, C, D, E](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typings.zenObservable.mod.global.ZenObservable.ObservableLike[E]
  ): ^[js.Tuple5[A, B, C, D, E]] = js.native
  @JSImport("zen-observable/esm", "zip")
  @js.native
  def zip[A, B, C, D, E, F](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typings.zenObservable.mod.global.ZenObservable.ObservableLike[E],
    f: typings.zenObservable.mod.global.ZenObservable.ObservableLike[F]
  ): ^[js.Tuple6[A, B, C, D, E, F]] = js.native
  
  type ObservableLike[T] = typings.zenObservable.mod.global.ZenObservable.ObservableLike[T]
  
  type Observer[T] = typings.zenObservable.mod.global.ZenObservable.Observer[T]
  
  type Subscriber[T] = typings.zenObservable.mod.global.ZenObservable.Subscriber[T]
  
  type Subscription = typings.zenObservable.mod.global.ZenObservable.Subscription
  
  type SubscriptionObserver[T] = typings.zenObservable.mod.global.ZenObservable.SubscriptionObserver[T]
}
