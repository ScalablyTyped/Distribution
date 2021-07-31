package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.EventData
import typings.zchatBrowser.zchatBrowserStrings.last_read
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timestamp
  extends StObject
     with EventData {
  
  var nick: String
  
  var timestamp: Double
  
  var `type`: last_read
}
object Timestamp {
  
  @scala.inline
  def apply(nick: String, timestamp: Double): Timestamp = {
    val __obj = js.Dynamic.literal(nick = nick.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("last_read")
    __obj.asInstanceOf[Timestamp]
  }
  
  @scala.inline
  implicit class TimestampMutableBuilder[Self <: Timestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNick(value: String): Self = StObject.set(x, "nick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: last_read): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
