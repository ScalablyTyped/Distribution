package typings.zenObservableTs.typesMod.ZenObservable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var error: js.UndefOr[js.Function1[/* errorValue */ js.Any, Unit]] = js.native
  var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
  var start: js.UndefOr[js.Function1[/* subscription */ Subscription, _]] = js.native
}

object Observer {
  @scala.inline
  def apply[T](): Observer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Observer[T]]
  }
  @scala.inline
  implicit class ObserverOps[Self <: Observer[_], T] (val x: Self with Observer[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setError(value: /* errorValue */ js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setNext(value: /* value */ T => Unit): Self = this.set("next", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setStart(value: /* subscription */ Subscription => _): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

