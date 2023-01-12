package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatetimepickerIcons extends StObject {
  
  var date: js.UndefOr[String] = js.undefined
  
  var down: js.UndefOr[String] = js.undefined
  
  var time: js.UndefOr[String] = js.undefined
  
  var up: js.UndefOr[String] = js.undefined
}
object DatetimepickerIcons {
  
  inline def apply(): DatetimepickerIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimepickerIcons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatetimepickerIcons] (val x: Self) extends AnyVal {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDown(value: String): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setUp(value: String): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
