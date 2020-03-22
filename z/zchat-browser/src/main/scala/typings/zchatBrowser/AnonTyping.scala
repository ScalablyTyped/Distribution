package typings.zchatBrowser

import typings.zchatBrowser.mod.EventData
import typings.zchatBrowser.zchatBrowserStrings.typing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTyping extends EventData {
  var nick: String
  var `type`: typing
  var typing: Boolean
}

object AnonTyping {
  @scala.inline
  def apply(nick: String, `type`: typing, typing: Boolean): AnonTyping = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTyping]
  }
}

