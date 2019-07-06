package typings
package zchatDashBrowserLib.zchatDashBrowserMod.ChatEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItem extends js.Object {
  var action: Action
  var heading: java.lang.String
  var image_url: js.UndefOr[java.lang.String] = js.undefined
  var paragraph: java.lang.String
}

object ListItem {
  @scala.inline
  def apply(
    action: Action,
    heading: java.lang.String,
    paragraph: java.lang.String,
    image_url: java.lang.String = null
  ): ListItem = {
    val __obj = js.Dynamic.literal(action = action, heading = heading, paragraph = paragraph)
    if (image_url != null) __obj.updateDynamic("image_url")(image_url)
    __obj.asInstanceOf[ListItem]
  }
}

