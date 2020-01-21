package typings.zchatBrowser

import typings.zchatBrowser.mod._EventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotqueue_position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChatqueueposition extends _EventData {
  var nick: String
  var queue_position: Double
  var `type`: chatDotqueue_position
}

object AnonChatqueueposition {
  @scala.inline
  def apply(nick: String, queue_position: Double, `type`: chatDotqueue_position): AnonChatqueueposition = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], queue_position = queue_position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChatqueueposition]
  }
}

