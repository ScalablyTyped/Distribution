package typings.zinggrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zinggrid.KebabKeys<zinggrid.ZSoft.ZingGridAttributes.ZGCheckbox> */
trait KebabKeysZGCheckbox extends StObject {
  
  var checked: js.UndefOr[Boolean] = js.undefined
}
object KebabKeysZGCheckbox {
  
  inline def apply(): KebabKeysZGCheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KebabKeysZGCheckbox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KebabKeysZGCheckbox] (val x: Self) extends AnyVal {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
  }
}
