package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.ChatEventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotcomment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type  :'chat.comment',   comment ? :string,   new_comment ? :string} */
trait BaseChatEventDatatypechatComment extends ChatEventData {
  var comment: js.UndefOr[String] = js.undefined
  var display_name: String
  var new_comment: js.UndefOr[String] = js.undefined
  var nick: String
  var time_stamp: Double
  var `type`: chatDotcomment
}

object BaseChatEventDatatypechatComment {
  @scala.inline
  def apply(
    display_name: String,
    nick: String,
    time_stamp: Double,
    `type`: chatDotcomment,
    comment: String = null,
    new_comment: String = null
  ): BaseChatEventDatatypechatComment = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (new_comment != null) __obj.updateDynamic("new_comment")(new_comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChatEventDatatypechatComment]
  }
}

