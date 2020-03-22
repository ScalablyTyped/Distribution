package typings.zchatBrowser

import typings.zchatBrowser.mod.ChatEvent.ChatEventData
import typings.zchatBrowser.zchatBrowserStrings.chatDotrating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined zchat-browser.zchat-browser.ChatEvent.BaseChatEventData & {  type  :'chat.rating',   rating ? :string,   new_rating ? :string} */
trait BaseChatEventDatatypechatNewrating extends ChatEventData {
  var display_name: String
  var new_rating: js.UndefOr[String] = js.undefined
  var nick: String
  var rating: js.UndefOr[String] = js.undefined
  var time_stamp: Double
  var `type`: chatDotrating
}

object BaseChatEventDatatypechatNewrating {
  @scala.inline
  def apply(
    display_name: String,
    nick: String,
    time_stamp: Double,
    `type`: chatDotrating,
    new_rating: String = null,
    rating: String = null
  ): BaseChatEventDatatypechatNewrating = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], time_stamp = time_stamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (new_rating != null) __obj.updateDynamic("new_rating")(new_rating.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChatEventDatatypechatNewrating]
  }
}

