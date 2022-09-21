package typings.zinggrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zinggrid.KebabKeys<zinggrid.ZSoft.ZingGridAttributes.ZGMenu> */
trait KebabKeysZGMenu extends StObject {
  
  var replace: js.UndefOr[Boolean] = js.undefined
}
object KebabKeysZGMenu {
  
  inline def apply(): KebabKeysZGMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KebabKeysZGMenu]
  }
  
  extension [Self <: KebabKeysZGMenu](x: Self) {
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
  }
}
