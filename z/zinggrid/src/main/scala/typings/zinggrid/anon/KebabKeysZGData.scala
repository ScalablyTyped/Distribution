package typings.zinggrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zinggrid.KebabKeys<zinggrid.ZSoft.ZingGridAttributes.ZGData> */
trait KebabKeysZGData extends StObject {
  
  var adapter: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var idKey: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[Any] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
}
object KebabKeysZGData {
  
  inline def apply(): KebabKeysZGData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KebabKeysZGData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KebabKeysZGData] (val x: Self) extends AnyVal {
    
    inline def setAdapter(value: String): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setIdKey(value: String): Self = StObject.set(x, "idKey", value.asInstanceOf[js.Any])
    
    inline def setIdKeyUndefined: Self = StObject.set(x, "idKey", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
