package typings.zenObservable

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  @JSImport("zen-observable/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("zen-observable/esm", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends typings.zenObservable.mod.^[T] {
    def this(subscriber: typings.zenObservable.mod.global.ZenObservable.Subscriber[T]) = this()
  }
  object default {
    
    @JSImport("zen-observable/esm", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def from[R](observable: ArrayLike[R]): typings.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservable.mod.Observable[R]]
    /* static member */
    inline def from[R](observable: typings.zenObservable.mod.Observable[R]): typings.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservable.mod.Observable[R]]
    inline def from[R](observable: typings.zenObservable.mod.global.ZenObservable.ObservableLike[R]): typings.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservable.mod.Observable[R]]
    
    /* static member */
    inline def of[R](items: R*): typings.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.zenObservable.mod.Observable[R]]
  }
  
  @JSImport("zen-observable/esm", "Observable")
  @js.native
  open class Observable[T] protected ()
    extends typings.zenObservable.mod.^[T] {
    def this(subscriber: typings.zenObservable.mod.global.ZenObservable.Subscriber[T]) = this()
  }
  object Observable {
    
    @JSImport("zen-observable/esm", "Observable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from[R](observable: ArrayLike[R]): typings.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservable.mod.Observable[R]]
    /* static member */
    inline def from[R](observable: typings.zenObservable.mod.Observable[R]): typings.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservable.mod.Observable[R]]
    inline def from[R](observable: typings.zenObservable.mod.global.ZenObservable.ObservableLike[R]): typings.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(observable.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservable.mod.Observable[R]]
    
    /* static member */
    inline def of[R](items: R*): typings.zenObservable.mod.Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.zenObservable.mod.Observable[R]]
  }
  
  inline def combineLatest(): typings.zenObservable.mod.^[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")().asInstanceOf[typings.zenObservable.mod.^[scala.Nothing]]
  inline def combineLatest[A](a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A]): typings.zenObservable.mod.^[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservable.mod.^[js.Array[A]]]
  inline def combineLatest[T](observables: typings.zenObservable.mod.global.ZenObservable.ObservableLike[T]*): typings.zenObservable.mod.^[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.zenObservable.mod.^[js.Array[T]]]
  inline def combineLatest[A, B](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B]
  ): typings.zenObservable.mod.^[js.Tuple2[A, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple2[A, B]]]
  inline def combineLatest[A, B, C](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C]
  ): typings.zenObservable.mod.^[js.Tuple3[A, B, C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple3[A, B, C]]]
  inline def combineLatest[A, B, C, D](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D]
  ): typings.zenObservable.mod.^[js.Tuple4[A, B, C, D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple4[A, B, C, D]]]
  inline def combineLatest[A, B, C, D, E](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typings.zenObservable.mod.global.ZenObservable.ObservableLike[E]
  ): typings.zenObservable.mod.^[js.Tuple5[A, B, C, D, E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple5[A, B, C, D, E]]]
  inline def combineLatest[A, B, C, D, E, F](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typings.zenObservable.mod.global.ZenObservable.ObservableLike[E],
    f: typings.zenObservable.mod.global.ZenObservable.ObservableLike[F]
  ): typings.zenObservable.mod.^[js.Tuple6[A, B, C, D, E, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple6[A, B, C, D, E, F]]]
  
  inline def merge(): typings.zenObservable.mod.^[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")().asInstanceOf[typings.zenObservable.mod.^[scala.Nothing]]
  inline def merge[A](a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A]): typings.zenObservable.mod.^[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservable.mod.^[A]]
  inline def merge[T](observables: typings.zenObservable.mod.global.ZenObservable.ObservableLike[T]*): typings.zenObservable.mod.^[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.zenObservable.mod.^[T]]
  inline def merge[A, B](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B]
  ): typings.zenObservable.mod.^[A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[A | B]]
  inline def merge[A, B, C](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C]
  ): typings.zenObservable.mod.^[A | B | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[A | B | C]]
  inline def merge[A, B, C, D](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D]
  ): typings.zenObservable.mod.^[A | B | C | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[A | B | C | D]]
  inline def merge[A, B, C, D, E](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typings.zenObservable.mod.global.ZenObservable.ObservableLike[E]
  ): typings.zenObservable.mod.^[A | B | C | D | E] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[A | B | C | D | E]]
  inline def merge[A, B, C, D, E, F](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typings.zenObservable.mod.global.ZenObservable.ObservableLike[E],
    f: typings.zenObservable.mod.global.ZenObservable.ObservableLike[F]
  ): typings.zenObservable.mod.^[A | B | C | D | E | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[A | B | C | D | E | F]]
  
  inline def zip(): typings.zenObservable.mod.^[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")().asInstanceOf[typings.zenObservable.mod.^[scala.Nothing]]
  inline def zip[A](a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A]): typings.zenObservable.mod.^[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservable.mod.^[js.Array[A]]]
  inline def zip[T](observables: typings.zenObservable.mod.global.ZenObservable.ObservableLike[T]*): typings.zenObservable.mod.^[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.zenObservable.mod.^[js.Array[T]]]
  inline def zip[A, B](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B]
  ): typings.zenObservable.mod.^[js.Tuple2[A, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple2[A, B]]]
  inline def zip[A, B, C](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C]
  ): typings.zenObservable.mod.^[js.Tuple3[A, B, C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple3[A, B, C]]]
  inline def zip[A, B, C, D](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D]
  ): typings.zenObservable.mod.^[js.Tuple4[A, B, C, D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple4[A, B, C, D]]]
  inline def zip[A, B, C, D, E](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typings.zenObservable.mod.global.ZenObservable.ObservableLike[E]
  ): typings.zenObservable.mod.^[js.Tuple5[A, B, C, D, E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple5[A, B, C, D, E]]]
  inline def zip[A, B, C, D, E, F](
    a: typings.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typings.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typings.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typings.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typings.zenObservable.mod.global.ZenObservable.ObservableLike[E],
    f: typings.zenObservable.mod.global.ZenObservable.ObservableLike[F]
  ): typings.zenObservable.mod.^[js.Tuple6[A, B, C, D, E, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple6[A, B, C, D, E, F]]]
  
  type ObservableLike[T] = typings.zenObservable.mod.global.ZenObservable.ObservableLike[T]
  
  type Observer[T] = typings.zenObservable.mod.global.ZenObservable.Observer[T]
  
  type Subscriber[T] = typings.zenObservable.mod.global.ZenObservable.Subscriber[T]
  
  type Subscription = typings.zenObservable.mod.global.ZenObservable.Subscription
  
  type SubscriptionObserver[T] = typings.zenObservable.mod.global.ZenObservable.SubscriptionObserver[T]
}
