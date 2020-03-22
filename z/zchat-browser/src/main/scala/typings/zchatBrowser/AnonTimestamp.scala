package typings.zchatBrowser

import typings.zchatBrowser.mod.EventData
import typings.zchatBrowser.zchatBrowserStrings.last_read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTimestamp extends EventData {
  var nick: String
  var timestamp: Double
  var `type`: last_read
}

object AnonTimestamp {
  @scala.inline
  def apply(nick: String, timestamp: Double, `type`: last_read): AnonTimestamp = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTimestamp]
  }
}

