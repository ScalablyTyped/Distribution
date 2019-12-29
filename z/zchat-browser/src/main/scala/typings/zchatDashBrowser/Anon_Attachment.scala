package typings.zchatDashBrowser

import typings.zchatDashBrowser.zchatDashBrowserMod.Attachment
import typings.zchatDashBrowser.zchatDashBrowserStrings.chatDotfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attachment extends js.Object {
  var attachment: Attachment
  var deleted: Boolean
  var `type`: chatDotfile
}

object Anon_Attachment {
  @scala.inline
  def apply(attachment: Attachment, deleted: Boolean, `type`: chatDotfile): Anon_Attachment = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Attachment]
  }
}

