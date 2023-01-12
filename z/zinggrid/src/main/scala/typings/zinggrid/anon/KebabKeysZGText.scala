package typings.zinggrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zinggrid.KebabKeys<zinggrid.ZSoft.ZingGridAttributes.ZGText> */
trait KebabKeysZGText extends StObject {
  
  var value: js.UndefOr[String] = js.undefined
}
object KebabKeysZGText {
  
  inline def apply(): KebabKeysZGText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KebabKeysZGText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KebabKeysZGText] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
