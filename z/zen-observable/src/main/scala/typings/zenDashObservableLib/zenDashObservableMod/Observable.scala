package typings
package zenDashObservableLib.zenDashObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable[T] extends js.Object {
  @JSName(org.scalablytyped.runtime.Symbol.observable)
  var observable: js.Function0[Observable[T]] = js.native
  def concat[R](observable: Observable[R]*): Observable[R] = js.native
  def filter(callback: js.Function1[/* value */ T, scala.Boolean]): Observable[T] = js.native
  def flatMap[R](
    callback: js.Function1[
      /* value */ T, 
      zenDashObservableLib.zenDashObservableMod.Global.ZenObservableNs.ObservableLike[R]
    ]
  ): Observable[R] = js.native
  def forEach(callback: js.Function1[/* value */ T, scala.Unit]): js.Promise[scala.Unit] = js.native
  def map[R](callback: js.Function1[/* value */ T, R]): Observable[R] = js.native
  def reduce(callback: js.Function2[/* previousValue */ T, /* currentValue */ T, T]): Observable[T] = js.native
  def reduce(callback: js.Function2[/* previousValue */ T, /* currentValue */ T, T], initialValue: T): Observable[T] = js.native
  @JSName("reduce")
  def reduce_R[R](callback: js.Function2[/* previousValue */ R, /* currentValue */ T, R]): Observable[R] = js.native
  @JSName("reduce")
  def reduce_R[R](callback: js.Function2[/* previousValue */ R, /* currentValue */ T, R], initialValue: R): Observable[R] = js.native
  def subscribe(observer: zenDashObservableLib.zenDashObservableMod.Global.ZenObservableNs.Observer[T]): zenDashObservableLib.zenDashObservableMod.Global.ZenObservableNs.Subscription = js.native
  def subscribe(onNext: js.Function1[/* value */ T, scala.Unit]): zenDashObservableLib.zenDashObservableMod.Global.ZenObservableNs.Subscription = js.native
  def subscribe(
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* error */ js.Any, scala.Unit]
  ): zenDashObservableLib.zenDashObservableMod.Global.ZenObservableNs.Subscription = js.native
  def subscribe(
    onNext: js.Function1[/* value */ T, scala.Unit],
    onError: js.Function1[/* error */ js.Any, scala.Unit],
    onComplete: js.Function0[scala.Unit]
  ): zenDashObservableLib.zenDashObservableMod.Global.ZenObservableNs.Subscription = js.native
}

