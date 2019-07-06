package typings
package zchatDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attachment extends js.Object {
  var attachment: zchatDashBrowserLib.zchatDashBrowserMod.Attachment
  var deleted: scala.Boolean
  var `type`: zchatDashBrowserLib.zchatDashBrowserLibStrings.chatDOTfile
}

object Anon_Attachment {
  @scala.inline
  def apply(
    attachment: zchatDashBrowserLib.zchatDashBrowserMod.Attachment,
    deleted: scala.Boolean,
    `type`: zchatDashBrowserLib.zchatDashBrowserLibStrings.chatDOTfile
  ): Anon_Attachment = {
    val __obj = js.Dynamic.literal(attachment = attachment, deleted = deleted)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Attachment]
  }
}

