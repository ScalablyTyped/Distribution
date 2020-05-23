package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.EventData
import typings.zchatBrowser.zchatBrowserStrings.typing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typing extends EventData {
  var nick: String
  var `type`: typing
  var typing: Boolean
}

object Typing {
  @scala.inline
  def apply(nick: String, `type`: typing, typing: Boolean): Typing = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typing]
  }
}

