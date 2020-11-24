package typings.zenObservable

import typings.zenObservable.mod.^
import typings.zenObservable.mod.global.ZenObservable.ObservableLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zen-observable/extras", JSImport.Namespace)
@js.native
object extrasMod extends js.Object {
  
  def combineLatest(): ^[scala.Nothing] = js.native
  def combineLatest[A](a: ObservableLike[A]): ^[js.Array[A]] = js.native
  def combineLatest[T](observables: ObservableLike[T]*): ^[js.Array[T]] = js.native
  def combineLatest[A, B](a: ObservableLike[A], b: ObservableLike[B]): ^[js.Tuple2[A, B]] = js.native
  def combineLatest[A, B, C](a: ObservableLike[A], b: ObservableLike[B], c: ObservableLike[C]): ^[js.Tuple3[A, B, C]] = js.native
  def combineLatest[A, B, C, D](a: ObservableLike[A], b: ObservableLike[B], c: ObservableLike[C], d: ObservableLike[D]): ^[js.Tuple4[A, B, C, D]] = js.native
  def combineLatest[A, B, C, D, E](
    a: ObservableLike[A],
    b: ObservableLike[B],
    c: ObservableLike[C],
    d: ObservableLike[D],
    e: ObservableLike[E]
  ): ^[js.Tuple5[A, B, C, D, E]] = js.native
  def combineLatest[A, B, C, D, E, F](
    a: ObservableLike[A],
    b: ObservableLike[B],
    c: ObservableLike[C],
    d: ObservableLike[D],
    e: ObservableLike[E],
    f: ObservableLike[F]
  ): ^[js.Tuple6[A, B, C, D, E, F]] = js.native
  
  def merge(): ^[scala.Nothing] = js.native
  def merge[A](a: ObservableLike[A]): ^[A] = js.native
  def merge[T](observables: ObservableLike[T]*): ^[T] = js.native
  def merge[A, B](a: ObservableLike[A], b: ObservableLike[B]): ^[A | B] = js.native
  def merge[A, B, C](a: ObservableLike[A], b: ObservableLike[B], c: ObservableLike[C]): ^[A | B | C] = js.native
  def merge[A, B, C, D](a: ObservableLike[A], b: ObservableLike[B], c: ObservableLike[C], d: ObservableLike[D]): ^[A | B | C | D] = js.native
  def merge[A, B, C, D, E](
    a: ObservableLike[A],
    b: ObservableLike[B],
    c: ObservableLike[C],
    d: ObservableLike[D],
    e: ObservableLike[E]
  ): ^[A | B | C | D | E] = js.native
  def merge[A, B, C, D, E, F](
    a: ObservableLike[A],
    b: ObservableLike[B],
    c: ObservableLike[C],
    d: ObservableLike[D],
    e: ObservableLike[E],
    f: ObservableLike[F]
  ): ^[A | B | C | D | E | F] = js.native
  
  def zip(): ^[scala.Nothing] = js.native
  def zip[A](a: ObservableLike[A]): ^[js.Array[A]] = js.native
  def zip[T](observables: ObservableLike[T]*): ^[js.Array[T]] = js.native
  def zip[A, B](a: ObservableLike[A], b: ObservableLike[B]): ^[js.Tuple2[A, B]] = js.native
  def zip[A, B, C](a: ObservableLike[A], b: ObservableLike[B], c: ObservableLike[C]): ^[js.Tuple3[A, B, C]] = js.native
  def zip[A, B, C, D](a: ObservableLike[A], b: ObservableLike[B], c: ObservableLike[C], d: ObservableLike[D]): ^[js.Tuple4[A, B, C, D]] = js.native
  def zip[A, B, C, D, E](
    a: ObservableLike[A],
    b: ObservableLike[B],
    c: ObservableLike[C],
    d: ObservableLike[D],
    e: ObservableLike[E]
  ): ^[js.Tuple5[A, B, C, D, E]] = js.native
  def zip[A, B, C, D, E, F](
    a: ObservableLike[A],
    b: ObservableLike[B],
    c: ObservableLike[C],
    d: ObservableLike[D],
    e: ObservableLike[E],
    f: ObservableLike[F]
  ): ^[js.Tuple6[A, B, C, D, E, F]] = js.native
}
