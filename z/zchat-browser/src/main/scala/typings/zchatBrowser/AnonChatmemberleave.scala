package typings.zchatBrowser

import typings.zchatBrowser.zchatBrowserStrings.chatDotmemberleave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChatmemberleave extends js.Object {
  var `type`: chatDotmemberleave
}

object AnonChatmemberleave {
  @scala.inline
  def apply(`type`: chatDotmemberleave): AnonChatmemberleave = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChatmemberleave]
  }
}

