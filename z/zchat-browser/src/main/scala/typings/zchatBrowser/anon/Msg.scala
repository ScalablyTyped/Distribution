package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.Button
import typings.zchatBrowser.mod.ChatEvent.StructuredMessage
import typings.zchatBrowser.zchatBrowserStrings.QUICK_REPLIES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Msg
  extends StObject
     with StructuredMessage {
  
  var msg: String
  
  var quick_replies: js.Array[Button]
  
  var `type`: QUICK_REPLIES
}
object Msg {
  
  @scala.inline
  def apply(msg: String, quick_replies: js.Array[Button]): Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], quick_replies = quick_replies.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("QUICK_REPLIES")
    __obj.asInstanceOf[Msg]
  }
  
  @scala.inline
  implicit class MsgMutableBuilder[Self <: Msg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuick_replies(value: js.Array[Button]): Self = StObject.set(x, "quick_replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuick_repliesVarargs(value: Button*): Self = StObject.set(x, "quick_replies", js.Array(value :_*))
    
    @scala.inline
    def setType(value: QUICK_REPLIES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
