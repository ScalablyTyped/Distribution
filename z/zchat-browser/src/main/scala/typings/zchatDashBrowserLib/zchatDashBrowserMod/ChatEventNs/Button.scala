package typings
package zchatDashBrowserLib.zchatDashBrowserMod.ChatEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  var action: Action
  var text: java.lang.String
}

object Button {
  @scala.inline
  def apply(action: Action, text: java.lang.String): Button = {
    val __obj = js.Dynamic.literal(action = action, text = text)
  
    __obj.asInstanceOf[Button]
  }
}

