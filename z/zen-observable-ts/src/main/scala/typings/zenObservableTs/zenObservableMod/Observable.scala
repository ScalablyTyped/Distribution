package typings.zenObservableTs.zenObservableMod

import org.scalablytyped.runtime.Instantiable1
import typings.std.ArrayLike
import typings.zenObservableTs.typesMod.ZenObservable.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observable[T] extends js.Object {
  
  def filter(fn: js.Function1[/* value */ T, Boolean]): Observable[T] = js.native
  
  def flatMap[R](fn: js.Function1[/* value */ T, typings.zenObservableTs.typesMod.ZenObservable.ObservableLike[R]]): Observable[R] = js.native
  
  def forEach(fn: js.Function1[/* value */ T, Unit]): js.Promise[Unit] = js.native
  
  def from[R](observable: ArrayLike[R]): Observable[R] = js.native
  def from[R](observable: typings.zenObservableTs.typesMod.ZenObservable.ObservableLike[R]): Observable[R] = js.native
  def from[R](observable: Observable[R]): Observable[R] = js.native
  
  def map[R](fn: js.Function1[/* value */ T, R]): Observable[R] = js.native
  
  def of[R](args: R*): Observable[R] = js.native
  
  def reduce[R](fn: js.Function2[/* previousValue */ R | T, /* currentValue */ T, R | T]): Observable[R | T] = js.native
  def reduce[R](fn: js.Function2[R | T, /* currentValue */ T, R | T], initialValue: R | T): Observable[R | T] = js.native
  
  def subscribe(observerOrNext: js.Function1[/* value */ T, Unit]): Subscription = js.native
  def subscribe(
    observerOrNext: js.Function1[/* value */ T, Unit],
    error: js.UndefOr[scala.Nothing],
    complete: js.Function0[Unit]
  ): Subscription = js.native
  def subscribe(observerOrNext: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ js.Any, Unit]): Subscription = js.native
  def subscribe(
    observerOrNext: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): Subscription = js.native
  def subscribe(observerOrNext: typings.zenObservableTs.typesMod.ZenObservable.Observer[T]): Subscription = js.native
  def subscribe(
    observerOrNext: typings.zenObservableTs.typesMod.ZenObservable.Observer[T],
    error: js.UndefOr[scala.Nothing],
    complete: js.Function0[Unit]
  ): Subscription = js.native
  def subscribe(
    observerOrNext: typings.zenObservableTs.typesMod.ZenObservable.Observer[T],
    error: js.Function1[/* error */ js.Any, Unit]
  ): Subscription = js.native
  def subscribe(
    observerOrNext: typings.zenObservableTs.typesMod.ZenObservable.Observer[T],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): Subscription = js.native
}
@JSImport("zen-observable-ts/lib/zenObservable", "Observable")
@js.native
object Observable
  extends Instantiable1[/* subscriber */ Subscriber[js.Object], Observable[js.Object]] {
  
  def from[R](observable: ArrayLike[R]): Observable[R] = js.native
  def from[R](observable: typings.zenObservableTs.typesMod.ZenObservable.ObservableLike[R]): Observable[R] = js.native
  def from[R](observable: Observable[R]): Observable[R] = js.native
  
  def of[R](args: R*): Observable[R] = js.native
}
