package typings.zchatDashBrowser

import typings.zchatDashBrowser.zchatDashBrowserMod._EventData
import typings.zchatDashBrowser.zchatDashBrowserStrings.last_read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lastread extends _EventData {
  var nick: String
  var timestamp: Double
  var `type`: last_read
}

object Anon_Lastread {
  @scala.inline
  def apply(nick: String, timestamp: Double, `type`: last_read): Anon_Lastread = {
    val __obj = js.Dynamic.literal(nick = nick, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Lastread]
  }
}

