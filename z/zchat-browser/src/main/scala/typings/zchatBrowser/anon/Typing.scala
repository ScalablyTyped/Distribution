package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.EventData
import typings.zchatBrowser.zchatBrowserStrings.typing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typing extends EventData {
  var nick: String = js.native
  var `type`: typing = js.native
  var typing: Boolean = js.native
}

object Typing {
  @scala.inline
  def apply(nick: String, `type`: typing, typing: Boolean): Typing = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typing]
  }
  @scala.inline
  implicit class TypingOps[Self <: Typing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNick(value: String): Self = this.set("nick", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typing): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTyping(value: Boolean): Self = this.set("typing", value.asInstanceOf[js.Any])
  }
  
}

