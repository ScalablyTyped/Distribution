package typings.zinggrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zinggrid.KebabKeys<zinggrid.ZSoft.ZingGridAttributes.ZGIcon> */
trait KebabKeysZGIcon extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object KebabKeysZGIcon {
  
  inline def apply(): KebabKeysZGIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KebabKeysZGIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KebabKeysZGIcon] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
