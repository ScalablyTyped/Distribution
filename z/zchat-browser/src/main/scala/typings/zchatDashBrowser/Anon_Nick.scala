package typings.zchatDashBrowser

import typings.zchatDashBrowser.zchatDashBrowserMod._EventData
import typings.zchatDashBrowser.zchatDashBrowserStrings.typing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Nick extends _EventData {
  var nick: String
  var `type`: typing
  var typing: Boolean
}

object Anon_Nick {
  @scala.inline
  def apply(nick: String, `type`: typing, typing: Boolean): Anon_Nick = {
    val __obj = js.Dynamic.literal(nick = nick, typing = typing)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Nick]
  }
}

