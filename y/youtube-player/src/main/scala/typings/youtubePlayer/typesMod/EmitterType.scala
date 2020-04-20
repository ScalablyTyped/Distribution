package typings.youtubePlayer.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitterType extends js.Object {
  def trigger(eventName: String, event: js.Object): Unit
}

object EmitterType {
  @scala.inline
  def apply(trigger: (String, js.Object) => Unit): EmitterType = {
    val __obj = js.Dynamic.literal(trigger = js.Any.fromFunction2(trigger))
    __obj.asInstanceOf[EmitterType]
  }
}

