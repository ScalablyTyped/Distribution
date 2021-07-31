package typings.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseOptions extends StObject {
  
  /**
    * The category (for example `'music'`.)
    * @default ''
    */
  var category: js.UndefOr[String] = js.undefined
  
  /**
    * The location.
    * @default 'US'
    */
  var gl: js.UndefOr[String] = js.undefined
  
  /**
    * The language.
    * @default 'en'
    */
  var hl: js.UndefOr[String] = js.undefined
  
  var pageEnd: js.UndefOr[Double] = js.undefined
  
  var pageStart: js.UndefOr[Double] = js.undefined
  
  var pages: js.UndefOr[Double] = js.undefined
  
  var sp: js.UndefOr[String] = js.undefined
  
  var userAgent: js.UndefOr[String] = js.undefined
}
object BaseOptions {
  
  @scala.inline
  def apply(): BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions]
  }
  
  @scala.inline
  implicit class BaseOptionsMutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setGl(value: String): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
    
    @scala.inline
    def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    @scala.inline
    def setPageEnd(value: Double): Self = StObject.set(x, "pageEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageEndUndefined: Self = StObject.set(x, "pageEnd", js.undefined)
    
    @scala.inline
    def setPageStart(value: Double): Self = StObject.set(x, "pageStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageStartUndefined: Self = StObject.set(x, "pageStart", js.undefined)
    
    @scala.inline
    def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    @scala.inline
    def setSp(value: String): Self = StObject.set(x, "sp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpUndefined: Self = StObject.set(x, "sp", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}
