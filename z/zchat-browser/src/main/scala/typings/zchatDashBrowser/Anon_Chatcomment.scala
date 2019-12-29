package typings.zchatDashBrowser

import typings.zchatDashBrowser.zchatDashBrowserStrings.chatDotcomment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chatcomment extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var new_comment: js.UndefOr[String] = js.undefined
  var `type`: chatDotcomment
}

object Anon_Chatcomment {
  @scala.inline
  def apply(`type`: chatDotcomment, comment: String = null, new_comment: String = null): Anon_Chatcomment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (new_comment != null) __obj.updateDynamic("new_comment")(new_comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Chatcomment]
  }
}

