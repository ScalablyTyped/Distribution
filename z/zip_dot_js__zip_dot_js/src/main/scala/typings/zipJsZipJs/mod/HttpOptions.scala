package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the options passed to the constructor of {@link HttpReader}.
  */
trait HttpOptions
  extends StObject
     with HttpRangeOptions {
  
  /**
    * `true` to always use `Range` headers when fetching data.
    * 
    * @defaultValue false
    */
  var forceRangeRequests: js.UndefOr[Boolean] = js.undefined
  
  /**
    * `true` to prevent using `HEAD` HTTP request in order the get the size of the content.
    * 
    * @defaultValue false
    */
  var preventHeadRequest: js.UndefOr[Boolean] = js.undefined
  
  /**
    * `true` to use `Range` headers when fetching data from servers returning `Accept-Ranges` headers.
    * 
    * @defaultValue false
    */
  var useRangeHeader: js.UndefOr[Boolean] = js.undefined
}
object HttpOptions {
  
  inline def apply(): HttpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpOptions] (val x: Self) extends AnyVal {
    
    inline def setForceRangeRequests(value: Boolean): Self = StObject.set(x, "forceRangeRequests", value.asInstanceOf[js.Any])
    
    inline def setForceRangeRequestsUndefined: Self = StObject.set(x, "forceRangeRequests", js.undefined)
    
    inline def setPreventHeadRequest(value: Boolean): Self = StObject.set(x, "preventHeadRequest", value.asInstanceOf[js.Any])
    
    inline def setPreventHeadRequestUndefined: Self = StObject.set(x, "preventHeadRequest", js.undefined)
    
    inline def setUseRangeHeader(value: Boolean): Self = StObject.set(x, "useRangeHeader", value.asInstanceOf[js.Any])
    
    inline def setUseRangeHeaderUndefined: Self = StObject.set(x, "useRangeHeader", js.undefined)
  }
}
