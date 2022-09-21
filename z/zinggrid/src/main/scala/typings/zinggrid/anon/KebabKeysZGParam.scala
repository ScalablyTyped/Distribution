package typings.zinggrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zinggrid.KebabKeys<zinggrid.ZSoft.ZingGridAttributes.ZGParam> */
trait KebabKeysZGParam extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object KebabKeysZGParam {
  
  inline def apply(): KebabKeysZGParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KebabKeysZGParam]
  }
  
  extension [Self <: KebabKeysZGParam](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
