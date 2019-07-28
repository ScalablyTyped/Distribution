package typings.zchatDashBrowser

import typings.zchatDashBrowser.zchatDashBrowserStrings.chatDOTcomment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chatcomment extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var new_comment: js.UndefOr[String] = js.undefined
  var `type`: chatDOTcomment
}

object Anon_Chatcomment {
  @scala.inline
  def apply(`type`: chatDOTcomment, comment: String = null, new_comment: String = null): Anon_Chatcomment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (new_comment != null) __obj.updateDynamic("new_comment")(new_comment)
    __obj.asInstanceOf[Anon_Chatcomment]
  }
}

