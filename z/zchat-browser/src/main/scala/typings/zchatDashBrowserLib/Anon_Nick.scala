package typings
package zchatDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Nick
  extends zchatDashBrowserLib.zchatDashBrowserMod._EventData {
  var nick: java.lang.String
  var `type`: zchatDashBrowserLib.zchatDashBrowserLibStrings.typing
  var typing: scala.Boolean
}

object Anon_Nick {
  @scala.inline
  def apply(
    nick: java.lang.String,
    `type`: zchatDashBrowserLib.zchatDashBrowserLibStrings.typing,
    typing: scala.Boolean
  ): Anon_Nick = {
    val __obj = js.Dynamic.literal(nick = nick, typing = typing)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Nick]
  }
}

