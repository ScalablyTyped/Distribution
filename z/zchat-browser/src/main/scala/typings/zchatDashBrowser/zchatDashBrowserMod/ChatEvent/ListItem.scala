package typings.zchatDashBrowser.zchatDashBrowserMod.ChatEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItem extends js.Object {
  var action: Action
  var heading: String
  var image_url: js.UndefOr[String] = js.undefined
  var paragraph: String
}

object ListItem {
  @scala.inline
  def apply(action: Action, heading: String, paragraph: String, image_url: String = null): ListItem = {
    val __obj = js.Dynamic.literal(action = action, heading = heading, paragraph = paragraph)
    if (image_url != null) __obj.updateDynamic("image_url")(image_url)
    __obj.asInstanceOf[ListItem]
  }
}

