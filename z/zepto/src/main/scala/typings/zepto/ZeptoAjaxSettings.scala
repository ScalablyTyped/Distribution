package typings.zepto

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZeptoAjaxSettings extends StObject {
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var beforeSend: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* settings */ this.type, Boolean]] = js.undefined
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var complete: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* status */ String, Unit]] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var context: js.UndefOr[js.Any] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var dataType: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[
    js.Function3[/* xhr */ XMLHttpRequest, /* errorType */ String, /* error */ Error, Unit]
  ] = js.undefined
  
  var global: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var jsonp: js.UndefOr[String] = js.undefined
  
  var jsonpCallback: js.UndefOr[js.Any] = js.undefined
  
  var mimeType: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var processData: js.UndefOr[Boolean] = js.undefined
  
  var success: js.UndefOr[
    js.Function3[/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest, Unit]
  ] = js.undefined
  
  // string or Function
  var timeout: js.UndefOr[Double] = js.undefined
  
  var traditional: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
  
  var xhrFields: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object ZeptoAjaxSettings {
  
  inline def apply(): ZeptoAjaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZeptoAjaxSettings]
  }
  
  extension [Self <: ZeptoAjaxSettings](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setBeforeSend(value: (/* xhr */ XMLHttpRequest, ZeptoAjaxSettings) => Boolean): Self = StObject.set(x, "beforeSend", js.Any.fromFunction2(value))
    
    inline def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setComplete(value: (/* xhr */ XMLHttpRequest, /* status */ String) => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction2(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: (/* xhr */ XMLHttpRequest, /* errorType */ String, /* error */ Error) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setJsonp(value: String): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    inline def setJsonpCallback(value: js.Any): Self = StObject.set(x, "jsonpCallback", value.asInstanceOf[js.Any])
    
    inline def setJsonpCallbackUndefined: Self = StObject.set(x, "jsonpCallback", js.undefined)
    
    inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setProcessData(value: Boolean): Self = StObject.set(x, "processData", value.asInstanceOf[js.Any])
    
    inline def setProcessDataUndefined: Self = StObject.set(x, "processData", js.undefined)
    
    inline def setSuccess(value: (/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTraditional(value: Boolean): Self = StObject.set(x, "traditional", value.asInstanceOf[js.Any])
    
    inline def setTraditionalUndefined: Self = StObject.set(x, "traditional", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setXhrFields(value: StringDictionary[js.Any]): Self = StObject.set(x, "xhrFields", value.asInstanceOf[js.Any])
    
    inline def setXhrFieldsUndefined: Self = StObject.set(x, "xhrFields", js.undefined)
  }
}
