package typings
package zchatDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lastread
  extends zchatDashBrowserLib.zchatDashBrowserMod._EventData {
  var nick: java.lang.String
  var timestamp: scala.Double
  var `type`: zchatDashBrowserLib.zchatDashBrowserLibStrings.last_read
}

object Anon_Lastread {
  @scala.inline
  def apply(
    nick: java.lang.String,
    timestamp: scala.Double,
    `type`: zchatDashBrowserLib.zchatDashBrowserLibStrings.last_read
  ): Anon_Lastread = {
    val __obj = js.Dynamic.literal(nick = nick, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Lastread]
  }
}

