package typings
package zchatDashBrowserLib.zchatDashBrowserMod.ChatEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseChatEventData extends js.Object {
  var display_name: java.lang.String
  var nick: java.lang.String
  var time_stamp: scala.Double
}

object BaseChatEventData {
  @scala.inline
  def apply(display_name: java.lang.String, nick: java.lang.String, time_stamp: scala.Double): BaseChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name, nick = nick, time_stamp = time_stamp)
  
    __obj.asInstanceOf[BaseChatEventData]
  }
}

