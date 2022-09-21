package typings.zipJsZipJs.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents options passed to the constructor of `HttpRangeReader` and `HttpReader`.
  */
trait HttpRangeOptions extends StObject {
  
  /**
    * The HTTP headers.
    */
  var headers: js.UndefOr[(js.Iterable[js.Tuple2[String, String]]) | (Map[String, String])] = js.undefined
  
  /**
    * `true` to rely `XMLHttpRequest` instead of `fetch` to fetch data.
    * 
    * @defaultValue false
    */
  var useXHR: js.UndefOr[Boolean] = js.undefined
}
object HttpRangeOptions {
  
  inline def apply(): HttpRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRangeOptions]
  }
  
  extension [Self <: HttpRangeOptions](x: Self) {
    
    inline def setHeaders(value: (js.Iterable[js.Tuple2[String, String]]) | (Map[String, String])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setUseXHR(value: Boolean): Self = StObject.set(x, "useXHR", value.asInstanceOf[js.Any])
    
    inline def setUseXHRUndefined: Self = StObject.set(x, "useXHR", js.undefined)
  }
}
