package typings.zapierPlatformCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Get extends js.Object {
  def get(): js.Promise[String] = js.native
  def set(cursor: String): js.Promise[Null] = js.native
}

object Get {
  @scala.inline
  def apply(get: () => js.Promise[String], set: String => js.Promise[Null]): Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Get]
  }
  @scala.inline
  implicit class GetOps[Self <: Get] (val x: Self) extends AnyVal {
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
    def setGet(value: () => js.Promise[String]): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: String => js.Promise[Null]): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

