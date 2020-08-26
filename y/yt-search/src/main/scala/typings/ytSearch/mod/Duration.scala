package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration extends js.Object {
  var seconds: Double = js.native
  var timestamp: String = js.native
}

object Duration {
  @scala.inline
  def apply(seconds: Double, timestamp: String): Duration = {
    val __obj = js.Dynamic.literal(seconds = seconds.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  @scala.inline
  implicit class DurationOps[Self <: Duration] (val x: Self) extends AnyVal {
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
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

