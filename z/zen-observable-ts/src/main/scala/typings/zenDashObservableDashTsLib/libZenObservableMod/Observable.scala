package typings
package zenDashObservableDashTsLib.libZenObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable[T] extends js.Object {
  def filter(fn: js.Function1[/* value */ T, scala.Boolean]): Observable[T] = js.native
  def flatMap[R](
    fn: js.Function1[
      /* value */ T, 
      zenDashObservableDashTsLib.libTypesMod.ZenObservableNs.ObservableLike[R]
    ]
  ): Observable[R] = js.native
  def forEach(fn: js.Function1[/* value */ T, scala.Unit]): js.Promise[scala.Unit] = js.native
  def from[R](observable: stdLib.ArrayLike[R]): Observable[R] = js.native
  def from[R](observable: zenDashObservableDashTsLib.libTypesMod.ZenObservableNs.ObservableLike[R]): Observable[R] = js.native
  def from[R](observable: Observable[R]): Observable[R] = js.native
  def map[R](fn: js.Function1[/* value */ T, R]): Observable[R] = js.native
  def of[R](args: R*): Observable[R] = js.native
  def reduce[R](fn: js.Function2[/* previousValue */ R | T, /* currentValue */ T, R | T]): Observable[R | T] = js.native
  def reduce[R](fn: js.Function2[R | T, /* currentValue */ T, R | T], initialValue: R | T): Observable[R | T] = js.native
  def subscribe(observerOrNext: js.Function1[/* value */ T, scala.Unit]): zenDashObservableDashTsLib.libTypesMod.ZenObservableNs.Subscription = js.native
  def subscribe(
    observerOrNext: js.Function1[/* value */ T, scala.Unit],
    error: js.Function1[/* error */ js.Any, scala.Unit]
  ): zenDashObservableDashTsLib.libTypesMod.ZenObservableNs.Subscription = js.native
  def subscribe(
    observerOrNext: js.Function1[/* value */ T, scala.Unit],
    error: js.Function1[/* error */ js.Any, scala.Unit],
    complete: js.Function0[scala.Unit]
  ): zenDashObservableDashTsLib.libTypesMod.ZenObservableNs.Subscription = js.native
  def subscribe(observerOrNext: zenDashObservableDashTsLib.libTypesMod.ZenObservableNs.Observer[T]): zenDashObservableDashTsLib.libTypesMod.ZenObservableNs.Subscription = js.native
  def subscribe(
    observerOrNext: zenDashObservableDashTsLib.libTypesMod.ZenObservableNs.Observer[T],
    error: js.Function1[/* error */ js.Any, scala.Unit]
  ): zenDashObservableDashTsLib.libTypesMod.ZenObservableNs.Subscription = js.native
  def subscribe(
    observerOrNext: zenDashObservableDashTsLib.libTypesMod.ZenObservableNs.Observer[T],
    error: js.Function1[/* error */ js.Any, scala.Unit],
    complete: js.Function0[scala.Unit]
  ): zenDashObservableDashTsLib.libTypesMod.ZenObservableNs.Subscription = js.native
}

@JSImport("zen-observable-ts/lib/zenObservable", "Observable")
@js.native
class ObservableCls[T] protected () extends Observable[T] {
  def this(subscriber: Subscriber[T]) = this()
}

@JSImport("zen-observable-ts/lib/zenObservable", "Observable")
@js.native
object Observable
  extends org.scalablytyped.runtime.Instantiable1[/* subscriber */ Subscriber[js.Object], Observable[js.Object]] {
  def from[R](observable: stdLib.ArrayLike[R]): zenDashObservableDashTsLib.libZenObservableMod.Observable[R] = js.native
  def from[R](observable: zenDashObservableDashTsLib.libTypesMod.ZenObservableNs.ObservableLike[R]): zenDashObservableDashTsLib.libZenObservableMod.Observable[R] = js.native
  def from[R](observable: zenDashObservableDashTsLib.libZenObservableMod.Observable[R]): zenDashObservableDashTsLib.libZenObservableMod.Observable[R] = js.native
  def of[R](args: R*): zenDashObservableDashTsLib.libZenObservableMod.Observable[R] = js.native
}

