package typings.zchatBrowser

import typings.zchatBrowser.zchatBrowserStrings.chatDotcomment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChatcomment extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var new_comment: js.UndefOr[String] = js.undefined
  var `type`: chatDotcomment
}

object AnonChatcomment {
  @scala.inline
  def apply(`type`: chatDotcomment, comment: String = null, new_comment: String = null): AnonChatcomment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (new_comment != null) __obj.updateDynamic("new_comment")(new_comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChatcomment]
  }
}

