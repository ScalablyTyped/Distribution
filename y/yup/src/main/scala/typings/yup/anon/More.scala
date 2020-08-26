package typings.yup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait More extends js.Object {
  var more: Double = js.native
}

object More {
  @scala.inline
  def apply(more: Double): More = {
    val __obj = js.Dynamic.literal(more = more.asInstanceOf[js.Any])
    __obj.asInstanceOf[More]
  }
  @scala.inline
  implicit class MoreOps[Self <: More] (val x: Self) extends AnyVal {
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
    def setMore(value: Double): Self = this.set("more", value.asInstanceOf[js.Any])
  }
  
}

