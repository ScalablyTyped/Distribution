package typings.zipkin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context[T] extends js.Object {
  def getContext(): T = js.native
  def letContext[V](ctx: T, callback: js.Function0[V]): V = js.native
  def scoped[V](callback: js.Function0[V]): V = js.native
  def setContext(ctx: T): Unit = js.native
}

object Context {
  @scala.inline
  def apply[T](
    getContext: () => T,
    letContext: (T, js.Function0[js.Any]) => js.Any,
    scoped: js.Function0[js.Any] => js.Any,
    setContext: T => Unit
  ): Context[T] = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), letContext = js.Any.fromFunction2(letContext), scoped = js.Any.fromFunction1(scoped), setContext = js.Any.fromFunction1(setContext))
    __obj.asInstanceOf[Context[T]]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context[_], T] (val x: Self with Context[T]) extends AnyVal {
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
    def setGetContext(value: () => T): Self = this.set("getContext", js.Any.fromFunction0(value))
    @scala.inline
    def setLetContext(value: (T, js.Function0[js.Any]) => js.Any): Self = this.set("letContext", js.Any.fromFunction2(value))
    @scala.inline
    def setScoped(value: js.Function0[js.Any] => js.Any): Self = this.set("scoped", js.Any.fromFunction1(value))
    @scala.inline
    def setSetContext(value: T => Unit): Self = this.set("setContext", js.Any.fromFunction1(value))
  }
  
}

