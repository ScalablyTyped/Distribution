package typings.zchatBrowser

import typings.zchatBrowser.mod._EventData
import typings.zchatBrowser.zchatBrowserStrings.typing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNick extends _EventData {
  var nick: String
  var `type`: typing
  var typing: Boolean
}

object AnonNick {
  @scala.inline
  def apply(nick: String, `type`: typing, typing: Boolean): AnonNick = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNick]
  }
}

