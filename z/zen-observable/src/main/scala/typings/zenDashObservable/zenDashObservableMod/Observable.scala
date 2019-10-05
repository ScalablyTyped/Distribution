package typings.zenDashObservable.zenDashObservableMod

import typings.zenDashObservable.zenDashObservableMod.Global.ZenObservable.ObservableLike
import typings.zenDashObservable.zenDashObservableMod.Global.ZenObservable.Observer
import typings.zenDashObservable.zenDashObservableMod.Global.ZenObservable.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable[T] extends js.Object {
  def concat[R](observable: Observable[R]*): Observable[R] = js.native
  def filter(callback: js.Function1[/* value */ T, Boolean]): Observable[T] = js.native
  def flatMap[R](callback: js.Function1[/* value */ T, ObservableLike[R]]): Observable[R] = js.native
  def forEach(callback: js.Function1[/* value */ T, Unit]): js.Promise[Unit] = js.native
  def map[R](callback: js.Function1[/* value */ T, R]): Observable[R] = js.native
  def reduce(callback: js.Function2[/* previousValue */ T, /* currentValue */ T, T]): Observable[T] = js.native
  def reduce(callback: js.Function2[/* previousValue */ T, /* currentValue */ T, T], initialValue: T): Observable[T] = js.native
  @JSName("reduce")
  def reduce_R[R](callback: js.Function2[/* previousValue */ R, /* currentValue */ T, R]): Observable[R] = js.native
  @JSName("reduce")
  def reduce_R[R](callback: js.Function2[/* previousValue */ R, /* currentValue */ T, R], initialValue: R): Observable[R] = js.native
  def subscribe(observer: Observer[T]): Subscription = js.native
  def subscribe(onNext: js.Function1[/* value */ T, Unit]): Subscription = js.native
  def subscribe(onNext: js.Function1[/* value */ T, Unit], onError: js.Function1[/* error */ js.Any, Unit]): Subscription = js.native
  def subscribe(
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.Function1[/* error */ js.Any, Unit],
    onComplete: js.Function0[Unit]
  ): Subscription = js.native
}

