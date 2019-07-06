package typings
package zchatDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chatqueueposition
  extends zchatDashBrowserLib.zchatDashBrowserMod._EventData {
  var nick: java.lang.String
  var queue_position: scala.Double
  var `type`: zchatDashBrowserLib.zchatDashBrowserLibStrings.chatDOTqueue_position
}

object Anon_Chatqueueposition {
  @scala.inline
  def apply(
    nick: java.lang.String,
    queue_position: scala.Double,
    `type`: zchatDashBrowserLib.zchatDashBrowserLibStrings.chatDOTqueue_position
  ): Anon_Chatqueueposition = {
    val __obj = js.Dynamic.literal(nick = nick, queue_position = queue_position)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Chatqueueposition]
  }
}

