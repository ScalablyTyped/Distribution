package typings.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnStateChangeEvent extends PlayerEvent {
  /**
    * New player state.
    */
  var data: PlayerState = js.native
}

object OnStateChangeEvent {
  @scala.inline
  def apply(data: PlayerState, target: Player): OnStateChangeEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnStateChangeEvent]
  }
  @scala.inline
  implicit class OnStateChangeEventOps[Self <: OnStateChangeEvent] (val x: Self) extends AnyVal {
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
    def setData(value: PlayerState): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

