package typings.zchatDashBrowser

import typings.zchatDashBrowser.zchatDashBrowserMod._EventData
import typings.zchatDashBrowser.zchatDashBrowserStrings.chatDOTqueue_position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chatqueueposition extends _EventData {
  var nick: String
  var queue_position: Double
  var `type`: chatDOTqueue_position
}

object Anon_Chatqueueposition {
  @scala.inline
  def apply(nick: String, queue_position: Double, `type`: chatDOTqueue_position): Anon_Chatqueueposition = {
    val __obj = js.Dynamic.literal(nick = nick, queue_position = queue_position)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Chatqueueposition]
  }
}

