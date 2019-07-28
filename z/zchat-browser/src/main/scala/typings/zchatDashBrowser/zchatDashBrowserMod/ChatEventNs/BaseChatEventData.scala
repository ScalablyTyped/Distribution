package typings.zchatDashBrowser.zchatDashBrowserMod.ChatEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseChatEventData extends js.Object {
  var display_name: String
  var nick: String
  var time_stamp: Double
}

object BaseChatEventData {
  @scala.inline
  def apply(display_name: String, nick: String, time_stamp: Double): BaseChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name, nick = nick, time_stamp = time_stamp)
  
    __obj.asInstanceOf[BaseChatEventData]
  }
}

