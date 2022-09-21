package typings.zinggrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zinggrid.KebabKeys<zinggrid.ZSoft.ZingGridAttributes.ZGSource> */
trait KebabKeysZGSource extends StObject {
  
  var position: js.UndefOr[String] = js.undefined
}
object KebabKeysZGSource {
  
  inline def apply(): KebabKeysZGSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KebabKeysZGSource]
  }
  
  extension [Self <: KebabKeysZGSource](x: Self) {
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
