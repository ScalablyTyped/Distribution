package typings.zchatDashBrowser

import typings.zchatDashBrowser.zchatDashBrowserMod.Attachment
import typings.zchatDashBrowser.zchatDashBrowserStrings.chatDOTfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attachment extends js.Object {
  var attachment: Attachment
  var deleted: Boolean
  var `type`: chatDOTfile
}

object Anon_Attachment {
  @scala.inline
  def apply(attachment: Attachment, deleted: Boolean, `type`: chatDOTfile): Anon_Attachment = {
    val __obj = js.Dynamic.literal(attachment = attachment, deleted = deleted)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Attachment]
  }
}

