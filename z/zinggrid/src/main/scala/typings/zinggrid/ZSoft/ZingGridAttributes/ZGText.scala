package typings.zinggrid.ZSoft.ZingGridAttributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZGText extends StObject {
  
  /**
    * @description Specifies what value to generate in text field.  Current built-in options are
    * pager-related information.
    */
  var value: js.UndefOr[String] = js.undefined
}
object ZGText {
  
  inline def apply(): ZGText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZGText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZGText] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
