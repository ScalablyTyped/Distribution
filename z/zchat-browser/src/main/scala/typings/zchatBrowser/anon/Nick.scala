package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.EventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotqueue_position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nick extends EventData {
  var nick: String
  var queue_position: Double
  var `type`: chatDotqueue_position
}

object Nick {
  @scala.inline
  def apply(nick: String, queue_position: Double, `type`: chatDotqueue_position): Nick = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], queue_position = queue_position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nick]
  }
}

