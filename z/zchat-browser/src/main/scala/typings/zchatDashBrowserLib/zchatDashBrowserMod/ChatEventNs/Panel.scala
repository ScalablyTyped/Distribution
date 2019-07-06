package typings
package zchatDashBrowserLib.zchatDashBrowserMod.ChatEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Panel extends js.Object {
  var action: Action
  var heading: java.lang.String
  var image_url: java.lang.String
  var paragraph: js.UndefOr[java.lang.String] = js.undefined
}

object Panel {
  @scala.inline
  def apply(
    action: Action,
    heading: java.lang.String,
    image_url: java.lang.String,
    paragraph: java.lang.String = null
  ): Panel = {
    val __obj = js.Dynamic.literal(action = action, heading = heading, image_url = image_url)
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph)
    __obj.asInstanceOf[Panel]
  }
}

