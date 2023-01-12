package typings.zinggrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zinggrid.KebabKeys<zinggrid.ZSoft.ZingGridAttributes.ZGCaption> */
trait KebabKeysZGCaption extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object KebabKeysZGCaption {
  
  inline def apply(): KebabKeysZGCaption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KebabKeysZGCaption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KebabKeysZGCaption] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
