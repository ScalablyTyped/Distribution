package typings.zchatBrowser.mod

import typings.zchatBrowser.zchatBrowserStrings.chatDotrating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatRatingChatEventData extends StObject {
  
  var display_name: String
  
  var new_rating: js.UndefOr[String] = js.undefined
  
  var nick: String
  
  var rating: js.UndefOr[String] = js.undefined
  
  var timestamp: Double
  
  var `type`: chatDotrating
}
object ChatRatingChatEventData {
  
  inline def apply(display_name: String, nick: String, timestamp: Double): ChatRatingChatEventData = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat.rating")
    __obj.asInstanceOf[ChatRatingChatEventData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatRatingChatEventData] (val x: Self) extends AnyVal {
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setNew_rating(value: String): Self = StObject.set(x, "new_rating", value.asInstanceOf[js.Any])
    
    inline def setNew_ratingUndefined: Self = StObject.set(x, "new_rating", js.undefined)
    
    inline def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: chatDotrating): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
