package typings.zchatBrowser

import typings.zchatBrowser.mod._EventData
import typings.zchatBrowser.zchatBrowserStrings.last_read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLastread extends _EventData {
  var nick: String
  var timestamp: Double
  var `type`: last_read
}

object AnonLastread {
  @scala.inline
  def apply(nick: String, timestamp: Double, `type`: last_read): AnonLastread = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLastread]
  }
}

