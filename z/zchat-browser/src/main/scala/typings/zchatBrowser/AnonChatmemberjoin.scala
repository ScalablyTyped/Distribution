package typings.zchatBrowser

import typings.zchatBrowser.zchatBrowserStrings.chatDotmemberjoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChatmemberjoin extends js.Object {
  var `type`: chatDotmemberjoin
}

object AnonChatmemberjoin {
  @scala.inline
  def apply(`type`: chatDotmemberjoin): AnonChatmemberjoin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChatmemberjoin]
  }
}

