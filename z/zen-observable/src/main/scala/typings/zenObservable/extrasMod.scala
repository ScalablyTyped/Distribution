package typings.zenObservable

import typings.zenObservable.mod.global.ZenObservable.ObservableLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extrasMod {
  
  @JSImport("zen-observable/extras", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineLatest(): typings.zenObservable.mod.^[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")().asInstanceOf[typings.zenObservable.mod.^[scala.Nothing]]
  inline def combineLatest[A](a: ObservableLike[A]): typings.zenObservable.mod.^[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservable.mod.^[js.Array[A]]]
  inline def combineLatest[T](observables: ObservableLike[T]*): typings.zenObservable.mod.^[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.zenObservable.mod.^[js.Array[T]]]
  inline def combineLatest[A, B](a: ObservableLike[A], b: ObservableLike[B]): typings.zenObservable.mod.^[js.Tuple2[A, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple2[A, B]]]
  inline def combineLatest[A, B, C](a: ObservableLike[A], b: ObservableLike[B], c: ObservableLike[C]): typings.zenObservable.mod.^[js.Tuple3[A, B, C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple3[A, B, C]]]
  inline def combineLatest[A, B, C, D](a: ObservableLike[A], b: ObservableLike[B], c: ObservableLike[C], d: ObservableLike[D]): typings.zenObservable.mod.^[js.Tuple4[A, B, C, D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple4[A, B, C, D]]]
  inline def combineLatest[A, B, C, D, E](
    a: ObservableLike[A],
    b: ObservableLike[B],
    c: ObservableLike[C],
    d: ObservableLike[D],
    e: ObservableLike[E]
  ): typings.zenObservable.mod.^[js.Tuple5[A, B, C, D, E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple5[A, B, C, D, E]]]
  inline def combineLatest[A, B, C, D, E, F](
    a: ObservableLike[A],
    b: ObservableLike[B],
    c: ObservableLike[C],
    d: ObservableLike[D],
    e: ObservableLike[E],
    f: ObservableLike[F]
  ): typings.zenObservable.mod.^[js.Tuple6[A, B, C, D, E, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple6[A, B, C, D, E, F]]]
  
  inline def merge(): typings.zenObservable.mod.^[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")().asInstanceOf[typings.zenObservable.mod.^[scala.Nothing]]
  inline def merge[A](a: ObservableLike[A]): typings.zenObservable.mod.^[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservable.mod.^[A]]
  inline def merge[T](observables: ObservableLike[T]*): typings.zenObservable.mod.^[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.zenObservable.mod.^[T]]
  inline def merge[A, B](a: ObservableLike[A], b: ObservableLike[B]): typings.zenObservable.mod.^[A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[A | B]]
  inline def merge[A, B, C](a: ObservableLike[A], b: ObservableLike[B], c: ObservableLike[C]): typings.zenObservable.mod.^[A | B | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[A | B | C]]
  inline def merge[A, B, C, D](a: ObservableLike[A], b: ObservableLike[B], c: ObservableLike[C], d: ObservableLike[D]): typings.zenObservable.mod.^[A | B | C | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[A | B | C | D]]
  inline def merge[A, B, C, D, E](
    a: ObservableLike[A],
    b: ObservableLike[B],
    c: ObservableLike[C],
    d: ObservableLike[D],
    e: ObservableLike[E]
  ): typings.zenObservable.mod.^[A | B | C | D | E] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[A | B | C | D | E]]
  inline def merge[A, B, C, D, E, F](
    a: ObservableLike[A],
    b: ObservableLike[B],
    c: ObservableLike[C],
    d: ObservableLike[D],
    e: ObservableLike[E],
    f: ObservableLike[F]
  ): typings.zenObservable.mod.^[A | B | C | D | E | F] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[A | B | C | D | E | F]]
  
  inline def zip(): typings.zenObservable.mod.^[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")().asInstanceOf[typings.zenObservable.mod.^[scala.Nothing]]
  inline def zip[A](a: ObservableLike[A]): typings.zenObservable.mod.^[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any]).asInstanceOf[typings.zenObservable.mod.^[js.Array[A]]]
  inline def zip[T](observables: ObservableLike[T]*): typings.zenObservable.mod.^[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.zenObservable.mod.^[js.Array[T]]]
  inline def zip[A, B](a: ObservableLike[A], b: ObservableLike[B]): typings.zenObservable.mod.^[js.Tuple2[A, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple2[A, B]]]
  inline def zip[A, B, C](a: ObservableLike[A], b: ObservableLike[B], c: ObservableLike[C]): typings.zenObservable.mod.^[js.Tuple3[A, B, C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple3[A, B, C]]]
  inline def zip[A, B, C, D](a: ObservableLike[A], b: ObservableLike[B], c: ObservableLike[C], d: ObservableLike[D]): typings.zenObservable.mod.^[js.Tuple4[A, B, C, D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple4[A, B, C, D]]]
  inline def zip[A, B, C, D, E](
    a: ObservableLike[A],
    b: ObservableLike[B],
    c: ObservableLike[C],
    d: ObservableLike[D],
    e: ObservableLike[E]
  ): typings.zenObservable.mod.^[js.Tuple5[A, B, C, D, E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple5[A, B, C, D, E]]]
  inline def zip[A, B, C, D, E, F](
    a: ObservableLike[A],
    b: ObservableLike[B],
    c: ObservableLike[C],
    d: ObservableLike[D],
    e: ObservableLike[E],
    f: ObservableLike[F]
  ): typings.zenObservable.mod.^[js.Tuple6[A, B, C, D, E, F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.zenObservable.mod.^[js.Tuple6[A, B, C, D, E, F]]]
}
