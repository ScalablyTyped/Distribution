package typings.zinggrid.ZSoft.ZingGridAttributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZGPager extends StObject {
  
  /**
    * @description Sets the number of records or rows to display per page
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Sets the number of cards to display per page when in card mode
    */
  var pageSizeCard: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Sets the number of rows to display per page when in row mode
    */
  var pageSizeRow: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Determines max number of page buttons to display.  Default is 5.
    */
  var pagerButtonLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * @description Determines which type of pagination to use, input or buttons
    */
  var pagerType: js.UndefOr[String] = js.undefined
  
  /**
    * @description Indicates where to position the pager
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * @description Sets the options for page size in "zg-option-list"
    */
  var sizeOptions: js.UndefOr[String] = js.undefined
}
object ZGPager {
  
  inline def apply(): ZGPager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZGPager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZGPager] (val x: Self) extends AnyVal {
    
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
