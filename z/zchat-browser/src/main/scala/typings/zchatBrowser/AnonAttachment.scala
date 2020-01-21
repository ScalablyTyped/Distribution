package typings.zchatBrowser

import typings.zchatBrowser.mod.Attachment
import typings.zchatBrowser.zchatBrowserStrings.chatDotfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttachment extends js.Object {
  var attachment: Attachment
  var deleted: Boolean
  var `type`: chatDotfile
}

object AnonAttachment {
  @scala.inline
  def apply(attachment: Attachment, deleted: Boolean, `type`: chatDotfile): AnonAttachment = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttachment]
  }
}

