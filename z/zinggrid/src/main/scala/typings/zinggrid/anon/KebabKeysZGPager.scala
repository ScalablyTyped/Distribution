package typings.zinggrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined zinggrid.KebabKeys<zinggrid.ZSoft.ZingGridAttributes.ZGPager> */
trait KebabKeysZGPager extends StObject {
  
  var pageSize: js.UndefOr[Double] = js.undefined
  
  var pageSizeCard: js.UndefOr[Double] = js.undefined
  
  var pageSizeRow: js.UndefOr[Double] = js.undefined
  
  var pagerButtonLimit: js.UndefOr[Double] = js.undefined
  
  var pagerType: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var sizeOptions: js.UndefOr[String] = js.undefined
}
object KebabKeysZGPager {
  
  inline def apply(): KebabKeysZGPager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KebabKeysZGPager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KebabKeysZGPager] (val x: Self) extends AnyVal {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeCard(value: Double): Self = StObject.set(x, "pageSizeCard", value.asInstanceOf[js.Any])
    
    inline def setPageSizeCardUndefined: Self = StObject.set(x, "pageSizeCard", js.undefined)
    
    inline def setPageSizeRow(value: Double): Self = StObject.set(x, "pageSizeRow", value.asInstanceOf[js.Any])
    
    inline def setPageSizeRowUndefined: Self = StObject.set(x, "pageSizeRow", js.undefined)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPagerButtonLimit(value: Double): Self = StObject.set(x, "pagerButtonLimit", value.asInstanceOf[js.Any])
    
    inline def setPagerButtonLimitUndefined: Self = StObject.set(x, "pagerButtonLimit", js.undefined)
    
    inline def setPagerType(value: String): Self = StObject.set(x, "pagerType", value.asInstanceOf[js.Any])
    
    inline def setPagerTypeUndefined: Self = StObject.set(x, "pagerType", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSizeOptions(value: String): Self = StObject.set(x, "sizeOptions", value.asInstanceOf[js.Any])
    
    inline def setSizeOptionsUndefined: Self = StObject.set(x, "sizeOptions", js.undefined)
  }
}
